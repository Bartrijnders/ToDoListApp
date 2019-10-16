package ToDoListItems;

import ItemDetails.IDetailAble;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {

    private String title;
    private boolean checked;
    private List<IDetailAble> details;
    private Date dateOfCreation;

    public Task(String title) {
        this.title = title;
        this.checked = false;
        this.details = new ArrayList<>();
        this.dateOfCreation = new Date(System.currentTimeMillis());

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public List<IDetailAble> getDetails() {
        return details;
    }

    public void setDetails(List<IDetailAble> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Tilte: " + title + ", Checked: " + checked);
        for (IDetailAble detail : details) {
            output.append(", ");
            output.append(detail.toString());
        }
        return output.toString();
    }
}
