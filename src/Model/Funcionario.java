package Model;

import java.util.ArrayList;

public class Funcionario extends Pessoa {

    private ArrayList<OrdemDeServico> ordemDeServicos;
    private int matricula;
    private float salario;
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Construtor vazio para facilitar a instanciação↓
    public Funcionario() {
    }  
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Construtor completo com todos os dados nescessarios para criação de um FUNCIONARIO↓
    public Funcionario(String nome, String cpf, String rg, int matricula, float salario) {
        super(nome, cpf, rg);
        this.ordemDeServicos = new ArrayList<>();
        this.matricula = matricula;
        this.salario = salario;
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Construtor do funcionarios para a OrdemDeServico↓
    public Funcionario(int matriculaFuncionario, String nome) {
        super(nome);
        this.ordemDeServicos = new ArrayList<>();
        this.matricula = matriculaFuncionario;
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------   

    
    //Getter e Setter↓
    public ArrayList<OrdemDeServico> getOrdemDeServico() {
        return ordemDeServicos;
    }

    public void setOrdemDeServico(ArrayList<OrdemDeServico> ordemDeServicos) {
        this.ordemDeServicos = ordemDeServicos;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }    
}
