package creational.singleton;

public class Singleton1Main {
    public static void main(String[] args) {
        var singleton_1 = SingletonEager.getInstance();

        var singletonHolderIdiom = SingletonHolderIdiom.getInstance();
    }
}
