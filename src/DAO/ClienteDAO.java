package DAO;

import Interface.InterfaceCliente;
import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteDAO implements InterfaceCliente {
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void create(Cliente cliente) {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(" INSERT INTO Cliente (nome,rg,cpf) "
                    + " VALUES (?,?,?) ");
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getRg());
            stmt.setString(3, cliente.getCpf());

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
    public void update(Cliente clienteNovo, Cliente clienteVelho) {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(" UPDATE cliente SET nome = ?, rg = ?, cpf = ? WHERE cpf = ? ");
            stmt.setString(1, clienteNovo.getNome());
            stmt.setString(2, clienteNovo.getRg());
            stmt.setString(3, clienteNovo.getCpf());
            stmt.setString(4, clienteVelho.getCpf());

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
    public void delete(Cliente cliente) {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(" DELETE FROM Cliente WHERE cpf = ? ");

            stmt.setString(1, cliente.getCpf());

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
    public ArrayList<Cliente> read() throws Exception {
         Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement(" SELECT * FROM Cliente ");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente cli = new Cliente();

                cli.setNome(rs.getString("nome"));
                cli.setRg(rs.getString("rg"));
                cli.setCpf(rs.getString("cpf"));
                clientes.add(cli);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!!" + ex);
        } finally {
            ConexaoBanco.closeConnetion(con, stmt, rs);
        }

        return (ArrayList<Cliente>) clientes;
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------    
    public ArrayList<Cliente> readForCpf(String cpf) throws Exception {
        
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement(" SELECT * FROM Cliente WHERE cpf LIKE ? ");
            stmt.setString(1, "%"+cpf+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente cli = new Cliente();

                cli.setNome(rs.getString("nome"));
                cli.setRg(rs.getString("rg"));
                cli.setCpf(rs.getString("cpf"));
                clientes.add(cli);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!!" + ex);
        } finally {
            ConexaoBanco.closeConnetion(con, stmt, rs);
        }

        return (ArrayList<Cliente>) clientes;
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------

    
}
