# ✅ Task Manager - Simplified Task Management System

Task Manager is a **web-based application** designed to help users manage their daily tasks efficiently. Built using **Spring Boot** and **PostgreSQL**, this application provides an intuitive way to **add, edit, and delete tasks** while ensuring a clean and structured experience. 📝📌

## 🎯 Key Features

✔️ **Task List Management** - View all tasks in an organized table.
✔️ **Task Creation** - Easily add new tasks with a title, description, status, and due date.
✔️ **Task Editing** - Modify task details directly from the interface.
✔️ **Task Deletion** - Remove completed or unwanted tasks with a single click.
✔️ **User-Friendly Interface** - Simple and minimalistic UI for seamless navigation.
✔️ **Database Integration** - Uses PostgreSQL for persistent data storage.

## 🚀 Technologies Used

⚡ **Java 17** - The core programming language.
⚡ **Spring Boot** - Framework used for backend development.
⚡ **Spring Data JPA** - Facilitates database operations.
⚡ **Thymeleaf** - HTML template engine for dynamic UI rendering.
⚡ **PostgreSQL** - Database system for storing task data.
⚡ **HTML & CSS** - Frontend for creating a responsive user interface.
⚡ **Maven** - Dependency and build management.

## 🛠 Code Structure

📌 **Primary Components:**

- `Task.java` - Defines the task entity.
- `TaskRepository.java` - Handles database interactions.
- `TaskService.java` - Implements business logic.
- `WebController.java` - Manages HTTP requests and responses.
- `application.properties` - Configures database connection.
- `TaskmanagerApplication.java` - Main entry point for the application.

📌 **View Templates:**

- `tasks.html` - Displays all tasks.
- `addtask.html` - Form for adding a new task.
- `edit-task.html` - Form for modifying an existing task.

## 📋 Usage Instructions

1️⃣ **Start the Application**:

- Run `TaskmanagerApplication.java` from your IDE.
- Ensure PostgreSQL is running and configured correctly.
- Navigate to `http://localhost:8080/tasks` in your browser.

2️⃣ **Manage Your Tasks**:

- Click "Add Task" to create a new entry.
- Use the "Edit" button to modify an existing task.
- Click "Delete" to remove a task from the list.

## 🏆 Developers

Project developed by **Paul-Gabriel Ilie**. 🚀

