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
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T> {

    @Override
    protected void kontrolaCreate() throws ZavrsniRadException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaEmail();

    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniRadException {

    }

    @Override
    protected void kontrolaDelete() throws ZavrsniRadException {

    }

    protected void kontrolaIme() throws ZavrsniRadException {

        if (entitet.getIme().isEmpty() || entitet.getIme() == null) {
            throw new ZavrsniRadException("Unos imena je obavezan!");
        }

        if (!entitet.getIme().matches("[a-zA-Z]+")) {
            throw new ZavrsniRadException("Ime ne može sadržavati brojeve!");
        }

    }

    protected void kontrolaPrezime() throws ZavrsniRadException {
        if (entitet.getPrezime().isEmpty() || entitet.getPrezime() == null) {
            throw new ZavrsniRadException("Unos prezimena je obavezan!");
        }
        if (!entitet.getPrezime().matches(("[a-zA-Z]+"))) {
            throw new ZavrsniRadException("Prezime ne može sadržavati brojeve!");
        }
    }

    protected void kontrolaEmail() throws ZavrsniRadException {
        if (entitet.getEmail().isEmpty()) {
            throw new ZavrsniRadException("Email ne smije biti prazan!");
        }
        if (entitet.getEmail().length() >= 50) {
            throw new ZavrsniRadException("Email nije valjan!");
        }

    }
}
