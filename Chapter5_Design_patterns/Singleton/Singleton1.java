
class Singleton {
    public String message;
    private static Singleton singleInstance = null;
    private Singleton() {
        message = "Hello, I am the message from Singleton class";
    }
    public static synchronized Singleton getInstance() {
        if(singleInstance == null) {singleInstance = new Singleton();}
        return singleInstance;
    }
    /*Thread safe Singleton:
    * Singleton property is maintained in multithreaded environment.
    * To make a singleton class thread safe, getInstance() method is made synchronized.
    * Multiple threads can't access it simultaneously.
    */
}

public class Singleton1 {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

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