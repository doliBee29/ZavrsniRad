/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.utility;

import com.github.javafaker.Faker;
import hr.balic.zavrsnirad.controller.ObradaOperater;
import hr.balic.zavrsnirad.model.Operater;
import hr.balic.zavrsnirad.model.Usluga;
import hr.balic.zavrsnirad.model.Zaposlenik;
import java.math.BigDecimal;
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

        //***************************    USLUGA    ********************************
        Usluga feniranje = kreirajUslugu("Feniranje", new BigDecimal(60.00), "", "Feniranje i njega kose");
        Usluga pranjeKose = kreirajUslugu("Pranje kose", new BigDecimal(20.00), "", "Feniranje i njega kose");
        Usluga svecanaFrizura = kreirajUslugu("Svečana frizura", new BigDecimal(100.00), "", "Feniranje i njega kose");
        Usluga sisanjeJedan = kreirajUslugu("Šišanje za žene sa prirodnim sušenjem", new BigDecimal(70.00), "", "Šišanje");
        Usluga sisanjeDva = kreirajUslugu("Šišanje za žene sa fen frizurom", new BigDecimal(100.00), "", "Šišanje");
        Usluga muskarciJedan = kreirajUslugu("Muško šišanje bez pranja kose", new BigDecimal(50.00), "", "Muškarci");
        Usluga muskarciDva = kreirajUslugu("Muško šišanje brade", new BigDecimal(15.00), "", "Muškarci");
        Usluga muskarciTri = kreirajUslugu("Muško bojanje kose sa šišanjem", new BigDecimal(100.00), "", "Muškarci");
        Usluga koloracijaJedan = kreirajUslugu("Bojanje kose + fen frizura", new BigDecimal(245.00), "", "Koloracija");
        Usluga koloracijaDva = kreirajUslugu("Bojanje kose + šišanje + fen frizura", new BigDecimal(270.00), "", "Koloracija");
        Usluga koloracijaTri = kreirajUslugu("Bojanje kose + pramenovi + šišanje + fen frizura", new BigDecimal(340.00), "", "Koloracija");
        Usluga koloracijaCetiri = kreirajUslugu("Pramenovi na cijelu kosu + šišanje +fen frizura", new BigDecimal(330.00), "", "Koloracija");
        Usluga koloracijaPet = kreirajUslugu("Pramenovi na  cijelu kosu + preljev + šišanje + fen frizura'", new BigDecimal(340.00), "", "Koloracija");
        Usluga koloracijaŠest = kreirajUslugu("Minival", new BigDecimal(60.00), "", "Koloracija");
        Usluga ekstenzijeJedan = kreirajUslugu("Ekstenzije od prirodne kose", new BigDecimal(20.00), "Cijena se odnosi na jedan komad ekstenzije", "Ekstenzije");
        Usluga ekstenzijeDva = kreirajUslugu("Ekstenzije ugradnja", new BigDecimal(4.00), "Cijena se odnosi na jedan komad ekstenzije", "Ekstenzije");
        Usluga ekstenzijeTri = kreirajUslugu("Ekstenzije skidanje", new BigDecimal(200.00), "Cijena usluge skidanja svih ekstenzija s kose", "Ekstenzije");
        

        session.beginTransaction();
        session.save(feniranje);
        session.save(pranjeKose);
        session.save(svecanaFrizura);

        Faker faker = new Faker();
//        String[] kontaktBroj = {"0919253256", "0974531849", "0997852364", "0912345678", "0955632145", "0919253266", "0974523694", "099632145", "0997865412",
//            "097453658"};

        Zaposlenik z;
        for (int i = 0; i < 3; i++) {
            z = new Zaposlenik();
            z.setIme(faker.name().firstName());
            z.setPrezime(faker.name().lastName());
            z.setZanimanje(Zaposlenik.Zanimanje.Frizer);
            z.setEmail(z.getIme().toLowerCase() + "." + z.getPrezime().toLowerCase() + "@gmail.com");
            session.save(z);
        }

        session.getTransaction().commit();

    }

    private static Usluga kreirajUslugu(String naziv, BigDecimal cijena, String opis, String vrsta) {
        Usluga usluga = new Usluga();
        usluga.setNaziv(naziv);
        usluga.setCijena(cijena);
        usluga.setVrsta(vrsta);
        usluga.setOpis(opis);
        return usluga;
    }

}
