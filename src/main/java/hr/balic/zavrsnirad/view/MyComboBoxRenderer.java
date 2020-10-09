/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.view;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Kira
 */
public class MyComboBoxRenderer extends JLabel implements ListCellRenderer {

    private String title;

    

    public MyComboBoxRenderer(String newTitle) {
        title = newTitle;
        
        
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean hasFocus) {
        if (index == -1 && value == null) {
            setText(title);
        } else {
            setText(value.toString());
        }
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
