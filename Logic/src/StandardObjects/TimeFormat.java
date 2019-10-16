package StandardObjects;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {

    private SimpleDateFormat format;

    public String format_DMYUMS(Date date){
        format = new SimpleDateFormat("dd-MM-yy, HH:mm:ss");
        return format.format(date);
    }
}
