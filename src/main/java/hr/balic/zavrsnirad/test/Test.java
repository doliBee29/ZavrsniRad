/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.test;

import hr.balic.zavrsnirad.controller.ObradaOsoba;
import hr.balic.zavrsnirad.model.Osoba;
import hr.balic.zavrsnirad.utility.ZavrsniRadException;

/**
 *
 * @author Kira
 */
public class Test {

    public static void main(String[] args) {

        Osoba osoba = new Osoba();

        ObradaOsoba obradaOsoba = new ObradaOsoba(osoba);
        osoba.setIme("Test");
        osoba.setPrezime("Test1");
        osoba.setKontaktBroj("Test");

        try {
            obradaOsoba.create();
        } catch (ZavrsniRadException ex) {
            System.out.println(ex.getPoruka());
        }

    }

}
