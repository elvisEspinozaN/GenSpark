package org.genspark;

public class Tire {
    public String brand;
    public int size;

//    public Tire() {}
//
//    public Tire(String brand, int size) {
//        this.brand = brand;
//        this.size = size;
//    }

//    // setter injection
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//    public void setSize(int size) {
//        this.size = size;
//    }


    public Tire(String brand, int size) {
        this.brand= brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
