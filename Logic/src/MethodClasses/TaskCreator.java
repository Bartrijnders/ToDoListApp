package MethodClasses;

import ToDoListItems.Task;

public class TaskCreator implements IItemCreator {

    private Task output;

    @Override
    public Task Create(String title){
        output = new Task(title);
        return output;
    }
}
