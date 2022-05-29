package com.panser.f1statistics.dto;

import com.panser.f1statistics.entity.Driver;

public class BestResult {

    private Driver driver;
    private Integer position;

    public BestResult(Driver driver, Integer position) {
        this.driver = driver;
        this.position = position;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
