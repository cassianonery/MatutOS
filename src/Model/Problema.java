package Model;

import java.util.ArrayList;

public class Problema {

    private int codigo;
    private String nome, descricao;
    private ArrayList<OrdemDeServico> ordemDeServicos;
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Construtor vazio para facilitar a instanciação↓
    public Problema() {
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Construtor completo com todos os dados nescessarios para criação de um PROBLEMA↓
    public Problema(int codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.ordemDeServicos = new ArrayList<>();
    }

    //-------------------------------------------------------------------
    //GETTERS E SETTERS↓
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
