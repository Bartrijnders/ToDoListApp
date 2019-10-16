package ItemDetails;

import StandardObjects.TimeFormat;

import java.util.Date;

public class Deadline implements IDetailAble{

    private Date dateTime;

    public Deadline(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        TimeFormat tf = new TimeFormat();
        return "Deadline: " + tf.format_DMYUMS(dateTime);
    }
}
