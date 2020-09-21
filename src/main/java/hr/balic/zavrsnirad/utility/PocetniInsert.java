/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.utility;

import com.github.javafaker.Faker;
import hr.balic.zavrsnirad.controller.ObradaOperater;
import hr.balic.zavrsnirad.model.Klijent;
import hr.balic.zavrsnirad.model.Operater;
import hr.balic.zavrsnirad.model.Osoba;
import org.hibernate.Session;

/**
 *
 * @author Kira
 */
public class PocetniInsert {

    public static void izvedi() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        
         Operater operater = new Operater();
        operater.setIme("Ivana");
        operater.setPrezime("Ivanković");
        operater.setUloga("operater");
        operater.setEmail("ivana.ivankovic@gmail.com");
        operater.setLozinka("ufo9854afsc");
        
        ObradaOperater oo = new ObradaOperater();
        oo.setEntitet(operater);
        try {
            oo.create();
        } catch (ZavrsniRadException ex) {
            ex.printStackTrace();
        }

        session.beginTransaction();

        Faker faker = new Faker();
        String[] kontaktBroj = {"0919253256", "0974531849", "0997852364", "0912345678", "0955632145", "0919253266", "0974523694", "099632145", "0997865412",
            "097453658"};

        Osoba o;

        for (int i = 0; i < 10; i++) {
            o = new Osoba() {
            };
            o.setIme(faker.name().firstName());
            o.setPrezime(faker.name().lastName());

            session.save(o);

        }

//        Klijent k;
//        
//        for (int i = 0; i < 10; i++){
//            k = new Klijent();
//            k.setSpol(Klijent.Spol.Muško);
//            k.setOsoba(o);
//        }
//        
//        session.getTransaction().commit();
//        
//        
    }

}
