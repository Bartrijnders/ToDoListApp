package Entities;

import Interfaces.ITaskPrinter;

public class TaskConsolePrinter implements ITaskPrinter {
    @Override
    public void print(Task task) {
        System.out.println(task.toString());
    }
}
