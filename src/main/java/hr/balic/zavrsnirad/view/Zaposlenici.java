/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.view;

import hr.balic.zavrsnirad.controller.ObradaZaposlenik;
import hr.balic.zavrsnirad.model.Klijent;
import hr.balic.zavrsnirad.model.Klijent.Spol;
import hr.balic.zavrsnirad.model.Zaposlenik;
import hr.balic.zavrsnirad.model.Zaposlenik.Zanimanje;
import hr.balic.zavrsnirad.utility.ZavrsniRadException;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Kira
 */
public class Zaposlenici extends javax.swing.JFrame {

    private ObradaZaposlenik obrada;
    private Zaposlenik entitet;

    /**
     * Creates new form Zaposlenici
     */
    public Zaposlenici() {
        initComponents();
        lstZaposlenici.setCellRenderer(new OsobaCellRenderer());
        obrada = new ObradaZaposlenik();
        ucitajPodatke();

        cmbxZanimanje.setRenderer(new MyComboBoxRenderer("Odaberite zanimanje"));
        cmbxZanimanje.setSelectedIndex(-1); // po default-u odabire prvi item, no potrebno postaviti bez odabira
        
        
        setTitle("Zaposlenici");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        lstZaposlenici = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlPodaci = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        cmbxZanimanje = new javax.swing.JComboBox<>();
        lblPoruka = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnPromijeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(41, 57, 80));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(23, 35, 51));

        jScrollPane1.setBackground(new java.awt.Color(23, 35, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        lstZaposlenici.setBackground(new java.awt.Color(23, 35, 51));
        lstZaposlenici.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lstZaposlenici.setForeground(new java.awt.Color(255, 255, 255));
        lstZaposlenici.setSelectionBackground(new java.awt.Color(41, 57, 80));
        lstZaposlenici.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstZaposleniciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstZaposlenici);

        jPanel2.setBackground(new java.awt.Color(41, 57, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_more_than_30px.png"))); // NOI18N
        jLabel1.setText("Zaposlenici");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_more_than_40px.png"))); // NOI18N
        jLabel3.setText("Upravljanje Zaposlenicima");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1)))
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("BeautySalon");

        pnlPodaci.setBackground(new java.awt.Color(23, 35, 51));
        pnlPodaci.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Podaci o Zaposleniku", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlPodaci.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ime");

        txtIme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Prezime");

        txtPrezime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-mail");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cmbxZanimanje.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbxZanimanje.setModel(new DefaultComboBoxModel(Zanimanje.values()));
        cmbxZanimanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxZanimanjeActionPerformed(evt);
            }
        });

        lblPoruka.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPoruka.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlPodaciLayout = new javax.swing.GroupLayout(pnlPodaci);
        pnlPodaci.setLayout(pnlPodaciLayout);
        pnlPodaciLayout.setHorizontalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbxZanimanje, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPodaciLayout.setVerticalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cmbxZanimanje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnDodaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_add_user_group_woman_man_30px.png"))); // NOI18N
        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromijeni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_update_user_30px.png"))); // NOI18N
        btnPromijeni.setText("Promijeni");
        btnPromijeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromijeniActionPerformed(evt);
            }
        });

        btnObrisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_delete_bin_30px.png"))); // NOI18N
        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUvjetKeyReleased(evt);
            }
        });

        btnTrazi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_search_30px_1.png"))); // NOI18N
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73)
                        .addComponent(pnlPodaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(496, 496, 496)
                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPromijeni, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUvjet))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addComponent(pnlPodaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPromijeni, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbxZanimanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxZanimanjeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxZanimanjeActionPerformed

    private void lstZaposleniciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstZaposleniciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        entitet = lstZaposlenici.getSelectedValue();
        if (entitet == null) {
            return;
        }

        txtIme.setText(entitet.getIme());
        txtPrezime.setText(entitet.getPrezime());
        txtEmail.setText(entitet.getEmail());
        cmbxZanimanje.setSelectedItem(entitet.getZanimanje());
    }//GEN-LAST:event_lstZaposleniciValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        lblPoruka.setText("");
        entitet = new Zaposlenik();

        postaviVrijednostiUEntitet();

        try {
            obrada.create();
            ucitajPodatke();
            ocistiPolja();
        } catch (ZavrsniRadException ex) {
            lblPoruka.setText(ex.getPoruka());
        }
        
        
        

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromijeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromijeniActionPerformed
        entitet = lstZaposlenici.getSelectedValue();
        if (entitet == null) {
            return;
        }

        postaviVrijednostiUEntitet();
        try {
            obrada.update();
            ucitajPodatke();
            ocistiPolja();

        } catch (ZavrsniRadException e) {
            lblPoruka.setText(e.getPoruka());
        }

    }//GEN-LAST:event_btnPromijeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        entitet = lstZaposlenici.getSelectedValue();
        if (entitet == null) {
            return;
        }

        obrada.setEntitet(entitet);

        try {
            obrada.delete();
            ucitajPodatke();
            ocistiPolja();
        } catch (ZavrsniRadException e) {
            lblPoruka.setText(e.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        ucitajPodatke();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void txtUvjetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ucitajPodatke();
        }
    }//GEN-LAST:event_txtUvjetKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromijeni;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<String> cmbxZanimanje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JList<Zaposlenik> lstZaposlenici;
    private javax.swing.JPanel pnlPodaci;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

    private void ucitajPodatke() {
       DefaultListModel<Zaposlenik> z = new DefaultListModel<>();

      
        obrada.getPodaci(txtUvjet.getText()).forEach(s -> z.addElement(s));

        lstZaposlenici.setModel(z);

    }

    private void postaviVrijednostiUEntitet() {

        entitet.setIme(txtIme.getText());
        entitet.setPrezime(txtPrezime.getText());
        entitet.setEmail(txtEmail.getText());
        entitet.setZanimanje((Zanimanje) cmbxZanimanje.getSelectedItem());
        obrada.setEntitet(entitet);
    }

    private void ocistiPolja() {
        for (Component c : pnlPodaci.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
        }
        lblPoruka.setText("");
    }

}
