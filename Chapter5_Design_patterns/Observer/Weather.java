import java.util.ArrayList;
import java.util.List;

interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
class WeatherStation {
    private float temperature;
    private float humidity;
    private float pressure;
    private final List<Observer> observerList;

    public WeatherStation() {
        observerList = new ArrayList<>();
    }
    public void registerObserver(Observer observer) { observerList.add(observer);}
    public void removeObserver(Observer observer) {
        observerList.removeIf(pObserver -> pObserver.equals(observer));
    }
    public void notifyObservers() {
        for(Observer observer : observerList) {observer.update(temperature, humidity, pressure);}
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
class Display implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Temperature: " + temperature
                        + "°C, Humidity: " + humidity
                        + "%, Pressure: " + pressure + "hPa");
    }
}
class TemperatureWarning implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        if(temperature > 30) {System.out.println("High temperature alert!");}
        else if(temperature < 20) {System.out.println("Low temperature alert!");}
    }
}
public class Weather {
    public static void main(String[] args) {
                WeatherStation station1 = new WeatherStation();

        Display monitor1 = new Display();
        TemperatureWarning monitor3 = new TemperatureWarning();

        station1.registerObserver(monitor1);
        station1.registerObserver(monitor3);

        station1.setMeasurements(25.5F, 60F, 1013.2F);
        station1.setMeasurements(32.2F, 70F, 1020.5F);
        station1.setMeasurements(24.8F, 58F, 1014.5F);
        station1.setMeasurements(15.7F, 30F, 1010.5F);

        System.out.println("\n");
        station1.removeObserver(monitor3);

        station1.setMeasurements(25.5F, 60F, 1013.2F);
        station1.setMeasurements(32.2F, 70F, 1020.5F);
        station1.setMeasurements(24.8F, 58F, 1014.5F);
        station1.setMeasurements(15.7F, 30F, 1010.5F);


    }
}
