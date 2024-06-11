/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewAdmin;

import ConnectionDatabase.ConnectDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @author ADMIN
 */
class Select {

    public static ResultSet getData(String Query) {
        Connection conn = null;
        ResultSet rs = null;
        Statement st = null;
        ConnectDB cn = new ConnectDB();
        try {
            conn = cn.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(Query);
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

}
