package org.example;

import java.sql.*;
import java.util.Scanner;
public class Bank
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
                String createTable = "CREATE TABLE IF NOT EXISTS accounts (" +
                        "accNo INT PRIMARY KEY, " +
                        "name VARCHAR(50), " +
                        "balance DOUBLE)";
                conn.createStatement().execute(createTable);
                // 2. CREATE (Add new account)
                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Initial Balance: ");
                double balance = sc.nextDouble();
                String insert = "INSERT INTO accounts VALUES (?, ?, ?)";
                PreparedStatement psInsert = conn.prepareStatement(insert);
                psInsert.setInt(1, accNo);
                psInsert.setString(2, name);
                psInsert.setDouble(3, balance);
                psInsert.executeUpdate();
                // 3. READ (balance > 10000)
                System.out.println("\nAccounts with balance > 10000:");
                ResultSet rs = conn.createStatement()
                        .executeQuery("SELECT * FROM accounts WHERE balance > 10000");
                while (rs.next())
                {
                    System.out.println(
                            rs.getInt("accNo") + " " +
                                    rs.getString("name") + " " +
                                    rs.getDouble("balance"));
                }
                // 4. UPDATE (Deposit / Withdraw)
                System.out.print("\nEnter Account Number for transaction: ");
                int transAcc = sc.nextInt();
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                System.out.print("Type 'd' for deposit, 'w' for withdraw: ");
                char choice = sc.next().charAt(0);
                String updateQuery = "";
                if (choice == 'd')
                {
                    updateQuery = "UPDATE accounts SET balance = balance + ? WHERE accNo = ?";
                }
                else if (choice == 'w')
                {
                    updateQuery = "UPDATE accounts SET balance = balance - ? WHERE accNo = ?";
                }
                else
                {
                    System.out.println("Invalid choice!");
                }
                PreparedStatement psUpdate = conn.prepareStatement(updateQuery);
                psUpdate.setDouble(1, amount);
                psUpdate.setInt(2, transAcc);
                psUpdate.executeUpdate();
                // 5. DELETE (Close account)
                System.out.print("\nEnter Account Number to delete: ");
                int deleteAcc = sc.nextInt();
                String delete = "DELETE FROM accounts WHERE accNo = ?";
                PreparedStatement psDelete = conn.prepareStatement(delete);
                psDelete.setInt(1, deleteAcc);
                psDelete.executeUpdate();
                System.out.println("\nBanking operations completed successfully!");
                conn.close();
                sc.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }