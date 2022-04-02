package creational.factorymethod.creator;

import creational.factorymethod.product.Button;
import creational.factorymethod.product.WindowsButton;

public class WindowsButtonCreator implements ButtonCreator {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
