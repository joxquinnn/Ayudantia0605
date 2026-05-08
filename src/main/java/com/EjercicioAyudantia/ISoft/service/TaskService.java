package com.EjercicioAyudantia.ISoft.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Task> getTasks(String prioridad, String titulo, String fechalimite){
        return taskList.stream()
            .filter(t -> prioridad == null || t.getPrioridad().equalsIgnoreCase(prioridad))
            .filter(t -> titulo == null || t.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
            .filter(t -> fechalimite == null || t.getFechaLimite().equals(fechalimite))
            //vuelve a empaquetar las tareas que pasaron los filtros
            .collect(Collectors.toList());
    }
}
