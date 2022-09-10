package com.paul.todo.services;

import com.paul.todo.entity.Task;
import com.paul.todo.persitence.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public List<Task> getAllTask(){
        return (List<Task>) taskRepository.findAll();
    }

    public Optional<Task> findTaskById(long id){
        return taskRepository.findById(id);
    }

    public Task saveTask(Task task){
        return taskRepository.save(task);
    }

    public Task deleteTask(long id){
        Optional<Task> task = taskRepository.findById(id);

        if(task.isPresent()){
            taskRepository.deleteById(id);
        }

        return task.get();
    }
}
