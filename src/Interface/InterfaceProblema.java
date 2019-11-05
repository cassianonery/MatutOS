package Interface;


import Model.Problema;
import java.util.ArrayList;
import java.util.List;

public interface InterfaceProblema {

    void create(Problema problema) throws Exception;

    ArrayList<Problema> read() throws Exception ;

    void update(Problema problema) throws Exception;

    void delete(Problema problema) throws Exception;

}
