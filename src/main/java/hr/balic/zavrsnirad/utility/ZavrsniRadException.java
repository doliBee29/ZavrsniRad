/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.utility;

/**
 *
 * @author Kira
 */
public class ZavrsniRadException extends Exception {

    private String poruka;

    public ZavrsniRadException(String poruka) {
        this.poruka = poruka;
    }

    public String getPoruka() {

        return poruka;
    }

}
