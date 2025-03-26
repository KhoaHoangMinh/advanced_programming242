interface Shape {
    public void draw();
}
class Circle implements Shape {
    public void draw() { System.out.println("Circle draw() method"); }
}
class Square implements Shape {
    public void draw() { System.out.println("Square draw() method"); }
}
class Rectangle implements Shape {
    public void draw() { System.out.println("Rectangle draw() method"); }
}

class ShapeFactory {
    public enum shapes {CIRCLE, SQUARE, RECTANGLE}
    public Shape getShape(shapes shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
            default -> null;
        };
    }
}

public class ShapeExample {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape(ShapeFactory.shapes.CIRCLE);
        Shape square = factory.getShape(ShapeFactory.shapes.SQUARE);
        Shape rectangle = factory.getShape(ShapeFactory.shapes.RECTANGLE);

        circle.draw();
        square.draw();
        rectangle.draw();

    }
}
