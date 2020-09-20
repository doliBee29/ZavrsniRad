/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.controller;

import hr.balic.zavrsnirad.model.Termin;
import hr.balic.zavrsnirad.utility.ZavrsniRadException;
import java.util.List;

/**
 *
 * @author Kira
 */
public class ObradaTermin extends Obrada<Termin> {

    public ObradaTermin(Termin termin) {
        super(termin);
    }

    @Override
    public List<Termin> getPodaci() {
        return session.createQuery("from Termin").list();

    }

    @Override
    protected void kontrolaCreate() throws ZavrsniRadException {
        kontrolaPocetakTermina();
        kontrolaZavrsetakTermina();
        kontrolaOtkazan();
    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniRadException {

    }

    @Override
    protected void kontrolaDelete() throws ZavrsniRadException {

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
}
