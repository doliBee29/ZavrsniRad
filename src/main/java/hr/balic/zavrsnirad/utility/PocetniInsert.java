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
import hr.balic.zavrsnirad.model.Usluga;
import hr.balic.zavrsnirad.model.Zaposlenik;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
        Usluga koloracijaSest = kreirajUslugu("Minival", new BigDecimal(60.00), "", "Koloracija");
        Usluga ekstenzijeJedan = kreirajUslugu("Ekstenzije od prirodne kose", new BigDecimal(20.00), "Cijena se odnosi na jedan komad ekstenzije", "Ekstenzije");
        Usluga ekstenzijeDva = kreirajUslugu("Ekstenzije ugradnja", new BigDecimal(4.00), "Cijena se odnosi na jedan komad ekstenzije", "Ekstenzije");
        Usluga ekstenzijeTri = kreirajUslugu("Ekstenzije skidanje", new BigDecimal(200.00), "Cijena usluge skidanja svih ekstenzija s kose", "Ekstenzije");
        Usluga manikura = kreirajUslugu("Manikura", new BigDecimal(90.00), "Njega ruku", "Manikura - osnovna njega");
        Usluga manikuraJedan = kreirajUslugu("Trajni lak - prvi nanos", new BigDecimal(140.00), "Njega ruku", "");
        Usluga manikuraDva = kreirajUslugu("Trajni lak - nadopuna", new BigDecimal(60.00), "Njega ruku", "");
        Usluga manikuraTri = kreirajUslugu("Skidanje trajnog laka", new BigDecimal(20.00), "Njega ruku", "");
        Usluga pedikura = kreirajUslugu("Estetska pedikura", new BigDecimal(70.00), "", "Njega stopala");
        Usluga pedikuraJedan = kreirajUslugu("Estetska pedikura + lakiranje", new BigDecimal(150.00), "", "Njega stopala");
        Usluga pedikuraDva = kreirajUslugu("Medicinska pedikura", new BigDecimal(120.00), "", "Njega stopala");
        Usluga pedikuraTri = kreirajUslugu("Medicinksa pedikura + lakiranje", new BigDecimal(170.00), "", "Njega stopala");
        Usluga pedikuraCetiri = kreirajUslugu("Medicinksa pedikura + trajni lak", new BigDecimal(200.00), "", "Njega stopala");
        Usluga pedikuraPet = kreirajUslugu("Estetska pedikura + trajni lak", new BigDecimal(180.00), "", "Njega stopala");
        Usluga depilacija = kreirajUslugu("Depilacija lica", new BigDecimal(50.00), "Depilacija šećernom pastom", "Kozmetičke usluge za tijelo");
        Usluga depilacijaJedan = kreirajUslugu("Depilacija cijelih nogu", new BigDecimal(1300.00), "Depilacija šećernom pastom", "Kozmetičke usluge za tijelo");
        Usluga depilacijaDva = kreirajUslugu("Depilacija potkoljenica", new BigDecimal(60.00), "Depilacija šećernom pastom", "Kozmetičke usluge za tijelo");
        Usluga depilacijaTri = kreirajUslugu("Depilacija natkoljenica", new BigDecimal(70.00), "Depilacija šećernom pastom", "Kozmetičke usluge za tijelo");
        Usluga depilacijaCetiri = kreirajUslugu("Depilacija pazuha", new BigDecimal(40.00), "Depilacija šećernom pastom", "Kozmetičke usluge za tijelo");
// dodati usluge masaže...

        session.beginTransaction();
        session.save(feniranje);
        session.save(pranjeKose);
        session.save(svecanaFrizura);
        session.save(sisanjeJedan);
        session.save(sisanjeDva);
        session.save(muskarciJedan);
        session.save(muskarciDva);
        session.save(muskarciTri);
        session.save(koloracijaJedan);
        session.save(koloracijaDva);
        session.save(koloracijaTri);
        session.save(koloracijaCetiri);
        session.save(koloracijaPet);
        session.save(koloracijaSest);
        session.save(ekstenzijeJedan);
        session.save(ekstenzijeDva);
        session.save(ekstenzijeTri);
        session.save(manikura);
        session.save(manikuraJedan);
        session.save(manikuraDva);
        session.save(manikuraTri);
        session.save(pedikura);
        session.save(pedikuraJedan);
        session.save(pedikuraDva);
        session.save(pedikuraTri);
        session.save(pedikuraCetiri);
        session.save(pedikuraPet);
        session.save(depilacija);
        session.save(depilacijaJedan);
        session.save(depilacijaDva);
        session.save(depilacijaTri);
        session.save(depilacijaCetiri);

        Faker faker = new Faker();

//        String[] kontaktBroj = {"0919253256", "0974531849", "0997852364", "0912345678", "0955632145", "0919253266", "0974523694", "099632145", "0997865412",
//            "097453658"};
        Zaposlenik z;
        List<Zaposlenik> zaposleniciFrizer = new ArrayList<>();
        List<Zaposlenik> zaposleniciKozmeticar = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            z = new Zaposlenik();
            z.setIme(faker.name().firstName());
            z.setPrezime(faker.name().lastName());
            z.setEmail(z.getIme().toLowerCase() + "." + z.getPrezime().toLowerCase() + "@gmail.com");
            session.save(z);

            if (i < 5) {
                zaposleniciFrizer.add(z);
                z.setZanimanje(Zaposlenik.Zanimanje.Frizer);

            }
            if (i >= 5 && i < 10) {
                zaposleniciKozmeticar.add(z);
                z.setZanimanje(Zaposlenik.Zanimanje.Kozmetičar);
            }
        }

        Klijent k;
        for (int i = 0; i < 50; i++) {
            k = new Klijent();
            k.setIme(faker.name().firstName());
            k.setPrezime(faker.name().lastName());
            k.setEmail(k.getIme().toLowerCase() + "." + k.getPrezime().toLowerCase() + "@gmail.com");
            session.save(k);

            if (i < 35) {
                k.setSpol(Klijent.Spol.Žensko);
            }

            if (i >= 35 && i < 50) {
                k.setSpol(Klijent.Spol.Muško);
            }
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
