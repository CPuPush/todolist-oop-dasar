package org.example.repository;

import org.example.entity.Todolist;

public class TodolistRepositoryImpl implements TodolistRepository{

    public Todolist[] data = new Todolist[10];

//    membuat method baru untuk melakukan pengecheckan
    public boolean isFull(){
        boolean isFull = true;
        for (int i = 0; i < data.length; i++){
            if(data[i] == null){
                // model masih kosong
                isFull = false;
                break;
            }
        }
        return isFull;
    }

//    membuat method baru untuk resize arraynya
    public void resizeIfFull(){
        if(isFull()){
            //* menambahkan kapasitas array objectnya dari 10 menjadi 20 contohnya nantinya jika 20 full maka dikali 2 lagi
            var temp = data;
            data = new Todolist[data.length*2];

            //* data yang sudah ada sebelumnya di assign ke variable yang baru yaitu dari temp ke data
            for(int i = 0; i < temp.length; i++){
                data[i] = temp[i];
            }
        }
    }

    @Override
    public Todolist[] getAlls() {
        return data;
    }

    @Override
    public void addTodo(Todolist todolist) {
        resizeIfFull();
        // * selanjutanya menambahkan data yang ke tempat yang kosong yaitu null
        for(int i = 0; i < data.length; i++){
            if(data[i] == null){
                data[i] = todolist;
                break;
            }
        }
    }

    @Override
    public boolean removeTodo(Integer number) {
        //check apakah angka yg dimasukkan valid atau tidak
        if((number - 1) >= data.length){
            return false;
        }else if(data[number-1] == null){
            return false;
        }else{
            for(int i = (number-1); i < data.length; i++){
                if(i == (data.length - 1)){
                    data[i] =null;
                }else {
                    data[i] = data[i+1];
                }
            }
        }
        return true;
    }
}

/*
* 7. Repository & Service menambah todolist
* 8. menghapus todolist
* */

