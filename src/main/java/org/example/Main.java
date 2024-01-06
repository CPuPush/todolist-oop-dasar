package org.example;

import org.example.repository.TodolistRepository;
import org.example.repository.TodolistRepositoryImpl;
import org.example.service.TodolistService;
import org.example.service.TodolistServiceImpl;
import org.example.view.TodolistView;

public class Main {
    public static void main(String[] args) {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistView.showTodoList();
    }
}