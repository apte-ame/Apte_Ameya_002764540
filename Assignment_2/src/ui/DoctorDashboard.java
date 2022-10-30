/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.table.DefaultTableModel;
import model.ConfigureSystem;
import model.Encounter;
import model.MasterDB;

/**
 *
 * @author AMEYA A
 */
public class DoctorDashboard extends javax.swing.JFrame {

    /**
     * Creates new form DoctorDashboard
     */
    ConfigureSystem cSysMain;
    public DoctorDashboard(ConfigureSystem cSysMain) {
        initComponents();
        this.cSysMain = cSysMain;
        populatePastApptTable(this.cSysMain);
        populateCurrentApptTable(this.cSysMain);
        
        
    }
    
        public DoctorDashboard() {
        initComponents();
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCurrAppt = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPastAppt = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLandingPage = new java.awt.Button();
        btnBookApp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCurrAppt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "EncounterId", "Patient", "VitalSign"
            }
        ));
        jScrollPane1.setViewportView(tblCurrAppt);

        tblPastAppt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "EncounterId", "Patient", "VitalSign"
            }
        ));
        jScrollPane2.setViewportView(tblPastAppt);

        jLabel1.setText("Past Appointments");

        jLabel2.setText("Current Appointments");

        btnLandingPage.setLabel("Home Page");
        btnLandingPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLandingPageActionPerformed(evt);
            }
        });

        btnBookApp.setText("Appointment Completion");
        btnBookApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel1)
                        .addGap(196, 196, 196)
                        .addComponent(btnLandingPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btnBookApp, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnLandingPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBookApp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLandingPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLandingPageActionPerformed
        // TODO add your handling code here:
        new MainSelectionPage(cSysMain).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLandingPageActionPerformed

    private void btnBookAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppActionPerformed
        // TODO add your handling code here:

        
        
        
        for(Encounter en:cSysMain.getEncList()){
            if(en.getDate().equals(tblCurrAppt.getModel().getValueAt(tblCurrAppt.getSelectedRow(), 0).toString())){
                cSysMain.getEncHList().add(en);
                cSysMain.getEncList().remove(en);
                System.out.println(en.getDate());
            }
        }
        populatePastApptTable(cSysMain);
       
    }//GEN-LAST:event_btnBookAppActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoctorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookApp;
    private java.awt.Button btnLandingPage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCurrAppt;
    private javax.swing.JTable tblPastAppt;
    // End of variables declaration//GEN-END:variables

    private void populatePastApptTable(ConfigureSystem cSysMain) {
        DefaultTableModel model = (DefaultTableModel)tblPastAppt.getModel();
        model.setRowCount(0);

        for(Encounter myRow:cSysMain.getEncHList()){
            Object[] row = new Object[4];
            row[0] = myRow.getDate();
            row[1] = myRow.getEncounterId();
            row[2] = myRow.getP().getPatientName();
            row[3] = myRow.getP().getVitalSign().getVitalSign();
            model.addRow(row);
        }
    }
    
    private void populateCurrentApptTable(ConfigureSystem cSysMain) {
         DefaultTableModel model = (DefaultTableModel)tblCurrAppt.getModel();
        model.setRowCount(0);

        for(Encounter myRow:cSysMain.getEncList()){
            Object[] row = new Object[4];
            row[0] = myRow.getDate();
            row[1] = myRow.getEncounterId();
            row[2] = myRow.getP().getPatientName();
            row[3] = myRow.getP().getVitalSign().getVitalSign();
            model.addRow(row);
        }
    }


}

