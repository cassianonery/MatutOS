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
            stmt = con.prepareStatement(" INSERT INTO ordemservico (matricula_funcionario, cpf_cliente, codigo_problema, descricaoproblema, datacadastro) "
                    + " VALUES (?,?,?,?,?,?) ");
           
            stmt.setInt(1, os.getFuncionarioOs().getMatricula());
            stmt.setString(2, os.getClienteOs().getCpf());
            stmt.setInt(3,os.getProblemaOs().getCodigo());
            stmt.setString(4, os.getDescricaoProblemaOS());
            stmt.setDate(5, os.getDataCadastroOS());
           
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
            stmt = con.prepareStatement(" SELECT numero, matricula_funcionario, cpf_cliente, codigo_problema, descricaoproblema, datacadastro FROM ordemservico ");
            rs = stmt.executeQuery();

            while (rs.next()) {

                OrdemDeServico os = new OrdemDeServico();
                os.setNumeroOS(rs.getInt("numero"));
                os.getFuncionarioOs().setMatricula(rs.getInt("matricula_funcionario"));
                os.getClienteOs().setCpf(rs.getString("cpf_cliente"));
                os.getProblemaOs().setCodigo(rs.getInt("codigo_problema"));
                os.setDescricaoProblemaOS(rs.getString("descricaoproblema"));
                os.setDataCadastroOS(rs.getDate("datacadastro"));
               
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

    @Override
    public List<OrdemDeServico> readAllTable() throws Exception {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<OrdemDeServico> ordensDeSerivcos = new ArrayList<>();

        try {
            stmt = con.prepareStatement(" SELECT * From ordemservico ");
            rs = stmt.executeQuery();

            while (rs.next()) {

                OrdemDeServico os = new OrdemDeServico();
                os.setNumeroOS(rs.getInt("numero"));
                os.getFuncionarioOs().setMatricula(rs.getInt("matricula_funcionario"));
                os.getClienteOs().setCpf(rs.getString("cpf_cliente"));
                os.getProblemaOs().setCodigo(rs.getInt("codigo_problema"));
                os.setDescricaoProblemaOS(rs.getString("descricaoproblema"));
                os.setDataCadastroOS(rs.getDate("datacadastro"));
                os.setDataSolucaoOS(rs.getDate("datasolucao"));
                os.setDataCancelamentoOS(rs.getDate("datacancelamento"));
                os.setDescricaoServicoOS(rs.getString("descricaoservico"));
                os.setMotivoCancelamentoOS(rs.getString("motivocancelamento"));
       
                ordensDeSerivcos.add(os);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO na leitura do banco " + ex);
        } finally {
            ConexaoBanco.closeConnetion(con, stmt, rs);
        }

        return (ArrayList<OrdemDeServico>) ordensDeSerivcos;
    }
    public List<OrdemDeServico> readAllTable(String numero) throws Exception {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<OrdemDeServico> ordensDeSerivcos = new ArrayList<>();

        try {
            stmt = con.prepareStatement(" SELECT * From ordemservico WHERE numero LIKE ? ");
            stmt.setString(1, "%"+numero+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                OrdemDeServico os = new OrdemDeServico();
                os.setNumeroOS(rs.getInt("numero"));
                os.getFuncionarioOs().setMatricula(rs.getInt("matricula_funcionario"));
                os.getClienteOs().setCpf(rs.getString("cpf_cliente"));
                os.getProblemaOs().setCodigo(rs.getInt("codigo_problema"));
                os.setDescricaoProblemaOS(rs.getString("descricaoproblema"));
                os.setDataCadastroOS(rs.getDate("datacadastro"));
                os.setDataSolucaoOS(rs.getDate("datasolucao"));
                os.setDataCancelamentoOS(rs.getDate("datacancelamento"));
                os.setDescricaoServicoOS(rs.getString("descricaoservico"));
                os.setMotivoCancelamentoOS(rs.getString("motivocancelamento"));
       
                ordensDeSerivcos.add(os);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO na leitura do banco " + ex);
        } finally {
            ConexaoBanco.closeConnetion(con, stmt, rs);
        }

        return (ArrayList<OrdemDeServico>) ordensDeSerivcos;
    }

}
