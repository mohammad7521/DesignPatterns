package creational.abstractfactory.creator;

import creational.abstractfactory.Button;
import creational.abstractfactory.Checkbox;

public interface GuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}
