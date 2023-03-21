/**
 * @author : Gathsara
 * created : 3/12/2023 -- 1:44 PM
 **/

package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.*;
import lk.ijse.hibernate.util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AppInitializer {
    public static void main(String[] args) {

   /*
      Basic crud

        Customer customer = new Customer();
        customer.setId("C001");
        customer.setName("Gathsara");
        customer.setSalary(100000);
        customer.setAddress("Galle");

        Customer customer1=new Customer();
        customer1.setId("C002");
        customer1.setName("Liviru");
        customer1.setSalary(200000);
        //customer1.setAddress("Colombo");
        customer1.setAddress("Panadura");


        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

    add

        session.save(customer);
        session.save(customer1);

     update

        session.update(customer1);

     get one

        Customer customer2 = session.get(Customer.class, "C001");
        System.out.println(customer);


        Customer customer3=new Customer();

        transaction.commit();
        session.close();

        */

      /*  Student s1 = new Student();
        s1.setId("S001");
        s1.setName("Gathsara");

        Laptop l1 = new Laptop();
        l1.setLid("L001");
        l1.setDescription("hp");
        l1.setStudent(s1);

        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(s1);
        session.save(l1);

        transaction.commit();
        session.close();*/


        Owner o1 = new Owner();
        o1.setoId("O001");
        o1.setName("Gathsara");

        Owner o2 = new Owner();
        o2.setoId("O002");
        o2.setName("Kavindu");

        Pet p1 = new Pet();
        p1.setPid("P001");
        p1.setName("Ash");
        p1.setOwner(o1);

        Pet p2 = new Pet();
        p2.setPid("P002");
        p2.setName("Tommy");
        p2.setOwner(o1);

        Pet p3 = new Pet();
        p3.setPid("P003");
        p3.setName("Fish");
        p3.setOwner(o2);

        //1 st method for creating list
        List<Pet> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);

        // 2 nd method

       o2.getList().add(p3);

        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(o1);
        session.save(p1);
        session.save(p2);
        session.save(o2);
        session.save(p3);

        transaction.commit();
        session.close();
    }
}
