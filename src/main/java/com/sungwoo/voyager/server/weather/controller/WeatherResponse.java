package com.sungwoo.voyager.server.weather.controller;

import com.sungwoo.voyager.server.weather.service.WeatherView;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class WeatherResponse {

    private WeatherView view;
    private long id;

    public WeatherResponse(WeatherView view) {
        this.view = view;
    }
}
