/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import model.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AMEYA A
 */
public class PatientAppointmentBooking extends javax.swing.JFrame {

    /**
     * Creates new form PatientAppointmentBooking
     */
    ConfigureSystem cSysMain;
    Patient pat;
    public PatientAppointmentBooking(ConfigureSystem cSysMain,Patient pat) {
        initComponents();
        this.cSysMain = cSysMain;
        this.pat =pat;
        myInitComponents(this.cSysMain);
    }
    
    public PatientAppointmentBooking() {
        initComponents();
        myInitComponents(cSysMain);
    }
    
    private void myInitComponents(ConfigureSystem cSysMain){
        
//        ConfigureSystem cSys = new ConfigureSystem();
        String[] cityNames = new String[cSysMain.getCityList().size()];
        int count = 0;
        for(City city:cSysMain.getCityList()){
            cityNames[count] = city.getCityName();
            count = count + 1;
        }
//        String[] cityNames = new String[3];
//        cityNames[0] = cSysMain.getCy1().getCityName();
//        cityNames[1] = cSysMain.getCy2().getCityName();
//        cityNames[2] = cSysMain.getCy3().getCityName();
        
        String[] communityNames = new String[cSysMain.getCommunityMasterList().size()];
        int count1 = 0;
        for(Community com:cSysMain.getCommunityMasterList()){
            communityNames[count1] = com.getCommunityName();
            count1 = count1 + 1;
        }
//        communityNames[0] = cSysMain.getC1().getCommunityName();
//        communityNames[1] = cSysMain.getC2().getCommunityName();
//        communityNames[2] = cSysMain.getC3().getCommunityName();
//        communityNames[3] = cSysMain.getC4().getCommunityName();
//        communityNames[4] = cSysMain.getC5().getCommunityName();
        
        String[] hospitalNames = new String[cSysMain.getHospitalDirUpdate().size()];
        int count2 = 0;
        for(Hospital hp:cSysMain.getHospitalDirUpdate()){
            hospitalNames[count2] = hp.getHospitalName();
            count2 = count2 + 1;
        }
//        hospitalNames[0] = cSysMain.getHp1().getHospitalName();
//        hospitalNames[1] = cSysMain.getHp2().getHospitalName();
//        hospitalNames[2] = cSysMain.getHp3().getHospitalName();
//        hospitalNames[3] = cSysMain.getHp4().getHospitalName();
//        hospitalNames[4] = cSysMain.getHp5().getHospitalName();
//        hospitalNames[5] = cSysMain.getHp6().getHospitalName();
//        hospitalNames[6] = cSysMain.getHp7().getHospitalName();
//        hospitalNames[7] = cSysMain.getHp8().getHospitalName();
//        hospitalNames[8] = cSysMain.getHp9().getHospitalName();
//        hospitalNames[9] = cSysMain.getHp10().getHospitalName();
        
        
        cmbBoxCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(communityNames));
        cmbBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(cityNames));
        cmbBoxHospital.setModel(new javax.swing.DefaultComboBoxModel<>(hospitalNames));
        
        DefaultTableModel model = (DefaultTableModel)tblDetails.getModel();
        model.setRowCount(0);

        for(MasterDB myRow:cSysMain.getMasterList()){
            Object[] row = new Object[4];
            row[0] = myRow.getD().getDoctorName();
            row[1] = myRow.getH().getHospitalName();
            row[2] = myRow.getC().getCityName();
            row[3] = myRow.getCom().getCommunityName();
            model.addRow(row);
        }

        
