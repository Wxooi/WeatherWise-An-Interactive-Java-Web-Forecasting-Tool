package com.weatherapi.service;

import com.weatherapi.model.WeatherData;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    public WeatherData getWeatherForCity(String city) {
        WeatherData weatherData = new WeatherData();
        weatherData.setCity(city);

        // Mock data
        switch (city.toLowerCase()) {
            case "london":
                weatherData.setTemperature(15.5);
                weatherData.setDescription("Partly Cloudy");
                break;
            case "new york":
                weatherData.setTemperature(22.3);
                weatherData.setDescription("Sunny");
                break;
            default:
                weatherData.setTemperature(20.0);
                weatherData.setDescription("Mild");
        }

        weatherData.setHumidity(65.0);
        weatherData.setWindSpeed(10.5);

        return weatherData;
    }
}
