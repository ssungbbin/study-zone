package com.ohgiraffers.section03;

public class CarCenter <T extends SportCar>{
    private T car;

    public CarCenter() {}
    public CarCenter(T car) {this.car = car;}

    public void setCar(T car) {this.car = car;}
    public T getCar() {return this.car;}
}
