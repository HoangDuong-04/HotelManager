/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import ConnectionDatabase.ConnectDB;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ADMIN
 */
public class ForgotPass extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPass
     */
    ConnectDB connectDB = new ConnectDB();

    public ForgotPass() {
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

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("UserName:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Password new:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Repeat Password:");
        jLabel4.setToolTipText("");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circular.png"))); // NOI18N
        jButton1.setText("Change Pass");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Change Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(248, 248, 248))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 102, 102));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log-out.png"))); // NOI18N
        btnClose.setText("Back");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton1)
                        .addGap(83, 83, 83)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        LoginForm frm = new LoginForm();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed
     private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt){
         
     }
     private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt){
         
     }
     private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt){
         
     }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String username = jTextField1.getText();
        String passDefault = jTextField2.getText();
        String newPass = jTextField3.getText();

        if (username.isEmpty() || passDefault.isEmpty() || newPass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hãy điền đầy đủ thông tin");
            return;
        }

        try (Connection conn = connectDB.getConnection()) {
            if (!isUsernameExist(conn, username) || !isPasswordCorrect(conn, username, passDefault)) {
                return;
            }

            if (updatePassword(conn, username, newPass)) {
                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công !");
            } else {
                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thất bại !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        this.dispose();
    }

    private boolean isUsernameExist(Connection conn, String username) throws SQLException {
        String staffNameCheckQuery = "SELECT StaffName FROM Staff WHERE StaffName = ? AND StaffRole = 'Receptionist'";
        PreparedStatement staffNameCheck = conn.prepareStatement(staffNameCheckQuery);
        staffNameCheck.setString(1, username);
        ResultSet staffNameCheckResult = staffNameCheck.executeQuery();

        if (!staffNameCheckResult.next()) {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập không tồn tại");
            return false;
        }
        return true;
    }

    private boolean isPasswordCorrect(Connection conn, String username, String password) throws SQLException {
        String staffPassCheckQuery = "SELECT StaffPassword FROM Staff WHERE StaffName = ? AND StaffPassword = ?";
        PreparedStatement staffPassCheck = conn.prepareStatement(staffPassCheckQuery);
        staffPassCheck.setString(1, username);
        staffPassCheck.setString(2, password);
        ResultSet staffPassCheckResult = staffPassCheck.executeQuery();

        if (!staffPassCheckResult.next()) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không chính xác !");
            return false;
        }
        return true;
    }

    private boolean updatePassword(Connection conn, String username, String newPass) throws SQLException, SQLException {
        String staffPasswordUpdateQuery = "UPDATE Staff SET StaffPassword = ? WHERE StaffName = ?";
        PreparedStatement staffPasswordUpdate = conn.prepareStatement(staffPasswordUpdateQuery);
        staffPasswordUpdate.setString(1, newPass);
        staffPasswordUpdate.setString(2, username);

        int rowAffected = staffPasswordUpdate.executeUpdate();
        return rowAffected > 0;
    }                                        

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
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
