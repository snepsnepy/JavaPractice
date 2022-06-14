package com.example.helloworld;

public class Methods {
    public static void main(String[] args) {
        double area = rectangleArea(5.4, 3.2);
        System.out.println("Area is: " + area);
    }

    public static double rectangleArea(double length, double width) {
        return length * width;
    }
}
