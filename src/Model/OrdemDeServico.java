package Model;

import java.sql.Date;
import java.util.ArrayList;

public class OrdemDeServico {
   
    private Cliente cliente;
    private Funcionario funcionario;
    private Problema problema;
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Problema> classProblemas;
    
    private int numeroOS;
    private String descricaoProblemaOS,
                   descricaoServicoOS,
                   motivoCancelamentoOS;
     
    private Date dataCadastroOS, 
                 dataCancelamentoOS,
                 dataSolucaoOS;

    
    //Construtor de Ordem de Servico para CANCELAMENTO↓
    public OrdemDeServico(int numeroOS, String descricaoServicoOS, Problema codProblema, String descricaoProblemaOS, Date dataCadastroOS, Date dataCancelamentoOS, String motivoCancelamentoOS, Funcionario funcionario, Cliente cliente) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.problema = codProblema;
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
    public OrdemDeServico(int numeroOS, String descricaoServicoOS, Problema problema, String descricaoProblemaOS, Date dataCadastroOS, Date dataSolucaoOS, Funcionario funcionario, Cliente cliente) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.problema = problema;
        this.numeroOS = numeroOS;
        this.descricaoProblemaOS = descricaoProblemaOS;
        this.descricaoServicoOS = descricaoServicoOS;
        this.dataCadastroOS = dataCadastroOS;
        this.dataSolucaoOS = dataSolucaoOS;
        
        this.clientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.classProblemas = new ArrayList<>();
    }

    
    //Todos os Getter↓
    public Cliente getCliente() {
        return cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Problema getProblema() {
        return problema;
    }

    public int getNumeroOS() {
        return numeroOS;
    }

    public String getDescricaoProblemaOS() {
        return descricaoProblemaOS;
    }

    public String getDescricaoServicoOS() {
        return descricaoServicoOS;
    }

    public String getMotivoCancelamentoOS() {
        return motivoCancelamentoOS;
    }

    public Date getDataCadastroOS() {
        return dataCadastroOS;
    }

    public Date getDataCancelamentoOS() {
        return dataCancelamentoOS;
    }

    public Date getDataSolucaoOS() {
        return dataSolucaoOS;
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

    public ArrayList<Problema> getClassProblemas() {
        return classProblemas;
    }

    public void setClassProblemas(ArrayList<Problema> classProblemas) {
        this.classProblemas = classProblemas;
    }
    
    
    
}
