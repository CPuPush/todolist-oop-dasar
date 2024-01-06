package org.example.view;

import org.example.service.TodolistService;
import org.example.util.InputUtil;

public class TodolistView {

    private TodolistService todolistService;

    public TodolistView(TodolistService todolistService) {
        this.todolistService = todolistService;
    }

    public void showTodoList(){
        while (true){
            todolistService.showTodoList();

            System.out.println("Menu: ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Keluar");

            var input = InputUtil.input("Pilih");

            if(input.equals("1")){
                addTodoList();
            }else if(input.equals("2")){
                removeTodoList();
            }else if(input.equals("3")){
                break;
            }else{
                System.out.println("Inputan salah");
            }
        }
    }

    public void addTodoList(){
        System.out.println("Menambah todo list");
        var todo = InputUtil.input("Todo (x jika batal)");

        if (todo.equals("x")){
//            batal
        }else{
            todolistService.addTodoList(todo);
        }
    }

    public void removeTodoList(){
        System.out.println("Menghapus todo list");
        var todo = InputUtil.input("nomor berapa yang ingin dihapus? (x jika batal)");
        if (todo.equals("x")){

        }
        else {
            todolistService.removeTodoList(Integer.parseInt(todo));
        }
    }
}
/*
! 4. View
* belum langsung diimplementasikan karena ini merupakan layer terluar alias UI nya jadi akan diimplementasikan sedikit demi sedikit ketika pembuatan businnes logicnya
5 ada di TodolistServiceImpl
* */
