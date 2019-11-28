package Model;

import java.sql.Date;
import java.util.ArrayList;

public class OrdemDeServico {
   
    private Cliente clienteOs;
    private Funcionario FuncionarioOs;
    private Problema problemaOs;
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Problema> problemas;
    
    private int numeroOS;
    private String descricaoProblemaOS,
                   descricaoServicoOS,
                   motivoCancelamentoOS,
                   status;
     
    private Date dataCad;
    
    private String dataCadastroOS, 
                 dataCancelamentoOS,
                 dataSolucaoOS;

    
    public OrdemDeServico() {
    }

    /*
    //Construtor de Ordem de Servico para CANCELAMENTO↓
    public OrdemDeServico(int numeroOS, String descricaoServicoOS, Problema codProblema, String descricaoProblemaOS, Date dataCadastroOS, Date dataCancelamentoOS, String motivoCancelamentoOS, Funcionario matri_funcionario_os, Cliente cpf_cliente_os) {
        this.cpf_cliente_os = cpf_cliente_os;
        this.matri_funcionario_os = matri_funcionario_os;
        this.cod_problema = codProblema;
        this.numeroOS = numeroOS;
        this.descricaoProblemaOS = descricaoProblemaOS;
        this.descricaoServicoOS = descricaoServicoOS;
        this.motivoCancelamentoOS = motivoCancelamentoOS;
        this.dataCadastroOS = dataCadastroOS;
        this.dataCancelamentoOS = dataCancelamentoOS;
        
        this.clientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.classProblemas = new ArrayList<>();
    }

    //Construtor de Ordem de Servico para SOLUCIONADO↓
    public OrdemDeServico(int numeroOS, String descricaoServicoOS, Problema cod_problema, String descricaoProblemaOS, Date dataCadastroOS, Date dataSolucaoOS, Funcionario matri_funcionario_os, Cliente cpf_cliente_os) {
        this.cpf_cliente_os = cpf_cliente_os;
        this.matri_funcionario_os = matri_funcionario_os;
        this.cod_problema = cod_problema;
        this.numeroOS = numeroOS;
        this.descricaoProblemaOS = descricaoProblemaOS;
        this.descricaoServicoOS = descricaoServicoOS;
        this.dataCadastroOS = dataCadastroOS;
        this.dataSolucaoOS = dataSolucaoOS;
        
        this.clientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.classProblemas = new ArrayList<>();
    }*/

    
    //Todos os Getter↓

    public Date getDataCad() {
        return dataCad;
    }

    public void setDataCad(Date dataCad) {
        this.dataCad = dataCad;
    }
    
    
    
    
    
    
    //----

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Cliente getClienteOs() {
        return clienteOs;
    }

    public void setClienteOs(Cliente clienteOs) {
        this.clienteOs = clienteOs;
    }

    public Funcionario getFuncionarioOs() {
        return FuncionarioOs;
    }

    public void setFuncionarioOs(Funcionario FuncionarioOs) {
        this.FuncionarioOs = FuncionarioOs;
    }

    public Problema getProblemaOs() {
        return problemaOs;
    }

    public void setProblemaOs(Problema problemaOs) {
        this.problemaOs = problemaOs;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Problema> getProblemas() {
        return problemas;
    }

    public void setProblemas(ArrayList<Problema> problemas) {
        this.problemas = problemas;
    }

    

    public int getNumeroOS() {
        return numeroOS;
    }

    public void setNumeroOS(int numeroOS) {
        this.numeroOS = numeroOS;
    }

    public String getDescricaoProblemaOS() {
        return descricaoProblemaOS;
    }

    public void setDescricaoProblemaOS(String descricaoProblemaOS) {
        this.descricaoProblemaOS = descricaoProblemaOS;
    }

    public String getDescricaoServicoOS() {
        return descricaoServicoOS;
    }

    public void setDescricaoServicoOS(String descricaoServicoOS) {
        this.descricaoServicoOS = descricaoServicoOS;
    }

    public String getMotivoCancelamentoOS() {
        return motivoCancelamentoOS;
    }

    public void setMotivoCancelamentoOS(String motivoCancelamentoOS) {
        this.motivoCancelamentoOS = motivoCancelamentoOS;
    }

    public String getDataCadastroOS() {
        return dataCadastroOS;
    }

    public void setDataCadastroOS(String dataCadastroOS) {
        this.dataCadastroOS = dataCadastroOS;
    }

    public String getDataCancelamentoOS() {
        return dataCancelamentoOS;
    }

    public void setDataCancelamentoOS(String dataCancelamentoOS) {
        this.dataCancelamentoOS = dataCancelamentoOS;
    }

    public String getDataSolucaoOS() {
        return dataSolucaoOS;
    }

    public void setDataSolucaoOS(String dataSolucaoOS) {
        this.dataSolucaoOS = dataSolucaoOS;
    }

 
  
    
    
}
