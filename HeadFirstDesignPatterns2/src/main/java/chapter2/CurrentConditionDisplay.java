package chapter2;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private float temp;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {

    }

    @Override
    public void update() {
        this.temp = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
