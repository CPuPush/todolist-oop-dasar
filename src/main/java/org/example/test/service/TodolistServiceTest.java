package org.example.test.service;

import org.example.entity.Todolist;
import org.example.repository.TodolistRepository;
import org.example.repository.TodolistRepositoryImpl;
import org.example.service.TodolistService;
import org.example.service.TodolistServiceImpl;

public class TodolistServiceTest {
    public static void main(String[] args) {
//        testAddTodoList();
//        testShowTodoList();
        testRemoveTodoList();
    }

    public static void testShowTodoList(){
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();
//        todolistRepository.data[0] = new Todolist("Belajar java dasar");
//        todolistRepository.data[1] = new Todolist("Belajar java ooops");

        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.showTodoList();
    }

    public static void testAddTodoList(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        todolistService.addTodoList("berangkat ke samosir");
        todolistService.addTodoList("berangkat ke india");
        todolistService.addTodoList("berangkat ke tangerang");

        todolistService.showTodoList();
    }

    public static void testRemoveTodoList(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        todolistService.addTodoList("berangkat ke samosir");
        todolistService.addTodoList("berangkat ke india");
        todolistService.addTodoList("berangkat ke tangerang");

        todolistService.showTodoList();

        todolistService.removeTodoList(3);
        todolistService.showTodoList();
        todolistService.removeTodoList(1);
        todolistService.showTodoList();
        todolistService.removeTodoList(13);
        todolistService.showTodoList();

    }
}
/*
! 6. Test Repository&service: menampilkan todolist
* konsep testShotTodoList menggunakan polimorphism => supaya yang bisa diakses oleh repository adalah yang diimplementasikan saja, sebenarnya sah sah saja memakai yang biasa tetapi seperti ini lebih direkomendsaikan
* stuck di relasi entity ke repository dimana class Todolist mengembalikan array.

note:
* sempat adanya kebingungan antar repository dan service jadi, repository berkenaan langsung dengan database atau data array, tetapi service ada logic yang dibuat atas data yang ada pada repository.
* seperti halnya showTodoList. TodolistRepository mereturn data dengan data sudah ditambahkan seperti contoh:
        todolistRepository.data[0] = new Todolist("Belajar java dasar");
        todolistRepository.data[1] = new Todolist("Belajar java ooops");
* nah kemudian Todoservice mengambil data tersebut kemudian diolah kembali dengan format yang ingin digunakan. Seperti itu dasar berfikirnya.
* */