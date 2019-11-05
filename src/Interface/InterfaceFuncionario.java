
package Interface;

import Model.Funcionario;
import java.util.ArrayList;


public interface InterfaceFuncionario {
    
    void create(Funcionario funcionario ) throws Exception;
    ArrayList<Funcionario> read() throws Exception ;
    void update(Funcionario funcionario) throws Exception;
    void delete(Funcionario funcionario) throws Exception;
    

}
