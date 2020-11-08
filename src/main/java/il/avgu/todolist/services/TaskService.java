package il.avgu.todolist.services;


import il.avgu.todolist.enums.StatusEnum;
import il.avgu.todolist.repositories.TaskRepository;
import il.avgu.todolist.resources.TaskResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<TaskResource> getTasks(){
        List<TaskResource> list = new ArrayList<>();
        taskRepository.findAll().forEach(list::add);
        return list;
    }

    public Optional<TaskResource> getTask(Integer id) {
        return taskRepository.findById(id);
    }

    public void addTask(TaskResource task) {
        task.setStatus(StatusEnum.TO_DO);

        taskRepository.save(task);
    }

    public void updateTask(Integer id, TaskResource task) {
        taskRepository.save(task);
    }

    public void deleteTask(Integer id) {
        taskRepository.deleteById(id);
    }
}