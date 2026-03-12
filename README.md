# Task Manager in Java

## About the Project

This project is a simple task manager developed in Java with the purpose of practicing fundamental programming concepts and object-oriented programming.

The application allows the user to interact through a console menu and perform basic task management operations, such as:

- adding a task
- completing a task
- listing all tasks
- searching for a task by ID
- removing a task

This project was built as part of my learning journey in Java, focusing on logic, class organization, encapsulation, list manipulation, and system structure.

---

## Project Structure

The project is divided into three main classes:

### `Main.java`
Responsible for user interaction through the console menu.

### `Tarefa.java`
Represents a task object with its main attributes:
- `id`
- `descricao`
- `concluida`

### `GerenciarTarefa.java`
Responsible for managing the list of tasks and executing the main system operations.

---

## Features

The system currently supports:

- Create a new task
- Mark a task as completed
- List all registered tasks
- Search for a task by ID
- Remove a task by ID

---

## Technologies Used

- Java
- Object-Oriented Programming
- ArrayList
- Git
- GitHub
- Visual Studio Code

---

## Concepts Practiced

This project helped me improve the following skills:

- class creation
- object instantiation
- constructors
- encapsulation
- boolean logic
- menu systems with `switch`
- list manipulation with `ArrayList`
- search and removal of objects
- code organization into multiple classes
- version control with Git and GitHub

---

## How to Run

Make sure the files are inside the same package and folder structure.

Compile the project:

```bash
javac Anotacoes/*.java
java Anotacoes.Main