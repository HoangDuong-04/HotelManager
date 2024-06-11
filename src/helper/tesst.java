/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class tesst {
   
    public static void main(String[] args) throws Exception {
//        String path= "E:\\";
//        Document doc = new Document();
//        try {
//            String sql_tx = "SELECT * FROM Room WHERE RoomID = ?";
//            PreparedStatement preparedStatement = conn.prepareStatement(sql_tx);
//            preparedStatement.setString(1, txtSearchRoom.getText());
//            rs = preparedStatement.executeQuery();
//            String roomID = rs.getString("RoomID");
//            String roomPrice = rs.getString("RoomPrice");
//            String roomType = rs.getString("RoomType");
//            Date selectedDateOut = txtDateCheckOut.getDate();
//            PdfWriter.getInstance(doc, new FileOutputStream(path+ "hi.pdf"));
//            
//            doc.open();
//            Paragraph paragraph1 = new Paragraph("\t\t-: Hotel Management System :-\n");
//            doc.add(paragraph1);
//            Paragraph paragraph2 = new Paragraph("*****************************************************\n");
//            doc.add(paragraph2);
//            Paragraph paragraph3 = new Paragraph("\tHóa Đơn\n\t ID Hoá Đơn :\n"
//                    + "Tên:"+name+"\n"
//                            + "SĐT: "+phoneCus+"\n"
//                                                + "Đăng Ký Ngày: "+checkIn+"\n"
//                                                    + "Trả Phòng Ngày: "+checkOut+"\n"
//                                                        + "Tổng ngày: "+totaldays+"\n"
//                                                            + "Tổng giá: "+totalPrices+"");
//            doc.add(paragraph3);
//            doc.add(paragraph2);
//            Paragraph paragraph4 = new Paragraph("\tThông tin phòng:\n"
//                    + "Số Phòng: "+roomID+"\n"
//                            + "Loại Phòng: "+roomType+"\n"
//                                    + "Giá Phòng: "+roomPrice+"");
//            doc.add(paragraph4);
//            doc.add(paragraph2);
//            PdfPTable tb1 = new PdfPTable(4);
//            tb1.addCell("Đăng Ký ngày: " + txtDateCheckIn.getText());
//            tb1.addCell("Trả Phòng Ngày: " + checkOut);
//            tb1.addCell("Tổng ngày: "+ totaldays);
//            tb1.addCell("Tổng Tiền: " + totalPrices);
//            doc.add(tb1);
//            doc.add(paragraph2);
//            Paragraph paragraph5 = new Paragraph("Cảm ơn, Hẹn gặp lại bạn!!");
//            doc.add(paragraph5);
//            
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        doc.close();
//        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn in hóa đơn?", "Select", JOptionPane.YES_NO_OPTION);
//        
//       
    }
}
