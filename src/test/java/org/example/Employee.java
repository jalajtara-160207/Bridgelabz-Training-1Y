package org.example;

import java.sql.*;
public class Employee
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
                String createTable = "CREATE TABLE IF NOT EXISTS employee (" +
                        "id INT PRIMARY KEY, " +
                        "name VARCHAR(50), " +
                        "salary DOUBLE)";
                conn.createStatement().execute(createTable);
                // 3. CREATE (Insert employee)
                String insert = "INSERT INTO employee VALUES (1, 'John', 25000), " +
                        "(2, 'Alice', 35000), " +
                        "(3, 'Bob', 12000)";
                conn.createStatement().executeUpdate(insert);
                // 4. READ (salary > 30000)
                System.out.println("Employees with salary > 30000:");
                ResultSet rs = conn.createStatement()
                        .executeQuery("SELECT * FROM employee WHERE salary > 30000");
                while (rs.next())
                {
                    System.out.println(
                            rs.getInt("id") + " " +
                                    rs.getString("name") + " " +
                                    rs.getDouble("salary"));
                }
                // 5. UPDATE (increase salary by 10% for id = 1)
                String update = "UPDATE employee SET salary = salary * 1.10 WHERE id = 1";
                conn.createStatement().executeUpdate(update);
                // 6. DELETE (salary < 15000)
                String delete = "DELETE FROM employee WHERE salary < 15000";
                conn.createStatement().executeUpdate(delete);
                System.out.println("\nOperations completed successfully!");
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }