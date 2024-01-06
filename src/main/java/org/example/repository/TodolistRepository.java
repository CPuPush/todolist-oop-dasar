package org.example.repository;

import org.example.entity.Todolist;

public interface TodolistRepository {
    // ? function kira kira akan digunakan
    // * dalam kasus ini get todos, add todos and delete todos
    Todolist[] getAlls();
    void addTodo(Todolist todolist);
    boolean removeTodo(Integer number);

}
/*
! 2. Repository
* Khusus untuk repository dan service, biasanya membuat interface dulu baru implementasi classnya
* interface => Revealing(mengungkapkan) an object's programming interface without revealing its class || declaring method one or more classes are expected to declare
* kenapa getAll tidak dijadikan sebagai function karena tipedata yg digunakan adalah array jadi hanya membalikkan array saja tidak perlu ada logic apapun disitu.
* repository hanya digunakan untuk koneksi ke database atau data. karena saat ini tidak ada sistem database pada aplikasi ini maka akan menggunakan array saja
3 ada di todolistService
* */