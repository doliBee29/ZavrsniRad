/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.controller;

import hr.balic.zavrsnirad.model.Klijent;
import hr.balic.zavrsnirad.utility.ZavrsniRadException;
import java.util.List;

/**
 *
 * @author Kira
 */
public class ObradaKlijent extends ObradaOsoba<Klijent> {

    public ObradaKlijent() {

    }

    @Override
    public List<Klijent> getPodaci() {
        return session.createQuery("from Klijent").list();

    }

    public List<Klijent> getPodaci(String uvjet) {
        return session.createQuery("from Klijent k "
                + " where concat(k.ime, ' ', k.prezime) "
                + " like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(100)
                .list();
    }

    @Override
    protected void kontrolaCreate() throws ZavrsniRadException {

        super.kontrolaCreate();
        kontrolaSpol();
        kontrolaTelefon();
        kontrolaKlijentabaza();

    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniRadException {

        super.kontrolaUpdate();
        kontrolaSpol();
        kontrolaTelefon();
        kontrolaKlijentabaza();
    }

    @Override
    protected void kontrolaDelete() throws ZavrsniRadException {
        
        kontrolaKlijentImaTermin();

    }

    private void kontrolaSpol() throws ZavrsniRadException {
        if (entitet.getSpol() == null) {
            throw new ZavrsniRadException("Unos spola je obavezan!");
        }
    }

    protected void kontrolaTelefon() throws ZavrsniRadException {
        if (entitet.getKontaktBroj().isEmpty() || entitet.getKontaktBroj() == null) {
            throw new ZavrsniRadException("Unos kontakt broja je obavezan!");
        }
        if (!entitet.getKontaktBroj().matches("^(\\d{3}[- .]?){2}\\d{4}$")) {
            throw new ZavrsniRadException("Format unosa broja je 091-123-4567 ili 091 123 4567:");

        }
    }

    private void kontrolaKlijentabaza() throws ZavrsniRadException{
        List<Klijent> lista = session.createQuery(""
               + " from Klijent k "
               + " where k.ime=:ime and k.prezime=:prezime and k.email=:email"
               )
               .setParameter("ime", entitet.getIme())
               .setParameter("prezime", entitet.getPrezime())
                .setParameter("email", entitet.getEmail())
               .list();
       if(lista.size()>0){
           throw  new ZavrsniRadException("Zaposlenik " + lista.get(0).getImePrezime() + "već postoji u bazi!");
       }
    }

    private void kontrolaKlijentImaTermin() throws ZavrsniRadException{
        
        if(entitet.getTermini().size()>0) {
            
            throw new ZavrsniRadException("Klijent " + entitet.getImePrezime().toUpperCase() + " se ne može obrisati jer ima ugovoren termin! Pristisnite INFO.");
        }
        
    }

}
