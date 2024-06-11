/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import ConnectionDatabase.ConnectDB;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ADMIN
 */
public class Select {
    public static ResultSet getData(String Query){
        Connection conn = null;
        ResultSet rs = null;
        Statement st = null;
        ConnectDB cn = new ConnectDB();
        try {
            conn = cn.getConnection();
            st=conn.createStatement();
            rs= st.executeQuery(Query);
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return  null;
        }
    }
}
