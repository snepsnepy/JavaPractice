package com.example.helloworld.staticElements;

public class App {
    public static void main(String[] args) {
        System.out.println("Current var value: " + TestStatic.getStaticVar());
        TestStatic.setStaticVar(1);
        System.out.println("Current var value: " + TestStatic.getStaticVar());
        TestStatic.setStaticVar(24);
        System.out.println("Current var value: " + TestStatic.getStaticVar());

    }
}
