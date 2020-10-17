/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.view;

import hr.balic.zavrsnirad.model.Termin;
import hr.balic.zavrsnirad.model.Usluga;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Kira
 */
public class TerminCellRenderer extends JLabel implements ListCellRenderer<Termin> {

   

    @Override
    public Component getListCellRendererComponent(JList<? extends Termin> list, Termin value, int index, boolean isSelected, boolean cellHasFocus) {
        
        setText(value.getId()+". TERMIN: " + value.getVrijemePocetka() + " (" + value.getZaposlenik().getZanimanje()+ ")");
        if (isSelected) {
            setBackground(new Color(41,57,80));
            setForeground(new Color(204, 204, 204));
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        setFont(list.getFont());
                setOpaque(true);
        return this;
    }

    

    

}
