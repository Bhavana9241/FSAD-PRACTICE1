package com.klu.demo;

public class Bike {

    private Engine engine;

    public Bike() {
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void ride() {
        engine.start();
        System.out.println("Bike is running");
    }
}
