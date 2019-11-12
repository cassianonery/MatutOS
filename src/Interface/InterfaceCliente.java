/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Model.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lukas
 */
public interface InterfaceCliente {

    void create(Cliente cliente) throws Exception;

    void update(Cliente clienteNovo, Cliente clienteVelho) throws Exception;

    void delete(Cliente cliente) throws Exception;
    
    ArrayList<Cliente> read() throws Exception ;
    
    //ArrayList<Cliente> readByName() throws Exception ;
    

}
