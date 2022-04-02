package creational.factorymethod.creator;

import creational.factorymethod.product.Button;
import creational.factorymethod.product.HtmlButton;

public class HtmlButtonCreator implements ButtonCreator {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
