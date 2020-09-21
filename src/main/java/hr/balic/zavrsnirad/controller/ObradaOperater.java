/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.controller;

import hr.balic.zavrsnirad.model.Operater;
import hr.balic.zavrsnirad.utility.ZavrsniRadException;
import java.util.List;

/**
 *
 * @author Kira
 */
public class ObradaOperater extends ObradaOsoba<Operater> {

    
    
   
    
    @Override
    public List<Operater> getPodaci() {
        return session.createQuery("from Operater").list();
    }

    @Override
    protected void kontrolaCreate() throws ZavrsniRadException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaEmail();
    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniRadException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaEmail();

    }

    @Override
    protected void kontrolaDelete() throws ZavrsniRadException {

    }

}
