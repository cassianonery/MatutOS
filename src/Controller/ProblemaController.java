package Controller;

import DAO.ProblemaDAO;
import Interface.InterfaceProblema;
import Model.Problema;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProblemaController implements InterfaceProblema {

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void create(Problema problema) throws Exception {

            //Object Treatment↓------------------------------------------------------------------
            if (problema == null) {
                throw new Exception("Objeto Problema não pode ser Nulo: Favor insira os dados corretamente");
            }
   
            Validations.nome(problema.getNome());//←NAME Treatment
            Validations.descrição(problema.getDescricao());//←DESCRIPTION Treatment

            //jogar para os DADOS↓
            new ProblemaDAO().create(problema);
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void update(Problema problema) throws Exception {
            //Object Treatment↓------------------------------------------------------------------
            if (problema == null) {
                throw new Exception("Objeto Problema não pode ser Nulo: Favor insira os dados corretamente");
            }

            Validations.codigoProb(problema.getCodigo());//←CODE Treatment
            Validations.nome(problema.getNome());//←NAME Treatment
            Validations.descrição(problema.getDescricao());//←DESCRIPTION Treatment

            //jogar para os DADOS↓
            new ProblemaDAO().update(problema);
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void delete(Problema problema) throws Exception {
            //Object Treatment↓------------------------------------------------------------------
            if (problema == null) {
                throw new Exception("Objeto Problema não pode ser Nulo: Favor insira os dados corretamente");
            }
             Validations.codigoProb(problema.getCodigo());//←CODE Treatment

            //jogar para os DADOS↓
            new ProblemaDAO().delete(problema);
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public ArrayList<Problema> read() throws Exception {
        //LER dos DADOS↓
        ProblemaDAO dao = new ProblemaDAO();
        return dao.read();
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public ArrayList<Problema> read(String codigo) throws Exception {
        //LER dos DADOS↓
         return new ProblemaDAO().read(codigo);
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
//------------------------------------------------------------------------------END---------------------------------------------------------------------------------------------------------

}
