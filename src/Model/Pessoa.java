
package Model;

abstract class Pessoa {
    
    
    protected String cpf, nome, rg;
 
    //Construtor vazio↓
    public Pessoa() {
    }

    //Construtor padrão↓
    public Pessoa(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    //Construtor cliente↓
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    //Construtor Funcionario↓
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    
    //Getter e Setter ↓
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
   
    
    
    
}
