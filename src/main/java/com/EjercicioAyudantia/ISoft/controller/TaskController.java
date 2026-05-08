package com.EjercicioAyudantia.ISoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EjercicioAyudantia.ISoft.model.Task;
import com.EjercicioAyudantia.ISoft.service.TaskService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;
    
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @PostMapping()
    public ResponseEntity<Task> postNewTask(@RequestBody Task task) {
        Task saveTask = taskService.generarTarea(task);  
        return new ResponseEntity<>(saveTask, HttpStatus.CREATED);
    }

    @GetMapping()
    public List<Task> getTasks() {
        return null;
    }
}
