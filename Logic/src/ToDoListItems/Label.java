package ToDoListItems;


public class Label implements IToDoListItem {

    private String title;
    private String HexColor;

    public Label(String title, String hexColor) {
        this.title = title;
        HexColor = hexColor;
    }

    public Label(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void setTitle(String title) {

    }
}
