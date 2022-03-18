package AdapterPattern;

public class ClockAdapter implements Watch {


    Clock clock;

    public ClockAdapter(Clock clock){
        this.clock=clock;
    }


    @Override
    public void showTime() {
        clock.showTime();
    }
}
