package DAO;

import Interface.InterfaceFuncionario;
import Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FuncionarioDAO implements InterfaceFuncionario {

//----------------------------------------------------------------------------------------------------------------------------------------------------------    
    @Override
    public void create(Funcionario funcionario) {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO Funcionario (nome,rg,cpf,salario)"
                    + "VALUES (?,?,?,?)");           
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getRg());
            stmt.setString(3, funcionario.getCpf());
            stmt.setFloat(4, funcionario.getSalario());

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
    public void update(Funcionario funcionario) throws Exception {

        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE funcionario SET nome = ?, rg = ?, cpf = ?, salario = ? WHERE matricula = ?");
            
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getRg());
            stmt.setString(3, funcionario.getCpf());
            stmt.setFloat(4, funcionario.getSalario());
            stmt.setInt(5, funcionario.getMatricula());

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
    public void delete(Funcionario funcionario) throws Exception {
        
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM Funcionario WHERE matricula = ?");

            stmt.setInt(1, funcionario.getMatricula());

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
    public ArrayList<Funcionario> read() throws Exception {
      Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Funcionario");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Funcionario funcionario = new Funcionario();

                funcionario.setMatricula(rs.getInt("matricula"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setSalario(rs.getFloat("salario"));
                funcionarios.add(funcionario);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!!" + ex);
        } finally {
            ConexaoBanco.closeConnetion(con, stmt, rs);
        }

        return (ArrayList<Funcionario>) funcionarios;
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------    
    public ArrayList<Funcionario> read(String matricula) throws Exception {
      Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Funcionario WHERE matricula LIKE ?");
            stmt.setString(1, "%"+matricula+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Funcionario funcionario = new Funcionario();

                funcionario.setMatricula(rs.getInt("matricula"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setSalario(rs.getFloat("salario"));
                funcionarios.add(funcionario);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!!" + ex);
        } finally {
            ConexaoBanco.closeConnetion(con, stmt, rs);
        }

        return (ArrayList<Funcionario>) funcionarios;
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
}
