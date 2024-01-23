package com.taskmanagement.Task_Management_App.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

enum TaskStatus{
    TODO,IN_PROGRESS,DONE
}

@Entity
@Table(name = "TaskTable")

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TaskModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String task;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    // private TaskStatus status;
   // public Date duedate;

}
