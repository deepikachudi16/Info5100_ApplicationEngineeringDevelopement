/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import static java.time.Clock.system;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deepika Reddy
 */
public class ManageRestaurants extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurants
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount user;
    
    public ManageRestaurants(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateNetworkTable();
        ConfirmBtn.setEnabled(false);
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
        networkJTable = new javax.swing.JTable();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        uNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        ConfirmBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Backbtn = new javax.swing.JButton();
        submit = new javax.swing.JButton();

        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "User Name", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);

        jLabel3.setForeground(new java.awt.Color(51, 0, 255));
        jLabel3.setText("Name");

        jLabel4.setForeground(new java.awt.Color(51, 0, 255));
        jLabel4.setText("Password");

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        updateBtn.setForeground(new java.awt.Color(153, 0, 153));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setForeground(new java.awt.Color(153, 0, 153));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        ConfirmBtn.setForeground(new java.awt.Color(153, 0, 153));
        ConfirmBtn.setText("Confirm Update");
        ConfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBtnActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(51, 0, 255));
        jLabel5.setText("Username");

        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(ConfirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateBtn)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(submit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Backbtn)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateBtn)
                            .addComponent(deleteBtn)
                            .addComponent(ConfirmBtn))
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3))
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Backbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(submit)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBtnActionPerformed
        // TODO add your handling code here:

        String name = nameJTextField.getText();
        String uname=uNameTextField.getText();
        String password=PasswordField.getText();

        try {
            if(name==null || name.isEmpty()){
                throw new NullPointerException(" Name field is Empty");

            }else if(name.length()<5 || Pattern.matches("^[A-Za-z]+$", name)==false){
                throw new Exception("Please enter valid  Name");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "  Name is invalid");

            return;
        }

        try {
            if(uname==null || uname.isEmpty()){
                throw new NullPointerException("User Name field is Empty");

            }else if(uname.length()<5){
                throw new Exception("Please enter valid User Name");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "User Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " User Name is invalid");

            return;
        }

        try {

            if(password==null || password.isEmpty()){
                throw new NullPointerException("Pwd field is Empty");
            }else if(Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password)==false){
                throw new Exception("Invalid Password");
            }

        }  catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Password is Empty");

            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is of invalid pattern");

            return;
        }

        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(uname)==false) {
            JOptionPane.showMessageDialog(null,"  User Name already exists ");
        }else{

            system.getUserAccountDirectory().updateUserAccount(user,name,uname,password);
            populateNetworkTable();
            submitJButton.setEnabled(true);
            deleteBtn.setEnabled(true);
            updateBtn.setEnabled(true);
            ConfirmBtn.setEnabled(false);
            nameJTextField.setText("");
            uNameTextField.setText("");
            PasswordField.setText("");
        }
    }//GEN-LAST:event_ConfirmBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = networkJTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username= (String) networkJTable.getValueAt(selectedRow, 1);
                String pwd= (String) networkJTable.getValueAt(selectedRow, 2);
                UserAccount user=system.getUserAccountDirectory().authenticateUser(username, pwd);

                //UserAccount user = (UserAccount) networkJTable.getValueAt(selectedRow, 0);
                system.getUserAccountDirectory().deleteUserAccount(user);
                system.getRestaurantDirectory().deleteRestaurent(user.getUsername());
                populateNetworkTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int selectRow = networkJTable.getSelectedRow();

        if(selectRow>=0){
            String username= (String) networkJTable.getValueAt(selectRow, 1);
            String pwd= (String) networkJTable.getValueAt(selectRow, 2);
            user=system.getUserAccountDirectory().authenticateUser(username, pwd);

            nameJTextField.setText(user.getName()+"");
            uNameTextField.setText(user.getUsername()+"");
            PasswordField.setText(user.getPassword()+"");
            // system.getUserAccountDirectory().deleteUserAccount(user);

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row");
        }
        submitJButton.setEnabled(false);
        deleteBtn.setEnabled(false);
        updateBtn.setEnabled(false);
        ConfirmBtn.setEnabled(true);
    }//GEN-LAST:event_updateBtnActionPerformed
     
    
    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();
        
        model.setRowCount(0);
        
       // for()
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
           
            if ("Business.Role.AdminRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3];
               
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                
                model.addRow(row);
            }
            
        }
    }
    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        // TODO add your handling code here:
       userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackbtnActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String name = nameJTextField.getText();
        String uname=uNameTextField.getText();
        String password=PasswordField.getText();
              
        try {
             if(name==null || name.isEmpty()){
                throw new NullPointerException(" Name field is Empty");
                
                
            }else if(name.length()<5 || Pattern.matches("^[A-Za-z]+$", name)==false){
                throw new Exception("Please enter valid  Name");
                
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Name is Empty");
           
            return;
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "  Name is invalid");
       
            return;
        }
        
        try {
             if(uname==null || uname.isEmpty()){
                throw new NullPointerException("User Name field is Empty");
                
                
            }else if(uname.length()<5){
                throw new Exception("Please enter valid User Name");
                
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "User Name is Empty");
           
            return;
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " User Name is invalid");
       
            return;
        }
        
         try {
             
            if(password==null || password.isEmpty()){
                throw new NullPointerException("Password field is Empty");
            }else if(Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password)==false){
                throw new Exception("Invalid Password");
            }
            
            
        }  catch(NullPointerException e){
             JOptionPane.showMessageDialog(null, "Password is Empty");
            
             
             return;
        }catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Password is of invalid pattern");
             
             
             return;
        }
         
         
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(uname)==false) {
            JOptionPane.showMessageDialog(null,"  User Name already exists ");
        }else{
            
        UserAccount ua1 =system.getUserAccountDirectory().createUserAccount(name,uname,password, null, new AdminRole());
        Restaurant restro= system.getRestaurantDirectory().createRestaurantInfo(uname);
        populateNetworkTable();
        nameJTextField.setText("");
        uNameTextField.setText("");
        PasswordField.setText("");
        }
    }//GEN-LAST:event_submitActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }    
    
    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              

        String name = nameJTextField.getText();
        String uname=uNameTextField.getText();
        String password=PasswordField.getText();
              
        try {
             if(name==null || name.isEmpty()){
                throw new NullPointerException(" Name field is Empty");
                
                
            }else if(name.length()<5 || Pattern.matches("^[A-Za-z]+$", name)==false){
                throw new Exception("Please enter valid  Name");
                
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Name is Empty");
           
            return;
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "  Name is invalid");
       
            return;
        }
        
        try {
             if(uname==null || uname.isEmpty()){
                throw new NullPointerException("User Name field is Empty");
                
                
            }else if(uname.length()<5){
                throw new Exception("Please enter valid User Name");
                
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "User Name is Empty");
           
            return;
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " User Name is invalid");
       
            return;
        }
        
         try {
             
            if(password==null || password.isEmpty()){
                throw new NullPointerException("Pwd field is Empty");
            }else if(Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password)==false){
                throw new Exception("Invalid Password");
            }
            
            
        }  catch(NullPointerException e){
             JOptionPane.showMessageDialog(null, "Password is Empty");
            
             
             return;
        }catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Password is of invalid pattern");
             
             
             return;
        }
         
         
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(uname)==false) {
            JOptionPane.showMessageDialog(null,"  User Name already exists ");
        }else{
            
        UserAccount ua1 =system.getUserAccountDirectory().createUserAccount(name,uname,password, null, new CustomerRole());
        Restaurant restro= system.getRestaurantDirectory().createRestaurantInfo(uname);
        populateNetworkTable();
        nameJTextField.setText("");
        uNameTextField.setText("");
        PasswordField.setText("");
        }
    }                                    
 private javax.swing.JButton submitJButton;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JButton ConfirmBtn;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable networkJTable;
    private javax.swing.JButton submit;
    private javax.swing.JTextField uNameTextField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}