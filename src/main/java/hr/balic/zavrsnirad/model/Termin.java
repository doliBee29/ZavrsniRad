/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Kira
 */
@Entity
public class Termin extends Entitet {

    private Date vrjemePocetka;
    private Date vrijemeZavrsetka;
    private Boolean otkazan;

    @ManyToOne
    private Zaposlenik zaposlenik;

    @ManyToOne
    private Klijent klijent;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "usluga_termin", joinColumns = {
        @JoinColumn(name = "termin_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "usluga_id")})

    private List<Usluga> usluge;

    public Date getVrjemePocetka() {
        return vrjemePocetka;
    }

    public void setVrjemePocetka(Date vrjemePocetka) {
        this.vrjemePocetka = vrjemePocetka;
    }

    public Date getVrijemeZavrsetka() {
        return vrijemeZavrsetka;
    }

    public void setVrijemeZavrsetka(Date vrijemeZavrsetka) {
        this.vrijemeZavrsetka = vrijemeZavrsetka;
    }

    public Boolean getOtkazan() {
        return otkazan;
    }

    public void setOtkazan(Boolean otkazan) {
        this.otkazan = otkazan;
    }

    public Zaposlenik getZaposlenik() {
        return zaposlenik;
    }

    public void setZaposlenik(Zaposlenik zaposlenik) {
        this.zaposlenik = zaposlenik;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public List<Usluga> getUsluge() {
        return usluge;
    }

    public void setUsluge(List<Usluga> usluge) {
        this.usluge = usluge;
    }

}
