package DAO;

import Interface.InterfaceOrdemDeServico;
import Model.OrdemDeServico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class OrdemServicoDAO implements InterfaceOrdemDeServico {

    @Override
    public void create(OrdemDeServico os) throws Exception {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        
            stmt = con.prepareStatement(" INSERT INTO ordemservico (matricula_funcionario, cpf_cliente, codigo_problema, datacadastro, descricaoproblema) "
                    + " VALUES (?,?,?,?,?) ");

            stmt.setInt(1, os.getFuncionarioOs().getMatricula());
            stmt.setString(2, os.getClienteOs().getCpf());
            stmt.setInt(3, os.getProblemaOs().getCodigo());
            stmt.setDate(4, os.getDataCadastroOS());
            stmt.setString(5, os.getDescricaoProblemaOS());

            stmt.executeUpdate();
            
            ConexaoBanco.closeConnetion(con, stmt);
    }

    @Override
    public void update(OrdemDeServico os) throws Exception {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        
            stmt = con.prepareStatement(" UPDATE ordemservico SET matricula_funcionario = ?, cpf_cliente = ?, codigo_problema = ?, "
                    + " datacadastro = ?, descricaoproblema = ? WHERE numero = ? ");

            stmt.setInt(1, os.getFuncionarioOs().getMatricula());
            stmt.setString(2, os.getClienteOs().getCpf());
            stmt.setInt(3, os.getProblemaOs().getCodigo());
            stmt.setDate(4, os.getDataCadastroOS());
            stmt.setString(5, os.getDescricaoProblemaOS());
            stmt.setInt(6, os.getNumeroOS());

            stmt.executeUpdate();
  
            ConexaoBanco.closeConnetion(con, stmt);

    }

    @Override
    public List<OrdemDeServico> read() throws Exception {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<OrdemDeServico> ordensDeSerivcos = new ArrayList<>();

            stmt = con.prepareStatement(" Select Os.numero as numeroOrdem, \n"
                    + "Os.motivocancelamento as motivoCancelamentoOrdem, \n"
                    + "Os.datacadastro as dataCadastroOrdem,\n"
                    + "Os.datasolucao as dataSolucaoOrdem,\n"
                    + "Os.descricaoproblema as descProblemaOrdem, \n"
                    + "Os.descricaoservico as descServicoOrdem, \n"
                    + "Os.datacancelamento as dataCancelamentoOrdem, \n"
                    
                    + "Fun.matricula As matriculafuncionario, \n"
                    + "Fun.nome as nomefuncionario, \n"
                    + "Fun.rg as rgfuncionario, \n"
                    + "Fun.cpf as cpffuncionario,\n"
                    + "Fun.salario as salariofuncionario, \n"
                    
                    + "Cli.nome as nomecliente,\n"
                    + "Cli.rg as rgcliente,\n"
                    + "Cli.cpf as cpfcliente,\n"
                    
                    + "problema.codigo as codigoProblema,\n"
                    + "problema.nome as nomeClassProblema,\n"
                    + "problema.descricao as descricaoClassProblema\n"
                    
                    + "		FROM ordemservico As Os \n"
                    + "        Join cliente As Cli On Os.cpf_cliente = Cli.cpf \n"
                    + "        Join funcionario As Fun on Os.matricula_funcionario = Fun.matricula \n"
                    + "         Join problema As problema On Os.codigo_problema = problema.codigo\n"
                    + "        WHERE 0 = 0 ");
            rs = stmt.executeQuery();

            while (rs.next()) {

                OrdemDeServico os = new OrdemDeServico();
                
                os.setNumeroOS(rs.getInt("numeroOrdem"));
                os.setMotivoCancelamentoOS(rs.getString("motivoCancelamentoOrdem"));
                os.setDataCadastroOS(rs.getDate("dataCadastroOrdem"));
                os.setDataSolucaoOS(rs.getDate("dataSolucaoOrdem"));
                os.setDescricaoProblemaOS(rs.getString("descProblemaOrdem"));
                os.setDescricaoServicoOS(rs.getString("descServicoOrdem"));
                os.setDataCancelamentoOS(rs.getDate("dataCancelamentoOrdem"));
                
                os.getFuncionarioOs().setMatricula(rs.getInt("matriculafuncionario"));
                os.getFuncionarioOs().setNome(rs.getString("nomefuncionario"));
                os.getFuncionarioOs().setRg(rs.getString("rgfuncionario"));
                os.getFuncionarioOs().setRg(rs.getString("cpffuncionario"));
                os.getFuncionarioOs().setSalario(rs.getFloat("salariofuncionario"));
                
                os.getClienteOs().setNome(rs.getString("nomecliente"));
                os.getClienteOs().setRg(rs.getString("rgcliente"));
                os.getClienteOs().setCpf(rs.getString("cpfcliente"));
                
                os.getProblemaOs().setCodigo(rs.getInt("codigoProblema"));
                os.getProblemaOs().setNome(rs.getString("nomeClassProblema"));
                os.getProblemaOs().setDescricao(rs.getString("descricaoClassProblema"));
               
                ordensDeSerivcos.add(os);
            }

       
            ConexaoBanco.closeConnetion(con, stmt, rs);
        

        return (ArrayList<OrdemDeServico>) ordensDeSerivcos;
    }

    public List<OrdemDeServico> read(String numero) throws Exception {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<OrdemDeServico> ordensDeSerivcos = new ArrayList<>();

            stmt = con.prepareStatement(" SELECT * From ordemservico WHERE numero LIKE ? ");
            stmt.setString(1, "%" + numero + "%");
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
   
            ConexaoBanco.closeConnetion(con, stmt, rs);
        return (ArrayList<OrdemDeServico>) ordensDeSerivcos;
    }

    @Override
    public void solucionar(OrdemDeServico os) throws Exception {
         Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
       
            stmt = con.prepareStatement(" UPDATE ordemservico SET datasolucao = ? , descricaoservico = ? WHERE numero = ? ");

           
            stmt.setDate(1, os.getDataSolucaoOS());
            stmt.setString(2, os.getDescricaoServicoOS());
            stmt.setInt(3, os.getNumeroOS());

            stmt.executeUpdate();
            ConexaoBanco.closeConnetion(con, stmt);
        
    }

    @Override
    public void cancelar(OrdemDeServico os) throws Exception {
          Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
       
            stmt = con.prepareStatement(" UPDATE ordemservico SET datacancelamento = ? , motivocancelamento = ? WHERE numero = ? ");

           
            stmt.setDate(1, os.getDataCancelamentoOS());
            stmt.setString(2, os.getMotivoCancelamentoOS());
            stmt.setInt(3, os.getNumeroOS());

            stmt.executeUpdate();
            ConexaoBanco.closeConnetion(con, stmt);
        
        
    }

}
