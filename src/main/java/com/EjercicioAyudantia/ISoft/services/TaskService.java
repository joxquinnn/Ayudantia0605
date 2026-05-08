package com.EjercicioAyudantia.ISoft.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.EjercicioAyudantia.ISoft.model.Task;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();

    public List<Task> getTasks(String prioridad, String titulo, String fechalimite){
        return tasks.stream()
            .filter(t -> prioridad == null || t.getPrioridad().equalsIgnoreCase(prioridad))
            .filter(t -> titulo == null || t.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
            .filter(t -> fechalimite == null || t.getFechaLimite().equals(fechalimite))
            //vuelve a empaquetar las tareas que pasaron los filtros
            .collect(Collectors.toList());
    }
}

