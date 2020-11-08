package il.avgu.todolist.repositories;

import il.avgu.todolist.resources.TaskResource;
import org.springframework.data.repository.CrudRepository;

//what's the entity class, what's the ID that the entity class has
public interface TaskRepository extends CrudRepository<TaskResource, Integer> {
}
