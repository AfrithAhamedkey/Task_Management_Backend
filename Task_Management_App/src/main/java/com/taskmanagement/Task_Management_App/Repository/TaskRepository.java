package com.taskmanagement.Task_Management_App.Repository;

import com.taskmanagement.Task_Management_App.Model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskModel,Long> {
}
