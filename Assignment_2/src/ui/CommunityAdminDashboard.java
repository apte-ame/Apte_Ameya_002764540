/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;

/**
 *
 * @author AMEYA A
 */
public class CommunityAdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form CommunityAdminDashboard
     */
    ConfigureSystem cSysMain;
    public CommunityAdminDashboard(ConfigureSystem cSysMain) {
        initComponents();
        this.cSysMain = cSysMain;
        populateCommTable(cSysMain);
    }
    public CommunityAdminDashboard() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblCommunity = new javax.swing.JTable();
        btnViewCom = new javax.swing.JButton();
        btnUpdateComm = new javax.swing.JButton();
        btnCreateComm = new javax.swing.JButton();
        txtHosName = new javax.swing.JTextField();
        txtDocName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCommId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCommName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHouse = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHosId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCityId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        btnLandingPage = new java.awt.Button();
        btnDeleteCom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCommunity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "COMMUNITY ID", "COMMUNITY NAME", "HOUSE", "HOSPITAL NAME"
            }
        ));
        jScrollPane2.setViewportView(tblCommunity);

        btnViewCom.setText("View Comm");
        btnViewCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewComActionPerformed(evt);
            }
        });

        btnUpdateComm.setText("Update Comm");
        btnUpdateComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCommActionPerformed(evt);
            }
        });

        btnCreateComm.setText("Create Comm");
        btnCreateComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCommActionPerformed(evt);
            }
        });

        txtHosName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHosNameActionPerformed(evt);
            }
        });

        txtDocName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Community Id");

        jLabel5.setText("Community Name");

        txtCommName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommNameActionPerformed(evt);
            }
        });

        jLabel6.setText("House");

        txtHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseActionPerformed(evt);
            }
        });

        jLabel1.setText("Hospital Id");

        jLabel2.setText("Hospital Name");

        jLabel3.setText("Doctors Name");

        jLabel10.setText("City Id");

        txtCityId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityIdActionPerformed(evt);
            }
        });

        jLabel11.setText("City Name");

        txtCityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityNameActionPerformed(evt);
            }
        });

        btnLandingPage.setBackground(new java.awt.Color(255, 255, 204));
        btnLandingPage.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLandingPage.setLabel("HOME PAGE");
        btnLandingPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLandingPageActionPerformed(evt);
            }
        });

        btnDeleteCom.setText("Delete Comm");
        btnDeleteCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteComActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHosId)
                                    .addComponent(txtHosName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDocName)
                                    .addComponent(txtCityId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCommName)
                            .addComponent(txtHouse)
                            .addComponent(txtCityName)
                            .addComponent(txtCommId, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLandingPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnUpdateComm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewCom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCreateComm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeleteCom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnLandingPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnViewCom)
                        .addGap(3, 3, 3)
                        .addComponent(btnUpdateComm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateComm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteCom))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHosId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCommId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHosName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtCommName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewComActionPerformed
        // TODO add your handling code here:
        clearAllTextBoxes();
        int selectedRowIndex = tblCommunity.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be viewed");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)tblCommunity.getModel();
        txtCommId.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtCommName.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtHouse.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtHosName.setText(model.getValueAt(selectedRowIndex, 3).toString());
    }//GEN-LAST:event_btnViewComActionPerformed

    private void btnUpdateCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCommActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCommunity.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be updated");
            return;
        }
        DefaultTableModel modelHosp = (DefaultTableModel)tblCommunity.getModel();
        //        DefaultTableModel modelDoc = (DefaultTableModel)tblDoctor.getModel();

        for(int i=0;i<cSysMain.getCommunityMasterList().size();i++){
            if(cSysMain.getCommunityMasterList().get(i).getCommunityId().equals(modelHosp.getValueAt(selectedRowIndex, 0).toString())){
                if(txtCommId.getText().isEmpty()&& txtCommName.getText().isEmpty() && txtHouse.getText().isEmpty() && txtHosName.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this,"All fields cannot be empty");

                }else{
                    if(!txtCommId.getText().isEmpty()){
                        cSysMain.getCommunityMasterList().get(i).setCommunityId(txtCommId.getText());

                        for(City c:cSysMain.getCityList()){
                            for(Community comm:c.getCommList()){
                                if(comm.getCommunityId().equals(cSysMain.getCommunityMasterList().get(i).getCommunityId())){
                                    comm.setCommunityId(txtCommId.getText());
                                }
                            }
                        }
                    }
                    if(!txtCommName.getText().isEmpty()){

                        cSysMain.getCommunityMasterList().get(i).setCommunityName(txtCommName.getText());

                        for(City c:cSysMain.getCityList()){
                            for(Community comm:c.getCommList()){
                                if(comm.getCommunityName().equals(cSysMain.getCommunityMasterList().get(i).getCommunityName())){
                                    comm.setCommunityName(txtCommName.getText());
                                }
                            }
                        }
                    }
                    if(!txtHouse.getText().isEmpty()){

                        for(House house:cSysMain.getAllHouses()){
                            for(House h:cSysMain.getCommunityMasterList().get(i).getHouseList()){
                                if(house.getHouseName().equals(h.getHouseName())){
                                    house.setHouseName(txtHouse.getText());
                                    h.setHouseName(txtHouse.getText());
                                }
                            }

                        }

                    }

                    if(!txtHosName.getText().isEmpty()){

                        for(Hospital h:cSysMain.getHospitalDirUpdate()){
                            for(Hospital hComm:cSysMain.getCommunityMasterList().get(i).getHosp()){
                                if(h.getHospitalName().equals(hComm.getHospitalName())){
                                    h.setHospitalName(txtHosName.getText());

                                }
                            }
                        }
                        for(City c:cSysMain.getCityList()){
                            for(Hospital hosp:c.getHospList()){
                                for(Hospital h:cSysMain.getCommunityMasterList().get(i).getHosp()){
                                    if(hosp.getHospitalName().equals(h.getHospitalName())){
                                        hosp.setHospitalName(txtHosName.getText());
                                        h.setHospitalName(txtHosName.getText());

                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
        clearAllTextBoxes();
        populateCommTable(cSysMain);


    }//GEN-LAST:event_btnUpdateCommActionPerformed

    private void btnCreateCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCommActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCommunity.getSelectedRow();
        if(txtHosId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter the hospitalId");
        }
        else if(txtHosName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter the hospitalName");
        }
        else if(txtDocName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter the Doctors Name");
        }
        else if(txtCommId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter the Community Id");
        }
        else if(txtCommName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter the Community Name");
        }
        else if(txtHouse.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter the House Name");
        }
        else if(txtCityId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter the City Id");
        }
        else if(txtCityName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter the City Name");
        }
        else{
            
            House hNew = new House("HN1",txtHouse.getText());
            Doctor docNew = new Doctor(txtDocName.getText(), "123", "abc");
            Hospital hosNew = new Hospital(txtHosName.getText(),txtHosId.getText(),docNew);
            ArrayList<House> hListNew = new ArrayList<House>();
            ArrayList<Hospital> hosListNew = new ArrayList<Hospital>();
            hListNew.add(hNew);
            hosListNew.add(hosNew);
            cSysMain.getHospitalDirUpdate().add(hosNew);
            cSysMain.getDoctorList().add(docNew);
            cSysMain.getAllHouses().add(hNew);
            cSysMain.getMasterHouseListy().add(hListNew);
            Community commNew = new Community(hListNew,txtCommName.getText(),hosListNew,txtCommId.getText());
            cSysMain.getCommunityMasterList().add(commNew);
            ArrayList<Community> commListNew = new ArrayList<Community>();
            commListNew.add(commNew);
            cSysMain.getMasterCommunityListy().add(commListNew);
            City cityNew = new City(hosListNew,commListNew,txtCityName.getText(),txtCityId.getText());
            cSysMain.getCityList().add(cityNew);
            MasterDB masterNew = new MasterDB(cityNew, hosNew, docNew, commNew);
            cSysMain.getMasterList().add(masterNew);

            
        clearAllTextBoxes();
            populateCommTable(cSysMain);
        }
    }//GEN-LAST:event_btnCreateCommActionPerformed

    private void txtHosNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHosNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHosNameActionPerformed

    private void txtDocNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocNameActionPerformed

    private void txtCommNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommNameActionPerformed

    private void txtHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseActionPerformed

    private void txtCityIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityIdActionPerformed

    private void txtCityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityNameActionPerformed

    private void btnLandingPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLandingPageActionPerformed
        // TODO add your handling code here:
        new MainSelectionPage(cSysMain).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLandingPageActionPerformed

    private void btnDeleteComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteComActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCommunity.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be deleted");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)tblCommunity.getModel();
        for(int i=0;i<cSysMain.getCommunityMasterList().size();i++){
            if(cSysMain.getCommunityMasterList().get(i).getCommunityId().equals(model.getValueAt(selectedRowIndex, 0).toString())){
                cSysMain.getCommunityMasterList().remove(cSysMain.getCommunityMasterList().get(i));
            }
        }
        for(int i=0;i<cSysMain.getCityList().size();i++){
            for(int j=0;j<cSysMain.getCityList().get(i).getCommList().size();j++){
                if(cSysMain.getCityList().get(i).getCommList().get(j).getCommunityId().equals(model.getValueAt(selectedRowIndex, 0).toString())){
                    cSysMain.getCityList().get(i).getCommList().get(j).setCommunityId(String.valueOf(cSysMain.getCityList().get(i).getCommList().size()+1));
                    cSysMain.getCityList().get(i).getCommList().get(j).setCommunityName("commn");
                }
            }
        }
        populateCommTable(cSysMain);
        
        clearAllTextBoxes();
    }//GEN-LAST:event_btnDeleteComActionPerformed

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
            java.util.logging.Logger.getLogger(CommunityAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommunityAdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateComm;
    private javax.swing.JButton btnDeleteCom;
    private java.awt.Button btnLandingPage;
    private javax.swing.JButton btnUpdateComm;
    private javax.swing.JButton btnViewCom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCommunity;
    private javax.swing.JTextField txtCityId;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtCommId;
    private javax.swing.JTextField txtCommName;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JTextField txtHosId;
    private javax.swing.JTextField txtHosName;
    private javax.swing.JTextField txtHouse;
    // End of variables declaration//GEN-END:variables
    private void populateCommTable(ConfigureSystem cSysMain) {
        DefaultTableModel model = (DefaultTableModel)tblCommunity.getModel();
        model.setRowCount(0);

        for(Community myRow:cSysMain.getCommunityMasterList()){
            Object[] row = new Object[4];
            row[0] = myRow.getCommunityId();
            row[1] = myRow.getCommunityName();
            row[2] = myRow.getHouseList().get(0).getHouseName();
            row[3] = myRow.getHosp().get(0).getHospitalName();
            model.addRow(row);
        }
    }
    
     private void clearAllTextBoxes(){
       
        txtCityId.setText("");
        txtCityName.setText("");
        txtCommId.setText("");
        txtCommName.setText("");
        txtDocName.setText("");
        txtHosId.setText("");
        txtHosName.setText("");
        txtHouse.setText("");
        
    }

}
