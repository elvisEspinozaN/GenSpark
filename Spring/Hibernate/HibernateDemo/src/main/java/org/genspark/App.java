package org.genspark;

import org.genspark.Entity.Employee;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("Employee DB");

        Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory(); // create the session :: open the session

        Session session= factory.openSession();

        Transaction t= session.beginTransaction(); // create object for transaction :: begin the transaction

//        Employee e1= new Employee(); // creating an object for this class
//        e1.setEmpId(1);
//        e1.setEmpName("John Doe");
//        e1.setEmpDept("HR Dept");

//        session.save(e1); // to save :: ensure to commit

        Query q= session.createQuery("update Employee set empName=:n where empId=:i");
        q.setParameter("n", "Elvis Esp");
        q.setParameter("i", 1);
        int status= q.executeUpdate();
        System.out.println(status);

        t.commit();
        System.out.println("Successfully Saved");
        factory.close();
        session.close();
    }
}
