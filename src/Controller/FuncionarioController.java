package Controller;

import DAO.FuncionarioDAO;
import Model.Funcionario;
import java.util.ArrayList;
import Interface.InterfaceFuncionario;

public class FuncionarioController implements InterfaceFuncionario {

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void create(Funcionario funcionario) throws Exception {

        //Object Treatment↓------------------------------------------------------------------
        if (funcionario == null) {
            throw new Exception("Objeto Funcionario não pode ser Nulo: Favor insira os dados corretamente");
        }

        Validations.nome(funcionario.getNome());//←NAME Treatment
        Validations.rg(funcionario.getRg());  //←RG Treatment
        Validations.cpf(funcionario.getCpf());//←CPF Treatment
        Validations.salario(funcionario.getSalario());//←SALARIO Treatment

        //jogar para os DADOS↓
        new FuncionarioDAO().create(funcionario);
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void update(Funcionario funcionario) throws Exception {
        //Object Treatment↓------------------------------------------------------------------
        if (funcionario == null) {
            throw new Exception("Objeto Funcionario não pode ser Nulo: Favor insira os dados corretamente");
        }

        Validations.matricula(funcionario.getMatricula());//←MATRICULA Treatment
        Validations.nome(funcionario.getNome());//←NAME Treatment
        Validations.rg(funcionario.getRg());  //←RG Treatment
        Validations.cpf(funcionario.getCpf());//←CPF Treatment
        Validations.salario(funcionario.getSalario());//←SALARIO Treatment

        //jogar para os DADOS↓
        new FuncionarioDAO().update(funcionario);
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void delete(Funcionario funcionario) throws Exception {
        Validations.matricula(funcionario.getMatricula());
        //jogar para os DADOS↓
        new FuncionarioDAO().delete(funcionario);
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public ArrayList<Funcionario> read() throws Exception {
        FuncionarioDAO dao = new FuncionarioDAO();
        return dao.read();
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------   

    public ArrayList<Funcionario> read(String matricula) throws Exception {
        return new FuncionarioDAO().read(matricula);
    }

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------END---------------------------------------------------------------------------------------------------------
}
