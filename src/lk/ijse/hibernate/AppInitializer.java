/**
 * @author : Gathsara
 * created : 3/12/2023 -- 1:44 PM
 **/

package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {

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

  /*      add

        session.save(customer);
        session.save(customer1);*/

       /* update

        session.update(customer1);
*/
       /* get one

        Customer customer2 = session.get(Customer.class, "C001");
        System.out.println(customer);
*/

        Customer customer3=new Customer();

        transaction.commit();
        session.close();
    }
}
