/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelLogin;

import ConnectionDatabase.ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @author ADMIN
 */
public class UserDao {
    ArrayList<User> ls = new ArrayList<>();
    ConnectDB cn = new ConnectDB();

    public UserDao() {
        ls.add(new User("admin", "admin", "Manager"));
        try (Connection conn = cn.getConnection();
             PreparedStatement createAccountList = conn.prepareStatement("SELECT staffName, staffPassword FROM Staff WHERE staffRole = 'Receptionist'");
             ResultSet createAccountListResult = createAccountList.executeQuery()) {

            while (createAccountListResult.next()) {
                ls.add(new User(createAccountListResult.getString("staffName"), createAccountListResult.getString("StaffPassword"), "Receptionist"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean checkLogin(String username, String pass, String role) {
        return ls.stream().anyMatch(u -> u.getUsername().equals(username) && u.getPassword().equals(pass) && u.getRole().equals(role));
    }
}
