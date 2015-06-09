package com.edgecamp71.halt.io;

import com.edgecamp71.halt.model.UserCred;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    private static void buildSessionFactory() {
        try {
            Configuration cfg = new Configuration()
                .configure("datasource.xml")
                .addAnnotatedClass(UserCred.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties())
                .build();
            sessionFactory = cfg.buildSessionFactory(serviceRegistry);
        } catch (Exception e) {
            System.err.println("SessionFactory initialization failed." + e);
        }
    }

    public static SessionFactory sessionFactory() {
        if(sessionFactory == null) {
            System.out.println(546546);
            buildSessionFactory();
        }
        System.out.println(sessionFactory);
        return sessionFactory;
    }

    public static Session session() {
        return sessionFactory().openSession();
    }

}
