package com.example.helloworld.oop;

public class Car {
    private int speed;
    private String color;
    private String brand;

    public Car() {
        speed = 0;
        color = "Yellow";
        brand = "Honda";
    }

    public Car(int speed, String color, String brand) {
        this.speed = speed;
        this.color = color;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Viteza: " + speed + " Culoarea: " + color + " Brandul: " + brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String run() {
        if(color.equals("Blue") && speed > 0) {
            return "Running!!!";
        } else {
            return "Not running...";
        }
    }
}
