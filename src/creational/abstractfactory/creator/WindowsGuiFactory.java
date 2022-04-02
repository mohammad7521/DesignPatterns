package creational.abstractfactory.creator;

import creational.abstractfactory.Button;
import creational.abstractfactory.Checkbox;
import creational.abstractfactory.product.WindowsButton;
import creational.abstractfactory.product.WindowsCheckbox;

public class WindowsGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
