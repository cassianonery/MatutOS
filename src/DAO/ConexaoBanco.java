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
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);
        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------    
    public static void closeConnetion(Connection con){
        
            try {
                if(con!=null){
                con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------    
    public static void closeConnetion(Connection con, PreparedStatement stmt){
        
        closeConnetion(con);
        
            try {
                if(stmt!=null){
                    stmt.close();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
//----------------------------------------------------------------------------------------------------------------------------------------------------------    
    public static void closeConnetion(Connection con, PreparedStatement stmt, ResultSet rs){
        
        closeConnetion(con, stmt);
        
            try {
                if(rs!=null){
                    rs.close();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------   