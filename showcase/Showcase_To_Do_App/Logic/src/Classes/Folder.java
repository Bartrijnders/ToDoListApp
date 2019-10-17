package Classes;

import java.util.ArrayList;

public class Folder {

    private String Name;
    private ArrayList<Task> tasks;

    public Folder(String name, ArrayList<Task> tasks) {
        Name = name;
        this.tasks = tasks;
    }

    public String getName() {
        return Name;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setName(String name) {
        Name = name;
    }
}
