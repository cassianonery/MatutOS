package Controller;

import DAO.ClienteDAO;
import Model.Cliente;
import Controller.Validations;

import Interface.InterfaceCliente;
import java.util.ArrayList;

public class ClienteController implements InterfaceCliente {
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void create(Cliente cliente) throws Exception {

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

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void update(Cliente clienteNovo, Cliente clienteVelho) throws Exception {

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
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void delete(Cliente cliente) throws Exception {

        Validations.cpf(cliente.getCpf());//←CPF Treatment
        //jogar para os DADOS↓
        new ClienteDAO().delete(cliente);

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
