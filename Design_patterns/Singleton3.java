// Enum based singleton
enum SingletonEnum {
    INSTANCE;
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}

public class Singleton3 {
    public static void main(String[] args) {
        SingletonEnum x = SingletonEnum.INSTANCE;
        SingletonEnum y = SingletonEnum.INSTANCE;

        System.out.println("singleton x == singleton y? " + (x == y));
        x.log("Singleton pattern with enum!");
        System.out.println("Hashcode of singleton x: " + x.hashCode());
        System.out.println("Hashcode of singleton y: " + y.hashCode());
    }
}
