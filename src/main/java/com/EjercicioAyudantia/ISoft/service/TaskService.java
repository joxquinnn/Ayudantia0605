package com.EjercicioAyudantia.ISoft.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.EjercicioAyudantia.ISoft.model.Task;

@Service
public class TaskService {
    private final List<Task> taskList = new ArrayList<>();

    public Task generarTarea(Task task){
        int idInt = taskList.size() + 1;
        Long id = Long.valueOf(idInt);
        task.setId(id);
        task.setCompletada(false);
        taskList.add(task);
        return task;
    }
    public List<Task> listarTareas(){
        return taskList;
    }
}
