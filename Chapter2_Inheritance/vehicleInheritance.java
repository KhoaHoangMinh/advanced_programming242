public class vehicleInheritance {
    public static class Vehicle{
        private String brand;
        private int year;

        public Vehicle() {
            this.brand = "Unknown";
            this.year = 0;
        }
        public Vehicle(String brand, int year) {
            this.brand = brand;
            this.year = year;
        }
        public String getBrand() {
            return brand;
        }
        public int getYear() {
            return year;
        }
        public void setBrand(String brand) {
            this.brand = brand;
        }
        public void setYear(int year) {
            this.year = year;
        }
        public void displayInfo() {
            System.out.println("Brand: " + brand
                    + ", Year: " + year);
        }
    }
    public static class Car extends Vehicle {
        private String model;
        public Car(String brand, String model, int year) {
            this.setBrand(brand);
            this.model = model;
            this.setYear(year);
        }
        public Car() {
            this("Unknown", "Unknown", 0);
        }
        public String getModel() {
            return model;
        }
        public void setModel(String model) {
            this.model = model;
        }
        @Override
        public void displayInfo() {
            System.out.println("Brand: " + this.getBrand()
                    + ", Model: " + this.model
                    + ", Year: " + this.getYear());
        }
    }
    public static class Bike extends Vehicle {
        private int engineCapacity;
        public Bike(String brand, int year, int engineCapacity) {
            setBrand(brand);
            setYear(year);
            this.engineCapacity = engineCapacity;
        }
        public Bike() {
            this("Unknown", 0, 0);
        }
        public int getEngineCapacity() {
            return engineCapacity;
        }
        public void setEngineCapacity(int engineCapacity) {
            this.engineCapacity = engineCapacity;
        }
        @Override
        public void displayInfo() {
            System.out.println("Brand: " + getBrand() + ", Year: "
                    + getYear() + ", Engine capcity: "
                    + getEngineCapacity());
        }
    }
    public static void main(String[] args) {
        Car myCar1 = new Car();
        Car myCar2 = new Car("Subaru", "BRZ", 2020);
        myCar1.displayInfo();
        myCar2.displayInfo();

        Bike myBike1 = new Bike();
        Bike myBike2 = new Bike("Honda", 2017, 150);
        myBike1.displayInfo();
        myBike2.displayInfo();
    }
}
