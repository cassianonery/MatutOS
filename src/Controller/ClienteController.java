package Controller;

import DAO.ClienteDAO;
import Model.Cliente;
import Interface.InterfaceCliente;
import java.util.ArrayList;

public class ClienteController implements InterfaceCliente {
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void create(Cliente cliente) throws Exception {
        //Objeto↓------------------------------------------------------------------
        if (cliente == null) {
            throw new Exception("Favor insira os dados corretamente");
        }
        //NOME↓------------------------------------------------------------------
        if (cliente.getNome().trim().equals("") || cliente.getNome() == null) {

            throw new Exception("Favor insira o nome corretamente");
        }
        if (cliente.getNome().length() > 100) {

            throw new Exception("Quantidades de caracters exedidos");
        }
        //RG↓------------------------------------------------------------------

        if (cliente.getRg().trim().equals("") || cliente.getRg() == null) {
            throw new Exception("Favor insira o rg corretamente");
        }
        if (cliente.getRg().length() > 10 || cliente.getRg().length() < 7) {
            throw new Exception("RG deve conter no minimo 7 digitos e no maximo 10 digitos");
        }
        //CPF↓------------------------------------------------------------------
        if (cliente.getCpf().trim().equals("") || cliente.getCpf() == null) {
            throw new Exception("O CPF não pode ser vazio ou nulo");
        }
        if (cliente.getCpf().length() != 11) {
            throw new Exception("O CPF não pode conter menos de 11 digitos");
        }
        //jogar para os DADOS↓
        ClienteDAO dao = new ClienteDAO();
        dao.create(cliente);

    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void update(Cliente cliente) throws Exception {
        //Objeto↓------------------------------------------------------------------
        if (cliente == null) {
            throw new Exception("Favor insira os dados corretamente");
        }
        //NOME↓------------------------------------------------------------------
        if (cliente.getNome().trim().equals("") || cliente.getNome() == null) {

            throw new Exception("Favor insira o nome corretamente");
        }
        if (cliente.getNome().length() > 100) {

            throw new Exception("Quantidades de caracters exedidos");
        }
        //RG↓------------------------------------------------------------------

        if (cliente.getRg().trim().equals("") || cliente.getRg() == null) {
            throw new Exception("Favor insira o rg corretamente");
        }
        if (cliente.getRg().length() > 10 || cliente.getRg().length() < 7) {
            throw new Exception("RG deve conter no minimo 7 digitos e no maximo 10 digitos");
        }
        //CPF↓------------------------------------------------------------------
        if (cliente.getCpf().trim().equals("") || cliente.getCpf() == null) {
            throw new Exception("O CPF não pode ser vazio ou nulo");
        }
        if (cliente.getCpf().length() != 11) {
            throw new Exception("O CPF não pode conter menos de 11 digitos");
        }
        //jogar para os DADOS↓
        ClienteDAO dao = new ClienteDAO();
        dao.update(cliente);
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void delete(Cliente cliente) throws Exception {

        //jogar para os DADOS↓
        ClienteDAO dao = new ClienteDAO();
        dao.delete(cliente);
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public ArrayList<Cliente> read() throws Exception {

        ClienteDAO dao = new ClienteDAO();
        return dao.read();

    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------    
    public ArrayList<Cliente> readForCpf(String cpf) throws Exception {

        ClienteDAO dao = new ClienteDAO();
        return dao.readForCpf(cpf);
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
}
