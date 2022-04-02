package creational.factorymethod.creator;

import creational.factorymethod.product.Button;
import creational.factorymethod.product.MacButton;

public class MacButtonCreator implements ButtonCreator {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
