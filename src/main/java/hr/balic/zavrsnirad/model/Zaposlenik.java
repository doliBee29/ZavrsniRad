/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Kira
 */
@Entity
public class Zaposlenik extends Osoba {

//    @ManyToOne
//    private Usluga usluga;
    @Enumerated(EnumType.STRING)
    private Zanimanje zanimanje;

    /**
     *
     */
    public static enum Zanimanje {
        Frizer,
        Kozmetičar

    }

    @OneToMany(mappedBy = "zaposlenik")
    private List<Termin> termini = new ArrayList<>();

    public Zanimanje getZanimanje() {
        return zanimanje;
    }

    public void setZanimanje(Zanimanje zanimanje) {
        this.zanimanje = zanimanje;
    }

    public List<Termin> getTermini() {
        return termini;
    }

    public void setTermini(List<Termin> termini) {
        this.termini = termini;
    }

    
    
    @Override
    public String toString() {
        return getIme() + " " + getPrezime() + " - " + getZanimanje();
    }

}
