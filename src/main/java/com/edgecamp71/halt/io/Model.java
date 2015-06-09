package com.edgecamp71.halt.io;

public abstract class Model<M> {

    @SuppressWarnings("unchecked")
    public M save() {
        System.out.println(this);
        return (M)HibernateUtil.session().save(this);
    }

    public void update() {
        HibernateUtil.session().update(this);
    }

    public void delete() {
        HibernateUtil.session().delete(this);
    }

    @SuppressWarnings("unchecked")
    public static Model findById(Class modelClazz, Long id) {
        return (Model) HibernateUtil.session().get(modelClazz, id);
    }

}
