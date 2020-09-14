/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.controller;

import hr.balic.zavrsnirad.model.Zaposlenik;
import hr.balic.zavrsnirad.utility.ZavrsniRadException;

/**
 *
 * @author Kira
 */
public class ObradaZaposlenik extends Obrada<Zaposlenik> {

    public ObradaZaposlenik(Zaposlenik zaposlenik) {
        super(zaposlenik);
    }

    @Override
    protected void kontrolaCreate() throws ZavrsniRadException {
        kontrolaZanimanje();
    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniRadException {

    }

    @Override
    protected void kontrolaDelete() throws ZavrsniRadException {

    }

    private void kontrolaZanimanje() throws ZavrsniRadException {
        if (entitet.getZanimanje() == null) {
            throw new ZavrsniRadException("Obavezan unos vrste zaposlenika(zanimanje)!");
        }
    }

}
