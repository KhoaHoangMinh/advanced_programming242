interface Car { public void assemble(); }
class Sedan implements Car {
    @Override
    public void assemble() { System.out.println("Assembling a sedan car"); }
}
class HatchBack implements Car {
    @Override
    public void assemble() { System.out.println("Assembling a hatchback car"); }
}

interface CarSpecification { public void display(); }
class NorthAmericaSpec implements CarSpecification {
    @Override
    public void display() {
        System.out.println("North America Car Specification: Safety " +
                "features compliant with local regulations.");
    }
}
class EuropeSpec implements CarSpecification {
    @Override
    public void display() {
        System.out.println("Europe Car Specification: Fuel " +
                "efficiency and emissions compliant with EU standards.");
    }
}

// Abstract factory
interface CarFactory {
    public Car createCar();
    public CarSpecification createSpecification();
}
// Concrete factories
class NorthAmericaFactory implements CarFactory {
    @Override
    public Car createCar() { return new Sedan(); }
    @Override
    public CarSpecification createSpecification() { return new NorthAmericaSpec(); }
}
class EuropeFactory implements CarFactory {
    @Override
    public Car createCar() { return new HatchBack(); }
    @Override
    public CarSpecification createSpecification() { return new EuropeSpec(); }
}

public class AbstractFactoryExample {
    public static void main(String[] args) {
        CarFactory northAmericanFactory = new NorthAmericaFactory();
        CarSpecification americanSpec = northAmericanFactory.createSpecification();
        Car sedan = northAmericanFactory.createCar();
        americanSpec.display();
        sedan.assemble();

        CarFactory europeFactory = new EuropeFactory();
        CarSpecification europeSpec = europeFactory.createSpecification();
        Car hatchBack = europeFactory.createCar();
        europeSpec.display();
        hatchBack.assemble();
    }
}
