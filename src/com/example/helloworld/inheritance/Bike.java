package com.example.helloworld.inheritance;

public class Bike extends Vehicle{
    private String handle;

    public Bike() {
        this.handle = "Short";
    }

    public Bike(String handle, String engine, int wheels, int seats, int fuelTank, String lights) {
        super(engine, wheels, seats, fuelTank, lights);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    public void run() {
        System.out.println("Running BIKE!");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + handle + '\'' + " Engine: " + getEngine() +
                '}';
    }
}
