package Classes;

import java.util.ArrayList;

public class ToDoList {

    private ArrayList<Task> tasks = new ArrayList<>();
    private ArrayList<Folder> folders= new ArrayList<>();
    private ArrayList<Label> labels = new ArrayList<>();



    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public ArrayList<Folder> getFolders() {
        return folders;
    }

    public ArrayList<Label> getLabels() {
        return labels;
    }
}
