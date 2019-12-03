package Controller;

import DAO.ClienteDAO;
import Model.Cliente;
import Controller.Validations;

import Interface.InterfaceCliente;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ClienteController implements InterfaceCliente {
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    
    @Override
    public void create(Cliente cliente) throws Exception {

        //Confirmação de CADASTRO do Cliente↓
        int confirmacao = JOptionPane.showConfirmDialog(null, "Certeza que quer cadastrar esse Cliente?", "Confirmação", JOptionPane.YES_OPTION);

        //Caso confirmação seja SIM↓
        if (confirmacao == JOptionPane.YES_OPTION) {

            //Object Treatment↓------------------------------------------------------------------
            if (cliente == null) {
                throw new Exception("Objeto Cliente não pode ser Nulo: Favor insira os dados corretamente");
            }
            Validations.nome(cliente.getNome());//←NAME Treatment
            Validations.rg(cliente.getRg());    //←RG Treatment
            Validations.cpf(cliente.getCpf());  //←CPF Treatment

            //jogar para os DADOS↓
            new ClienteDAO().create(cliente);
        }
        //Caso confirmação seja NÃO ele simplesmente ignora ↑
    }

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void update(Cliente clienteNovo, Cliente clienteVelho) throws Exception {

        //Confirmação de ATUALIZAÇÃO do Cliente↓
        int confirmacao = JOptionPane.showConfirmDialog(null, "Certeza que quer Atualziar esse Cliente?", "Confirmação", JOptionPane.YES_OPTION);

        //Caso confirmação seja SIM↓
        if (confirmacao == JOptionPane.YES_OPTION) {
            //Object Treatment↓------------------------------------------------------------------
            if (clienteNovo == null) {
                throw new Exception("Objeto Cliente não pode ser Nulo: Favor insira os dados corretamente");
            }

            Validations.nome(clienteNovo.getNome());//←NAME Treatment
            Validations.rg(clienteNovo.getRg());  //←RG Treatment
            Validations.cpf(clienteNovo.getCpf());//←CPF Treatment

            //jogar para os DADOS↓
            new ClienteDAO().update(clienteNovo, clienteVelho);
        }
        //Caso confirmação seja NÃO ele simplesmente ignora ↑
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void delete(Cliente cliente) throws Exception {

        //Confirmação de EXCLUSÃO do Cliente↓
        int confirmacao = JOptionPane.showConfirmDialog(null, "Certeza que quer EXCLUIR esse Cliente?", "Confirmação", JOptionPane.YES_OPTION);

        //Caso confirmação seja SIM↓
        if (confirmacao == JOptionPane.YES_OPTION) {

            //jogar para os DADOS↓
            new ClienteDAO().delete(cliente);
        }
        //Caso confirmação seja NÃO ele simplesmente ignora ↑
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public ArrayList<Cliente> read() throws Exception {
        return new ClienteDAO().read();
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    

    public ArrayList<Cliente> read(String cpf) throws Exception {
        return new ClienteDAO().read(cpf);
    }

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------END---------------------------------------------------------------------------------------------------------
}
