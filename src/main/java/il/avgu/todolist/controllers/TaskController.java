package il.avgu.todolist.controllers;

import il.avgu.todolist.resources.TaskResource;
import il.avgu.todolist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping(value = "/v1/tasks", produces = "application/json")
    //GETS ALL TASKS
    public List<TaskResource> getTasks(){
          return taskService.getTasks();
    }

    @GetMapping(value = "/v1/tasks/{id}", produces = "application/json")
    //GET ONE SPECIFIC TASK
    public Optional<TaskResource> getTask(@PathVariable Integer id){
        return taskService.getTask(id);//TaskResource;
    }

    @PostMapping(value = "/v1/tasks/", produces = "application/json")
    //CREATE A NEW TASK
    public void createTasks(@RequestBody TaskResource task){
        taskService.addTask(task);
    }

    @PutMapping(value = "/v1/tasks/{id}", produces = "application/json")
    //UPDATE ONE SPECIFIC TASK
    public void updateTask(@PathVariable Integer id, @RequestBody TaskResource task) {
        taskService.updateTask(id, task);
    }

    @DeleteMapping(value = "/v1/tasks/{id}", produces = "application/json")
    //DELETE ONE SPECIFIC TASK
    public void deleteTask(@PathVariable Integer id) {
        taskService.deleteTask(id);
    }
}
