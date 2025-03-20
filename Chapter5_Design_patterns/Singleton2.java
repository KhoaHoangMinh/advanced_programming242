
public class Singleton2 {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        x.message = (x.message).toUpperCase();

        System.out.println("Message from is x" + x.message);
        System.out.println("Message from is y" + y.message);
        System.out.println("Message from is z" + z.message + "\n");

        z.message = (z.message).toLowerCase();

        System.out.println("Message from is x" + x.message);
        System.out.println("Message from is y" + y.message);
        System.out.println("Message from is z" + z.message);
    }

}
