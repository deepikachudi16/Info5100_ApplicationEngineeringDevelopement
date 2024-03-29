/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.Address;
import model.Fullreport;

/**
 *
 * @author Deepika Reddy
 */
public class ViewAddressPanel extends javax.swing.JPanel {

    Address address;
    Fullreport fullreport;
    public ViewAddressPanel(Address address, Fullreport fullreport) {
        initComponents();
        this.address=address;
        this.fullreport=fullreport;
        displayAddress();
    }

    ViewAddressPanel(Address address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtstate_ = new javax.swing.JTextField();
        city_ = new javax.swing.JLabel();
        txtzipcode_ = new javax.swing.JTextField();
        state_ = new javax.swing.JLabel();
        zipcode_ = new javax.swing.JLabel();
        addressheading_ = new javax.swing.JLabel();
        street_ = new javax.swing.JLabel();
        txtcity_ = new javax.swing.JTextField();
        txtstreet_ = new javax.swing.JTextField();

        txtstate_.setEditable(false);

        city_.setForeground(new java.awt.Color(0, 51, 153));
        city_.setText("City:");

        txtzipcode_.setEditable(false);

        state_.setForeground(new java.awt.Color(0, 51, 153));
        state_.setText("State:");

        zipcode_.setForeground(new java.awt.Color(0, 51, 153));
        zipcode_.setText("Zipcode:");

        addressheading_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addressheading_.setForeground(new java.awt.Color(0, 51, 153));
        addressheading_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressheading_.setText("Address");
        addressheading_.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        street_.setForeground(new java.awt.Color(0, 51, 153));
        street_.setText("Street Address:");

        txtcity_.setEditable(false);

        txtstreet_.setEditable(false);
        txtstreet_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstreet_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressheading_, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(street_, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(city_, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(state_, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(zipcode_))
                                .addGap(57, 57, 57)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtstreet_, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(txtcity_)
                            .addComponent(txtstate_)
                            .addComponent(txtzipcode_))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addressheading_, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(street_)
                    .addComponent(txtstreet_, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city_)
                    .addComponent(txtcity_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state_)
                    .addComponent(txtstate_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipcode_)
                    .addComponent(txtzipcode_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtstreet_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstreet_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstreet_ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressheading_;
    private javax.swing.JLabel city_;
    private javax.swing.JLabel state_;
    private javax.swing.JLabel street_;
    private javax.swing.JTextField txtcity_;
    private javax.swing.JTextField txtstate_;
    private javax.swing.JTextField txtstreet_;
    private javax.swing.JTextField txtzipcode_;
    private javax.swing.JLabel zipcode_;
    // End of variables declaration//GEN-END:variables

    private void displayAddress() {
        txtstreet_.setText(address.getStreet());
        txtcity_.setText(address.getCity());
        txtstate_.setText(address.getState());
        txtzipcode_.setText(address.getZipcode());
      
    }
}
