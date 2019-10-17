package Classes;

import java.util.ArrayList;
import java.util.List;

public class Task {

    private String title;
    private Boolean checked;
    private ArrayList<Detail> details;
    private Label label;

    public Task(String title, Boolean checked) {
        this.title = title;
        this.checked = checked;
        this.details = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public List<Detail> getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return ("Title: " + title + ", Done: " + checked);
    }
}
