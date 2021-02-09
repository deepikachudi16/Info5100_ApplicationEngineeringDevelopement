/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import model.Address;
import model.Fullreport;

/**
 *
 * @author Deepika Reddy
 */
public class AddressPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddressPanel
     */
    Address address;
    Fullreport fullreport;
   
    public AddressPanel(Address address, Fullreport fullreport) {
        initComponents();
      this.address= address;
      this.fullreport=fullreport;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        city = new javax.swing.JLabel();
        txtzipcode = new javax.swing.JTextField();
        state = new javax.swing.JLabel();
        zipcode = new javax.swing.JLabel();
        addressheading = new javax.swing.JLabel();
        street = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        txtstreet = new javax.swing.JTextField();
        txtstate = new javax.swing.JTextField();
        addresssave = new javax.swing.JButton();

        city.setForeground(new java.awt.Color(0, 51, 153));
        city.setText("City:");

        state.setForeground(new java.awt.Color(0, 51, 153));
        state.setText("State:");

        zipcode.setForeground(new java.awt.Color(0, 51, 153));
        zipcode.setText("Zipcode:");

        addressheading.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addressheading.setForeground(new java.awt.Color(0, 51, 153));
        addressheading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressheading.setText("Address");
        addressheading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        street.setForeground(new java.awt.Color(0, 51, 153));
        street.setText("Street Address:");

        txtstreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstreetActionPerformed(evt);
            }
        });

        addresssave.setForeground(new java.awt.Color(0, 51, 153));
        addresssave.setText("Save");
        addresssave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresssaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressheading, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(zipcode))
                                        .addGap(57, 57, 57)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtstreet, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(txtcity)
                                    .addComponent(txtstate)
                                    .addComponent(txtzipcode)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(addresssave)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addressheading, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(street)
                    .addComponent(txtstreet, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city)
                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state)
                    .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipcode)
                    .addComponent(txtzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addresssave)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtstreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstreetActionPerformed

    private void addresssaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresssaveActionPerformed
        address.setStreet(txtstreet.getText());
        address.setCity(txtcity.getText());
        address.setState(txtstate.getText());
        address.setZipcode(txtzipcode.getText());
        
        fullreport.setAddress(address);
        JOptionPane.showMessageDialog(this,"Address is Entered");
    }//GEN-LAST:event_addresssaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressheading;
    private javax.swing.JButton addresssave;
    private javax.swing.JLabel city;
    private javax.swing.JLabel state;
    private javax.swing.JLabel street;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtstate;
    private javax.swing.JTextField txtstreet;
    private javax.swing.JTextField txtzipcode;
    private javax.swing.JLabel zipcode;
    // End of variables declaration//GEN-END:variables
}
