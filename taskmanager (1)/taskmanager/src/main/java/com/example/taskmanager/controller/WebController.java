package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
@Controller
public class WebController {

    private final TaskService taskService;

    @Autowired
    public WebController(TaskService taskService) {
        this.taskService = taskService;
    }

    // Pagina principală cu toate task-urile
    @GetMapping("/tasks")
    public String viewTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "tasks"; // Returnează pagina tasks.html
    }

    // Pagina pentru adăugarea unui task nou
    @GetMapping("/tasks/add")
    public String addTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "addtask";
    }

    // Adăugarea unui task nou în baza de date
    @PostMapping("/tasks/add")
    public String addTask(@ModelAttribute Task task) {
        task.setCreatedAt(LocalDateTime.now());
        taskService.addNewTask(task);
        return "redirect:/tasks";
    }

    // Ștergerea unui task
    @GetMapping("/tasks/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }
    @GetMapping("/tasks/edit/{id}")
    public String editTaskForm(@PathVariable Long id, Model model) {
        Task task = taskService.getTaskById(id);
        model.addAttribute("task", task);
        return "edit-task";
    }
    @PostMapping("/tasks/edit/{id}")
    public String editTask(@PathVariable Long id, @ModelAttribute Task task) {
        task.setId(id);
        taskService.updateTask(id, task);
        return "redirect:/tasks";
    }


}
