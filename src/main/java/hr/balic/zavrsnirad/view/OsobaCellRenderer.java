/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.view;

import hr.balic.zavrsnirad.model.Osoba;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Kira
 */
public class OsobaCellRenderer extends JLabel implements ListCellRenderer<Osoba> {

    @Override
    public Component getListCellRendererComponent(JList<? extends Osoba> list, Osoba value, int index, boolean isSelected, boolean cellHasFocus) {
        setText(value.getIme() + " " + value.getPrezime());
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
