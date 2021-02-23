/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.Fullreport;
import model.Product;

/**
 *
 * @author Deepika Reddy
 */
public class ViewDemoPanel extends javax.swing.JPanel {

    Product product;
    Fullreport fullreport;
    public ViewDemoPanel(Product product, Fullreport fullreport) {
        initComponents();
        this.product= product;
        this.fullreport=fullreport;
        displayProduct();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtdateofbirth_ = new javax.swing.JTextField();
        txtweight_ = new javax.swing.JTextField();
        phonenumber_ = new javax.swing.JLabel();
        txtheight_ = new javax.swing.JTextField();
        dateofbirth_ = new javax.swing.JLabel();
        txtssn_ = new javax.swing.JTextField();
        addressheading = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        txtfirstname_ = new javax.swing.JTextField();
        txtlastname_ = new javax.swing.JTextField();
        age_ = new javax.swing.JLabel();
        weight_ = new javax.swing.JLabel();
        height_ = new javax.swing.JLabel();
        txtphonenumber_ = new javax.swing.JTextField();
        ssn_ = new javax.swing.JLabel();
        lastname_ = new javax.swing.JLabel();
        txtage_ = new javax.swing.JTextField();

        txtdateofbirth_.setEditable(false);

        txtweight_.setEditable(false);

        phonenumber_.setForeground(new java.awt.Color(0, 51, 153));
        phonenumber_.setText("Phone Number:");

        txtheight_.setEditable(false);

        dateofbirth_.setForeground(new java.awt.Color(0, 51, 153));
        dateofbirth_.setText("Date of Birth:");

        txtssn_.setEditable(false);

        addressheading.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addressheading.setForeground(new java.awt.Color(0, 51, 153));
        addressheading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addressheading.setText("Demographic Information");
        addressheading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        firstname.setForeground(new java.awt.Color(0, 51, 153));
        firstname.setText("First Name:");

        txtfirstname_.setEditable(false);
        txtfirstname_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstname_ActionPerformed(evt);
            }
        });

        txtlastname_.setEditable(false);
        txtlastname_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastname_ActionPerformed(evt);
            }
        });

        age_.setForeground(new java.awt.Color(0, 51, 153));
        age_.setText("Age:");

        weight_.setForeground(new java.awt.Color(0, 51, 153));
        weight_.setText("Weight:");

        height_.setForeground(new java.awt.Color(0, 51, 153));
        height_.setText("Height:");

        txtphonenumber_.setEditable(false);

        ssn_.setForeground(new java.awt.Color(0, 51, 153));
        ssn_.setText("Social Security Number:");

        lastname_.setForeground(new java.awt.Color(0, 51, 153));
        lastname_.setText("Last Name:");

        txtage_.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastname_, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phonenumber_, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateofbirth_, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(age_, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(weight_, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ssn_, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(height_, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(112, 112, 112)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtphonenumber_, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(txtdateofbirth_)
                            .addComponent(txtage_)
                            .addComponent(txtweight_)
                            .addComponent(txtheight_)
                            .addComponent(txtssn_)
                            .addComponent(txtlastname_)
                            .addComponent(txtfirstname_)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(addressheading, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addressheading, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfirstname_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlastname_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastname_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtphonenumber_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonenumber_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateofbirth_)
                    .addComponent(txtdateofbirth_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age_)
                    .addComponent(txtage_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weight_)
                    .addComponent(txtweight_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(height_, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtheight_, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssn_)
                    .addComponent(txtssn_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtfirstname_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfirstname_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfirstname_ActionPerformed

    private void txtlastname_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlastname_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlastname_ActionPerformed

    private void displayProduct() {
        txtfirstname_.setText(product.getFirstname());
        txtlastname_.setText(product.getLastname());
        txtphonenumber_.setText(product.getPhonenumber());
        txtdateofbirth_.setText(product.getDateofbirth());
        txtage_.setText(product.getAge());
        txtweight_.setText(product.getWeight());
        txtheight_.setText(product.getWeight());
        txtssn_.setText(product.getSsn());
        
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressheading;
    private javax.swing.JLabel age_;
    private javax.swing.JLabel dateofbirth_;
    private javax.swing.JLabel firstname;
    private javax.swing.JLabel height_;
    private javax.swing.JLabel lastname_;
    private javax.swing.JLabel phonenumber_;
    private javax.swing.JLabel ssn_;
    private javax.swing.JTextField txtage_;
    private javax.swing.JTextField txtdateofbirth_;
    private javax.swing.JTextField txtfirstname_;
    private javax.swing.JTextField txtheight_;
    private javax.swing.JTextField txtlastname_;
    private javax.swing.JTextField txtphonenumber_;
    private javax.swing.JTextField txtssn_;
    private javax.swing.JTextField txtweight_;
    private javax.swing.JLabel weight_;
    // End of variables declaration//GEN-END:variables
}