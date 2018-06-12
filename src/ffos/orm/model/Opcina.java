/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.orm.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Korisnik
 */

@Entity
@Table
public class Opcina {
    @Id
    @GeneratedValue
    private Long id;
    private String ime;
    @ManyToOne
    private Zupanija zupanija;
    @ManyToMany
    private Set<Oznaka> oznake;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Zupanija getZupanija() {
        return zupanija;
    }

    public void setZupanija(Zupanija zupanija) {
        this.zupanija = zupanija;
    }

    public Set<Oznaka> getOznake() {
        return oznake;
    }

    public void setOznake(Set<Oznaka> oznake) {
        this.oznake = oznake;
    }
    
    @Override
    public String toString() {
        return super.toString().format(ime);
    }
    

}
