package com.restdemo.crud.assignment.controller;

import com.restdemo.crud.assignment.model.Task;
import com.restdemo.crud.assignment.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> getTasks(){
        return taskService.getTasks();
    }

    @PostMapping("/tasks")
    public String addTask(@RequestBody Task task){
        return taskService.addTask(task.getTaskId(),task.getTaskName(),task.isStatus());
    }

    @PutMapping("/tasks/{id}")
    public String updateTask(@PathVariable int id, @RequestBody Task task){
        return taskService.updateTask(id,task.getTaskName(),task.isStatus());
    }

    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable int id){
        if (taskService.deleteTask(id))
            return "Success";
        else
            return "Failure";
    }

}
