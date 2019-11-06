package DAO;

import Model.Problema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProblemaDAO implements Interface.InterfaceProblema {

//----------------------------------------------------------------------------------------------------------------------------------------------------------    
    @Override
    public void create(Problema problema) {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(" INSERT INTO problema (codigo,nome,descricao) "
                    + "VALUES (?,?,?)");
            stmt.setInt(1, problema.getCodigo());
            stmt.setString(2, problema.getNome());
            stmt.setString(3, problema.getDescricao());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar: !" + ex);
        } finally {
            ConexaoBanco.closeConnetion(con, stmt);
        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void update(Problema problema) {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(" UPDATE problema SET codigo = ?, nome = ?, descricao = ? WHERE codigo = ? ");
            stmt.setInt(1, problema.getCodigo());
            stmt.setString(2, problema.getNome());
            stmt.setString(3, problema.getDescricao());
            stmt.setInt(4, problema.getCodigo());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: !" + ex);
        } finally {
            ConexaoBanco.closeConnetion(con, stmt);
        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void delete(Problema problema) {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM problema WHERE codigo = ?");

            stmt.setInt(1, problema.getCodigo());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: !" + ex);
        } finally {
            ConexaoBanco.closeConnetion(con, stmt);
        }

    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public ArrayList<Problema> read() throws Exception {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Problema> problemas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM problema");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Problema problema = new Problema();
                problema.setCodigo(rs.getInt("codigo"));
                problema.setNome(rs.getString("nome"));
                problema.setDescricao(rs.getString("descricao"));
                problemas.add(problema);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!!" + ex);
        } finally {
            ConexaoBanco.closeConnetion(con, stmt, rs);
        }

        return (ArrayList<Problema>) problemas;
    }
    
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    public ArrayList<Problema> readForCodigo(String codigo) throws Exception {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Problema> problemas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM problema WHERE codigo LIKE ?");
            stmt.setString(1, "%"+codigo+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Problema problema = new Problema();
                problema.setCodigo(rs.getInt("codigo"));
                problema.setNome(rs.getString("nome"));
                problema.setDescricao(rs.getString("descricao"));
                problemas.add(problema);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!!" + ex);
        } finally {
            ConexaoBanco.closeConnetion(con, stmt, rs);
        }

        return (ArrayList<Problema>) problemas;
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
}
