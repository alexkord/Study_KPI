package ua.kpi.my_db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Config config = Config.getInstance();
        List<Client> clients = new ArrayList<>();
        Connection connection;
        connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Client client = new Client(resultSet.getInt("id"), resultSet.getString("name"));
            clients.add(client);
        }

//        String url = "jdbc:mysql://localhost:3306/test";
//        String username = "root";
//        String password = "root";
//        Class.forName("com.mysql.jdbc.Driver");
//        try(Connection connection = DriverManager.getConnection(url, username, password);
//            Statement statement = connection.createStatement()) {
////                statement.executeUpdate("DROP TABLE animals");
////                statement.executeUpdate("CREATE TABLE animals (id INT NOT NULL AUTO_INCREMENT, name VARCHAR(30) NOT NULL , PRIMARY KEY (id))");
////                statement.executeUpdate("INSERT INTO animals (id, name) VALUE ()");
//                System.out.println("We'are connected");
//                statement.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
