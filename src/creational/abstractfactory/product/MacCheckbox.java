package creational.abstractfactory.product;

import creational.abstractfactory.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting Mac Checkbox ..... ");
    }

    @Override
    public void check() {
        System.out.println("Checking mac Checkbox");
    }
}
