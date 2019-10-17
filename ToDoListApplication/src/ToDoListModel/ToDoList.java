package ToDoListModel;

import ToDoListItems.IToDoListItem;

import java.io.Serializable;
import java.util.ArrayList;

public class ToDoList implements Serializable {
    ArrayList<IToDoListItem> items;

    public ToDoList(ArrayList<IToDoListItem> items) {
        this.items = items;
    }

    public ToDoList() {
        this.items = new ArrayList<>();
    }

    public ArrayList<IToDoListItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<IToDoListItem> items) {
        this.items = items;
    }
}
