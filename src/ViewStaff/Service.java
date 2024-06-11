/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ViewStaff;

import ConnectionDatabase.ConnectDB;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Vector;


import model.PlaceholderTextField;

public class Service extends JFrame {

    public Service() {
        initComponents();
        loadTable();
        PlaceholderTextField txtSearchRoomForBook = new PlaceholderTextField(20);
        txtSearchRoomForBook.setPlaceholder("RoomID");
        jPanel2.add(txtSearchRoomForBook);
        findRoomByStatus();
        tbServiceShow.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 15));
        tbServiceShow.getTableHeader().setOpaque(true);
        tbServiceShow.getTableHeader().setBackground(new Color(32, 136, 203));
        tbServiceShow.getTableHeader().setForeground(new Color(255, 255, 255));
        tbServiceShow.setRowHeight(25);
        tbServiceChoosen.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 15));
        tbServiceChoosen.getTableHeader().setOpaque(true);
        tbServiceChoosen.getTableHeader().setBackground(new Color(32, 136, 203));
        tbServiceChoosen.getTableHeader().setForeground(new Color(255, 255, 255));
        tbServiceChoosen.setRowHeight(25);
    }

    Connection conn = null;
    ConnectDB cn = new ConnectDB();
    Statement st = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbServiceChoosen = new javax.swing.JTable();
        CbServiceType = new javax.swing.JComboBox<>();
        btnFindService = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbServiceShow = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSearchRoomForBook2 = new javax.swing.JTextField();
        txtSearchRoomForBook3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSearchRoomForBook1 = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        CbRoomID = new javax.swing.JComboBox<>();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tbServiceChoosen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbServiceChoosen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Service Type", "Service Name", "Service Price"
            }
        ));
        tbServiceChoosen.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbServiceChoosen);

        CbServiceType.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CbServiceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Entertainment", "Driver", "Other" }));
        CbServiceType.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search service type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        CbServiceType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbServiceTypeActionPerformed(evt);
            }
        });

        btnFindService.setBackground(new java.awt.Color(255, 204, 102));
        btnFindService.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFindService.setForeground(new java.awt.Color(255, 255, 255));
        btnFindService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search .png"))); // NOI18N
        btnFindService.setText("Find");
        btnFindService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindServiceActionPerformed(evt);
            }
        });

        tbServiceShow.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbServiceShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Service Type", "Service Name", "Service Price"
            }
        ));
        tbServiceShow.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbServiceShow);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Service List");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Service List was choosen");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("RoomID");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Room Information");

        txtSearchRoomForBook2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSearchRoomForBook2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchRoomForBook2ActionPerformed(evt);
            }
        });

        txtSearchRoomForBook3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSearchRoomForBook3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchRoomForBook3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Phone number");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Name");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Checkin-Date");

        txtSearchRoomForBook1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSearchRoomForBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchRoomForBook1ActionPerformed(evt);
            }
        });

        Add.setBackground(new java.awt.Color(255, 204, 102));
        Add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add-button.png"))); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        CbRoomID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CbRoomID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbRoomIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(187, 187, 187)
                            .addComponent(jLabel2)
                            .addGap(257, 257, 257)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CbServiceType, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnFindService, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(237, 237, 237))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSearchRoomForBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(47, 47, 47)
                                        .addComponent(CbRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSearchRoomForBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(76, 76, 76)
                                        .addComponent(txtSearchRoomForBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(176, 176, 176)
                                    .addComponent(jLabel3)
                                    .addGap(174, 174, 174))))
                        .addGap(58, 58, 58))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchRoomForBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(CbRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchRoomForBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(txtSearchRoomForBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CbServiceType, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFindService, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87))
        );

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/box.png"))); // NOI18N
        jLabel1.setText("Book for Service");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbServiceTypeActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CbServiceTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbServiceTypeActionPerformed

    private void btnFindServiceActionPerformed(ActionEvent evt) {
        String selectValueType = CbServiceType.getSelectedItem().toString();
        ResultSet rs = Select.getData("SELECT * FROM Service WHERE ServiceType = '" + selectValueType + "'");
        DefaultTableModel model = (DefaultTableModel) tbServiceShow.getModel();
        model.setRowCount(0);
        try {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(2), rs.getString(1), rs.getString(3)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    private void findRoomByStatus() {
    String sql = "SELECT RoomID FROM Room WHERE RoomStatus = 'Booked'";

    try (Connection conn = cn.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        CbRoomID.removeAllItems();
        CbRoomID.addItem("");
        while (rs.next()) {
            CbRoomID.addItem(rs.getString("RoomID"));
        }
        CbRoomID.setSelectedIndex(0);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    private void FindCusByRoomID(){
        String roomID = CbRoomID.getSelectedItem().toString();
        String sql = "SELECT Customer.CusName, Customer.CusPhone, Enroll.CheckinDate " +
                "FROM Customer, Enroll " +
                "WHERE Enroll.RoomID = ? AND Enroll.CusID = Customer.CusID AND Enroll.CheckOutDate IS NULL";
        try (Connection conn = cn.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, roomID);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txtSearchRoomForBook1.setText(rs.getString("CusPhone"));
                txtSearchRoomForBook3.setText(rs.getString("CusName"));
                txtSearchRoomForBook2.setText(rs.getString("CheckInDate"));
                loadTable1();
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void btnFindRoomActionPerformed(ActionEvent evt) {
        
    }

    private void btnCloseActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        Main frm = new Main();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtSearchRoomForBook1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtSearchRoomForBook1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchRoomForBook1ActionPerformed

    private void txtSearchRoomForBook2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtSearchRoomForBook2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchRoomForBook2ActionPerformed

    private void txtSearchRoomForBook3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtSearchRoomForBook3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchRoomForBook3ActionPerformed

    private void AddActionPerformed(ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        String roomID = CbRoomID.getSelectedItem().toString();
        String serviceName = tbServiceShow.getValueAt(tbServiceShow.getSelectedRow(), 1).toString();
        String enrollIDFind = "SELECT EnrollID FROM Enroll WHERE RoomID = '" + roomID + "' AND CheckInDate = '" + txtSearchRoomForBook2.getText() + "'";
        try (Connection conn = cn.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(enrollIDFind)) {
            while (rs.next()) {
                String enrollID = rs.getString("EnrollID");
                String sql = "INSERT INTO ServiceRoom VALUES (?, ?)";
                try (PreparedStatement pst = conn.prepareStatement(sql)) {
                    pst.setString(1, serviceName);
                    pst.setString(2, enrollID);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Add service successfully");
                    loadTable1();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddActionPerformed

    private void CbRoomIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbRoomIDActionPerformed
        
        FindCusByRoomID();
    }//GEN-LAST:event_CbRoomIDActionPerformed

    public void loadTable() {
        String sql = "SELECT ServiceType, ServiceName, ServicePrice FROM Service";
        try (Connection conn = cn.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            DefaultTableModel df = (DefaultTableModel) tbServiceShow.getModel();
            df.setRowCount(0);

            while (rs.next()) {
                Vector<String> row = new Vector<>();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    row.addElement(rs.getString(i));
                }
                df.addRow(row);
            }
            tbServiceShow.setModel(df);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadTable1() {
        String roomID = CbRoomID.getSelectedItem().toString();
        String sql = "SELECT Service.ServiceType, ServiceRoom.ServiceName, Service.ServicePrice, Enroll.CheckInDate, Enroll.RoomID, Room.RoomStatus" +
                " FROM ServiceRoom INNER JOIN Service ON ServiceRoom.ServiceName = Service.ServiceName" +
                " INNER JOIN Enroll ON ServiceRoom.EnrollID = Enroll.EnrollID" +
                " INNER JOIN Room ON Enroll.RoomID = Room.RoomID" +
                " WHERE Enroll.RoomID = '" + roomID + "' AND Room.RoomStatus = 'Booked' AND Enroll.CheckInDate = '" + txtSearchRoomForBook2.getText() + "';";
        try (Connection conn = cn.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            DefaultTableModel df = (DefaultTableModel) tbServiceChoosen.getModel();
            df.setRowCount(0);

            while (rs.next()) {
                Vector<String> row = new Vector<>();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    row.addElement(rs.getString(i));
                }
                df.addRow(row);
            }
            tbServiceChoosen.setModel(df);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {


        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Service frm = new Service();
                frm.setLocationRelativeTo(null);
                frm.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JComboBox<String> CbRoomID;
    private javax.swing.JComboBox<String> CbServiceType;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnFindService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbServiceChoosen;
    private javax.swing.JTable tbServiceShow;
    private javax.swing.JTextField txtSearchRoomForBook1;
    private javax.swing.JTextField txtSearchRoomForBook2;
    private javax.swing.JTextField txtSearchRoomForBook3;
    // End of variables declaration//GEN-END:variables


}
