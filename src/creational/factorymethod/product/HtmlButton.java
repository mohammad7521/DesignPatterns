package creational.factorymethod.product;

public class HtmlButton implements Button {
    @Override
    public void paint() {
        System.out.println(" Painting Html Button ....");
    }

    @Override
    public void click() {
        System.out.println("Html Button Clicking ....");
    }
}
