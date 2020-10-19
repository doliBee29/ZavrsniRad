/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.controller;

import hr.balic.zavrsnirad.model.Termin;
import hr.balic.zavrsnirad.model.Usluga;
import hr.balic.zavrsnirad.utility.ZavrsniRadException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author Kira
 */
public class ObradaTermin extends Obrada<Termin> {

    public ObradaTermin(Termin termin) {
        super(termin);
    }

    public ObradaTermin() {

    }

    @Override
    public List<Termin> getPodaci() {
        return session.createQuery("from Termin").list();

    }

    public List<Usluga> getPodaci(String uvjet) {
        return session.createQuery("from Termin t"
                + " where concat(t.id + ' ' + t.vrijemepocetka) "
                + " like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(100)
                .list();
    }

    @Override
    protected void kontrolaCreate() throws ZavrsniRadException {

        kontrolaKlijent(); 
        kontrolaZaposlenik();
        kontrolaZaposlenikTerminBaza();
        kontrolaOtkazan();
        kontrolaPocetakTermina();
        kontrolaZavrsetakTermina();
        kontrolaUsluge();

    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniRadException {
        
        kontrolaKlijent(); 
        kontrolaZaposlenik();
        kontrolaZaposlenikTerminBaza();
        kontrolaOtkazan();
        kontrolaPocetakTermina();
        kontrolaZavrsetakTermina();

    }

    @Override
    protected void kontrolaDelete() throws ZavrsniRadException {
        kontrolaBrisanjaUslugaTermin();
    }

    private void kontrolaPocetakTermina() throws ZavrsniRadException {
        if (entitet.getVrijemePocetka() == null) {
            throw new ZavrsniRadException("Obavezan unos početka termina!");
        }
    }

    private void kontrolaZavrsetakTermina() throws ZavrsniRadException {
        if (entitet.getVrijemeZavrsetka() == null) {
            throw new ZavrsniRadException("Obavezan unos završetka termina!");
        }

    }

    private void kontrolaOtkazan() throws ZavrsniRadException {

        if (entitet.getOtkazan() == null) {
            throw new ZavrsniRadException("Obavezan unos otkazivanja termina: DA/NE?");

        }

    }

    private void kontrolaUsluge() throws ZavrsniRadException {
        if (entitet.getUsluge().isEmpty()) {
            throw new ZavrsniRadException("Obavezan odabir usluge!");
        }
    }

    private void kontrolaKlijent() throws ZavrsniRadException {

        if (entitet.getKlijent() == null) {
            throw new ZavrsniRadException("Obavezno je odabrati klijenta iz padajućeg izbornika!");
        }
    }

    private void kontrolaZaposlenik() throws ZavrsniRadException {
        if (entitet.getZaposlenik() == null) {
            throw new ZavrsniRadException("Obavezno je odabrati zaposlenika iz padajućeg izbornika!");
        }
    }

    private void kontrolaBrisanjaUslugaTermin() throws ZavrsniRadException {

       if (!entitet.getUsluge().isEmpty()) {
            throw new ZavrsniRadException("NIJE MOGUĆE OBRISATI TERMIN! Pritisnite INFO gumb.");
        }

        }

    private void kontrolaZaposlenikTerminBaza() throws ZavrsniRadException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        
       List<Termin> lista = session.createQuery(""
               + " from Termin t "
               + " where t.vrijemePocetka=:vrijemePocetka and t.vrijemeZavrsetka=:vrijemeZavrsetka  and t.zaposlenik=:zaposlenik"
               )
               .setParameter("vrijemePocetka", entitet.getVrijemePocetka())
               .setParameter("vrijemeZavrsetka", entitet.getVrijemeZavrsetka())
               .setParameter("zaposlenik", entitet.getZaposlenik())
               .list();
       if(lista.size()>0){
           throw  new ZavrsniRadException("Zaposlenik " + lista.get(0).getZaposlenik().getImePrezime().toUpperCase() + "već ima ugovoren termin: " + (sdf.format(lista.get(0).getVrijemePocetka()))
                   + ", odaberite drugo vrijeme početka termina!");
       }
    }
        
   
    }


