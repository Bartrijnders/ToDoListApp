package Classes;

public class Description implements Detail {

    private String text;

    public Description(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Description: " + text;
    }
}
