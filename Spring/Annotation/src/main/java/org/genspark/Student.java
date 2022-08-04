package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student{
    private int id;
    private String name;
    @Autowired
    List<Phone> ph;
    @Autowired
    private Address add;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public Address getAdd() {
        return add;
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
