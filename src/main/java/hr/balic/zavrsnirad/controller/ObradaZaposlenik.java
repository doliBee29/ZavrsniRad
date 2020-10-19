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
public class ObradaZaposlenik extends ObradaOsoba<Zaposlenik> {

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
        super.kontrolaCreate();
        kontrolaZanimanje();
        kontrolaZaposlenikUBazi();
    }

    @Override
    protected void kontrolaUpdate() throws ZavrsniRadException {
        super.kontrolaUpdate();
        kontrolaZanimanje();
        kontrolaZaposlenikUBazi();
    }

    @Override
    protected void kontrolaDelete() throws ZavrsniRadException {
        if(entitet.getTermini().size()>0) {
            throw new ZavrsniRadException("Zaposlenik se ne može obrisati jer ima ugovorene termine!");
        }
   }

    private void kontrolaZanimanje() throws ZavrsniRadException {
        if (entitet.getZanimanje() == null) {
            throw new ZavrsniRadException("Obavezan unos vrste zaposlenika(zanimanje)!");
        }
    }

    private void kontrolaZaposlenikUBazi() throws ZavrsniRadException {
       List<Zaposlenik> lista = session.createQuery(""
               + " from Zaposlenik z "
               + " where z.ime=:ime and z.prezime=:prezime and z.email=:email and z.zanimanje=:zanimanje"
               )
               .setParameter("ime", entitet.getIme())
               .setParameter("prezime", entitet.getPrezime())
                .setParameter("email", entitet.getEmail())
               .setParameter("zanimanje", entitet.getZanimanje())
               .list();
       if(lista.size()>0){
           throw  new ZavrsniRadException("Zaposlenik " + lista.get(0).getImePrezime().toUpperCase() + "već postoji u bazi!");
       }
    }
    
    

}
