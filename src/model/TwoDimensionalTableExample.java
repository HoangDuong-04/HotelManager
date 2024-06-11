package model;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TwoDimensionalTableExample {
    public static void main(String[] args) {
        // Dữ liệu mảng 2 chiều
        Object[][] data = {
            {"John", 25, "Male"},
            {"Emily", 30, "Female"},
            {"David", 35, "Male"}
        };

        // Tên cột
        String[] columnNames = {"Name", "Age", "Gender"};

        // Tạo JTable với dữ liệu và tên cột
        JTable table = new JTable(data, columnNames);

        // Tạo JScrollPane để chứa JTable
        JScrollPane scrollPane = new JScrollPane(table);

        // Tạo JFrame và thêm JScrollPane vào đó
        JFrame frame = new JFrame("Two Dimensional Table Example");
        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
