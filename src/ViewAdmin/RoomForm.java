
package ViewAdmin;

import ConnectionDatabase.ConnectDB;
import java.awt.Color;
import java.awt.Font;

import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author ADMIN
 */
public class RoomForm extends javax.swing.JFrame {

    final String[] header = {"RoomID", "RoomType", "RoomPrice", "RoomStatus"};
    final DefaultTableModel tb = new DefaultTableModel(header, 0);
    ResultSet rs;
    ConnectDB cn = new ConnectDB();
    Statement st = null;
    Connection conn;
    PreparedStatement pst;

    public RoomForm() {
        initComponents();
        loadTable();
        TableRooms.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 15));
        TableRooms.getTableHeader().setOpaque(false);
        TableRooms.getTableHeader().setBackground(new Color(32, 136, 203));
        TableRooms.getTableHeader().setForeground(new Color(255, 255, 255));
        TableRooms.setRowHeight(25);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableRooms = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CbRoomType = new javax.swing.JComboBox<>();
        btnAddRoom = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnDeleteRoom = new javax.swing.JButton();
        btnChangeRoom = new javax.swing.JButton();
        txtRoomPrice = new javax.swing.JTextField();
        txtRoomID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        TableRooms.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TableRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "RoomID", "Room Type", "Room Price", "Room Status"
            }
        ));
        TableRooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableRoomsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableRooms);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hotel.png"))); // NOI18N
        jLabel1.setText("Room Control");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("RoomID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("RoomPrice");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("RoomType");

        CbRoomType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CbRoomType.setForeground(new java.awt.Color(0, 102, 102));
        CbRoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Room", "Double Room", "VIP Room", "Family Room" }));
        CbRoomType.setBorder(new javax.swing.border.MatteBorder(null));
        CbRoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbRoomTypeActionPerformed(evt);
            }
        });

        btnAddRoom.setBackground(new java.awt.Color(255, 204, 102));
        btnAddRoom.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAddRoom.setForeground(new java.awt.Color(255, 255, 255));
        btnAddRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-button.png"))); // NOI18N
        btnAddRoom.setText("AddRoom");
        btnAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRoomActionPerformed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnDeleteRoom.setBackground(new java.awt.Color(255, 204, 102));
        btnDeleteRoom.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnDeleteRoom.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        btnDeleteRoom.setText("Delete Room");
        btnDeleteRoom.setToolTipText("");
        btnDeleteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRoomActionPerformed(evt);
            }
        });

        btnChangeRoom.setBackground(new java.awt.Color(255, 204, 102));
        btnChangeRoom.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnChangeRoom.setForeground(new java.awt.Color(255, 255, 255));
        btnChangeRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/import.png"))); // NOI18N
        btnChangeRoom.setText("Fix Room");
        btnChangeRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeRoomActionPerformed(evt);
            }
        });

        txtRoomPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtRoomID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAddRoom)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtRoomPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(CbRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChangeRoom)
                            .addGap(237, 237, 237)
                            .addComponent(btnDeleteRoom)
                            .addGap(47, 47, 47)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(735, 735, 735)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClose)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)
                        .addGap(25, 25, 25)
                        .addComponent(txtRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(24, 24, 24)
                        .addComponent(CbRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRoomPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangeRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        MainAdmin frm = new MainAdmin();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRoomActionPerformed
        String roomType = CbRoomType.getSelectedItem().toString();
        String roomID = txtRoomID.getText();
        String roomPrice = txtRoomPrice.getText();

        if (roomPrice.isEmpty() || roomType.isEmpty() || roomID.isEmpty()) {
            JOptionPane.showConfirmDialog(this, "Not enough information!");
            return;
        }

        try (Connection conn = cn.getConnection()) {
            String sql_check_pk = "SELECT RoomID FROM Room WHERE RoomID = ?";
            PreparedStatement pst = conn.prepareStatement(sql_check_pk);
            pst.setString(1, roomID);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showConfirmDialog(this, "RoomID already exists!");
                return;
            }

            String sql = "INSERT INTO Room VALUES (?, ?, ?, 'Not Booked')";
            pst = conn.prepareStatement(sql);
            pst.setString(1, roomID);
            pst.setString(2, roomType);
            pst.setString(3, roomPrice);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Add room successfully!");
                loadTable();
                clearTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAddRoomActionPerformed

    private void btnDeleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRoomActionPerformed
        String roomID = txtRoomID.getText();

        try (Connection conn = cn.getConnection();
             PreparedStatement pstCheck = conn.prepareStatement("SELECT RoomStatus FROM Room WHERE RoomID = ?")) {

            pstCheck.setString(1, roomID);
            try (ResultSet rs = pstCheck.executeQuery()) {
                if (rs.next() && "Booked".equals(rs.getString("RoomStatus"))) {
                    JOptionPane.showMessageDialog(this, "Room is booked, cannot delete!", "Alert", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            int confirmResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this room?", "Confirm deletion", JOptionPane.YES_NO_OPTION);
            if (confirmResult == JOptionPane.YES_OPTION) {
                try (PreparedStatement pstDelete = conn.prepareStatement("DELETE FROM Room WHERE RoomID = ?")) {
                    pstDelete.setString(1, roomID);
                    int deleteCount = pstDelete.executeUpdate();

                    if (deleteCount > 0) {
                        JOptionPane.showMessageDialog(this, "Delete room successfully!", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        clearTable();
                    } else {
                        JOptionPane.showMessageDialog(this, "Unable to delete room. Please try again!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteRoomActionPerformed

    private void btnChangeRoomActionPerformed(java.awt.event.ActionEvent evt) {                                              
        String roomType = CbRoomType.getSelectedItem().toString();
        String roomID = txtRoomID.getText();
        String roomPrice = txtRoomPrice.getText();

        if (roomPrice.isEmpty() || roomType.isEmpty() || roomID.isEmpty()) {
            JOptionPane.showConfirmDialog(this, "Not enough data!");
            return;
        }

        try (Connection conn = cn.getConnection();
             PreparedStatement pst = conn.prepareStatement("UPDATE Room SET RoomType = ?, RoomPrice = ? WHERE RoomID = ?")) {

            pst.setString(1, roomType);
            pst.setString(2, roomPrice);
            pst.setString(3, roomID);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Update room successfully!");
                loadTable();
                clearTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void TableRoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableRoomsMouseClicked
        int index = CbRoomType.getSelectedIndex();
        String selectValue = CbRoomType.getItemAt(index);

        int x = TableRooms.getSelectedRow();
        if (x >= 0) {
            txtRoomID.setText(TableRooms.getValueAt(x, 0) + "");
            CbRoomType.setSelectedItem(TableRooms.getValueAt(x, 1) + "");
            txtRoomPrice.setText(TableRooms.getValueAt(x, 2) + "");
            txtRoomID.setEnabled(false);
        }
    }//GEN-LAST:event_TableRoomsMouseClicked

    private void CbRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbRoomTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbRoomTypeActionPerformed

    @SuppressWarnings("ConvertToTryWithResources")
    public void loadTable() {
        try (Connection conn = cn.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from Room")) {

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            tb.setRowCount(0);

            while (rs.next()) {
                Vector<String> row = new Vector<>();
                for (int i = 1; i <= columnCount; i++) {
                    row.addElement(rs.getString(i));
                }
                tb.addRow(row);
            }
            TableRooms.setModel(tb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearTable() {
        txtRoomID.setText("");
        txtRoomPrice.setText("");
        loadTable();
        txtRoomID.setEnabled(true);
    }

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
            java.util.logging.Logger.getLogger(RoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RoomForm frm = new RoomForm();
                frm.setLocationRelativeTo(null);
                frm.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbRoomType;
    private javax.swing.JTable TableRooms;
    private javax.swing.JButton btnAddRoom;
    private javax.swing.JButton btnChangeRoom;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDeleteRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtRoomID;
    private javax.swing.JTextField txtRoomPrice;
    // End of variables declaration//GEN-END:variables
}
