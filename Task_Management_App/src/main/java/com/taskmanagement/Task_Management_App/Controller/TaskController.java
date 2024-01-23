package com.taskmanagement.Task_Management_App.Controller;

import com.taskmanagement.Task_Management_App.Model.TaskModel;
import com.taskmanagement.Task_Management_App.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TaskController {
  @Autowired
  TaskRepository taskRepository;

  TaskModel taskModel;

  @GetMapping
  public List<TaskModel> getalltask() {
    return taskRepository.findAll();

  }

  @GetMapping("/{id}")
  public Optional<TaskModel> getTaskById(@PathVariable Long id) {
    return taskRepository.findById(id);
  }

  @PostMapping("/createtask")
  public TaskModel createTask(@RequestBody TaskModel taskModel) {
    return taskRepository.save(taskModel);

  }


  @PutMapping("/updatetask/{id}")
    public TaskModel updateTask(@PathVariable Long id,@RequestBody TaskModel newtaskModel){
    TaskModel exproduct = taskRepository.findById(id).get();
    exproduct.setTask(newtaskModel.getTask());
    

   return taskRepository.save(exproduct);


  }

  @DeleteMapping("/{id}")
  public String deleteById(@PathVariable Long id) {
     taskRepository.deleteById(id);
     return "Deleted Succesfully";
  }
}
//}
//}
