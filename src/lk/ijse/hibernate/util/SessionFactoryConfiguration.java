/**
 * @author : Gathsara
 * created : 3/12/2023 -- 7:05 PM
 **/

package lk.ijse.hibernate.util;

import lk.ijse.hibernate.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfiguration {

    private static SessionFactoryConfiguration sessionFactoryConfiguration;
    private SessionFactory sessionFactory;

/*
    .cofigure() method eken xml file eka sessionfactory ekata load karanava
*/

    private SessionFactoryConfiguration() {

        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(Owner.class)
                .addAnnotatedClass(Pet.class);

        sessionFactory = configuration.buildSessionFactory();

    }

    public static SessionFactoryConfiguration getInstance() {
        return (sessionFactoryConfiguration == null) ?
                sessionFactoryConfiguration = new SessionFactoryConfiguration()
                : sessionFactoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
