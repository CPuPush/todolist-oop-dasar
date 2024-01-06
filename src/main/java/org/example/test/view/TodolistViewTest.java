package org.example.test.view;

import org.example.repository.TodolistRepository;
import org.example.repository.TodolistRepositoryImpl;
import org.example.service.TodolistService;
import org.example.service.TodolistServiceImpl;
import org.example.view.TodolistView;

public class TodolistViewTest {
    public static void main(String[] args) {
//        testShowTodoList();
//        testAddTodolist();
        testRemoveTodoList();
    }


    public static void testShowTodoList(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistService.addTodoList("makan");
        todolistService.addTodoList("minum");
        todolistService.addTodoList("tidur");

        todolistView.showTodoList();

    }

    public static void testAddTodolist(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistView.addTodoList();
        todolistService.showTodoList();
    }

    public static void testRemoveTodoList(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistView.addTodoList();
        todolistService.showTodoList();
        todolistView.removeTodoList();
        todolistService.showTodoList();
    }
}
