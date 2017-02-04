package com.test.core.spring.ioc.beans;

import java.util.List;

/**
 *
 */
public class Garage {
    private int number;
    private Car car;

    public Garage() {
    }

    public Garage(int number, Car car) {
        this.number = number;
        this.car = car;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
