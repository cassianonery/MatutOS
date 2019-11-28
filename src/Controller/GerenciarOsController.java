package Controller;

import DAO.ClienteDAO;
import DAO.FuncionarioDAO;
import DAO.OrdemServicoDAO;
import DAO.ProblemaDAO;
import Model.Cliente;
import Model.Funcionario;
import Model.Problema;
import Model.OrdemDeServico;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import View.GerenciarOS;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class GerenciarOsController {

    private GerenciarOS gerenciarOs;

    public GerenciarOsController(GerenciarOS gerenciarOs){
        this.gerenciarOs = gerenciarOs;
    }

    public void readLineTableOs() {
        if (gerenciarOs.getjTable_OS_cadastro().getSelectedRow() != -1) {
         /*   
         SimpleDateFormat simpleDateFormate = new SimpleDateFormat("dd/MM/yyyy");
           String dataFormatada = simpleDateFormate.format(gerenciarOs.getjDateChooser_data_cadastroOS().getDate().toString());*/
           
            gerenciarOs.getjText_matricula_funcionarioOS().setText(gerenciarOs.getjTable_OS_cadastro().getValueAt(gerenciarOs.getjTable_OS_cadastro().getSelectedRow(), 1).toString());
            gerenciarOs.getjText_cpf_clienteOs().setText(gerenciarOs.getjTable_OS_cadastro().getValueAt(gerenciarOs.getjTable_OS_cadastro().getSelectedRow(), 2).toString());
            gerenciarOs.getjText_cod_problemaOS().setText(gerenciarOs.getjTable_OS_cadastro().getValueAt(gerenciarOs.getjTable_OS_cadastro().getSelectedRow(), 3).toString());
            gerenciarOs.getjTextArea_descricao_problemaOS().setText(gerenciarOs.getjTable_OS_cadastro().getValueAt(gerenciarOs.getjTable_OS_cadastro().getSelectedRow(), 4).toString());
           // gerenciarOs.getjDateChooser_data_cadastroOS().setDate(gerenciarOs.getjTable_OS_cadastro().getValueAt(gerenciarOs.getjTable_OS_cadastro().getSelectedRow(), 5));
            gerenciarOs.getjLabel_Status().setText(gerenciarOs.getjTable_OS_cadastro().getValueAt(gerenciarOs.getjTable_OS_cadastro().getSelectedRow(), 6).toString());
        }
    }
    
    //ATUALIZA A TABELA DA ORDEM DE SERVIÇO↓
    public void readJTableOS() throws Exception {
        DefaultTableModel model = (DefaultTableModel) gerenciarOs.getjTable_OS_cadastro().getModel();
        model.setNumRows(0);
        
        OrdemServicoController OsController = new OrdemServicoController();
        OrdemServicoDAO dao = new OrdemServicoDAO();
   
        for (OrdemDeServico os : OsController.read()) {
            model.addRow(new Object[]{
                os.getNumeroOS(),
                os.getFuncionarioOs().getMatricula(),
                os.getClienteOs().getCpf(),
                os.getProblemaOs().getCodigo(),
                os.getDescricaoProblemaOS(),
                os.getStatus()
            });
        }
        
        //LIMPA OS CAMPOS DE TEXTO↓
        /*home.getCampo_busca_cli().setText("");
        home.getNome_campo_cli().setText("");
        home.getRg_campo_cli().setText("");
        home.getCpf_campo_cli().setText("");*/
          
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void readComboBox_Cliente() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            ArrayList<Cliente> clientes = new ArrayList<>();
            ClienteDAO dao = new ClienteDAO();
            
            clientes = dao.read();
            
            for (Cliente cliente : clientes) {
                model.addElement(cliente.getCpf());
            }
            gerenciarOs.getjComboBoxClienteOS().setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(GerenciarOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setNameJText_Cliente() {
        try {
            ClienteDAO cli = new ClienteDAO();
            Cliente cliente = cli.read().get(gerenciarOs.getjComboBoxClienteOS().getSelectedIndex());

            gerenciarOs.getjText_cpf_clienteOs().setText(cliente.getNome());
        } catch (Exception ex) {
            Logger.getLogger(GerenciarOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//-----------------------------------------------------------------------------------------
    public void readComboBox_Funcionario() {

        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            ArrayList<Funcionario> funcionarios = new ArrayList<>();
            FuncionarioDAO dao = new FuncionarioDAO();
            
            funcionarios = dao.read();
            
            for (Funcionario funcionario : funcionarios) {
                model.addElement(funcionario.getMatricula());
            }

            gerenciarOs.getjComboBoxFuncionarioOS().setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(GerenciarOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setNameJText_Funcionario() {
        try {
            FuncionarioDAO dao = new FuncionarioDAO();
            Funcionario funcionario = dao.read().get(gerenciarOs.getjComboBoxFuncionarioOS().getSelectedIndex());

            gerenciarOs.getjText_matricula_funcionarioOS().setText(funcionario.getNome());
        } catch (Exception ex) {
            Logger.getLogger(GerenciarOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//-----------------------------------------------------------------------------------------
    
    public void readComboBox_Problema() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            ArrayList<Problema> problemas = new ArrayList<>();
            ProblemaDAO dao = new ProblemaDAO();
            
            problemas = dao.read();

            for (Problema problema : problemas) {
                model.addElement(problema.getCodigo());
            }

            gerenciarOs.getjComboBoxProblemaOS().setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(GerenciarOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setNameJText_Problema() {
        try {
            ProblemaDAO dao = new ProblemaDAO();
            Problema problema = dao.read().get(gerenciarOs.getjComboBoxProblemaOS().getSelectedIndex());

            gerenciarOs.getjText_cod_problemaOS().setText(problema.getNome());
        } catch (Exception ex) {
            Logger.getLogger(GerenciarOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
     /*  
    public void testFunc(){
        
        try {
            FuncionarioDAO dao = new FuncionarioDAO();
            
            for(Funcionario f: dao.read()){
               
                gerenciar.getjComboBoxFuncionarioOS().addItem(f);               
            }     
        } catch (Exception ex) {
            Logger.getLogger(GerenciarOsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
}
