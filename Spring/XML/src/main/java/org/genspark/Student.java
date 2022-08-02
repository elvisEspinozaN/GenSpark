package org.genspark;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;


// setter injection
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setPh(List<Phone> ph) {
//        this.ph = ph;
//    }
//
//    public void setAdd(Address add) {
//        this.add = add;
//    }

// Construction Injection
    public Student(int id, String name, List<Phone> ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }
}
