package com.company;

import Storage.FileStorage.TxtFileLoader;
import Storage.FileStorage.TxtFileSaver;
import ToDoListItems.IToDoListItem;
import ToDoListItems.Task;
import ToDoListModel.ToDoList;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ToDoList toDoList1 = new ToDoList();
        Task task1 = new Task("lol");
        Task task2 = new Task("lol2");
        toDoList1.getItems().add(task1);
        toDoList1.getItems().add(task2);

        task1.setChecked(true);

        TxtFileSaver txtFileSaver = new TxtFileSaver();
        txtFileSaver.Save(toDoList1);

        TxtFileLoader txtFileLoader = new TxtFileLoader();
        ToDoList toDoList = txtFileLoader.Load();

        for(IToDoListItem item : toDoList.getItems()){
            System.out.println(item.toString());
        }
    }
}
