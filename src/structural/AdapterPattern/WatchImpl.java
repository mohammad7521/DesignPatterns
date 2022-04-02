package structural.AdapterPattern;

import java.util.Date;

public class WatchImpl implements Watch{
    @Override
    public void showTime() {
        System.out.println("the time is: "+new Date().getTime());
    }
}
