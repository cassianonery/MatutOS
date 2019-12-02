package Interface;

import Model.OrdemDeServico;
import java.util.List;

public interface InterfaceOrdemDeServico {

    void create(OrdemDeServico OrdemDeServico) throws Exception;

    List<OrdemDeServico> read() throws Exception;

    void update(OrdemDeServico OrdemDeServico) throws Exception;
    
    void solucionar(OrdemDeServico OrdemDeServico) throws Exception;
    
    void cancelar(OrdemDeServico OrdemDeServico) throws Exception;
    
    
}
