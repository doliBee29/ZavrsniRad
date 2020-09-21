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
public class Klijent extends Osoba {

    @Enumerated(EnumType.STRING)
    private Spol spol;

    public static enum Spol {
        Muško,
        Žensko
    }

    private String kontaktBroj;

    public String getKontaktBroj() {
        return kontaktBroj;
    }

    public void setKontaktBroj(String kontaktBroj) {
        this.kontaktBroj = kontaktBroj;
    }

    public Spol getSpol() {
        return spol;
    }

    public void setSpol(Spol spol) {
        this.spol = spol;
    }

}
