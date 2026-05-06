package com.EjercicioAyudantia.ISoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EjercicioAyudantia.ISoft.model.Task;

import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/tasks")
public class TaskController {
    
    @PostMapping()
    public Optional<Task> postNewTask() {
        return null;
    }

    @GetMapping()
    public List<Task> getTasks() {
        return null;
    }
}
