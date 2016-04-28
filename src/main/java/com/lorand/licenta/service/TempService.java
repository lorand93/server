package com.lorand.licenta.service;

import com.lorand.licenta.model.TempModel;

public class TempService {
    static final TempModel temperature = new TempModel(20);
    
    public TempModel getTemp() {
	return temperature;
    }

    public TempModel updateTemperature(int temperatureValue) {
	temperature.setTemperature(temperatureValue);;
	return temperature;
    }
   

}
