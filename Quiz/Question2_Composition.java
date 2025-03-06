public class Question2_Composition {
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
    public static class Circle {
        private Point center;
        private int radius;
        public Circle(Point center, int radius) {
            this.center = center;
            this.radius = radius;
        }
        public Point getCenter() {
            return center;
        }
        public int getRadius() {
            return radius;
        }
        public void setCenter(Point center) {
            this.center = center;
        }
        public void setRadius(int radius) {
            this.radius = radius;
        }
        public void setXY(int x, int y) {
            center.setXY(x, y);
        }
        public double getArea() {
            return Math.PI * radius * radius;
        }
        public double getCircumference() {
            return 2 * Math.PI * radius;
        }
    };
    public static void main(String[] args) {
        Point center = new Point(0, 0);
        Circle circle = new Circle(center, 5);
        System.out.println("I = (" + center.getX() + ", " + center.getY() + ")");
        System.out.println("Radius = " + circle.getRadius());
        System.out.println("Area = " + circle.getArea());
        System.out.println("Circumference = " + circle.getCircumference());
    }
}
