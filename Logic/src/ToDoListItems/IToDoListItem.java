package ToDoListItems;

import java.io.Serializable;

public interface IToDoListItem extends Serializable {
    String getTitle();

    void setTitle(String title);
}
