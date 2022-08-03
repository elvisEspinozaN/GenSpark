package org.genspark;

import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

public class AppConfig {
    @Bean
    public Student getStudent(int id, String name, List<Phone> ph, Address add) {
        return new Student(id, name, ph, add);
    }

    @Bean
    public String name() {
        return "John Doe";
    }

    @Bean
    public int id() {
        return 123;
    }

    @Bean
    public List<Phone> ph() {
        List<Phone> ph= new ArrayList<>();
        ph.add(new Phone("000-000-0000"));
        ph.add(new Phone("111-111-1111"));
        ph.add(new Phone("222-222-2222"));
        return ph;
    }

    @Bean
    public Address add(String city, String state, String country, String zipcode) {
        return new Address("NYC", "NY", "US", "12345");
    }


}
