/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad;

import hr.balic.zavrsnirad.controller.ObradaZaposlenik;
import hr.balic.zavrsnirad.model.Zaposlenik;
import hr.balic.zavrsnirad.utility.HibernateUtil;
import hr.balic.zavrsnirad.utility.PocetniInsert;
import hr.balic.zavrsnirad.view.Autorizacija;


/**
 *
 * @author Kira
 */
public class Start {
    
    public static void main(String[] args) {
        
      //new Autorizacija().setVisible(true);
      
        HibernateUtil.getSessionFactory().openSession();
//        PocetniInsert.izvedi();
    }
    
}
