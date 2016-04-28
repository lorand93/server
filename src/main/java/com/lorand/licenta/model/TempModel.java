package com.lorand.licenta.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TempModel {

    private int temperature;
    private String userId;
    private String password;
    
    public TempModel() {
	
    }
    
    public TempModel(int temperature) {
	this.temperature = temperature;
    }
        
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
