/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.utility;

import com.github.javafaker.Faker;
import hr.balic.zavrsnirad.controller.ObradaOperater;
import hr.balic.zavrsnirad.model.Operater;
import hr.balic.zavrsnirad.model.Zaposlenik;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Kira
 */
public class PocetniInsert {

    public static void izvedi() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Operater operater = new Operater();
        operater.setIme("Dolores");
        operater.setPrezime("Balić");
        operater.setUloga("operater");
        operater.setEmail("dolores.balic@gmail.com");
        operater.setLozinka(BCrypt.hashpw("db", BCrypt.gensalt()));

        ObradaOperater oo = new ObradaOperater();
        oo.setEntitet(operater);
        try {
            oo.create();
        } catch (ZavrsniRadException ex) {
            ex.printStackTrace();
        }

        session.beginTransaction();

        Faker faker = new Faker();
//        String[] kontaktBroj = {"0919253256", "0974531849", "0997852364", "0912345678", "0955632145", "0919253266", "0974523694", "099632145", "0997865412",
//            "097453658"};

        Zaposlenik z;
        for (int i = 0; i < 10; i++) {
            z = new Zaposlenik();
            z.setIme(faker.name().firstName());
            z.setPrezime(faker.name().lastName());
            z.setZanimanje(Zaposlenik.Zanimanje.Frizer);
            z.setEmail(z.getIme().toLowerCase() + "." + z.getPrezime().toLowerCase() + "@gmail.com");
            session.save(z);
        }

        session.getTransaction().commit();

    }

}
