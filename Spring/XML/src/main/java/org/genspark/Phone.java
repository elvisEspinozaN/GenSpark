package org.genspark;

public class Phone {
    private String mob;

// setter injection
//    public void setMob(String mob) {
//        this.mob = mob;
//    }

// Constructor Injection
    public Phone(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
