package DAO;

import Interface.InterfaceOrdemDeServico;
import Model.OrdemDeServico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class OrdemServicoDAO implements InterfaceOrdemDeServico {

    @Override
    public void create(OrdemDeServico os) throws Exception {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(" INSERT INTO ordemservico (matricula_funcionario, cpf_cliente, codigo_problema, descricaoproblema, datacadastro, status) "
                    + " VALUES (?,?,?,?,?,?) ");
           
            stmt.setInt(1, os.getFuncionarioOs().getMatricula());
            stmt.setString(2, os.getClienteOs().getCpf());
            stmt.setInt(3,os.getProblemaOs().getCodigo());
            stmt.setString(4, os.getDescricaoProblemaOS());
            stmt.setString(5, os.getDataCadastroOS());
            stmt.setString(6, os.getStatus());
            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao salvar no Banco: !" + ex);
        } finally {
            ConexaoBanco.closeConnetion(con, stmt);
        }
    }

    @Override
    public List<OrdemDeServico> read() throws Exception {
     Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<OrdemDeServico> ordensDeSerivcos = new ArrayList<>();

        try {
            stmt = con.prepareStatement(" SELECT matricula_funcionario, cpf_cliente, codigo_problema, descricaoproblema, datacadastro, status FROM ordemservico ");
            rs = stmt.executeQuery();

            while (rs.next()) {

                OrdemDeServico os = new OrdemDeServico();
                os.getFuncionarioOs().setMatricula(rs.getInt("matricula_funcionario"));
                os.getClienteOs().setCpf(rs.getString("cpf_cliente"));
                os.getProblemaOs().setCodigo(rs.getInt("codigo_problema"));
                os.setDescricaoProblemaOS(rs.getString("descricaoproblema"));
                os.setDataCadastroOS(rs.getString("datacadastro"));
               
                ordensDeSerivcos.add(os);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO na leitura do banco " + ex);
        } finally {
            ConexaoBanco.closeConnetion(con, stmt, rs);
        }

        return (ArrayList<OrdemDeServico>) ordensDeSerivcos;
    }

    @Override
    public void update(OrdemDeServico OrdemDeServico) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
