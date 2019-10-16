package com.company;

import ItemDetails.*;
import MethodClasses.TaskDetailAdder;
import ToDoListItems.Task;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Task taak1 = new Task("taak1");
        Task taak2 = new Task("taak2");
        IDetailAble description1 = new Description("dit is de eerste taak");
        Date date = new Date(System.currentTimeMillis());
        IDetailAble deadline = new Deadline(date);
        IDetailAble prio2 = new Priority(PriorityLevel.HIGH);
        IDetailAble rep = new Repetition(RepetitionInterval.MONTLY);
        TaskDetailAdder tda = new TaskDetailAdder();
        tda.AddSingleDetail(taak1, description1);
        tda.AddSingleDetail(taak2,prio2 );
        tda.AddSingleDetail(taak1, deadline);
        tda.AddSingleDetail(taak1, rep);
        System.out.println(taak1.toString());
        System.out.println(taak2.toString());
    }
}
