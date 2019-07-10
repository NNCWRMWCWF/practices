package com.frolov.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Алексей on 13.04.2019.
 */
public class StatisticsDisplay implements Observer, DisplayElement{
    private Observable weatherData;
    private float temperature;
    private float humidity;
    private float pressure;


    public StatisticsDisplay(WeatherData data){
        this.weatherData = data;
        this.weatherData.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println(String.format("Static temperature: %f,\nStatic humidity: %f,\nStatic pressure: %f\n", temperature, humidity, pressure));
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData){
            WeatherData data = (WeatherData)obs;
            this.temperature = data.getTemperature();
            this.humidity = data.getHumidity();
            this.pressure = data.getPressure();
            display();
        }
    }
}
