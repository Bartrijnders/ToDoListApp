package MethodClasses;

import ToDoListItems.Label;

public class LabelCreator implements ILabelCreator {

    private Label output;

    public Label Create(String title){
        output = new Label(title);
        return output;
    }

    public Label Create(String title, String colorCode){
        output = new Label(title, colorCode);
        return output;
    }

}
