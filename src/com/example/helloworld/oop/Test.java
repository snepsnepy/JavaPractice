package com.example.helloworld.oop;

public class Test {
    public static void main(String[] args) {
        Car Dacia = new Car(0, "Yellow", "Dacia");
        Car Honda = new Car(10, "Blue", "Honda");

//        honda.setColor("Blue");
//        honda.setSpeed(0);
//        System.out.println(honda.getColor());

        System.out.println(Dacia.toString());
    }


}
