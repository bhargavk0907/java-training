package org.example.jdbc;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/app";
        String user = "root";
        String password = "root";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM customers")) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("customer_id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("email") + " | " +
                                rs.getString("city") + " | "
                );
            }

//            PreparedStatement ps = con.prepareStatement("INSERT INTO customers VALUES (?, ?, ?, ?)");
//            ps.setInt(1, 5);
//            ps.setString(2, "Alice");
//            ps.setString(3, "TEST@NOMAIL.COM");
//            ps.setString(4, "New York");
//            ps.executeUpdate();


            String sql = "UPDATE customers SET CITY = ? WHERE customer_id = ?";

            PreparedStatement ps1 = con.prepareStatement(sql);
            ps1.setString(1, "Test");  // new age
            ps1.setInt(2, 5);

            int rowsUpdated = ps1.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");

            String deleteSql = "DELETE FROM customers WHERE customer_id = ?";
            PreparedStatement ps2 = con.prepareStatement(deleteSql);
            ps2.setInt(1, 5); // Assuming you want to delete the customer with ID 5
            int rowsDeleted = ps2.executeUpdate();





        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
