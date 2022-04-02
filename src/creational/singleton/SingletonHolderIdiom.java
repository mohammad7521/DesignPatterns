package creational.singleton;

// Lazy + Thread Safe. HOW?
public class SingletonHolderIdiom {

    // JVM won't load this class until it is accessed by some code.
    // JVM will Synchronize class initialization on first attempt.
    //  this approach is high performant because only on first attempt synchronization
    //  is applied.
    private static class LazyHolder {
        static SingletonHolderIdiom INSTANCE = new SingletonHolderIdiom();
    }

    public static SingletonHolderIdiom getInstance() {
        return LazyHolder.INSTANCE;
    }
}
