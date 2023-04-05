/**
 * @author : Gathsara
 * created : 3/12/2023 -- 1:44 PM
 **/

package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.*;
import lk.ijse.hibernate.util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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

        /*Owner o1 = new Owner();
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
*/

      /*  Lecture l1 = new Lecture();
        l1.setId("L001");
        l1.setName("Niroth");

        Lecture l2 = new Lecture();
        l2.setId("L002");
        l2.setName("Prasad");

        Subject s1 = new Subject();
        s1.setId("S001");
        s1.setName("PRF");

        Subject s2 = new Subject();
        s2.setId("S002");
        s2.setName("OOP");

        List<Subject> subList = new ArrayList<>();
        subList.add(s1);
        subList.add(s2);

        List<Lecture> lectureList=new ArrayList<>();
        lectureList.add(l1);
        lectureList.add(l2);

        l1.setList(subList);
        l2.setList(subList);

        s1.setList(lectureList);
        s2.setList(lectureList);

        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(s1);
        session.save(s2);
        session.save(l1);
        session.save(l2);

        transaction.commit();
        session.close();
*/

       /*
       Data Fetching

       Owner o1 = new Owner();
        o1.setoId("O001");
        o1.setName("Gathsara");

        Pet p1 = new Pet();
        p1.setPid("P001");
        p1.setName("Ash");
        p1.setOwner(o1);

        Pet p2 = new Pet();
        p2.setPid("P002");
        p2.setName("Tommy");
        p2.setOwner(o1);


        List<Pet> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);

        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(o1);
        session.save(p1);
        session.save(p2);

        transaction.commit();
        session.close();*/

        /*   //Lazy Fetching (By deafult fetching in hibernate)

         */

        /*Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Owner owner1 = session.get(Owner.class, "O001");
        System.out.println(owner1.getoId()+" , "+owner1.getName());

        transaction.commit();
        session.close();*/

        /*
         */

       /* //Eager Fetching

        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Owner owner = session.get(Owner.class, "O001");
        System.out.println(owner.getoId()+" , "+owner.getName());
        System.out.println(owner.getList());

        transaction.commit();
        session.close();
*/

      /*
         //Get Vs Load

       Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Owner owner = session.get(Owner.class, "O001");
        System.out.println(owner.getoId());

        Owner o002 = session.load(Owner.class, "O002");
        System.out.println(o002.getoId());

        //output --> O002

        Owner owner = session.get(Owner.class, "O002");
        System.out.println(owner.getoId());

        //output --> NullPointerException


        transaction.commit();
        session.close();*/

        /*Test test = new Test();
        test.setId("T001");*/

/*        //HQL

        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        String sql="FROM owner";
        Query query = session.createQuery(sql);
        List<Owner> list = query.list();

        for (Owner owner :list) {
            System.out.println(owner.getList());
        }

        String hql="FROM owner WHERE name LIKE 'G%' ";
        Query query = session.createQuery(hql);
        List <Owner>list = query.list();

        for (Owner owner:list) {
            System.out.println(owner.getList());
        }

        String pid="P001";
        String name="Dog";

        String hql="UPDATE Pet SET name= : pet_name WHERE pid= : pet_id";
        Query query = session.createQuery(hql);
        query.setParameter("pet_name",name);
        query.setParameter("pet_id",pid);

        int i = query.executeUpdate();
        System.out.println(i>0);


        transaction.commit();
        session.close();*/
    }
}
