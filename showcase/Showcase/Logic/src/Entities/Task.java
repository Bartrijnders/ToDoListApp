package Entities;

import Interfaces.ICheck;

public class Task implements ICheck {
    private String title;
    private Boolean checked;

    public Task(String title) {
        this.title = title;
        this.checked = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void check() {
        checked = !checked;
    }


}
