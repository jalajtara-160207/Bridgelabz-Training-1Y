package org.example;

import java.sql.*;
public class Product
{
        // Database credentials
        static final String URL = "jdbc:mysql://localhost:3306/company_db";
        static final String USER = "root";
        static final String PASSWORD = "Password";
        public static void main(String[] args)
        {
            try
            {
                // 1. Connect to database
                Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                // 2. Create Table
                String createTable = "CREATE TABLE IF NOT EXISTS product (" +
                        "pid INT PRIMARY KEY, " +
                        "pname VARCHAR(50), " +
                        "qty INT)";
                conn.createStatement().execute(createTable);
                // 3. CREATE (Insert 3 products)
                String insert = "INSERT INTO product VALUES " +
                        "(1, 'Laptop', 5), " +
                        "(2, 'Mouse', 20), " +
                        "(3, 'Keyboard', 8)";
                conn.createStatement().executeUpdate(insert);
                // 4. READ (Low stock: qty < 10)
                System.out.println("Low Stock Products (qty < 10):");
                ResultSet rs = conn.createStatement()
                        .executeQuery("SELECT * FROM product WHERE qty < 10");
                while (rs.next())
                {
                    System.out.println(
                            rs.getInt("pid") + " " +
                                    rs.getString("pname") + " " +
                                    rs.getInt("qty"));
                }
                // 5. UPDATE (Add stock to a product, pid = 1)
                String update = "UPDATE product SET qty = qty + 10 WHERE pid = 1";
                conn.createStatement().executeUpdate(update);
                // 6. DELETE (Remove discontinued product, pid = 3)
                String delete = "DELETE FROM product WHERE pid = 3";
                conn.createStatement().executeUpdate(delete);
                System.out.println("\nInventory operations completed successfully!");
                conn.close();
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }