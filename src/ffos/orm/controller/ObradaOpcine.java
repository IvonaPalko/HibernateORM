/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.orm.controller;

import ffos.orm.model.Opcina;
import ffos.orm.pomocno.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Korisnik
 */
public class ObradaOpcine {
    
    private Session session;
    
    public ObradaOpcine(){
        session = HibernateUtil.getSession();
    }
    
    
    public Opcina dodajOpcine(Opcina o){
        session.beginTransaction();
        session.saveOrUpdate(o);
        session.getTransaction().commit();
        return o;
    }
    
    public void brisanjeOpcine(Opcina o){
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
    }
    
    public List<Opcina> getOpcine() {
        Query q = session.createQuery("From Opcina");
        return q.list();
    }
    
   
    }
