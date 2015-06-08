package com.edgecamp71.halt.io;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    private static void buildSessionFactory() {
        try {
            Configuration cfg = new Configuration().configure();
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
            buildSessionFactory();
        }
        return sessionFactory;
    }

    public static Session currentSession() {
        return sessionFactory().getCurrentSession();
    }

}
