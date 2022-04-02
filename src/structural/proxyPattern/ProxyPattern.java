package structural.proxyPattern;

public class ProxyPattern {

    //the proxy pattern is used to act as an interface to another resource
    //consider a heavy object like jdbc or session factory:
    //it's not practical to create an instance of these objects whenever we
    //want to use them

    public interface HeavyObject {
        void doSomething();
    }

    public class HeavyObjectImpl implements HeavyObject{


        @Override
        public void doSomething() {
            System.out.println("processing...");
        }
    }


    //now we use the proxy pattern to initialize object on demand

    public class HeavyObjectProxy implements HeavyObject{

        private HeavyObject heavyObject;
        @Override
        public void doSomething() {
            if (heavyObject==null){
                heavyObject=new HeavyObjectImpl();
            }
            heavyObject.doSomething();
        }

    }

}
