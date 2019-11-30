package Controller;

import DAO.FuncionarioDAO;
import Model.Funcionario;
import java.util.ArrayList;
import Interface.InterfaceFuncionario;
import javax.swing.JOptionPane;

public class FuncionarioController implements InterfaceFuncionario {

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void create(Funcionario funcionario) throws Exception {

        //Confirmação de CADASTRO do FUNCIONARIO↓
        int confirmacao = JOptionPane.showConfirmDialog(null, "Certeza que quer Cadastrar esse Funcionario?", "Confirmação", JOptionPane.YES_OPTION);

        //Caso confirmação seja SIM↓
        if (confirmacao == JOptionPane.YES_OPTION) {

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
        //Caso confirmação seja NÃO ele simplesmente ignora ↑
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void update(Funcionario funcionario) throws Exception {

        //Confirmação de ATUALIZAÇÃO do FUNCIONARIO↓
        int confirmacao = JOptionPane.showConfirmDialog(null, "Certeza que quer Atualizar esse Funcionario?", "Confirmação", JOptionPane.YES_OPTION);

        //Caso confirmação seja SIM↓
        if (confirmacao == JOptionPane.YES_OPTION) {

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
        //Caso confirmação seja NÃO ele simplesmente ignora ↑
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void delete(Funcionario funcionario) throws Exception {

        //Confirmação de EXCLUSÃO do FUNCIONARIO↓
        int confirmacao = JOptionPane.showConfirmDialog(null, "Certeza que quer Excluir esse Funcionario?", "Confirmação", JOptionPane.YES_OPTION);

        //Caso confirmação seja SIM↓
        if (confirmacao == JOptionPane.YES_OPTION) {

          
            //jogar para os DADOS↓
            new FuncionarioDAO().delete(funcionario);
        }
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
