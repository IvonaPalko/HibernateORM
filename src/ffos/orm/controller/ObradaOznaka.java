/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.orm.controller;

import ffos.orm.model.Oznaka;
import ffos.orm.model.Zupanija;
import ffos.orm.pomocno.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Korisnik
 */
public class ObradaOznaka {
    
    private Session session;
    
    public ObradaOznaka(){
        session = HibernateUtil.getSession();
    }
    
    
    public Oznaka dodajOznaka(Oznaka oz){
        session.beginTransaction();
        session.saveOrUpdate(oz);
        session.getTransaction().commit();
        return oz;
    }
    
    public void brisanjeOznaka(Oznaka oz){
        session.beginTransaction();
        session.delete(oz);
        session.getTransaction().commit();
    }
    
    public List<Oznaka> getOznaka() {
        Query q = session.createQuery("From Oznaka");
        return q.list();
    }
    
}
