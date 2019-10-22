package MethodClasses;

import ToDoListItems.IToDoListItem;

public interface IItemCreator {
    IToDoListItem Create(String title);
}
