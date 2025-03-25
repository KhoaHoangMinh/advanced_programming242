// Product interface
interface Vehicle {
    public void printVehicle();
}
// Concrete products
class TwoWheeler implements Vehicle {
    @Override
    public void printVehicle() { System.out.println("Two Wheeler vehicle"); }
}
class FourWheeler implements Vehicle {
    @Override
    public void printVehicle() { System.out.println("Four Wheeler vehicle"); }
}
// Factory interface
interface VehicleFactory {
    public Vehicle createVehicle();
}
// Concrete factory
class TwoWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() { return new TwoWheeler(); }
}
class FourWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() { return new FourWheeler(); }
}
class Client {
    private Vehicle pVehicle;
    public Client(VehicleFactory factory) { pVehicle = factory.createVehicle(); }
    public Vehicle getVehicle() { return pVehicle; }
}
public class VehicleExample {
    public static void main(String[] args) {
        TwoWheelerFactory twoWheelerFactory = new TwoWheelerFactory();
        Client twoWheelerClient = new Client(twoWheelerFactory);
        Vehicle motorcycle = twoWheelerClient.getVehicle();
        motorcycle.printVehicle();

        FourWheelerFactory fourWheelerFactory = new FourWheelerFactory();
        Client fourWheelerClient = new Client(fourWheelerFactory);
        Vehicle car = fourWheelerClient.getVehicle();
        car.printVehicle();
    }
}
