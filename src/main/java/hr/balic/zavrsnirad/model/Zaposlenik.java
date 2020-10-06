/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

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

//    public Usluga getUsluga() {
//        return usluga;
//    }
//
//    public void setUsluga(Usluga usluga) {
//        this.usluga = usluga;
//    }

    

    public Zanimanje getZanimanje() {
        return zanimanje;
    }

    public void setZanimanje(Zanimanje zanimanje) {
        this.zanimanje = zanimanje;
    }

    @Override
    public String toString() {
        return getIme() + " " + getPrezime() + " - " + getZanimanje();
    }

   

    
}
