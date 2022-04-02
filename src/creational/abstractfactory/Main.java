package creational.abstractfactory;

import creational.abstractfactory.creator.GuiFactory;
import creational.abstractfactory.creator.MacGuiFactory;
import creational.abstractfactory.creator.WindowsGuiFactory;


import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        GuiFactory guiFactory;

        // Configuration.
        if (Objects.equals(System.getProperty("os.name"), "Windows 10"))
            guiFactory = new WindowsGuiFactory();
        else
            guiFactory = new MacGuiFactory();

        guiFactory.createButton().paint();
        guiFactory.createButton().paint();
    }
}
