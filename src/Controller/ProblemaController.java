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

        //Confirmação de CADASTRO do Problema↓
        int confirmacao = JOptionPane.showConfirmDialog(null, "Certeza que quer cadastrar esse Problema?", "Confirmação", JOptionPane.YES_OPTION);

        //Caso confirmação seja SIM↓
        if (confirmacao == JOptionPane.YES_OPTION) {

            //Object Treatment↓------------------------------------------------------------------
            if (problema == null) {
                throw new Exception("Objeto Problema não pode ser Nulo: Favor insira os dados corretamente");
            }

            
            Validations.nome(problema.getNome());//←NAME Treatment
            Validations.descrição(problema.getDescricao());//←DESCRIPTION Treatment

            //jogar para os DADOS↓
            new ProblemaDAO().create(problema);
        }
        //Caso confirmação seja NÃO ele simplesmente ignora ↑

    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void update(Problema problema) throws Exception {

        //Confirmação de ATUALIZAÇÃO do Problema↓
        int confirmacao = JOptionPane.showConfirmDialog(null, "Certeza que quer Atualizar esse Problema?", "Confirmação", JOptionPane.YES_OPTION);

        //Caso confirmação seja SIM↓
        if (confirmacao == JOptionPane.YES_OPTION) {

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
        //Caso confirmação seja NÃO ele simplesmente ignora ↑

    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void delete(Problema problema) throws Exception {

        //Confirmação de EXCLUSÃO do Problema↓
        int confirmacao = JOptionPane.showConfirmDialog(null, "Certeza que quer Excluir esse Problema?", "Confirmação", JOptionPane.YES_OPTION);

        //Caso confirmação seja SIM↓
        if (confirmacao == JOptionPane.YES_OPTION) {

            //Object Treatment↓------------------------------------------------------------------
            if (problema == null) {
                throw new Exception("Objeto Problema não pode ser Nulo: Favor insira os dados corretamente");
            }

            //jogar para os DADOS↓
            new ProblemaDAO().delete(problema);
        }
        //Caso confirmação seja NÃO ele simplesmente ignora ↑
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
