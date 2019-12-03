/*package Extra;

import Controller.OrdemServicoController;
import DAO.*;
import Model.*;


import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class GController {

    private GerenciarOS_MVC gerenciarOs;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Problema> problemas = new ArrayList<>();

    public GController(GerenciarOS_MVC gerenciarOs) {
        this.gerenciarOs = gerenciarOs;
    }

    public void readLineTableOs() {
        if (gerenciarOs.getjTable_OS_cadastro().getSelectedRow() != -1) {
      
            gerenciarOs.getjText_numeroOS().setText(gerenciarOs.getjTable_OS_cadastro().getValueAt(gerenciarOs.getjTable_OS_cadastro().getSelectedRow(),0).toString());
            gerenciarOs.getjText_matricula_funcionarioOS().setText(gerenciarOs.getjTable_OS_cadastro().getValueAt(gerenciarOs.getjTable_OS_cadastro().getSelectedRow(), 1).toString());
            gerenciarOs.getjText_cpf_clienteOs().setText(gerenciarOs.getjTable_OS_cadastro().getValueAt(gerenciarOs.getjTable_OS_cadastro().getSelectedRow(), 2).toString());
            gerenciarOs.getjText_cod_problemaOS().setText(gerenciarOs.getjTable_OS_cadastro().getValueAt(gerenciarOs.getjTable_OS_cadastro().getSelectedRow(), 3).toString());
            gerenciarOs.getjTextArea_descricao_problemaOS().setText(gerenciarOs.getjTable_OS_cadastro().getValueAt(gerenciarOs.getjTable_OS_cadastro().getSelectedRow(), 4).toString());
            gerenciarOs.getjDateChooser_data_cadastroOS().setDate((Date) gerenciarOs.getjTable_OS_cadastro().getValueAt(gerenciarOs.getjTable_OS_cadastro().getSelectedRow(), 5));
        }
    }

    //ATUALIZA A TABELA DA ORDEM DE SERVIÇO↓
    public void readJTableOS() throws Exception {
        DefaultTableModel model = (DefaultTableModel) gerenciarOs.getjTable_OS_cadastro().getModel();
        model.setNumRows(0);
        OrdemServicoController OsController = new OrdemServicoController();

        for (OrdemDeServico os : OsController.read()) {
            model.addRow(new Object[]{
                os.getNumeroOS(),
                os.getFuncionarioOs().getMatricula(),
                os.getClienteOs().getCpf(),
                os.getProblemaOs().getCodigo(),
                os.getDescricaoProblemaOS(),
                os.getDataCadastroOS(),
                os.getStatus()
            });
        }

        //LIMPA OS CAMPOS DE TEXTO↓
        gerenciarOs.getjText_numeroOS().setText("");
        gerenciarOs.getjText_matricula_funcionarioOS().setText("");
        gerenciarOs.getjText_cpf_clienteOs().setText("");
        gerenciarOs.getjText_cod_problemaOS().setText("");
        gerenciarOs.getjTextArea_descricao_problemaOS().setText("");
        gerenciarOs.getjDateChooser_data_cadastroOS().setDate(null);
    }

    
    //-------
    //Cliente↓
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
            Logger.getLogger(GerenciarOS_MVC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setNameJText_Cliente() {
        try {
            ClienteDAO cli = new ClienteDAO();
            Cliente cliente = cli.read().get(gerenciarOs.getjComboBoxClienteOS().getSelectedIndex());

            gerenciarOs.getjText_cpf_clienteOs().setText(cliente.getNome());
        } catch (Exception ex) {
            Logger.getLogger(GerenciarOS_MVC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//-----------------------------------------------------------------------------------------
    //Funcionario↓
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
            Logger.getLogger(GerenciarOS_MVC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setNameJText_Funcionario() {
        try {
            FuncionarioDAO dao = new FuncionarioDAO();
            Funcionario funcionario = dao.read().get(gerenciarOs.getjComboBoxFuncionarioOS().getSelectedIndex());

            gerenciarOs.getjText_matricula_funcionarioOS().setText(funcionario.getNome());
        } catch (Exception ex) {
            Logger.getLogger(GerenciarOS_MVC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//-----------------------------------------------------------------------------------------

    //Problema↓
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
            Logger.getLogger(GerenciarOS_MVC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setNameJText_Problema() {
        try {
            ProblemaDAO dao = new ProblemaDAO();
            Problema problema = dao.read().get(gerenciarOs.getjComboBoxProblemaOS().getSelectedIndex());

            gerenciarOs.getjText_cod_problemaOS().setText(problema.getNome());
        } catch (Exception ex) {
            Logger.getLogger(GerenciarOS_MVC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

//GETTE E SETTE↓   
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Problema> getProblemas() {
        return problemas;
    }

    public void setProblemas(ArrayList<Problema> problemas) {
        this.problemas = problemas;
    }
    
    
    
    
    
    
    
    
    
    

}
*/