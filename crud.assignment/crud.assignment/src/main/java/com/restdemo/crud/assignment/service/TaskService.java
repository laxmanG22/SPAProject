package com.restdemo.crud.assignment.service;

import com.restdemo.crud.assignment.model.Task;
import com.restdemo.crud.assignment.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    ArrayList<Task> tasks = new ArrayList<>();
    TaskService(){
        tasks.add(new Task(1,"Learn java",true));
        tasks.add(new Task(2,"Learn javaScript",false));
        tasks.add(new Task(3,"Learn SpringBoot",true));
    }

//    private TaskRepository taskRepository;

    public List<Task> getTasks(){
//        return taskRepository.findAll();
        return tasks;
    }

    public String addTask(int id, String name, boolean status){
//        taskRepository.save(new Task(id,name,status));
        tasks.add(new Task(id,name,status));
        return "Success";
    }

    public String updateTask(int id, String name, boolean status){
        for(Task task : tasks){
            if(task.getTaskId() == id){
                task.setTaskName(name);
                task.setStatus(status);
            }
        }
        return "Success";
//        if(taskRepository.existsById(id)){
//            taskRepository.findById(id).map(task -> {
//                task.setTaskName(name);
//                task.setStatus(status);
//                return taskRepository.save(task);
//            });
//            return "Success";
//        }else
//            return "No Task with Id: "+id;
    }

    public boolean deleteTask(int id){
//        taskRepository.deleteById(id);
//        return true;
        return tasks.removeIf(task->task.getTaskId() == id);
    }


}
