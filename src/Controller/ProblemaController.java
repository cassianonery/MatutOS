
package Controller;
import DAO.ProblemaDAO;
import Interface.InterfaceProblema;
import Model.Problema;
import java.util.ArrayList;
public class ProblemaController implements InterfaceProblema{

//----------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void create(Problema problema) throws Exception {
         //Objeto↓------------------------------------------------------------------
        if (problema == null) {
            throw new Exception("Favor insira os dados corretamente");
        }
        //NOME↓------------------------------------------------------------------
        if (problema.getNome().trim().equals("") || problema.getNome() == null) {

            throw new Exception("O NOME não pode estar em branco");
        }
        if (problema.getNome().length() > 100) {

            throw new Exception("Quantidade de caracteres excedidos");
        }
        //DESCRIÇÃO↓------------------------------------------------------------------

        if (problema.getDescricao().trim().equals("") || problema.getDescricao() == null) {
            throw new Exception("Favor inserir uma descrição para o problema");
        }
        if (problema.getDescricao().length() > 255 || problema.getDescricao().length() < 40) {
            throw new Exception("A Descrição deve conter no minimo 40 caracteres e no maximo 255 caracteres");
        }
        
        //jogar para os DADOS↓
        ProblemaDAO dao = new ProblemaDAO();
        dao.create(problema);

    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public ArrayList<Problema> read() throws Exception {
        //LER dos DADOS↓
        ProblemaDAO dao = new ProblemaDAO();
         return dao.read();
    }
    
    public ArrayList<Problema> readForCodigo(String codigo) throws Exception {
        //LER dos DADOS↓
        ProblemaDAO dao = new ProblemaDAO();
         return dao.readForCodigo(codigo);
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void update(Problema problema) throws Exception {
       //Objeto↓------------------------------------------------------------------
        if (problema == null) {
            throw new Exception("Favor insira os dados corretamente");
        }
        //NOME↓------------------------------------------------------------------
        if (problema.getNome().trim().equals("") || problema.getNome() == null) {

            throw new Exception("O NOME não pode estar em branco");
        }
        if (problema.getNome().length() > 100) {

            throw new Exception("Quantidade de caracteres excedidos");
        }
        //DESCRIÇÃO↓------------------------------------------------------------------

        if (problema.getDescricao().trim().equals("") || problema.getDescricao() == null) {
            throw new Exception("Favor inserir uma descrição para o problema");
        }
        if (problema.getDescricao().length() > 255 || problema.getDescricao().length() < 40) {
            throw new Exception("A Descrição deve conter no minimo 40 caracteres e no maximo 255 caracteres");
        }
        
        //jogar para os DADOS↓
        ProblemaDAO dao = new ProblemaDAO();
        dao.update(problema);
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void delete(Problema problema) throws Exception {
     
        //jogar para os DADOS↓
        ProblemaDAO dao = new ProblemaDAO();
        dao.delete(problema);
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------    
}
