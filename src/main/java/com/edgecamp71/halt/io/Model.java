package com.edgecamp71.halt.io;

public abstract class Model<M> {

    @SuppressWarnings("unchecked")
    public M save(M model) {
        return (M)HibernateUtil.currentSession().save(model);
    }

    public void update(M model) {
        HibernateUtil.currentSession().update(model);
    }

}
