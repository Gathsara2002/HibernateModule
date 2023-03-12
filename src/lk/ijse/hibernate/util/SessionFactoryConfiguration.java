/**
 * @author : Gathsara
 * created : 3/12/2023 -- 7:05 PM
 **/

package lk.ijse.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfiguration {

    private static SessionFactoryConfiguration sessionFactoryConfiguration;
    private SessionFactory sessionFactory;

    private SessionFactoryConfiguration() {
        Configuration configuration = new Configuration();
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
