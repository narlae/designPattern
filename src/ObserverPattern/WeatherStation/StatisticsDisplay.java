package ObserverPattern.WeatherStation;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;

public class StatisticsDisplay implements Observer, DisplayElement{

    private ArrayList<Double> temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;


    public StatisticsDisplay(WeatherData weatherData) {
        temperature = new ArrayList<Double>();
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        DoubleSummaryStatistics statistics = temperature
                .stream()
                .mapToDouble(num -> num)
                .summaryStatistics();

        System.out.printf("평균/최고/최저 온도 = %.1f/%.1f/%.1f",statistics.getAverage(),
                statistics.getMax(),statistics.getMin());
        System.out.println();
    }

    @Override
    public void update() {
        temperature.add((double) weatherData.getTemperature());
        this.humidity = weatherData.getHumidity();
        display();
    }
}
