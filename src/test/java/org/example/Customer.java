package org.example;

import java.sql.*;
import java.util.Scanner;
public class Customer
{
        // Database credentials
        static final String URL = "jdbc:mysql://localhost:3306/company_db";
        static final String USER = "root";
        static final String PASSWORD = "Password";
        public static void main(String[] args)
        {
            try
            {
                Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                Scanner sc = new Scanner(System.in);
                // 1. Create Table
                String createTable = "CREATE TABLE IF NOT EXISTS customers (" +
                        "id INT PRIMARY KEY, " +
                        "name VARCHAR(50), " +
                        "phone VARCHAR(15))";
                conn.createStatement().execute(createTable);
                // 2. CREATE (Add new customer)
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // clear buffer
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Phone: ");
                String phone = sc.nextLine();
                String insert = "INSERT INTO customers VALUES (?, ?, ?)";
                PreparedStatement psInsert = conn.prepareStatement(insert);
                psInsert.setInt(1, id);
                psInsert.setString(2, name);
                psInsert.setString(3, phone);
                psInsert.executeUpdate();
                // 3. READ (Search by name using LIKE)
                System.out.print("\nEnter name to search: ");
                String searchName = sc.nextLine();
                String select = "SELECT * FROM customers WHERE name LIKE ?";
                PreparedStatement psSelect = conn.prepareStatement(select);
                psSelect.setString(1, "%" + searchName + "%");
                ResultSet rs = psSelect.executeQuery();
                System.out.println("\nSearch Results:");
                while (rs.next())
                {
                    System.out.println(
                            rs.getInt("id") + " " +
                                    rs.getString("name") + " " +
                                    rs.getString("phone"));
                }
                // 4. UPDATE (Change phone number)
                System.out.print("\nEnter ID to update phone: ");
                int updateId = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter new phone: ");
                String newPhone = sc.nextLine();
                String update = "UPDATE customers SET phone = ? WHERE id = ?";
                PreparedStatement psUpdate = conn.prepareStatement(update);
                psUpdate.setString(1, newPhone);
                psUpdate.setInt(2, updateId);
                psUpdate.executeUpdate();
                // 5. DELETE (Remove customer)
                System.out.print("\nEnter ID to delete: ");
                int deleteId = sc.nextInt();
                String delete = "DELETE FROM customers WHERE id = ?";
                PreparedStatement psDelete = conn.prepareStatement(delete);
                psDelete.setInt(1, deleteId);
                psDelete.executeUpdate();
                System.out.println("\nCustomer operations completed successfully!");
                conn.close();
                sc.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }