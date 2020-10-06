/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.view;

import hr.balic.zavrsnirad.controller.ObradaKlijent;
import hr.balic.zavrsnirad.controller.ObradaTermin;
import hr.balic.zavrsnirad.controller.ObradaUsluga;
import hr.balic.zavrsnirad.controller.ObradaZaposlenik;
import hr.balic.zavrsnirad.model.Klijent;
import hr.balic.zavrsnirad.model.Termin;
import hr.balic.zavrsnirad.model.Zaposlenik;
import hr.balic.zavrsnirad.utility.ZavrsniRadException;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Kira
 */
public class Termini extends javax.swing.JFrame {

    private ObradaTermin obrada;
    private Termin entitet;
    private ObradaUsluga obradaUsluga;

    /**
     * Creates new form Termini
     */
    public Termini() {
        initComponents();
        obrada = new ObradaTermin();
        obradaUsluga = new ObradaUsluga();

        ucitajPodatke();
        
        DefaultComboBoxModel<Klijent> kl = new DefaultComboBoxModel<>();
        new ObradaKlijent().getPodaci().forEach(s -> {
            kl.addElement(s);
        });
        cmbxKlijent.setModel(kl);
        cmbxKlijent.setRenderer(new MyComboBoxRenderer("Klijenti"));
        cmbxKlijent.setSelectedIndex(-1);
        
        DefaultComboBoxModel<Zaposlenik> zpl = new DefaultComboBoxModel<>();
        new ObradaZaposlenik().getPodaci().forEach(p -> {
            zpl.addElement(p);
        });
        cmbxZaposlenik.setRenderer(new OsobaCellRenderer());
        cmbxZaposlenik.setModel(zpl);
        cmbxZaposlenik.setRenderer(new MyComboBoxRenderer("Zaposlenici"));
        cmbxZaposlenik.setSelectedIndex(-1);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTermini = new javax.swing.JList<>();
        pnlPodaci = new javax.swing.JPanel();
        cmbxKlijent = new javax.swing.JComboBox<>();
        cmbxZaposlenik = new javax.swing.JComboBox<>();
        chbxOtkazan = new javax.swing.JCheckBox();
        dtpPocetak = new com.github.lgooddatepicker.components.DateTimePicker();
        dtpZavrsetak = new com.github.lgooddatepicker.components.DateTimePicker();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblPoruka = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnPromijeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(23, 35, 51));

