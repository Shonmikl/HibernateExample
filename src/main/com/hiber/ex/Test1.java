package main.com.hiber.ex;

import main.com.hiber.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory())
        {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Elena", "Filipouskaya", "IT", 3555);

            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
        }
    }
}