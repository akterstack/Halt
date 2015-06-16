package com.edgecamp71.halt.io;

import org.hibernate.Session;

import java.io.Serializable;
import java.util.function.Consumer;

public abstract class Model implements Serializable {

    public void save() {
        withTxn((session)->session.save(this));
    }

    public void update() {
        withTxn((session)->session.update(this));
    }

    public void delete() {
        withTxn((session)->session.delete(this));
    }

    public static Model findById(Class modelClazz, Long id) {
        return (Model) HibernateUtil.session().get(modelClazz, id);
    }

    public void withTxn(Consumer<Session> consumer) {
        Session session = HibernateUtil.session();
        session.beginTransaction();
        consumer.accept(session);
        session.getTransaction().commit();
        session.close();
    }

}
