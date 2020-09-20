/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

/**
 *
 * @author Kira
 */
@Entity
public class Zaposlenik extends Osoba {

    @OneToMany(mappedBy = "zaposlenik")
    private List<Usluga> usluga = new ArrayList<>();

    @Enumerated
    private Zanimanje zanimanje;

    private static enum Zanimanje {
        Frizer,
        Kozmetičar

    }

    public List<Usluga> getUsluga() {
        return usluga;
    }

    public void setUsluga(List<Usluga> usluga) {
        this.usluga = usluga;
    }

    public Zanimanje getZanimanje() {
        return zanimanje;
    }

    public void setZanimanje(Zanimanje zanimanje) {
        this.zanimanje = zanimanje;
    }

}
