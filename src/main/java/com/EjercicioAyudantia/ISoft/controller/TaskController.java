package com.EjercicioAyudantia.ISoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.EjercicioAyudantia.ISoft.model.Task;
import com.EjercicioAyudantia.ISoft.services.TaskService;

import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping()
    public Optional<Task> postNewTask() {
        return null;
    }

    @GetMapping
    public List<Task> lst(
            @RequestParam(required = false) String prioridad,
            @RequestParam(required = false) String titulo,
            @RequestParam(required = false) String fechalimite) {
        return taskService.getTasks(prioridad, titulo, fechalimite);
    }
}
