public class polymorphism {
    public static class Superclass {
        public void display() {
            System.out.println("Superclass");
        }
    }
    public static class Subclass extends Superclass{
        @Override
        public void display() {
            System.out.println("Subclass");
        }
    }
    public static void main(String[] args) {
        Superclass obj = new Subclass();
        obj.display();

    }
}