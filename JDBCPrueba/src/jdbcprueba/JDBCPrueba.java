
package jdbcprueba;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JDBCPrueba {

    
    public static void main(String[] args) {
        String user = "test";
        String password = "12345";
        String url = "jdbc:mysql://localhost:3306/Sena";
        
        Connection connection;
        Statement statement;
        ResultSet rs;
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException ex) {
            Logger.getLogger(JDBCPrueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
        connection = DriverManager.getConnection(url, user, password);
        
        statement = connection.createStatement ();
      /*  statement.executeUpdate("INSERT INTO users (name, password) VALUES ('usuarioN1', 'claveN1')");*/
        
        rs = statement.executeQuery("SELECT * FROM users");
        rs.next();
        
             do {
                 System.out.println(rs.getInt("usersId") + ":" + rs.getString("name"));
            } while (rs.next());
             
        } catch (SQLException ex) {
        Logger.getLogger(JDBCPrueba.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        
        System.out.println(user);       
        
        
    }
   
}
