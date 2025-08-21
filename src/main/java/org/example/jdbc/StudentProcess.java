package org.example.jdbc;

import java.sql.*;

public class StudentProcess {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/app";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // 1⃣ Get Connection
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // 2⃣ CREATE: Insert a new student
    public void insertStudent(int id, String name, int age) {
        String sql = "INSERT INTO students VALUES (?, ?, ?)";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);

            int rowsInserted = ps.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ: Display all students
    public void displayAllStudents() {
        String sql = "SELECT * FROM students";
        try (Connection con = getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("ID | Name | Age");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getInt("age"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE: Update student age by ID
    public void updateStudentAge(int id, int newAge) {
        String sql = "UPDATE students SET age = ? WHERE id = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, newAge);
            ps.setInt(2, id);

            int rowsUpdated = ps.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE: Delete student by ID
    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            int rowsDeleted = ps.executeUpdate();
            System.out.println(rowsDeleted + " row(s) deleted.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
