/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.test;

import hr.balic.zavrsnirad.controller.ObradaKlijent;
import hr.balic.zavrsnirad.controller.ObradaOsoba;
import hr.balic.zavrsnirad.controller.ObradaUsluga;
import hr.balic.zavrsnirad.model.Klijent;
import hr.balic.zavrsnirad.model.Osoba;
import hr.balic.zavrsnirad.model.Usluga;
import hr.balic.zavrsnirad.utility.ZavrsniRadException;
import java.math.BigDecimal;

/**
 *
 * @author Kira
 */
public class Test {

    public static void main(String[] args) {

//        Osoba osoba = new Osoba();
//
//        ObradaOsoba obradaOsoba = new ObradaOsoba(osoba);
//        osoba.setIme("Test");
//        osoba.setPrezime("Test1");
//        osoba.setKontaktBroj("Test");
//
//        try {
//            obradaOsoba.create();
//        } catch (ZavrsniRadException ex) {
//            System.out.println(ex.getPoruka());
//        }
//        Klijent klijent = new Klijent();
//
//        ObradaKlijent obradaKlijent = new ObradaKlijent(klijent);
//
//        
//
//        try {
//            obradaKlijent.create();
//        } catch (ZavrsniRadException e) {
//            System.out.println(e.getPoruka());
//    }
        Usluga usluga = new Usluga();

        ObradaUsluga obradaUsluga = new ObradaUsluga(usluga);
        usluga.setNaziv("šćčđž");
        usluga.setCijena(new BigDecimal(10580.23));

        try {
            obradaUsluga.create();
        } catch (ZavrsniRadException e) {
            System.out.println(e.getPoruka());

        }

    }

}
