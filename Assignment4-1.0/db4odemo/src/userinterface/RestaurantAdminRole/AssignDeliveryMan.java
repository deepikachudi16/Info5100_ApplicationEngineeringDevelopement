/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.DeliveryMan.DeliveryMan;
import Business.Order.Order;
import  static Business.Role.Role.RoleType.DeliveryMan;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deepika Reddy
 */
public class AssignDeliveryMan extends javax.swing.JPanel {

    /**
     * Creates new form AssignDeliveryMan
     */
    
    private JPanel userProcessContainer;
    private UserAccount account;
    Order order;
    EcoSystem system;
    
    public AssignDeliveryMan(JPanel userProcessContainer, UserAccount account, Order order, EcoSystem system) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.order = order;
        this.system = system;
        initComponents();
        populateNetworkTable();
    }

private void populateNetworkTable() {
        jLabel1.setText("Order ID:"+order.getOrder_id());
        DefaultTableModel model = (DefaultTableModel) DeliveryManJTable.getModel();
        
        model.setRowCount(0);
        
        for(DeliveryMan deliveryMan1:system.getDeliveryManDirectory().getDeliveryManList()){
               Object[] row = new Object[1];
               
                row[0] = deliveryMan1;
                
                
                model.addRow(row);
            }
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
        DeliveryManJTable = new javax.swing.JTable();
        AssignOrderBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        DeliveryManJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Delivery Man"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DeliveryManJTable);

        AssignOrderBtn.setText("Assign Order");
        AssignOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignOrderBtnActionPerformed(evt);
            }
        });

        BackBtn.setText(" Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Assign Delivery Man");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Deepika Reddy\\Desktop\\rrr.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)))
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(AssignOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addComponent(AssignOrderBtn)
                .addGap(3, 3, 3)
                .addComponent(BackBtn)
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AssignOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignOrderBtnActionPerformed
        int selectedRow = DeliveryManJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {

            DeliveryMan deliveryMan  = (DeliveryMan)DeliveryManJTable.getValueAt(selectedRow, 0);
            deliveryMan.getOrderList().add(order);
            order.setStatus("Assign to Deliveryman");

            for(Customer cust:system.getCustomerDirectory().getCustList()){
                if(order.getCustomerName().equals(cust.getUserName())){
                    for(Order order : cust.getOrderList()){
                        order.setStatus("Assign to Deliveryman");
                    }
                }
            }
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);

        }
    }//GEN-LAST:event_AssignOrderBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignOrderBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JTable DeliveryManJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
