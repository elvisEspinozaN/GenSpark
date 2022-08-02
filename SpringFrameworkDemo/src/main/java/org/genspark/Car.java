package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;

public class Car implements Vehicle {
    public Tire ti;

//    // technique known as setter injection
//    public Tire getTi() {
//        return ti;
//    }
//
//    public void setTi(Tire ti) {
//        this.ti = ti;
//    }


    public Car(Tire ti) {
        this.ti = ti;
    }

    public void drive() {
        System.out.println("I'm driving car "+ ti);
    }
}
