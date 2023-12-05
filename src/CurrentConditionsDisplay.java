public class CurrentConditionsDisplay implements CuriousWeatherWatcher {

    @Override
    public void update(WeatherData data) {
        System.out.println("Current conditions: " + data.getTemperature() + "F and " + data.getHumidity() + "% humidity");
    }    
}
