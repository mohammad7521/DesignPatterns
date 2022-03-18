package AdapterPattern;

public class Main {
    public static void main(String[] args) {

        ClockImpl clock=new ClockImpl();
        Watch watch=new WatchImpl();


        Watch clockAdapter=new ClockAdapter(clock);
        clockAdapter.showTime();

    }
}
