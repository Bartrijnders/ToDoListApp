package ItemDetails;

public class Description implements IDetailAble {

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
