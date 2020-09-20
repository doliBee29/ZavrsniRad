/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.controller;

import hr.balic.zavrsnirad.model.Osoba;
import hr.balic.zavrsnirad.utility.ZavrsniRadException;
import java.util.List;

/**
 *
 * @author Kira
 */
public class ObradaOsoba extends Obrada<Osoba> {

    public ObradaOsoba() {
    }

    public ObradaOsoba(Osoba osoba) {
        super(osoba);
    }

    @Override
    public List<Osoba> getPodaci() {
        return session.createQuery("from Osoba").list();

    }

    @Override
    protected void kontrolaCreate() throws ZavrsniRadException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaTelefon();

    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniRadException {

    }

    @Override
    protected void kontrolaDelete() throws ZavrsniRadException {

    }

    private void kontrolaIme() throws ZavrsniRadException {

        if (entitet.getIme().isEmpty() || entitet.getIme() == null) {
            throw new ZavrsniRadException("Unos imena je obavezan!");
        }

        if (!entitet.getIme().matches("[a-zA-Z]+")) {
            throw new ZavrsniRadException("Ime ne može sadržavati brojeve!");
        }

    }

    private void kontrolaPrezime() throws ZavrsniRadException {
        if (entitet.getPrezime().isEmpty() || entitet.getPrezime() == null) {
            throw new ZavrsniRadException("Unos prezimena je obavezan!");
        }
        if (!entitet.getPrezime().matches(("[a-zA-Z]+"))) {
            throw new ZavrsniRadException("Prezime ne može sadržavati brojeve!");
        }
    }

    private void kontrolaTelefon() throws ZavrsniRadException {
        if (entitet.getKontaktBroj().isEmpty() || entitet.getKontaktBroj() == null) {
            throw new ZavrsniRadException("Unos kontakt broja je obavezan!");
        }
        if (!entitet.getKontaktBroj().matches("^(\\d{3}[- .]?){2}\\d{4}$")) {
            throw new ZavrsniRadException("Format unosa broja je 091-123-4567 ili 091 123 4567:");

        }
    }

}
