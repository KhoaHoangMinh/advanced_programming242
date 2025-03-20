// Adaptee: the existing class with an incompatible interface
class LegacyPrinter {
    public void printDocument() {
        System.out.println("Printing by LegacyPrinter");
    }
}
// Target interface: the interface that the client code expects
interface Printer {
    public void print();
}
// Adapter
class PrinterAdapter implements Printer {
    LegacyPrinter legacyPrinter;
    PrinterAdapter(LegacyPrinter obj) {legacyPrinter = obj;}
    @Override
    public void print() {
        legacyPrinter.printDocument();
    }
}

public class PrinterProblem {

    public static void main(String[] args) {
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        Printer printerAdapter = new PrinterAdapter(legacyPrinter);
        // Client wants to use this only
        printerAdapter.print();
    }
}
