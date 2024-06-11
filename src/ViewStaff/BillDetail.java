/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ViewStaff;

import ConnectionDatabase.ConnectDB;
import java.awt.Color;
import java.awt.Font;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 * @author qbkilll
 */
public class BillDetail extends javax.swing.JFrame {
    ConnectDB cn = new ConnectDB();


    /**
     * Creates new form BillDetail
     */
    public BillDetail() {
        initComponents();
        tableBill.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 15));
        tableBill.getTableHeader().setOpaque(false);
        tableBill.getTableHeader().setBackground(new Color(32, 136, 203));
        tableBill.getTableHeader().setForeground(new Color(255, 255, 255));
        tableBill.setRowHeight(25);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableBill = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtRoomIDSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(1103, 768));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tableBill.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "BillID", "CusID", "CusName", "CusPhone", "RoomID", "Room Type", "Room Price", "CheckInDate", "CheckOutDate", "TotalServicePrice", "TotalPrice"
            }
        ));
        tableBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBillMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBill);
        if (tableBill.getColumnModel().getColumnCount() > 0) {
            tableBill.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/invoice (1).png"))); // NOI18N
        jLabel2.setText("Bill Management ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Find room by ID");

        txtRoomIDSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtRoomIDSearch.setForeground(new java.awt.Color(0, 102, 102));
        txtRoomIDSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomIDSearchActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loupe.png"))); // NOI18N
        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circular.png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtRoomIDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(btnClose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoomIDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRoomIDSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomIDSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomIDSearchActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String roomID = txtRoomIDSearch.getText();
        String sql = "select Enroll.EnrollID, Enroll.CusID, Customer.CusName, Customer.CusPhone," +
                " Enroll.RoomID, Room.RoomType, Room.RoomPrice," +
                " Enroll.CheckInDate, Enroll.CheckOutDate, Enroll.TotalServicePrice, Enroll.TotalPrice" +
                " from Enroll inner join Customer on Enroll.CusID = Customer.CusID" +
                " inner join Room on Enroll.RoomID = Room.RoomID" +
                " where Enroll.RoomID = ?";
        DefaultTableModel model = (DefaultTableModel) tableBill.getModel();
        model.setRowCount(0);
        try (Connection conn = cn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, roomID);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    model.addRow(new Object[]{
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7),
                            rs.getString(8),
                            rs.getString(9),
                            rs.getString(10),
                            rs.getString(11)
                    });
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        Main frm = new Main();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCloseActionPerformed

    private void tableBillMouseClicked(java.awt.event.MouseEvent evt) {
        BillDetail billDetail = new BillDetail();
            billDetail.setVisible(false);
        try {
            int index = tableBill.getSelectedRow();
            TableModel model = tableBill.getModel();
            String enrollID = model.getValueAt(index, 0).toString();
            String cusID = model.getValueAt(index, 1).toString();
            String cusName = model.getValueAt(index, 2).toString();
            String cusPhone = model.getValueAt(index, 3).toString();
            String roomID = model.getValueAt(index, 4).toString();
            String roomType = model.getValueAt(index, 5).toString();
            String roomPrice = model.getValueAt(index, 6).toString();
            String checkInDate = model.getValueAt(index, 7).toString();
            String checkOutDate = model.getValueAt(index, 8).toString();
            String totalServicePrice = model.getValueAt(index, 9).toString();
            String totalPrice = model.getValueAt(index, 10).toString();
            PrintBill printBill = new PrintBill(enrollID, cusID, cusName, cusPhone, roomID, roomType, roomPrice, checkInDate, checkOutDate, totalServicePrice, totalPrice);
            printBill.setLocationRelativeTo(null);
            printBill.setVisible(true);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableBill.getModel();
        model.setRowCount(0);
        try (Connection conn = cn.getConnection();
             PreparedStatement pstmt = conn.prepareStatement("select Enroll.EnrollID, Enroll.CusID, Customer.CusName, Customer.CusPhone," +
                     " Enroll.RoomID, Room.RoomType, Room.RoomPrice," +
                     " Enroll.CheckInDate, Enroll.CheckOutDate, Enroll.TotalServicePrice, Enroll.TotalPrice" +
                     " from Enroll inner join Customer on Enroll.CusID = Customer.CusID" +
                     " inner join Room on Enroll.RoomID = Room.RoomID");
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        BillDetail frm = new BillDetail();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BillDetail frm = new BillDetail();
                frm.setLocationRelativeTo(null);
                frm.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBill;
    private javax.swing.JTextField txtRoomIDSearch;
    // End of variables declaration//GEN-END:variables
}
