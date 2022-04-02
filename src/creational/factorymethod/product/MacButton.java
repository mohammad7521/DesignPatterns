package creational.factorymethod.product;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting Mac Button .... ");
    }

    @Override
    public void click() {
        System.out.println("Mac Button  Clicking .... ");
    }
}
