package com.weatherapi.model;

import lombok.Data;

@Data
public class WeatherData {
    private String city;
    private double temperature;
    private String description;
    private double humidity;
    private double windSpeed;
}
