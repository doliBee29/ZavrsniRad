/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.controller;

import hr.balic.zavrsnirad.model.Operater;
import hr.balic.zavrsnirad.utility.ZavrsniRadException;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Kira
 */
public class ObradaOperater extends ObradaOsoba<Operater> {

    
    public Operater autoriziraj(String email, char[] lozinka) {

        Operater operater = (Operater) session.createQuery(
                "from Operater o where o.email=:email")
                .setParameter("email", email).getSingleResult();

        if (operater == null) {
            return null;
        }

        return BCrypt.checkpw(new String(lozinka), operater.getLozinka())
                ? operater : null;
    }
   
    
    @Override
    public List<Operater> getPodaci() {
        return session.createQuery("from Operater").list();
    }

    @Override
    protected void kontrolaCreate() throws ZavrsniRadException {
//        kontrolaIme();
//        kontrolaPrezime();
//        kontrolaEmail();
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
