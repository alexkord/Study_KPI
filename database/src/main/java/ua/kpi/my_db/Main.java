package ua.kpi.my_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/mydbtest";
        String username = "root";
        String password = "root";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement()) {
                statement.executeUpdate("DROP TABLE animal");
                statement.executeUpdate("CREATE TABLE animals (id INT NOT NULL AUTO_INCREMENT, name VARCHAR(30) NOT NULL , PRIMARY KEY (id))");
                statement.executeUpdate("INSERT INTO animals (id, name) VALUE ()");
            System.out.println("We'are connected");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