//        for(Doctor d :cSysMain.getDoctorList()){
//            Object[] row = new Object[4];
//            for(Hospital h:cSysMain.getHospitalDirUpdate()){
//                if(h.getDoctor().getDoctorName().equals(d.getDoctorName())){
//
//                    row[0] = d.getDoctorName();
//                    row[1] = h.getHospitalName();
//                    for(City c:cSysMain.getCityList()){
//                        for(Hospital hos:c.getHospList()){
//                            if(hos.getHospitalName().equals(h.getHospitalName())){
//                                row[2] = c.getCityName();
//                            }
//                        }
//                    for(Community com: cSysMain.getCommunityMasterList()){
//                        for(Hospital hos:com.getHosp()){
//                            if(hos.getHospitalName().equals(h.getHospitalName())){
//                                row[3] = com.getCommunityName();
//                            }
//                        }
//                        }
//                    }
//                }
//                
//            }
//        model.addRow(row);
// 
//        }
        
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
        tblDetails = new javax.swing.JTable();
        lblCity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        cmbBoxCity = new javax.swing.JComboBox<>();
        lblBookAppmt = new javax.swing.JLabel();
        btnLandingPage = new java.awt.Button();
        lblName1 = new javax.swing.JLabel();
        cmbBoxCommunity = new javax.swing.JComboBox<>();
        cmbBoxHospital = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBookApp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctors Name", "Hospital", "City", "Community"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetails.setName("tblDetails"); // NOI18N
        jScrollPane1.setViewportView(tblDetails);
        tblDetails.getAccessibleContext().setAccessibleDescription("");

        lblCity.setText("City");

        lblCommunity.setText("Community");

        cmbBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "Needham", "Brookline", "Brighton" }));
        cmbBoxCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBoxCityActionPerformed(evt);
            }
        });

        lblBookAppmt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookAppmt.setText("Book an appointment");

        btnLandingPage.setActionCommand("Home Page");
        btnLandingPage.setLabel("Home Page");
        btnLandingPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLandingPageActionPerformed(evt);
            }
        });

        lblName1.setText("Hospital");

        cmbBoxCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "Needham", "Brookline", "Brighton" }));
        cmbBoxCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBoxCommunityActionPerformed(evt);
            }
        });

        cmbBoxHospital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "Needham", "Brookline", "Brighton" }));
        cmbBoxHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBoxHospitalActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Appointment date");

        btnBookApp.setText("Schedule appointment");
        btnBookApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(lblBookAppmt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnLandingPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCity)
                            .addComponent(lblCommunity)
                            .addComponent(lblName1))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btnSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbBoxHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbBoxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBookApp, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCity)
                                    .addComponent(cmbBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearch)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBookAppmt)
                                    .addComponent(btnLandingPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCommunity)
                            .addComponent(cmbBoxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBookApp)
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName1)
                    .addComponent(cmbBoxHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBoxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBoxCityActionPerformed
        // TODO add your handling code here:
//        ConfigureSystem cSys = new ConfigureSystem();
               
        for(City c:cSysMain.getCityList()){
            if(c.getCityName().equals(cmbBoxCity.getSelectedItem().toString())){
                String[] commNames = new String[c.getCommList().size()];
                String[] hospNames = new String[c.getHospList().size()];
                int count1 = 0, count2 = 0;
                for(Community com:c.getCommList()){
                    commNames[count1] = com.getCommunityName();
                    count1 = count1 + 1;
                }
                for(Hospital hosp:c.getHospList()){
                    hospNames[count2] = hosp.getHospitalName();
                    count2 = count2 + 1;
                }
                
                cmbBoxCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(commNames));
                cmbBoxHospital.setModel(new javax.swing.DefaultComboBoxModel<>(hospNames));
            }
        }
        
        
        
        
    }//GEN-LAST:event_cmbBoxCityActionPerformed

    private void btnLandingPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLandingPageActionPerformed
        // TODO add your handling code here:
        new MainSelectionPage(cSysMain).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLandingPageActionPerformed

    private void cmbBoxCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBoxCommunityActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbBoxCommunityActionPerformed

    private void cmbBoxHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBoxHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBoxHospitalActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
//        ConfigureSystem cSys = new ConfigureSystem();
        String selectedCity = cmbBoxCity.getSelectedItem().toString();
        String selectedCommunity = cmbBoxCommunity.getSelectedItem().toString();
        String selectedHospital = cmbBoxHospital.getSelectedItem().toString();
        String doctorName = new String();
//        for(City c:cSysMain.getCityList()){
//            if(c.getCityName().equals(selectedCity)){
//                for(Hospital hosp:c.getHospList()){
//                    if(hosp.getHospitalName().equals(selectedHospital)){
//                        doctor = hosp.getDoctor().getDoctorName();
//                    }
//                }
//            }
//        }
        for(MasterDB myRow:cSysMain.getMasterList()){
            if((selectedCity.equals(myRow.getC().getCityName())) &&
                selectedCommunity.equals(myRow.getCom().getCommunityName()) &&
                selectedHospital.equals(myRow.getH().getHospitalName())){
                doctorName = myRow.getD().getDoctorName();
            }
        }

        DefaultTableModel model = (DefaultTableModel)tblDetails.getModel();
        model.setRowCount(0);

        Object[] row = new Object[4];
        row[0] = doctorName;
        row[1] = selectedHospital;
        row[2] = selectedCity;
        row[3] = selectedCommunity;

        model.addRow(row);
        

    }//GEN-LAST:event_btnSearchActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnBookAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppActionPerformed
        // TODO add your handling code here:
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        now = now.plusDays(3);
        Encounter enc;
        for(Doctor d:cSysMain.getDoctorList()){
            if(d.getDoctorName().equals(tblDetails.getModel().getValueAt(tblDetails.getSelectedRow(), 0).toString())){
                enc = new Encounter(now.toString(),"E3",d,pat);
                cSysMain.getEncList().add(enc);
            }
        }
        

        
        
        System.out.println(now.toString());
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
            java.util.logging.Logger.getLogger(PatientAppointmentBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientAppointmentBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientAppointmentBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientAppointmentBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientAppointmentBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookApp;
    private java.awt.Button btnLandingPage;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbBoxCity;
    private javax.swing.JComboBox<String> cmbBoxCommunity;
    private javax.swing.JComboBox<String> cmbBoxHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblBookAppmt;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblName1;
    private javax.swing.JTable tblDetails;
    // End of variables declaration//GEN-END:variables
}
