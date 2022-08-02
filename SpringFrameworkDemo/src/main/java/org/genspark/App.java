package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        Car obj= new Car(); // this is tight coupling
//        obj.drive(); // this is not a good practice

//        Vehicle obj1= new Bike(); // not a good idea, still tight coupling
//        obj1.drive();

        // BeanFactory - very limited
        // ApplicationContext - for larger applications

        ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
        Vehicle obj= (Vehicle) context.getBean("Vehicle"); // this is dependency injection
        obj.drive();

//        Tire obj= (Tire) context.getBean("Tire");
//        System.out.println(obj);
    }
}
