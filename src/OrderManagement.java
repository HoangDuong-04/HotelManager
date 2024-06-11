import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class OrderManagement {

    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 300;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Quản lý đơn hàng");
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        String[][] data = {
                {"Đồ ăn", "Mi ly", "17,000"},
                {"Đồ ăn", "Cơm chiên", "30,000"},
                {"Đồ ăn", "Bún bò", "30,000"},
                {"Đồ ăn", "Mì quảng", "25,000"},
        };

        String[] columnNames = {"Loại DV", "Dịch vụ", "Giá"};

        JTable table = new JTable(data, columnNames);
        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        tableScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JButton addButton = new JButton("Thêm");
        addButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Chức năng thêm dịch vụ mới chưa được triển khai!"));

        JButton deleteButton = new JButton("Xóa");
        deleteButton.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                ((DefaultTableModel) table.getModel()).removeRow(selectedRow);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);

        frame.getContentPane().add(tableScrollPane, BorderLayout.CENTER);
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
