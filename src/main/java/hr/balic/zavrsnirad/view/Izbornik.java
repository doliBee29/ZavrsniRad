/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.balic.zavrsnirad.view;

import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JPanel;

/**
 *
 * @author Kira
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        setTitle("Beauty salon");
        curDateTime();
    }

    
    public void curDateTime() {
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        lblDateTime.setText(dtf.format(now));
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
        pnlZaposlenik = new javax.swing.JPanel();
        lblZaposlenik = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlPocetna = new javax.swing.JPanel();
        lblPocetna = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlTermin = new javax.swing.JPanel();
        lblTermin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlUsluga = new javax.swing.JPanel();
        lblUsluga = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlKlijenti = new javax.swing.JPanel();
        lblPostavke = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        lblDateTime = new javax.swing.JLabel();
        lblNaslovnaSlika = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(23, 35, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlZaposlenik.setBackground(new java.awt.Color(23, 35, 51));
        pnlZaposlenik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlZaposlenikMousePressed(evt);
            }
        });

        lblZaposlenik.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblZaposlenik.setForeground(new java.awt.Color(255, 255, 255));
        lblZaposlenik.setText("Zaposlenik");
        lblZaposlenik.setPreferredSize(new java.awt.Dimension(49, 20));
        lblZaposlenik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblZaposlenikMousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kira\\Desktop\\icons\\icons8_management_24px.png")); // NOI18N

        javax.swing.GroupLayout pnlZaposlenikLayout = new javax.swing.GroupLayout(pnlZaposlenik);
        pnlZaposlenik.setLayout(pnlZaposlenikLayout);
        pnlZaposlenikLayout.setHorizontalGroup(
            pnlZaposlenikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlZaposlenikLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblZaposlenik, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlZaposlenikLayout.setVerticalGroup(
            pnlZaposlenikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlZaposlenikLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlZaposlenikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZaposlenik, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(pnlZaposlenik, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        pnlPocetna.setBackground(new java.awt.Color(41, 57, 80));
        pnlPocetna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPocetnaMousePressed(evt);
            }
        });

        lblPocetna.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPocetna.setForeground(new java.awt.Color(255, 255, 255));
        lblPocetna.setText("Početna");
        lblPocetna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblPocetnaMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kira\\Desktop\\icons\\icons8_home_24px.png")); // NOI18N

        javax.swing.GroupLayout pnlPocetnaLayout = new javax.swing.GroupLayout(pnlPocetna);
        pnlPocetna.setLayout(pnlPocetnaLayout);
        pnlPocetnaLayout.setHorizontalGroup(
            pnlPocetnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPocetnaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPocetna, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlPocetnaLayout.setVerticalGroup(
            pnlPocetnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPocetnaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPocetnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPocetna, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(pnlPocetna, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        pnlTermin.setBackground(new java.awt.Color(23, 35, 51));
        pnlTermin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlTerminMousePressed(evt);
            }
        });

        lblTermin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTermin.setForeground(new java.awt.Color(255, 255, 255));
        lblTermin.setText("Termin");
        lblTermin.setPreferredSize(new java.awt.Dimension(49, 20));
        lblTermin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTerminMousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kira\\Desktop\\icons\\icons8_phone_time_24px.png")); // NOI18N

        javax.swing.GroupLayout pnlTerminLayout = new javax.swing.GroupLayout(pnlTermin);
        pnlTermin.setLayout(pnlTerminLayout);
        pnlTerminLayout.setHorizontalGroup(
            pnlTerminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTerminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblTermin, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlTerminLayout.setVerticalGroup(
            pnlTerminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTerminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTerminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTermin, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(pnlTermin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        pnlUsluga.setBackground(new java.awt.Color(23, 35, 51));
        pnlUsluga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlUslugaMousePressed(evt);
            }
        });

        lblUsluga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsluga.setForeground(new java.awt.Color(255, 255, 255));
        lblUsluga.setText("Usluga");
        lblUsluga.setPreferredSize(new java.awt.Dimension(49, 20));
        lblUsluga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblUslugaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblUslugaMouseReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kira\\Desktop\\icons\\icons8_service_24px.png")); // NOI18N

        javax.swing.GroupLayout pnlUslugaLayout = new javax.swing.GroupLayout(pnlUsluga);
        pnlUsluga.setLayout(pnlUslugaLayout);
        pnlUslugaLayout.setHorizontalGroup(
            pnlUslugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUslugaLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsluga, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlUslugaLayout.setVerticalGroup(
            pnlUslugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUslugaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUslugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsluga, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(pnlUsluga, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        pnlKlijenti.setBackground(new java.awt.Color(23, 35, 51));
        pnlKlijenti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlKlijentiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlKlijentiMouseReleased(evt);
            }
        });

        lblPostavke.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPostavke.setForeground(new java.awt.Color(255, 255, 255));
        lblPostavke.setText("Klijenti");
        lblPostavke.setPreferredSize(new java.awt.Dimension(49, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kira\\Desktop\\icons\\icons8_card_payment_24px.png")); // NOI18N

        javax.swing.GroupLayout pnlKlijentiLayout = new javax.swing.GroupLayout(pnlKlijenti);
        pnlKlijenti.setLayout(pnlKlijentiLayout);
        pnlKlijentiLayout.setHorizontalGroup(
            pnlKlijentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKlijentiLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lblPostavke, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlKlijentiLayout.setVerticalGroup(
            pnlKlijentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKlijentiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKlijentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPostavke, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(pnlKlijenti, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Beauty Salon");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 610));

        jPanel2.setBackground(new java.awt.Color(71, 120, 197));

        lblDateTime.setBackground(new java.awt.Color(123, 156, 225));
        lblDateTime.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblDateTime.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(681, Short.MAX_VALUE)
                .addComponent(lblDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDateTime, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 930, 60));

        lblNaslovnaSlika.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kira\\Desktop\\naslovna1.jpg")); // NOI18N
        getContentPane().add(lblNaslovnaSlika, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 930, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblPocetnaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPocetnaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPocetnaMousePressed

    private void lblTerminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTerminMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTerminMousePressed

    private void lblUslugaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUslugaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblUslugaMousePressed

    private void lblZaposlenikMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblZaposlenikMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblZaposlenikMousePressed

    private void pnlPocetnaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPocetnaMousePressed
        setColor(pnlPocetna);
        resetColor(pnlKlijenti);
        resetColor(pnlTermin);
        resetColor(pnlUsluga);
        resetColor(pnlZaposlenik);
    }//GEN-LAST:event_pnlPocetnaMousePressed

    private void pnlTerminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTerminMousePressed
        setColor(pnlTermin);
        resetColor(pnlKlijenti);
        resetColor(pnlPocetna);
        resetColor(pnlUsluga);
        resetColor(pnlZaposlenik);
    }//GEN-LAST:event_pnlTerminMousePressed

    private void pnlUslugaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUslugaMousePressed
        setColor(pnlUsluga);
        resetColor(pnlKlijenti);
        resetColor(pnlTermin);
        resetColor(pnlPocetna);
        resetColor(pnlZaposlenik);
    }//GEN-LAST:event_pnlUslugaMousePressed

    private void pnlZaposlenikMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlZaposlenikMousePressed
        setColor(pnlZaposlenik);
        resetColor(pnlKlijenti);
        resetColor(pnlTermin);
        resetColor(pnlUsluga);
        resetColor(pnlPocetna);
    }//GEN-LAST:event_pnlZaposlenikMousePressed

    private void pnlKlijentiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKlijentiMousePressed
        setColor(pnlKlijenti);
        resetColor(pnlPocetna);
        resetColor(pnlTermin);
        resetColor(pnlUsluga);
        resetColor(pnlZaposlenik);
    }//GEN-LAST:event_pnlKlijentiMousePressed

    private void pnlKlijentiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKlijentiMouseReleased
        new Klijenti().setVisible(true);
    }//GEN-LAST:event_pnlKlijentiMouseReleased

    private void lblUslugaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUslugaMouseReleased
        new Usluge().setVisible(true);
    }//GEN-LAST:event_lblUslugaMouseReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDateTime;
    private javax.swing.JLabel lblNaslovnaSlika;
    private javax.swing.JLabel lblPocetna;
    private javax.swing.JLabel lblPostavke;
    private javax.swing.JLabel lblTermin;
    private javax.swing.JLabel lblUsluga;
    private javax.swing.JLabel lblZaposlenik;
    private javax.swing.JPanel pnlKlijenti;
    private javax.swing.JPanel pnlPocetna;
    private javax.swing.JPanel pnlTermin;
    private javax.swing.JPanel pnlUsluga;
    private javax.swing.JPanel pnlZaposlenik;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel panel) {
        
        panel.setBackground(new Color(41, 57, 80));
    }
    
    private void resetColor(JPanel panel) {
        
        panel.setBackground(new Color(23, 35, 51));
        
    }
    
}
