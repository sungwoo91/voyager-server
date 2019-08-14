package com.sungwoo.voyager.server.weather.controller;

import com.sungwoo.voyager.server.weather.service.WeatherService;
import com.sungwoo.voyager.server.weather.service.WeatherView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather/{hour}")
    @ResponseBody
    public WeatherResponse WeatherInfo(@PathVariable int hour) {
        log.info("hour : {}" , hour);

        WeatherView view = weatherService.WeatherInfo(hour);
        return new WeatherResponse(view);
    }
}
