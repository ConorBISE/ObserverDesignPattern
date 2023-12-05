import java.util.ArrayList;

public class WeatherStation {
    private ArrayList<CuriousWeatherWatcher> observers;

    public void attach(CuriousWeatherWatcher observer) {
        observers.add(observer);
    };

    public void detatch(CuriousWeatherWatcher observer) {
        observers.remove(observer);
    };

    public void notifi() {
        for (CuriousWeatherWatcher observer : observers) {
            observer.update(getWeatherData());
        }
    };
    
    public WeatherData getWeatherData() { return null; };
}
