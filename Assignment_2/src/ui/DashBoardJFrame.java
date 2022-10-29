/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
import model.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AMEYA A
 */
public class DashBoardJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DashBoardJFrame
     */
    public DashBoardJFrame() {
        initComponents();
        myInitComponents();
    }
    private void myInitComponents(){
        
        ConfigureSystem cSys = new ConfigureSystem();
        String[] cityNames = new String[cSys.getCityList().size()];
        int count = 0;
        for(City city:cSys.getCityList()){
            cityNames[count] = city.getCityName();
            count = count + 1;
        }
//        String[] cityNames = new String[3];
//        cityNames[0] = cSys.getCy1().getCityName();
//        cityNames[1] = cSys.getCy2().getCityName();
//        cityNames[2] = cSys.getCy3().getCityName();
        
        String[] communityNames = new String[cSys.getCommunityMasterList().size()];
        int count1 = 0;
        for(Community com:cSys.getCommunityMasterList()){
            communityNames[count1] = com.getCommunityName();
            count1 = count1 + 1;
        }
//        communityNames[0] = cSys.getC1().getCommunityName();
//        communityNames[1] = cSys.getC2().getCommunityName();
//        communityNames[2] = cSys.getC3().getCommunityName();
//        communityNames[3] = cSys.getC4().getCommunityName();
//        communityNames[4] = cSys.getC5().getCommunityName();
        
        String[] hospitalNames = new String[cSys.getHospitalDirUpdate().size()];
        int count2 = 0;
        for(Hospital hp:cSys.getHospitalDirUpdate()){
            hospitalNames[count2] = hp.getHospitalName();
            count2 = count2 + 1;
        }
//        hospitalNames[0] = cSys.getHp1().getHospitalName();
//        hospitalNames[1] = cSys.getHp2().getHospitalName();
//        hospitalNames[2] = cSys.getHp3().getHospitalName();
//        hospitalNames[3] = cSys.getHp4().getHospitalName();
//        hospitalNames[4] = cSys.getHp5().getHospitalName();
//        hospitalNames[5] = cSys.getHp6().getHospitalName();
//        hospitalNames[6] = cSys.getHp7().getHospitalName();
//        hospitalNames[7] = cSys.getHp8().getHospitalName();
//        hospitalNames[8] = cSys.getHp9().getHospitalName();
//        hospitalNames[9] = cSys.getHp10().getHospitalName();
        
        
        cmbBoxCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(communityNames));
        cmbBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(cityNames));
        cmbBoxHospital.setModel(new javax.swing.DefaultComboBoxModel<>(hospitalNames));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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

        btnLandingPage.setLabel("Landing Page");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(cmbBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBoxHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbBoxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(214, 214, 214)
                                .addComponent(btnSearch)))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity)
                            .addComponent(cmbBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCommunity)
                            .addComponent(cmbBoxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName1)
                            .addComponent(cmbBoxHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBookAppmt)
                            .addComponent(btnLandingPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBoxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBoxCityActionPerformed
        // TODO add your handling code here:
        ConfigureSystem cSys = new ConfigureSystem();
               
        for(City c:cSys.getCityList()){
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
        new MainJFrame().setVisible(true);
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
        ConfigureSystem cSys = new ConfigureSystem();
        String selectedCity = cmbBoxCity.getSelectedItem().toString();
        String selectedCommunity = cmbBoxCommunity.getSelectedItem().toString();
        String selectedHospital = cmbBoxHospital.getSelectedItem().toString();
        String doctor = new String();
        for(City c:cSys.getCityList()){
            if(c.getCityName().equals(selectedCity)){
                for(Hospital hosp:c.getHospList()){
                    if(hosp.getHospitalName().equals(selectedHospital)){
                        doctor = hosp.getDoctor().getDoctorName();
                    }
                }
            }
        }
//        String selectedDoctor = 
        DefaultTableModel model = (DefaultTableModel)tblDetails.getModel();
        model.setRowCount(0);
//        for(Employee emp: empDirTemp){
            Object[] row = new Object[4];
            row[0] = doctor;
            row[1] = selectedHospital;
            row[2] = selectedCity;
            row[3] = selectedCommunity;
            
            model.addRow(row);
        
//        clearAllTextBoxes();
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoardJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoardJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoardJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoardJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoardJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnLandingPage;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbBoxCity;
    private javax.swing.JComboBox<String> cmbBoxCommunity;
    private javax.swing.JComboBox<String> cmbBoxHospital;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBookAppmt;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblName1;
    private javax.swing.JTable tblDetails;
    // End of variables declaration//GEN-END:variables
}
