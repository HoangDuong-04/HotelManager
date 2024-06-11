/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ViewAdmin;

import ConnectionDatabase.ConnectDB;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

import model.Select;

public class ServiceControl extends javax.swing.JFrame {

    /**
     * Creates new form ServiceControl
     */
    public ServiceControl() {
        initComponents();
        loadTable();
        loadTable1();
        tbService.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 15));
        tbService.getTableHeader().setOpaque(false);
        tbService.getTableHeader().setBackground(new Color(32, 136, 203));
        tbService.getTableHeader().setForeground(new Color(255, 255, 255));
        tbService.setRowHeight(25);
        tbService1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 15));
        tbService1.getTableHeader().setOpaque(false);
        tbService1.getTableHeader().setBackground(new Color(32, 136, 203));
        tbService1.getTableHeader().setForeground(new Color(255, 255, 255));
        tbService1.setRowHeight(25);
    }

    Connection conn = null;
    ConnectDB cn = new ConnectDB();
    Statement st = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane1 = new java.awt.ScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAddService = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtServiceName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CbServiceType = new javax.swing.JComboBox<>();
        txtServicePrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbService = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnClose1 = new javax.swing.JButton();
        btnDeleteService = new javax.swing.JButton();
        btnRefresh1 = new javax.swing.JButton();
        btnChangeService = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtServiceChangeName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtServiceChangePrice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        CbServiceType1 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbService1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setForeground(new java.awt.Color(0, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/box.png"))); // NOI18N
        jLabel1.setText("Service Control");
        jLabel1.setToolTipText("");

        btnAddService.setBackground(new java.awt.Color(255, 204, 102));
        btnAddService.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddService.setForeground(new java.awt.Color(255, 255, 255));
        btnAddService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-button.png"))); // NOI18N
        btnAddService.setText("Add Service");
        btnAddService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddServiceActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(255, 204, 102));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circular.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Service Name");

        txtServiceName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel12.setBackground(new java.awt.Color(0, 102, 102));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Service Type");

        CbServiceType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CbServiceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Entertainment", "Transport", "Other" }));
        CbServiceType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbServiceTypeActionPerformed(evt);
            }
        });

        txtServicePrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Service Price");

        tbService.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tbService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ServiceType", "ServiceName", "ServicePrice"
            }
        ));
        jScrollPane1.setViewportView(tbService);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(164, 164, 164)
                                        .addComponent(btnAddService)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRefresh))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtServicePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtServiceName, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12)
                                        .addGap(41, 41, 41)
                                        .addComponent(CbServiceType, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(78, 78, 78)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnClose))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtServiceName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbServiceType, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtServicePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddService, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );

        jTabbedPane1.addTab("AddService", jPanel1);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/box.png"))); // NOI18N
        jLabel6.setText("Service Control");
        jLabel6.setToolTipText("");

        btnClose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });

        btnDeleteService.setBackground(new java.awt.Color(255, 204, 102));
        btnDeleteService.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeleteService.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete (1).png"))); // NOI18N
        btnDeleteService.setText("Delete Service");
        btnDeleteService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteServiceActionPerformed(evt);
            }
        });

        btnRefresh1.setBackground(new java.awt.Color(255, 204, 102));
        btnRefresh1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRefresh1.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circular.png"))); // NOI18N
        btnRefresh1.setText("Refresh");
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });

        btnChangeService.setBackground(new java.awt.Color(255, 204, 102));
        btnChangeService.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnChangeService.setForeground(new java.awt.Color(255, 255, 255));
        btnChangeService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/import.png"))); // NOI18N
        btnChangeService.setText("Change Service");
        btnChangeService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeServiceActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search .png"))); // NOI18N
        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Service Name");

        txtServiceChangeName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Service Price");

        txtServiceChangePrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel14.setBackground(new java.awt.Color(0, 102, 102));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Service Type");

        CbServiceType1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CbServiceType1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Entertainment", "Transport", "Other" }));
        CbServiceType1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbServiceType1ActionPerformed(evt);
            }
        });

        tbService1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tbService1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ServiceType", "ServiceName", "ServicePrice"
            }
        ));
        tbService1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbService1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbService1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnChangeService)
                        .addGap(129, 129, 129)
                        .addComponent(btnDeleteService))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CbServiceType1, 0, 173, Short.MAX_VALUE)
                            .addComponent(txtServiceChangeName))
                        .addGap(48, 48, 48)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(34, 34, 34)
                        .addComponent(txtServiceChangePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGap(93, 93, 93))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(btnClose1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbServiceType1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtServiceChangePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtServiceChangeName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteService, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangeService, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Change Service", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddServiceActionPerformed(java.awt.event.ActionEvent evt) {
        String name = txtServiceName.getText();
        String price = txtServicePrice.getText();
        String selectValueType = CbServiceType.getSelectedItem().toString();

        try (Connection conn = cn.getConnection();
             PreparedStatement pst = conn.prepareStatement("INSERT INTO Service VALUES (?, ?, ?)")) {
            pst.setString(1, name);
            pst.setString(2, selectValueType);
            pst.setString(3, price);

            int updatedRows = pst.executeUpdate();

            if (updatedRows > 0) {
                JOptionPane.showMessageDialog(null, "Add Service success");
                loadTable();
                deleteTable();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to add service");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }                                             

    private void deleteTable1() {
        txtServiceChangeName.setText("");
        txtServiceChangePrice.setText("");
        loadTable1();
    }

    private void deleteTable() {
        txtServicePrice.setText("");
        txtServiceName.setText("");
        loadTable();
    }

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        setVisible(false);
        ServiceControl frm = new ServiceControl();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here
        MainAdmin frm = new MainAdmin();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        MainAdmin frm = new MainAdmin();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClose1ActionPerformed

    private void btnDeleteServiceActionPerformed(java.awt.event.ActionEvent evt) {
        String serviceName = txtServiceChangeName.getText();
        if (JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this Service?", "Confirm deletion?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try (Connection conn = cn.getConnection();
                 PreparedStatement pst = conn.prepareStatement("DELETE FROM Service WHERE ServiceName = ?")) {
                pst.setString(1, serviceName);
                if (pst.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(this, "Service deleted!", "Notification", JOptionPane.INFORMATION_MESSAGE);
                    deleteTable1();
                    loadTable1();
                } else {
                    JOptionPane.showMessageDialog(this, "Service can't delete. Please check again!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }                                                

    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ServiceControl frm = new ServiceControl();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }//GEN-LAST:event_btnRefresh1ActionPerformed

    private void btnChangeServiceActionPerformed(java.awt.event.ActionEvent evt) {
        String nameAfter = txtServiceChangeName.getText();
        String price = txtServiceChangePrice.getText();
        String selectValueType = CbServiceType1.getSelectedItem().toString();
        String nameBefore = tbService1.getValueAt(tbService1.getSelectedRow(), 1).toString();

        try (Connection conn = cn.getConnection();
             PreparedStatement pst = conn.prepareStatement("UPDATE Service SET ServiceType = ?, ServiceName = ?, ServicePrice = ? WHERE ServiceName = ?")) {
            pst.setString(1, selectValueType);
            pst.setString(2, nameAfter);
            pst.setString(3, price);
            pst.setString(4, nameBefore);

            int updatedRows = pst.executeUpdate();

            if (updatedRows > 0) {
                JOptionPane.showMessageDialog(null, "Complete change!");
                loadTable();
                deleteTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }                                                

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String selectValueType = CbServiceType1.getSelectedItem().toString();
        DefaultTableModel model = (DefaultTableModel) tbService1.getModel();
        model.setRowCount(0);
        try (ResultSet rs = Select.getData("SELECT * FROM Service WHERE ServiceType = '" + selectValueType + "' ")) {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }                                        

    private void CbServiceTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbServiceTypeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_CbServiceTypeActionPerformed

    private void CbServiceType1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbServiceType1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbServiceType1ActionPerformed

    private void tbService1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbService1MouseClicked
        int index = CbServiceType1.getSelectedIndex();
        String selectValue = CbServiceType1.getItemAt(index);

        int x = tbService1.getSelectedRow();
        if (x >= 0) {
            CbServiceType1.setSelectedItem(tbService1.getValueAt(x, 0) + "");
            txtServiceChangeName.setText(tbService1.getValueAt(x, 1) + "");
            txtServiceChangePrice.setText(tbService1.getValueAt(x, 2) + "");
        }
    }//GEN-LAST:event_tbService1MouseClicked


    public void loadTable() {
        try {
            conn = cn.getConnection();
            int number;
            Vector row;
            String sql = "SELECT ServiceType, ServiceName, ServicePrice FROM Service"; // Thêm một khoảng trắng giữa "ServiceStatus" và "FROM"
            Statement stmtStatement = conn.createStatement();
            ResultSet rs = stmtStatement.executeQuery(sql);
            ResultSetMetaData metaData = rs.getMetaData();
            DefaultTableModel df = (DefaultTableModel) tbService.getModel();

            number = metaData.getColumnCount();
            df.setRowCount(0);
            while (rs.next()) {
                row = new Vector();
                for (int i = 1; i <= number; i++) {
                    row.addElement(rs.getString(i));
                }
                df.addRow(row);
            }
            // Di chuyển việc đặt mô hình của bảng ra khỏi vòng lặp
            tbService.setModel(df);

            stmtStatement.close();
            rs.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadTable1() {
        try {
            conn = cn.getConnection();
            int number;
            Vector row;
            String sql = "SELECT ServiceType, ServiceName, ServicePrice FROM Service"; // Thêm một khoảng trắng giữa "ServiceStatus" và "FROM"
            Statement stmtStatement = conn.createStatement();
            ResultSet rs = stmtStatement.executeQuery(sql);
            ResultSetMetaData metaData = rs.getMetaData();
            DefaultTableModel df = (DefaultTableModel) tbService1.getModel();

            number = metaData.getColumnCount();
            df.setRowCount(0);
            while (rs.next()) {
                row = new Vector();
                for (int i = 1; i <= number; i++) {
                    row.addElement(rs.getString(i));
                }
                df.addRow(row);
            }
            // Di chuyển việc đặt mô hình của bảng ra khỏi vòng lặp
            tbService.setModel(df);

            stmtStatement.close();
            rs.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(ServiceControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbServiceType;
    private javax.swing.JComboBox<String> CbServiceType1;
    private javax.swing.JButton btnAddService;
    private javax.swing.JButton btnChangeService;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnClose1;
    private javax.swing.JButton btnDeleteService;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTable tbService;
    private javax.swing.JTable tbService1;
    private javax.swing.JTextField txtServiceChangeName;
    private javax.swing.JTextField txtServiceChangePrice;
    private javax.swing.JTextField txtServiceName;
    private javax.swing.JTextField txtServicePrice;
    // End of variables declaration//GEN-END:variables
}
