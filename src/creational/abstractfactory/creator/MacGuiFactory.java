package creational.abstractfactory.creator;

import creational.abstractfactory.Button;
import creational.abstractfactory.Checkbox;
import creational.abstractfactory.product.MacButton;
import creational.abstractfactory.product.MacCheckbox;

public class MacGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
