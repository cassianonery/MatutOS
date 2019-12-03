package DAO;

import Interface.InterfaceCliente;
import Model.Cliente;
//-------------------------------
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//-------------------------------
import java.util.ArrayList;
import java.util.List;

//-------------------------------
//-------------------------------


public class ClienteDAO implements InterfaceCliente {
//----------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void create(Cliente cliente) throws SQLException {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement(" INSERT INTO Cliente (nome,rg,cpf) "
                + " VALUES (?,?,?) ");
        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getRg());
        stmt.setString(3, cliente.getCpf());

        stmt.executeUpdate();

        ConexaoBanco.closeConnetion(con, stmt);

    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------    

    @Override
    public void update(Cliente clienteNovo, Cliente clienteVelho) throws SQLException {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement(" UPDATE cliente SET nome = ?, rg = ?, cpf = ? WHERE cpf = ? ");
        stmt.setString(1, clienteNovo.getNome());
        stmt.setString(2, clienteNovo.getRg());
        stmt.setString(3, clienteNovo.getCpf());
        stmt.setString(4, clienteVelho.getCpf());

        stmt.executeUpdate();

        ConexaoBanco.closeConnetion(con, stmt);

    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void delete(Cliente cliente) throws SQLException {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;

        stmt = con.prepareStatement(" DELETE FROM Cliente WHERE cpf = ? ");

        stmt.setString(1, cliente.getCpf());

        stmt.executeUpdate();

        ConexaoBanco.closeConnetion(con, stmt);

    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public ArrayList<Cliente> read() throws Exception {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        stmt = con.prepareStatement(" SELECT * FROM Cliente ");
        rs = stmt.executeQuery();

        while (rs.next()) {

            Cliente cli = new Cliente();

            cli.setNome(rs.getString("nome"));
            cli.setRg(rs.getString("rg"));
            cli.setCpf(rs.getString("cpf"));
            clientes.add(cli);
        }

        ConexaoBanco.closeConnetion(con, stmt, rs);

        return (ArrayList<Cliente>) clientes;
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------    

    public ArrayList<Cliente> read(String cpf) throws Exception {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        stmt = con.prepareStatement(" SELECT * FROM Cliente WHERE cpf LIKE ? ");
        stmt.setString(1, "%" + cpf + "%");
        rs = stmt.executeQuery();

        while (rs.next()) {

            Cliente cli = new Cliente();

            cli.setNome(rs.getString("nome"));
            cli.setRg(rs.getString("rg"));
            cli.setCpf(rs.getString("cpf"));
            clientes.add(cli);
        }

        ConexaoBanco.closeConnetion(con, stmt, rs);

        return (ArrayList<Cliente>) clientes;
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------

    public ArrayList<Cliente> readAll(String valorPesquisa) throws Exception {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        stmt = con.prepareStatement(" SELECT * FROM Cliente WHERE cpf LIKE ? ");
        stmt.setString(1, "%" + valorPesquisa + "%");
        rs = stmt.executeQuery();

        while (rs.next()) {

            Cliente cli = new Cliente();

            cli.setNome(rs.getString("nome"));
            cli.setRg(rs.getString("rg"));
            cli.setCpf(rs.getString("cpf"));
            clientes.add(cli);
        }

        ConexaoBanco.closeConnetion(con, stmt, rs);

        return (ArrayList<Cliente>) clientes;
    }

}
