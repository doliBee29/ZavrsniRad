/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.controller;

import hr.balic.zavrsnirad.model.Usluga;
import hr.balic.zavrsnirad.model.Zaposlenik;
import hr.balic.zavrsnirad.utility.ZavrsniRadException;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Kira
 */
public class ObradaUsluga extends Obrada<Usluga> {

    public ObradaUsluga(Usluga usluga) {
        super(usluga);
    }

    @Override
    public List<Usluga> getPodaci() {
        return session.createQuery("from Usluga").list();

    }

    @Override
    protected void kontrolaCreate() throws ZavrsniRadException {
        kontrolaNaziv();
        kontrolaCijena();
    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniRadException {

    }

    @Override
    protected void kontrolaDelete() throws ZavrsniRadException {

    }

    private void kontrolaNaziv() throws ZavrsniRadException {
        kontrolaNull(entitet.getNaziv(), "Naziv nije definiran.");

        if (entitet.getNaziv().isEmpty()) {
            throw new ZavrsniRadException("Naziv nije postavljen! Unesite naziv.");
        }
        if (!entitet.getNaziv().matches("[a-žA-Ž]+")) {
            throw new ZavrsniRadException("Naziv ne može sadržavati brojeve!");
        }
        if (entitet.getNaziv().length() > 100) {
            throw new ZavrsniRadException("Dužina naziva ne može biti veća od 100 znakova!");
        }

    }

    private void kontrolaCijena() throws ZavrsniRadException {
        kontrolaNull(entitet.getCijena(), "Cijena nije definirana.");

        if (entitet.getCijena().compareTo(BigDecimal.ZERO) <= 0) {
            throw new ZavrsniRadException("Cijena ne može biti manja ili jednaka nuli!");
        }
        if (entitet.getCijena().compareTo(new BigDecimal(10000)) == 1) {
            throw new ZavrsniRadException("Cijena ne može biti veća od 10.000,00 kn");
        }
    }

    private void kontrolaNull(Object o, String poruka) throws ZavrsniRadException {
        if (o == null) {
            throw new ZavrsniRadException(poruka);
        }

    }

}
