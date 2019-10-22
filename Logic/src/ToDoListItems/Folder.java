package ToDoListItems;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IToDoListItem {
    private List<IToDoListItem> items = new ArrayList<>();
    private String title;

    public Folder(String title) {
        this.title = title;
    }

    public List<IToDoListItem> getItems() {
        return items;
    }

    public void setItems(List<IToDoListItem> items) {
        this.items = items;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }
}
