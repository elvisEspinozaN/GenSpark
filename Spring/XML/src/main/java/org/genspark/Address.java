package org.genspark;

public class Address {
    private String city;
    private String state;
    private String country;
    private String zipcode;

// setter injection
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public void setZipcode(String zipcode) {
//        this.zipcode = zipcode;
//    }

// Constructor Injection
    public Address(String city, String state, String country, String zipcode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
