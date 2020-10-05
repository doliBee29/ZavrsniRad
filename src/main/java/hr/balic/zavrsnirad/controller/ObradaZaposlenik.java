/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.controller;

import hr.balic.zavrsnirad.model.Zaposlenik;
import hr.balic.zavrsnirad.utility.ZavrsniRadException;
import java.util.List;

/**
 *
 * @author Kira
 */
public class ObradaZaposlenik extends ObradaOsoba <Zaposlenik> {

  

    public ObradaZaposlenik() {
       
    }

    @Override
    public List<Zaposlenik> getPodaci() {
        return session.createQuery("from Zaposlenik").list();

    }
    
    public List<Zaposlenik> getPodaci(String uvjet) {
        return session.createQuery("from Zaposlenik z "
                + " where concat(z.ime, ' ', z.prezime, ' ', z.zanimanje) "
                + " like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
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
