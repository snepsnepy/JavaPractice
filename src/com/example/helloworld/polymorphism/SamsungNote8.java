package com.example.helloworld.polymorphism;

public class SamsungNote8 extends Phone {
    public SamsungNote8(String model) {
        super(model);
    }

    public void features() {
        System.out.println("This is a Samsung Note8!");
    }
}
