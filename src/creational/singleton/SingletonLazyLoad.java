package creational.singleton;

// Not Thread Safe.
public class SingletonLazyLoad {
    private static SingletonLazyLoad INSTANCE;

    private SingletonLazyLoad() {}

    // we can put synchronized but what about performance?
    public static SingletonLazyLoad getInstance() {
        if (INSTANCE == null)
            INSTANCE = new SingletonLazyLoad();
        return INSTANCE;
    }
}
