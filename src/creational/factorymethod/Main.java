package creational.factorymethod;

import creational.factorymethod.creator.ButtonCreator;
import creational.factorymethod.creator.HtmlButtonCreator;
import creational.factorymethod.creator.MacButtonCreator;
import creational.factorymethod.creator.WindowsButtonCreator;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ButtonCreator buttonCreator; // we should create this guy.

        if (Objects.equals(System.getProperty("OS"), "Windows"))
            buttonCreator = new WindowsButtonCreator();
        else if (Objects.equals(System.getProperty("OS"), "Mac"))
            buttonCreator = new MacButtonCreator();
        else
            buttonCreator = new HtmlButtonCreator();

        var button = buttonCreator.createButton();
        button.paint();
    }
}
