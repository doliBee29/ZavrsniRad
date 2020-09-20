/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.controller;

import hr.balic.zavrsnirad.utility.HibernateUtil;
import hr.balic.zavrsnirad.utility.ZavrsniRadException;
import java.util.List;

import org.hibernate.Session;

/**
 *
 * @author Kira
 */
public abstract class Obrada<T> {

    protected T entitet;
    protected Session session;

    public abstract List<T> getPodaci();

    protected abstract void kontrolaCreate() throws ZavrsniRadException;

    protected abstract void kontrolaUpdate() throws ZavrsniRadException;

    protected abstract void kontrolaDelete() throws ZavrsniRadException;

    public Obrada(T entitet) {
        this();
        this.entitet = entitet;
    }

    public Obrada() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    public T create() throws ZavrsniRadException {
        kontrolaCreate();
        save();
        return entitet;
    }

    public T createAll(List<T> lista) throws ZavrsniRadException {
        session.beginTransaction();
        for (T t : lista) {
            setEntitet(t);
            kontrolaCreate();
            session.save(t);
        }
        session.getTransaction().commit();

        return entitet;
    }

    public T update() throws ZavrsniRadException {
        kontrolaUpdate();
        save();
        return entitet;
    }

    public boolean delete() throws ZavrsniRadException {
        kontrolaDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
        return true;
    }

    private void save() {
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }

}
