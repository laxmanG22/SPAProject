package com.restdemo.crud.assignment.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity
public class Task {
//    @Id
    private int taskId;
    private String taskName;
    private boolean status;

    public Task(int taskId, String taskName, boolean status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
