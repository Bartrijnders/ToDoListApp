package Classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DeadLine implements Detail {

    private Date dateTime;


    public DeadLine(Date dateTime) {
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
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
        String strDate = dateFormat.format(dateTime);
        return "Deadline: " + strDate;
    }
}