        jLabel2.setText("BeautySalon");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(41, 57, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kira\\Desktop\\icons\\icons8_more_than_30px.png")); // NOI18N
        jLabel1.setText("Termini");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kira\\Desktop\\icons\\icons8_more_than_40px.png")); // NOI18N
        jLabel3.setText("Upravljanje Terminima");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jScrollPane1.setBackground(new java.awt.Color(23, 35, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        lstTermini.setBackground(new java.awt.Color(23, 35, 51));
        lstTermini.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lstTermini.setForeground(new java.awt.Color(255, 255, 255));
        lstTermini.setSelectionBackground(new java.awt.Color(41, 57, 80));
        lstTermini.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTerminiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstTermini);

        pnlPodaci.setBackground(new java.awt.Color(23, 35, 51));
        pnlPodaci.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Podaci o Terminu\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlPodaci.setForeground(new java.awt.Color(255, 255, 255));

        cmbxKlijent.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        cmbxZaposlenik.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        chbxOtkazan.setText("Otkazan");
        chbxOtkazan.setBackground(new java.awt.Color(23, 35, 51));
        chbxOtkazan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        chbxOtkazan.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Datum i vrijeme početka termina");
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Datum i vrijeme završetka termina");
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        lblPoruka.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPoruka.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlPodaciLayout = new javax.swing.GroupLayout(pnlPodaci);
        pnlPodaci.setLayout(pnlPodaciLayout);
        pnlPodaciLayout.setHorizontalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbxZaposlenik, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbxOtkazan, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtpZavrsetak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dtpPocetak, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cmbxKlijent, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlPodaciLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {chbxOtkazan, cmbxKlijent, cmbxZaposlenik, dtpPocetak, dtpZavrsetak});

        pnlPodaciLayout.setVerticalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbxKlijent, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cmbxZaposlenik, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chbxOtkazan)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dtpPocetak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dtpZavrsetak, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlPodaciLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {chbxOtkazan, cmbxKlijent, cmbxZaposlenik});

        pnlPodaciLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dtpPocetak, dtpZavrsetak});

        btnDodaj.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kira\\Desktop\\icons\\icons8_add_user_group_woman_man_30px.png")); // NOI18N
        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromijeni.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kira\\Desktop\\icons\\icons8_update_user_30px.png")); // NOI18N
        btnPromijeni.setText("Promijeni");
        btnPromijeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromijeniActionPerformed(evt);
            }
        });

        btnObrisi.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kira\\Desktop\\icons\\icons8_delete_bin_30px.png")); // NOI18N
        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDodaj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPromijeni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnObrisi))
                            .addComponent(pnlPodaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(547, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(pnlPodaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPromijeni, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstTerminiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTerminiValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        entitet = lstTermini.getSelectedValue();
        if (entitet == null) {
            return;
        }

        
        DefaultComboBoxModel<Klijent> ms = (DefaultComboBoxModel<Klijent>) cmbxKlijent.getModel();
        for (int i = 0; i < ms.getSize(); i++) {
            if (ms.getElementAt(i).getId().equals(entitet.getKlijent().getId())) {
                cmbxKlijent.setSelectedIndex(i);
                break;
            }
        }
        DefaultComboBoxModel<Zaposlenik> zs = (DefaultComboBoxModel<Zaposlenik>) cmbxZaposlenik.getModel();
        for (int i = 0; i < ms.getSize(); i++) {
            if (zs.getElementAt(i).getId().equals(entitet.getZaposlenik().getId())) {
                cmbxZaposlenik.setSelectedIndex(i);
                break;
            }
        }
        
        chbxOtkazan.setSelected(entitet.getOtkazan());
        
        if(null!=entitet.getVrijemePocetka()) {
          dtpPocetak.setDateTimePermissive(entitet.getVrijemePocetka().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
        }
        
         if(null!=entitet.getVrijemeZavrsetka()) {
          dtpZavrsetak.setDateTimePermissive(entitet.getVrijemeZavrsetka().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
        }
    }//GEN-LAST:event_lstTerminiValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        lblPoruka.setText("");
        entitet = new Termin();

        postaviVrijednostiUEntitet();

        try {
            obrada.create();
            ucitajPodatke();
        } catch (ZavrsniRadException ex) {
            lblPoruka.setText(ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromijeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromijeniActionPerformed
//        entitet = lstKlijenti.getSelectedValue();
//        if (entitet == null) {
//            return;
//        }
//
//        postaviVrijednostiUEntitet();
//        try {
//            obrada.update();
//            ucitajPodatke();
//            ocistiPolja();
//
//        } catch (ZavrsniRadException e) {
//            lblPoruka.setText(e.getPoruka());
//        }
    }//GEN-LAST:event_btnPromijeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
//        entitet = lstKlijenti.getSelectedValue();
//        if (entitet == null) {
//            return;
//        }
//
//        obrada.setEntitet(entitet);
//
//        try {
//            obrada.delete();
//            ucitajPodatke();
//            ocistiPolja();
//        } catch (ZavrsniRadException e) {
//            lblPoruka.setText(e.getPoruka());
//        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    /**
     * @param args the command line arguments
     */
    //</editor-fold>

    /* Create and display the form */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromijeni;
    private javax.swing.JCheckBox chbxOtkazan;
    private javax.swing.JComboBox<Klijent> cmbxKlijent;
    private javax.swing.JComboBox<Zaposlenik> cmbxZaposlenik;
    private com.github.lgooddatepicker.components.DateTimePicker dtpPocetak;
    private com.github.lgooddatepicker.components.DateTimePicker dtpZavrsetak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JList<Termin> lstTermini;
    private javax.swing.JPanel pnlPodaci;
    // End of variables declaration//GEN-END:variables

    private void ucitajPodatke() {
        DefaultListModel<Termin> t = new DefaultListModel<>();
        obrada.getPodaci().forEach(s -> t.addElement(s));
        lstTermini.setModel(t);
    }

    private void postaviVrijednostiUEntitet() {
        entitet.setKlijent((Klijent) cmbxKlijent.getSelectedItem());
        entitet.setZaposlenik((Zaposlenik) cmbxZaposlenik.getSelectedItem());
        entitet.setOtkazan(chbxOtkazan.isSelected());
        
        if(dtpPocetak.getDateTimePermissive()!=null) {
          entitet.setVrijemePocetka(Date.from(dtpPocetak.getDateTimePermissive().atZone(ZoneId.systemDefault()).toInstant()));  
        }
        
         if(dtpZavrsetak.getDateTimePermissive()!=null) {
          entitet.setVrijemePocetka(Date.from(dtpZavrsetak.getDateTimePermissive().atZone(ZoneId.systemDefault()).toInstant()));  
        }
        }
    }

  

