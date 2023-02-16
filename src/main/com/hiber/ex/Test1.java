package main.com.hiber.ex;

import main.com.hiber.entity.Detail;
import main.com.hiber.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory())
        {
            Session session = factory.getCurrentSession();

            Employee employee = new Employee("Nik", "Nik", "It", 6666);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();

            System.out.println("DONE!");
            session.close();
        }
    }
}