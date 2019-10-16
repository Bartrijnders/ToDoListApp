package MethodClasses;

import ItemDetails.IDetailAble;
import ToDoListItems.Task;

public class TaskDetailAdder {

    public void AddSingleDetail(Task task, IDetailAble detail){
        task.getDetails().add(detail);
    }
}
