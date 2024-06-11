
import ConnectionDatabase.ConnectDB;
import ViewStaff.Main;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.modelData;
import raven.chart.CurveLineChart;
import raven.chart.ModelChart;

public class NewJFrame extends javax.swing.JFrame {

    Connection conn = null;
    ConnectDB cn = new ConnectDB();
    Statement st = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public NewJFrame() {
        initComponents();
        chart.setTitle("Data Chart");
        chart.addLegend("Total Price", Color.decode("#7b4397"), Color.decode("#dc2430"));
        setData();
    }

    private void setData() {
        try {
            List<modelData> dataList = new ArrayList<>();
            conn = cn.getConnection();
            String sql = "SELECT DATEPART(month, CheckOutDate) AS [Month], SUM(TotalPrice) AS Price FROM Enroll WHERE TotalPrice IS NOT NULL GROUP BY DATEPART(month, CheckOutDate) ORDER BY DATEPART(month, CheckOutDate)";
            PreparedStatement p = conn.prepareStatement(sql);
            ResultSet r = p.executeQuery();

            while (r.next()) {
                int month = r.getInt("Month");
                double price = r.getDouble("Price");
                dataList.add(new modelData(month, price));
            }

            r.close();
            p.close();

            // Đảm bảo rằng tất cả 12 tháng đều được hiển thị
            for (int month = 1; month <= 12; month++) {
                double price = 0.0;
                for (modelData data : dataList) {
                    if (data.getMonth() == month) {
                        price = data.getPrice();
                        break;
                    } else {
                    }
                }
                chart.addData(new ModelChart(String.valueOf(month), new double[]{price}));
            }

            chart.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    private void setDataRoom() {
//    try {
//        List<modelData> lists = new ArrayList<>();
//        String selectValueID = CbRoomID.getSelectedItem().toString();
//        conn = cn.getConnection();
//        String sql = "SELECT DATEPART(month, CheckOutDate) AS [Month], SUM(TotalPrice) AS Price FROM Enroll WHERE TotalPrice IS NOT NULL AND RoomID = ? GROUP BY DATEPART(month, CheckOutDate) ORDER BY DATEPART(month, CheckOutDate) DESC OFFSET 0 ROWS FETCH NEXT 7 ROWS ONLY";
//        PreparedStatement p = conn.prepareStatement(sql);
//        p.setString(1, selectValueID);
//        ResultSet r = p.executeQuery();
//        
//        while (r.next()) {
//            String month = r.getString("Month");
//            double price = r.getDouble("Price");
//            lists.add(new modelData(month, price));
//        }
//        
//        r.close();
//        p.close();
//        
//        // Add data to chart
//        for (int i = lists.size() - 1; i >= 0; i--) {
//            modelData d = lists.get(i);
//            double price = d.getPrice(); // Chuyển đổi kiểu long sang kiểu double
//            chart.addData(new ModelChart(d.getMonth(), new double[]{price}));
//        }
//        
//        chart.start();
//    } catch (Exception e) {
//        e.printStackTrace();
//    } 
//}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chart = new raven.chart.CurveLineChart();
        curveLineChart1 = new raven.chart.CurveLineChart();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(curveLineChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(curveLineChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private raven.chart.CurveLineChart chart;
    private raven.chart.CurveLineChart curveLineChart1;
    // End of variables declaration//GEN-END:variables
}
