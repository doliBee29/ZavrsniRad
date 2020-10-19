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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

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
    
    @OneToMany
    @JoinColumn(name = "klijent_id" )
    private List<Termin> termini = new ArrayList<>();

    public List<Termin> getTermini() {
        return termini;
    }

    public void setTermini(List<Termin> termini) {
        this.termini = termini;
    }

    

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

    @Override
    public String toString() {
        return getImePrezime();
    }
}
