package com.paul.todo.controller;

import com.paul.todo.entity.Task;
import com.paul.todo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> getAllTask(){
        return taskService.getAllTask();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        return new ResponseEntity<>(taskService.findTaskById(id), HttpStatus.OK);
    }

    @PostMapping("/save")
    public Task saveTask(@Validated @RequestBody Task task){
        //System.out.println("name" +task.getName());
        return  taskService.saveTask(task);
    }

    @DeleteMapping("/delete/{id}")
    public Task deleteTask(@PathVariable int id){
        return taskService.deleteTask(id);
    }
}
