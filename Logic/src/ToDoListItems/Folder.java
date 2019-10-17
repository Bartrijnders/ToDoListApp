package ToDoListItems;

import java.util.List;

public class Folder implements IToDoListItem {
    private List<IToDoListItem> items;
    private String title;

    public Folder(List<IToDoListItem> items, String title) {
        this.items = items;
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
