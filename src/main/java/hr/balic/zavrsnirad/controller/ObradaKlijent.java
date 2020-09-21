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
public class ObradaKlijent extends Obrada<Klijent> {

    public ObradaKlijent(Klijent klijent) {
        super(klijent);
    }

    @Override
    public List<Klijent> getPodaci() {
        return session.createQuery("from Klijent").list();

    }

    @Override
    protected void kontrolaCreate() throws ZavrsniRadException {
        kontrolaSpol();
        kontrolaTelefon();
       

    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniRadException {

    }

    @Override
    protected void kontrolaDelete() throws ZavrsniRadException {

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

}
