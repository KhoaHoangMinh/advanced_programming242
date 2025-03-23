import java.util.ArrayList;
import java.util.List;

// Subject
interface Subject {
    public void addObserver(DisplayDevice obj);
    public void removeObserver(DisplayDevice obj);
    public void notifyObserver();
}
// Observer
interface DisplayDevice {
    public void update(String weather);
}
class WeatherStation2 implements Subject {
    private List<DisplayDevice> observers ;
    public String weather;

    public WeatherStation2() { observers = new ArrayList<>();}
    @Override
    public void addObserver(DisplayDevice obj) {observers.add(obj);}
    @Override
    public void removeObserver(DisplayDevice obj) {observers.remove(obj);}
    @Override
    public void notifyObserver() {
        for(DisplayDevice device : observers) {
            device.update(weather);
        }
    }
    public void setWeather(String weather) {
        this.weather = weather;
        notifyObserver();
    }
}
// Concrete observer
class PhoneDisplay implements DisplayDevice {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }
    public void display() { System.out.println("From PhoneDisplay: the weather today is " + weather);}
}
// Concrete observer
class TVDisplay implements DisplayDevice {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }
    public void display() { System.out.println("From TVDisplay: the weather today is " + weather);}
}


public class Weather2 {
    public static void main(String[] args) {
        DisplayDevice iphone = new PhoneDisplay();
        DisplayDevice sonyTV = new TVDisplay();
        WeatherStation2 station = new WeatherStation2();
        int numWeather = 4;
        String[] weather = {"sunny", "rainy", "foggy", "windy"};

        station.addObserver(iphone);
        station.addObserver(sonyTV);

        for(String type : weather) {
            station.setWeather(type);
        }
    }
}
