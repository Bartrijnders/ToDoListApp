package com.company;

import Entities.Task;
import Entities.TaskConsolePrinter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Task task = new Task("new event");
        TaskConsolePrinter taskConsolePrinter = new TaskConsolePrinter();
        taskConsolePrinter.print(task);

    }
}
