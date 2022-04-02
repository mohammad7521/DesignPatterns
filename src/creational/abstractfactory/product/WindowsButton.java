package creational.abstractfactory.product;

import creational.abstractfactory.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting Windows Button .... ");
    }

    @Override
    public void click() {
        System.out.println("Windows Button Clicked .... ");
    }
}
