package Model;

import java.sql.Date;
import java.util.ArrayList;

public class OrdemDeServico {
   
    private Cliente clienteOs;
    private Funcionario funcionarioOs;
    private Problema problemaOs;
    
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
        funcionarioOs = new Funcionario();
        clienteOs = new Cliente();
        problemaOs = new Problema();
    }
    
    //comentar↓
     public String getStatus(){
        String retorno =  "Aberta";
        
        if (dataCancelamentoOS != null) {
            retorno = "Cancelada";
        }
        if (dataSolucaoOS != null) {
            retorno = "Solucionada";
        }
        
        return retorno;
    }

    

    
    //Todos os Getter↓

    public Cliente getClienteOs() {
        return clienteOs;
    }

    public void setClienteOs(Cliente clienteOs) {
        this.clienteOs = clienteOs;
    }

    public Funcionario getFuncionarioOs() {
        return funcionarioOs;
    }

    public void setFuncionarioOs(Funcionario funcionarioOs) {
        this.funcionarioOs = funcionarioOs;
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
