package MethodClasses;

import ToDoListItems.IToDoListItem;

public interface ILabelCreator extends IItemCreator{

    IToDoListItem Create(String title, String colorCode);
}
