public class CoordinatePoint {
    public static class Point2D {
        private float x = 0.0f;
        private float y = 0.0f;
        public Point2D(float x, float y) {
            this.x = x;
            this.y = y;
        }
        public Point2D() {
            this(0, 0);
        }
        public float getX() {
            return x;
        }
        public float getY() {
            return y;
        }
        public void setX(float x) {
            this.x = x;
        }
        public void setY(float y) {
            this.y = y;
        }
        public void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }
        public float[] getXY() {
            return new float[] {x, y};
        }
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
    public static class Point3D extends Point2D {
        private float z = 0.0f;
        public Point3D(float x, float y, float z) {
            super(x, y);
            this.z = z;
        }
        public Point3D() {
            this(0, 0, 0);
        }
        public float getZ() {
            return z;
        }
        public void setZ(float z) {
            this.z = z;
        }
        public void setXYZ(float x, float y, float z) {
            super.setXY(x, y);
            this.z = z;
        }
        public float[] getXYZ() {
            return new float[] {getX(), getY(), getZ()};
        }
        public String toString() {
            return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
        }

    }

    public static void testPoint2D() {
        // Creating a Point2D object
        Point2D point1 = new Point2D(5, 2);

        // Verifying the toString() method
        System.out.println(point1.toString()); // Expected: (5.0, 2.0)

        // Accessing individual coordinates using getters
        System.out.println("X: " + point1.getX()); // Expected: 5.0
        System.out.println("Y: " + point1.getY()); // Expected: 2.0

        // Modifying coordinates using setters
        point1.setX(10);
        point1.setY(20);

        // Verifying the updated coordinates
        System.out.println(point1.toString()); // Expected: (10.0, 20.0)

        // Setting both coordinates at once
        point1.setXY(30, 40);
        System.out.println(point1.toString()); // Expected: (30.0, 40.0)

        // Getting coordinates as array
        float[] coords = point1.getXY();
        System.out.println("X: " + coords[0] + ", Y: " + coords[1]); // Expected: X: 30.0, Y: 40.0
    }
    public static void testPoint3D() {
        // Creating a Point3D object
        Point3D point2 = new Point3D(5, 2, 7);

        // Verifying the toString() method
        System.out.println(point2.toString()); // Expected: (5.0, 2.0, 7.0)

        // Accessing individual coordinates using getters
        System.out.println("X: " + point2.getX()); // Expected: 5.0
        System.out.println("Y: " + point2.getY()); // Expected: 2.0
        System.out.println("Z: " + point2.getZ()); // Expected: 7.0

        // Modifying coordinates using setters
        point2.setX(10);
        point2.setY(20);
        point2.setZ(30);

        // Verifying the updated coordinates
        System.out.println(point2.toString()); // Expected: (10.0, 20.0, 30.0)

        // Setting all coordinates at once
        point2.setXYZ(40, 50, 60);
        System.out.println(point2.toString()); // Expected: (40.0, 50.0, 60.0)

        // Getting coordinates as array
        float[] coords3D = point2.getXYZ();
        System.out.println("X: " + coords3D[0] + ", Y: " + coords3D[1] + ", Z: " + coords3D[2]); // Expected: X: 40.0, Y: 50.0, Z: 60.0
    }
    public static void testGetArrays() {
        Point2D point2D = new Point2D(5, 10);
        Point3D point3D = new Point3D(1, 2, 3);

        // Print array from getXY() and getXYZ()
        float[] xy = point2D.getXY();
        System.out.println("Point2D Coordinates: X = " + xy[0] + ", Y = " + xy[1]); // Expected: X = 5.0, Y = 10.0

        float[] xyz = point3D.getXYZ();
        System.out.println("Point3D Coordinates: X = " + xyz[0] + ", Y = " + xyz[1] + ", Z = " + xyz[2]); // Expected: X = 1.0, Y = 2.0, Z = 3.0
    }

    public static void main(String[] args) {
//        testPoint2D();
//        testPoint3D();
        testGetArrays();
    }
}
