package org.example.service;

import org.example.entity.Todolist;
import org.example.repository.TodolistRepository;

public class TodolistServiceImpl implements TodolistService{

    private TodolistRepository todolistRepository;
    // inject

    public TodolistServiceImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void showTodoList() {
        System.out.println("===TodoList===");
        Todolist[] model = todolistRepository.getAlls();//! mengangkap data dari todorepo dimana data direturn berupa class array
        for(var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;
            if(todo != null){
                System.out.println(no + ". " + todo.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {
//        Todolist todolist = new Todolist(todo);
        todolistRepository.addTodo(new Todolist(todo));
        System.out.println("Sukses menambah todo : " + todo);

    }

    @Override
    public void removeTodoList(Integer number) {
        boolean success = todolistRepository.removeTodo(number);
        if(success){
            System.out.println("SUkses menghapus todo :" + number);
        }else {
            System.out.println("gagal menghapus todo : " + number);
        }
    }
}
/*
! 5. Repository&service menampilkan repository
* ini merupakan implementasi dari interface todolistService dengan method yang telah di register
* pada class todolistserviceImpl menggunakan field yaitu repository dan membuat constructor dengan parameter repository. sebelumnya repostory menghubungkan dengan manipulasi data dan service yang berhubungan dengan business logicnya.
* repository
6 ada di TodolistServiceTest
* */
