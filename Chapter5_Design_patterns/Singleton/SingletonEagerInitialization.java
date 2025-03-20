
class SingletonE {
    private static final SingletonE singleInstance = new SingletonE();
    // The final keyword in Java is used as a non-access modifier applicable to only a variable,
    // a method, or a class. It is used to restrict a user
    private SingletonE() {}
    public static SingletonE getInstance() {
        return singleInstance;
    }
}

public class SingletonEagerInitialization {
    public static void main(String[] args) {
        SingletonE x = SingletonE.getInstance();
        SingletonE y = SingletonE.getInstance();
        SingletonE z = SingletonE.getInstance();

        System.out.println("Hashcode of x is " + x.hashCode());
        System.out.println("Hashcode of y is " + y.hashCode());
        System.out.println("Hashcode of z is " + z.hashCode());

        if(x == y && y == z) {
            System.out.println("Three objects point to the same memory location on the heap");
            System.out.println("i.e, to the same object");
        } else {
            System.out.println("Three objects DO NOT point to the same memory location on the heap");
        }
    }
}
