package Controller.Views;

import Controller.ClienteController;
import Controller.FuncionarioController;
import Controller.OrdemServicoController;
import Controller.ProblemaController;
import DAO.OrdemServicoDAO;
import Model.Cliente;
import Model.Funcionario;
import Model.OrdemDeServico;
import Model.Problema;
import View.Home;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class HomeController {

    private Home home;

    public HomeController(Home home) {
        this.home = home;
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    //COMANDOS RESPONSABEIS POR ME MOSTRAR AS LINHAS DA TABELA CLIENTES↓
    public void readLineTableCliente() throws Exception {
        if (home.getTableClientes().getSelectedRow() != -1) {

            home.getNome_campo_cli().setText(home.getTableClientes().getValueAt(home.getTableClientes().getSelectedRow(), 0).toString());
            home.getRg_campo_cli().setText(home.getTableClientes().getValueAt(home.getTableClientes().getSelectedRow(), 1).toString());
            home.getCpf_campo_cli().setText(home.getTableClientes().getValueAt(home.getTableClientes().getSelectedRow(), 2).toString());
        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    //COMANDOS RESPONSABEIS POR ME MOSTRAR AS LINHAS DA TABELA FUNCIONARIOS↓
    public void readLineTableFuncionario() throws Exception {
        if (home.getTableFuncionario().getSelectedRow() != -1) {
            home.getMatricula_campo_func().setText(home.getTableFuncionario().getValueAt(home.getTableFuncionario().getSelectedRow(), 0).toString());
            home.getNome_campo_func().setText(home.getTableFuncionario().getValueAt(home.getTableFuncionario().getSelectedRow(), 1).toString());
            home.getRg_campo_func().setText(home.getTableFuncionario().getValueAt(home.getTableFuncionario().getSelectedRow(), 2).toString());
            home.getCpf_campo_func().setText(home.getTableFuncionario().getValueAt(home.getTableFuncionario().getSelectedRow(), 3).toString());
            home.getSalario_campo_func().setText(home.getTableFuncionario().getValueAt(home.getTableFuncionario().getSelectedRow(), 4).toString());
        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    //COMANDOS RESPONSABEIS POR ME MOSTRAR AS LINHAS DA TABELA PROBLEMAS↓
    public void readLineTableProblema() throws Exception {
        if (home.getTableProblema().getSelectedRow() != -1) {
            home.getCodigo_campo_prob().setText(home.getTableProblema().getValueAt(home.getTableProblema().getSelectedRow(), 0).toString());
            home.getNome_campo_prob().setText(home.getTableProblema().getValueAt(home.getTableProblema().getSelectedRow(), 1).toString());
            home.getDescricao_campo_prob().setText(home.getTableProblema().getValueAt(home.getTableProblema().getSelectedRow(), 2).toString());

        }
    }
    
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    //ATUALIZA A TABELA DE CLIENTES↓
    public void readJTableCliente() throws Exception {
        DefaultTableModel model = (DefaultTableModel) home.getTableClientes().getModel();
        model.setNumRows(0);
        ClienteController cliController = new ClienteController();

        for (Cliente c : cliController.read()) {
            model.addRow(new Object[]{
                c.getNome(),
                c.getRg(),
                c.getCpf()
            });
        }
        
        //LIMPA OS CAMPOS DE TEXTO↓
        home.getCampo_busca_cli().setText("");
        home.getNome_campo_cli().setText("");
        home.getRg_campo_cli().setText("");
        home.getCpf_campo_cli().setText("");
          
    }
     //COMANDO RESPONSAVEL POR ATUALIZAR MINHA TABELA DE CLIENTES PELO CPF↓
    public void readJTableCliente(String cpf) throws Exception {
        DefaultTableModel model = (DefaultTableModel) home.getTableClientes().getModel();
        model.setNumRows(0);
        ClienteController cliController = new ClienteController();

        for (Cliente c : cliController.read(cpf)) {
            model.addRow(new Object[]{
                c.getNome(),
                c.getRg(),
                c.getCpf()
            });
        }
        
        //LIMPA OS CAMPOS DE TEXTO↓
        home.getCampo_busca_cli().setText("");
        home.getNome_campo_cli().setText("");
        home.getRg_campo_cli().setText("");
        home.getCpf_campo_cli().setText("");
          
    }
  
    
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    //COMANDO RESPONSAVEL POR ATUALIZAR MINHA TABELA DE FUNCIONARIO↓
    public void readJTableFuncionario() throws Exception {
        DefaultTableModel model = (DefaultTableModel) home.getTableFuncionario().getModel();
        model.setNumRows(0);
        FuncionarioController funcController = new FuncionarioController();

        for (Funcionario f : funcController.read()) {
            model.addRow(new Object[]{
                f.getMatricula(),
                f.getNome(),
                f.getRg(),
                f.getCpf(),
                f.getSalario()
            });
        }
        
        //LIMPA OS CAMPOS DE TEXTO↓
        home.getCampo_busca_func().setText("");
        home.getMatricula_campo_func().setText("");
        home.getNome_campo_func().setText("");
        home.getRg_campo_func().setText("");
        home.getCpf_campo_func().setText("");
        home.getSalario_campo_func().setText("");
    }
    //COMANDO RESPONSAVEL POR ATUALIZAR MINHA TABELA DE FUNCIONARIO PELA MATRICULA↓
    public void readJTableFuncionario(String matricula) throws Exception {
        DefaultTableModel model = (DefaultTableModel) home.getTableFuncionario().getModel();
        model.setNumRows(0);
        FuncionarioController funcController = new FuncionarioController();

        for (Funcionario f : funcController.read(matricula)) {
            model.addRow(new Object[]{
                f.getMatricula(),
                f.getNome(),
                f.getRg(),
                f.getCpf(),
                f.getSalario()
            });
        }
        
        //LIMPA OS CAMPOS DE TEXTO↓
        home.getCampo_busca_func().setText("");
        home.getMatricula_campo_func().setText("");
        home.getNome_campo_func().setText("");
        home.getRg_campo_func().setText("");
        home.getCpf_campo_func().setText("");
        home.getSalario_campo_func().setText("");
    }
   
    
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    //COMANDO RESPONSAVEL POR ATUALIZAR MINHA TABELA DE PROBLEMAS↓
    public void readJTableProblema() throws Exception {
        DefaultTableModel model = (DefaultTableModel) home.getTableProblema().getModel();
        model.setNumRows(0);
        ProblemaController probController = new ProblemaController();
 
        for (Problema p : probController.read()) {
            model.addRow(new Object[]{
                p.getCodigo(),
                p.getNome(),
                p.getDescricao()});
        }
        
        //LIMPA OS CAMPOS DE TEXTO↓
        home.getCampo_busca_prob().setText("");
        home.getCodigo_campo_prob().setText("");
        home.getNome_campo_prob().setText("");
        home.getDescricao_campo_prob().setText("");
    }
    //COMANDO RESPONSAVEL POR ATUALIZAR MINHA TABELA DE PROBLEMAS PELO CODIGO↓
    public void readJTableProblema(String codigo) throws Exception {
        DefaultTableModel model = (DefaultTableModel) home.getTableProblema().getModel();
        model.setNumRows(0);
        ProblemaController probController = new ProblemaController();
 
        for (Problema p : probController.read(codigo)) {
            model.addRow(new Object[]{
                p.getCodigo(),
                p.getNome(),
                p.getDescricao()});
        }
        
        //LIMPA OS CAMPOS DE TEXTO↓
        home.getCampo_busca_prob().setText("");
        home.getCodigo_campo_prob().setText("");
        home.getNome_campo_prob().setText("");
        home.getDescricao_campo_prob().setText("");
    }
   
//----------------------------------------------------------------------------------------------------------------------------------------------------------

    //COMANDO RESPONSAVEL POR ATUALIZAR MINHA TABELA DE ORDEM DE SERVIÇO↓
    public void readJTableOrdemdeServico() throws Exception {
        DefaultTableModel model = (DefaultTableModel) home.getjTable_OsMain().getModel();
        model.setNumRows(0);
        OrdemServicoController OsControll = new OrdemServicoController();

        for (OrdemDeServico os : OsControll.readAllTable()) {
            model.addRow(new Object[]{
                os.getNumeroOS(),
                os.getDescricaoServicoOS(),
                os.getProblemaOs().getCodigo(),
                os.getDescricaoProblemaOS(),
                os.getDataCadastroOS(),
                os.getDataCancelamentoOS(),
                os.getMotivoCancelamentoOS(),
                os.getFuncionarioOs().getMatricula(),
                os.getClienteOs().getCpf()
            });
        }
    }
    public void readJTableOrdemdeServico(String numero) throws Exception {
        DefaultTableModel model = (DefaultTableModel) home.getjTable_OsMain().getModel();
        model.setNumRows(0);
        OrdemServicoController OsControll = new OrdemServicoController();

        for (OrdemDeServico os : OsControll.readAllTable(numero)) {
            model.addRow(new Object[]{
                os.getNumeroOS(),
                os.getDescricaoServicoOS(),
                os.getProblemaOs().getCodigo(),
                os.getDescricaoProblemaOS(),
                os.getDataCadastroOS(),
                os.getDataCancelamentoOS(),
                os.getMotivoCancelamentoOS(),
                os.getFuncionarioOs().getMatricula(),
                os.getClienteOs().getCpf()
            });
        }
        home.getjText_pesquisaOs().setText("");
    }
    

    
  
    
//----------------------------------------------------------------------------------------------------------------------------------------------------------  
    //METODOS RESPONSAVEIS POR ALTERAR AS CORES DOS BOTOES (CLIENTE,FUNCIONARIO,PROBLEMA,ORDEM DE SERIVOÇO)↓
    public void setLblColor(JLabel lbl) {
        lbl.setBackground(new Color(187, 187, 187));
    }

    public void resetLblColor(JLabel lbl) {
        lbl.setBackground(new Color(255, 255, 255));
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------

}
