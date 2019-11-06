
package Controller;

import DAO.FuncionarioDAO;
import Model.Funcionario;
import java.util.ArrayList;
import Interface.InterfaceFuncionario;

public class FuncionarioController implements InterfaceFuncionario {
    
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void create(Funcionario funcionario) throws Exception {
         //Objeto↓------------------------------------------------------------------
        if (funcionario == null) {
            throw new Exception("Favor insira os dados corretamente");
        }
        //NOME↓------------------------------------------------------------------
        if (funcionario.getNome().trim().equals("") || funcionario.getNome() == null) {

            throw new Exception("Favor insira o nome corretamente");
        }
        if (funcionario.getNome().length() > 100) {

            throw new Exception("Quantidades de caracters exedidos");
        }
        //RG↓------------------------------------------------------------------

        if (funcionario.getRg().trim().equals("") || funcionario.getRg() == null) {
            throw new Exception("Favor insira o rg corretamente");
        }
        if (funcionario.getRg().length() > 10 || funcionario.getRg().length() < 7) {
            throw new Exception("RG deve conter no minimo 7 digitos e no maximo 10 digitos");
        }
        //CPF↓------------------------------------------------------------------
        if (funcionario.getCpf().trim().equals("") || funcionario.getCpf() == null) {
            throw new Exception("O CPF não pode ser vazio ou nulo");
        }
        if (funcionario.getCpf().length() != 11) {
            throw new Exception("O CPF não pode conter menos de 11 digitos");
        }
        //SALARIO↓------------------------------------------------------------------
        if (funcionario.getSalario() < 800) {
            throw new Exception("Favor inserir um salario descente");
        }       
        //jogar para os DADOS↓
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.create(funcionario);

    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public ArrayList<Funcionario> read() throws Exception {
      FuncionarioDAO dao = new FuncionarioDAO();
         return dao.read();
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------   
    public ArrayList<Funcionario> readForMatricula(String matricula) throws Exception {
      FuncionarioDAO dao = new FuncionarioDAO();
      
         return dao.readForMatricula(matricula);
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void update(Funcionario funcionario) throws Exception {
         //Objeto↓------------------------------------------------------------------
        if (funcionario == null) {
            throw new Exception("Favor insira os dados corretamente");
        }
        //NOME↓------------------------------------------------------------------
        if (funcionario.getNome().trim().equals("") || funcionario.getNome() == null) {

            throw new Exception("Favor insira o nome corretamente");
        }
        if (funcionario.getNome().length() > 100) {

            throw new Exception("Quantidades de caracters exedidos");
        }
        //RG↓------------------------------------------------------------------

        if (funcionario.getRg().trim().equals("") || funcionario.getRg() == null) {
            throw new Exception("Favor insira o rg corretamente");
        }
        if (funcionario.getRg().length() > 10 || funcionario.getRg().length() < 7) {
            throw new Exception("RG deve conter no minimo 7 digitos e no maximo 10 digitos");
        }
        //CPF↓------------------------------------------------------------------
        if (funcionario.getCpf().trim().equals("") || funcionario.getCpf() == null) {
            throw new Exception("O CPF não pode ser vazio ou nulo");
        }
        if (funcionario.getCpf().length() != 11) {
            throw new Exception("O CPF não pode conter menos de 11 digitos");
        }
        //SALARIO↓------------------------------------------------------------------
        if (funcionario.getSalario() < 1000) {
            throw new Exception("Favor inserir um salario descente");
        }
        if (funcionario.getCpf().length() < 4) {
            throw new Exception("menos que 4 digitos? SERIO? mão de vaca!!");
        }
        //jogar para os DADOS↓
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.update(funcionario);
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void delete(Funcionario funcionario) throws Exception {
     
        //jogar para os DADOS↓
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.delete(funcionario);
    }
//---------------------------------------------------------------------------------------------------------------------------------------------------------- 
}
