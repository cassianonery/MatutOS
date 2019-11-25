package Model;

import java.sql.Date;
import java.util.ArrayList;

public class OrdemDeServico {
   
    private Cliente cpf_cliente_os;
    private Funcionario matri_funcionario_os;
    private Problema cod_problema_os;
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Problema> problemas;
    
    private int numeroOS;
    private String descricaoProblemaOS,
                   descricaoServicoOS,
                   motivoCancelamentoOS;
     
    private Date dataCadastroOS, 
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

    public Cliente getCpf_cliente_os() {
        return cpf_cliente_os;
    }

    public void setCpf_cliente_os(Cliente cpf_cliente_os) {
        this.cpf_cliente_os = cpf_cliente_os;
    }

    public Funcionario getMatri_funcionario_os() {
        return matri_funcionario_os;
    }

    public void setMatri_funcionario_os(Funcionario matri_funcionario_os) {
        this.matri_funcionario_os = matri_funcionario_os;
    }

    public Problema getCod_problema_os() {
        return cod_problema_os;
    }

    public void setCod_problema_os(Problema cod_problema_os) {
        this.cod_problema_os = cod_problema_os;
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

    public Date getDataCadastroOS() {
        return dataCadastroOS;
    }

    public void setDataCadastroOS(Date dataCadastroOS) {
        this.dataCadastroOS = dataCadastroOS;
    }

    public Date getDataCancelamentoOS() {
        return dataCancelamentoOS;
    }

    public void setDataCancelamentoOS(Date dataCancelamentoOS) {
        this.dataCancelamentoOS = dataCancelamentoOS;
    }

    public Date getDataSolucaoOS() {
        return dataSolucaoOS;
    }

    public void setDataSolucaoOS(Date dataSolucaoOS) {
        this.dataSolucaoOS = dataSolucaoOS;
    }
  
    
    
}
