package com.weatherapi.controller;

import com.weatherapi.model.WeatherData;
import com.weatherapi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
@CrossOrigin(origins = "http://localhost:5500")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{city}")
    public WeatherData getWeather(@PathVariable String city) {
        return weatherService.getWeatherForCity(city);
    }
}
