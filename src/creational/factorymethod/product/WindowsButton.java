package creational.factorymethod.product;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Painting Window Button ....");
    }

    @Override
    public void click() {
        System.out.println("Windows Button Click ...");
    }
}
