package creational.abstractfactory.product;

import creational.abstractfactory.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting Windows Checkbox ..... ");
    }

    @Override
    public void check() {
        System.out.println("Checking Windows Checkbox");
    }
}
