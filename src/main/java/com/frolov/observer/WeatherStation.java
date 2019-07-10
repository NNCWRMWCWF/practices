package com.frolov.observer;

/**
 * Created by Алексей on 13.04.2019.
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(9, 80, 600);
        weatherData.setMeasurements(11, 65, 590);
    }
}
