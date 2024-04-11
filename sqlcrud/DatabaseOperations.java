import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseOperations {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            String url = "jdbc:mysql://localhost:3306/pow";
            String username = "root";
            String password = "qwerty";
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

/*             // Example: Creating a table
            String createTableQuery = "CREATE TABLE test (id INT PRIMARY KEY, name VARCHAR(50))";
            statement.executeUpdate(createTableQuery); */

/*             // Example: Inserting data
            String insertQuery = "INSERT INTO users (id, name) VALUES (1, 'John')";
            statement.executeUpdate(insertQuery); */

/*             // Example: Updating data
            String updateQuery = "UPDATE users SET name = 'Jane' WHERE id = 1";
            statement.executeUpdate(updateQuery); */

            // Example: Querying data
            String selectQuery = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                int userId = resultSet.getInt("id");
                String userName = resultSet.getString("name");
                System.out.println("User ID: " + userId + ", Name: " + userName);
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
