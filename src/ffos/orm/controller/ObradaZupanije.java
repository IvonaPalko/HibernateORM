/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.orm.controller;

import ffos.orm.model.Zupanija;
import ffos.orm.pomocno.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Korisnik
 */
public class ObradaZupanije {
    
    private Session session;
    
    public ObradaZupanije(){
        session = HibernateUtil.getSession();
    }
    
    
    public Zupanija dodajZupanije(Zupanija z){
        session.beginTransaction();
        session.saveOrUpdate(z);
        session.getTransaction().commit();
        return z;
    }
    
    public void brisanjeZupanije(Zupanija z){
        session.beginTransaction();
        session.delete(z);
        session.getTransaction().commit();
    }
    
    public List<Zupanija> getZupanije() {
        Query q = session.createQuery("From Zupanija");
        return q.list();
    }
    
}
