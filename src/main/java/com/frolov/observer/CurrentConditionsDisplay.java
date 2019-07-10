package com.frolov.observer;


import java.util.Observable;

/**
 * Created by Алексей on 09.04.2019.
 */
public class CurrentConditionsDisplay implements java.util.Observer, DisplayElement{
    private Observable observable;
    private float temperature;
    private float humidity;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + " % humidity");
    }

}
