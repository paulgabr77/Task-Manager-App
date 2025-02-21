//package com.example.taskmanager.controller;
//
//import com.example.taskmanager.model.Task;
//import com.example.taskmanager.service.TaskService;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.ui.Model;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/tasks")
//public class TaskController {
//
//    private final TaskService taskService;
//
//    public TaskController(TaskService taskService) {
//        this.taskService = taskService;
//    }
//
//    @GetMapping
//    public List<Task> getAllTasks() {
//        List<Task> tasks = taskService.getAllTasks();
//        System.out.println(tasks);
//        return taskService.getAllTasks();
//    }
//
//    @GetMapping("/{id}")
//    public Task getTaskById(@PathVariable Long id) {
//        return taskService.getTaskById(id);
//    }
//
//    @PostMapping
//    public Task createTask(@RequestBody Task task) {
//        return taskService.createTask(task);
//    }
//
//    @PutMapping("/{id}")
//    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
//        return taskService.updateTask(id, task);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteTask(@PathVariable Long id) {
//        taskService.deleteTask(id);
//    }
//
//        @GetMapping("/tasks")
//        public String getTasks(Model model) {
//            List<Task> tasks = taskService.getAllTasks();
//            model.addAttribute("tasks", tasks);
//            return "tasks"; // tasks.html trebuie să fie în src/main/resources/templates/
//        }
//    }
//
