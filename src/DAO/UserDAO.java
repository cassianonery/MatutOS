package DAO;

import DAO.ConexaoBanco;
import Interface.UserInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO implements UserInterface {

    public boolean checkLogin(String login, String senha) throws Exception {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        stmt = con.prepareStatement(" SELECT * FROM usuario WHERE login = ? AND senha = ? ");
        stmt.setString(1, login);
        stmt.setString(2, senha);

        rs = stmt.executeQuery();

        if (rs.next()) {
            check = true;
        }

        ConexaoBanco.closeConnetion(con, stmt, rs);

        return check;

    }

}
