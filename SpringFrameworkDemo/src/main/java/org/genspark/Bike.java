package org.genspark;

public class Bike implements Vehicle {
    public Tire ti;

    public Bike(Tire ti) {
        this.ti= ti;
    }

    public void drive() {
        System.out.println("I'm riding bike "+ ti);
    }
}
