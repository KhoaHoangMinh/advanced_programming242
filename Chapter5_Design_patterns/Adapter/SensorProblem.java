// Service
class SuperTempReader {
    public void currentReading() {System.out.println("Reading from SuperTempReader");}
}
class TS7000 {
    public void getTemp() {System.out.println("Measuring temperature from TS7000");}
}
// Client interface
interface TempSensor {
    public void getTemperature();
}
// Adapter
class STRAdapter implements TempSensor {
    SuperTempReader superTempReader;
    STRAdapter(SuperTempReader obj) {superTempReader = obj;}
    @Override
    public void getTemperature() {superTempReader.currentReading();}
}
class TS7000Adapter implements TempSensor {
    TS7000 ts7000;
    TS7000Adapter(TS7000 obj) {ts7000 = obj;}
    @Override
    public void getTemperature() {ts7000.getTemp();}
}

public class SensorProblem {
    public static void main(String[] args) {
        SuperTempReader superTempReader = new SuperTempReader();
        TS7000 ts7000 = new TS7000();

        TempSensor sensor1 = new STRAdapter(superTempReader);
        TempSensor sensor2 = new TS7000Adapter(ts7000);
        // Client code
        sensor1.getTemperature();
        sensor2.getTemperature();
    }
}
