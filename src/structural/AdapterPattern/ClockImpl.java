package structural.AdapterPattern;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClockImpl implements Clock{

    @Override
    public void showTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}
