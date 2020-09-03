/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.model;

import javax.persistence.Entity;

/**
 *
 * @author Kira
 */
@Entity
public class Osoba extends Entitet{
    
    private String ime;
    private String prezime;
    private String kontaktBroj;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getKontaktBroj() {
        return kontaktBroj;
    }

    public void setKontaktBroj(String kontaktBroj) {
        this.kontaktBroj = kontaktBroj;
    }
    
    
    
}
