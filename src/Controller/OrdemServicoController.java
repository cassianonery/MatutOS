
package Controller;

import DAO.OrdemServicoDAO;
import Interface.InterfaceOrdemDeServico;
import Model.OrdemDeServico;
import java.util.List;
import javax.swing.JOptionPane;

public class OrdemServicoController implements InterfaceOrdemDeServico  {

        @Override
    public void create(OrdemDeServico ordemServiço) throws Exception {
   String caracteres = "0123456789/*-+,!@#$%¨&)(}{][^~´`;:><ºª§=¨¬£³²¹|_.\\";
        
        //Confirmando certeza da Ação↓------------------------------------------------------------------
        int confirmacao = JOptionPane.showConfirmDialog(null, "Certeza que quer criar essa OS ?", "Confirmação", JOptionPane.YES_NO_OPTION);
        
        //IF OptionPane == SIM, prossiga↓------------------------------------------------------------------
        if (confirmacao == JOptionPane.YES_OPTION) {
            
            //Objeto OrdemServiço não pode ser NULO↓------------------------------------------------------------------
           if (ordemServiço == null) {
                 throw new Exception("Objeto Ordem de Serviço não pode ser Nulo: Favor insira os dados corretamente");
            } 
            //Descrição do Serviço↓------------------------------------------------------------------
            else if (ordemServiço.getDescricaoServicoOS().trim().equals("") || ordemServiço.getDescricaoServicoOS() == null) {
                throw new Exception("O campo Descrição de Serviço não pode estar em branco, favor inserir corretamente..");
            } 
            else if(ordemServiço.getDescricaoServicoOS().length() > 255){
                throw new Exception("Caracteres exedidos (Limite de 255)");
            } 
            else if (ordemServiço.getDescricaoServicoOS().contains(caracteres)) {
                throw new Exception("NÃO ADIANTA USAR CTRL+C e CTRL+V AQUI É BLINDADOO KRAIII <3");
            }
            //Descrição do Problema↓------------------------------------------------------------------
            else if (ordemServiço.getDescricaoProblemaOS().trim().equals("") || ordemServiço.getDescricaoProblemaOS()== null) {
                throw new Exception("O campo Descrição do Problema não pode estar em branco, favor inserir corretamente..");
            } 
            else if(ordemServiço.getDescricaoProblemaOS().length() > 255){
                throw new Exception("Caracteres exedidos (Limite de 255)");
            } 
            else if (ordemServiço.getDescricaoProblemaOS().contains(caracteres)) {
                throw new Exception("JÁ DISSE QUE NÃO ADIANTA KRAIII <3");
            }
            else{
                OrdemServicoDAO dao = new OrdemServicoDAO();
                dao.create(ordemServiço);
            }
          
 
            
        }
        //IF NO OptionPane == NÃO, pare↓------------------------------------------------------------------
        else if(confirmacao == JOptionPane.NO_OPTION){
            
            
        }
    }

    @Override
    public List<OrdemDeServico> read() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(OrdemDeServico OrdemDeServico) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
