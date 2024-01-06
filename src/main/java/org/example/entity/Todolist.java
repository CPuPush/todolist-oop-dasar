package org.example.entity;

public class Todolist {
    private String todo;

    //constructor
    public Todolist(){
    }

    public Todolist(String todo){
        this.todo = todo;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}
/*
! 1. Membuat entity
* apa yang dibutuhkan yaitu hanya todolist pada aplikasi ini.
* pembuatan setter dan getter dilakukan untuk encapculation (retrict to some of an object's components and only expose what is necessary)
* fun fact kita bisa buat class menjadi tipe data array. dimana pada class Todolist ini di assign menjadi array. Todolist[]
2 ada di TodolistRepository
* */
