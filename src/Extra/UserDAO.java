
package Extra;

import DAO.ConexaoBanco;
import Interface.UserInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class UserDAO implements UserInterface{
    
     public boolean checkLogin(String login, String senha ) throws Exception {
         
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        
        try {
            stmt = con.prepareStatement(" SELECT * FROM usuario WHERE login = ? AND senha = ? ");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();

            if (rs.next()) {              
                check = true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!!" + ex);
        } finally {
            ConexaoBanco.closeConnetion(con, stmt, rs);
        }

        return check;

    }
    
    
}
