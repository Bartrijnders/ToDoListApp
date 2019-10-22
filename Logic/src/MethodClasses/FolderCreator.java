package MethodClasses;

import ToDoListItems.Folder;

public class FolderCreator implements IItemCreator{

    private Folder output;

    public Folder Create(String title)
    {
        output = new Folder(title);
        return output;
    }}
