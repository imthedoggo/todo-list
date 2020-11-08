package il.avgu.todolist.resources;

import il.avgu.todolist.enums.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="tasks")
public class TaskResource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //implement mapper (mapstruct)
    private Integer id;
    private String name;
    private String description;
    private StatusEnum status;
}
