package Model;

import java.util.ArrayList;


public class Cliente extends Pessoa {

    protected ArrayList<OrdemDeServico> ordemDeServicos;
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    //Construtor vazio para facilitar a instanciação↓
    public Cliente() {
        
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
   //GETTER E SETTERS ↓
    public ArrayList<OrdemDeServico> getOrdemDeServicos() {
        return ordemDeServicos;
    }
 
    public void setClientes(ArrayList<OrdemDeServico> ordemDeServicos) {
        this.ordemDeServicos = ordemDeServicos;
    }

}
