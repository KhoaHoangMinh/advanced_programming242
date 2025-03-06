public class Question2_Inheritance {
    public static class Point {
        private int x;
        private int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public void setX(int x) {
            this.x = x;
        }
        public void setY(int y) {
            this.y = y;
        }
        public void setXY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    };
    public static class Circle extends Point {
        private int radius;
        Circle(int x, int y, int radius) {
            super(x, y);
            this.radius = radius;
        }
        public int getRadius() {
            return radius;
        }
        public void setRadius(int radius) {
            this.radius = radius;
        }
        public double getCircumference() {
            return (Math.PI * 2 * radius * 100.0) / 100.0;
        }
        public double getArea() {
            return (Math.PI * radius * radius * 100.0) / 100.0;
        }
    };
    public static void main(String[] args) {
        System.out.println("Question2: ");
        Circle circle1 = new Circle(1, 2, 3);
        System.out.println("I = (" + circle1.getX() + ", " + circle1.getY() + "), ");
        System.out.println("R = " + circle1.getRadius());
        System.out.println("C = " + circle1.getCircumference());
        System.out.println("S = " + circle1.getArea());
    }
}
