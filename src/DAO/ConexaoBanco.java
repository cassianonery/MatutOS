package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoBanco {

    public Connection conn;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/matutos";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
//----------------------------------------------------------------------------------------------------------------------------------------------------------

    public static Connection getConnection() throws SQLException {

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        return DriverManager.getConnection(URL, USUARIO, SENHA);

    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------    

    public static void closeConnetion(Connection con) throws SQLException {

        if (con != null) {
            con.close();
        }

    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------    

    public static void closeConnetion(Connection con, PreparedStatement stmt) throws SQLException {

        closeConnetion(con);

        if (stmt != null) {
            stmt.close();
        }

    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------    

    public static void closeConnetion(Connection con, PreparedStatement stmt, ResultSet rs) throws SQLException {

        closeConnetion(con, stmt);

        if (rs != null) {
            rs.close();
        }

    }
}
//----------------------------------------------------------------------------------------------------------------------------------------------------------   
