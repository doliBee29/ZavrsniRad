/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad;

import hr.balic.zavrsnirad.utility.HibernateUtil;
import hr.balic.zavrsnirad.utility.PocetniInsert;


/**
 *
 * @author Kira
 */
public class Start {
    
    public static void main(String[] args) {
        
         //HibernateUtil.getSessionFactory().openSession();
         
         PocetniInsert.izvedi();
    }
    
}
