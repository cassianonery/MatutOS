package Controller.Views;

//Importações dos pacotes de Controladores↓
import Controller.ClienteController;
import Controller.FuncionarioController;
import Controller.OrdemServicoController;
import Controller.ProblemaController;

//Importações dos pacotes Model↓
import Model.Cliente;
import Model.Funcionario;
import Model.OrdemDeServico;
import Model.Problema;

//importação da View do Controller↓
import View.Home;

//importações java↓
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class HomeController {

    private Home home;

    public HomeController(Home home) {
        this.home = home;
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    //COMANDOS RESPONSAVEIS POR SETAR AS LINHAS DA TABELA CLIENTES↓
    public void setLineTable_Cliente() throws Exception {
        if (home.getTableClientes().getSelectedRow() != -1) {

            home.getNome_campo_cli().setText(home.getTableClientes().getValueAt(home.getTableClientes().getSelectedRow(), 0).toString());
            home.getRg_campo_cli().setText(home.getTableClientes().getValueAt(home.getTableClientes().getSelectedRow(), 1).toString());
            home.getCpf_campo_cli().setText(home.getTableClientes().getValueAt(home.getTableClientes().getSelectedRow(), 2).toString());
        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    //COMANDOS RESPONSAVEIS POR SETAR AS LINHAS DA TABELA FUNCIONARIOS↓
    public void setLineTable_Funcionario() throws Exception {
        if (home.getTableFuncionario().getSelectedRow() != -1) {
            home.getMatricula_campo_func().setText(home.getTableFuncionario().getValueAt(home.getTableFuncionario().getSelectedRow(), 0).toString());
            home.getNome_campo_func().setText(home.getTableFuncionario().getValueAt(home.getTableFuncionario().getSelectedRow(), 1).toString());
            home.getRg_campo_func().setText(home.getTableFuncionario().getValueAt(home.getTableFuncionario().getSelectedRow(), 2).toString());
            home.getCpf_campo_func().setText(home.getTableFuncionario().getValueAt(home.getTableFuncionario().getSelectedRow(), 3).toString());
            home.getSalario_campo_func().setText(home.getTableFuncionario().getValueAt(home.getTableFuncionario().getSelectedRow(), 4).toString());
        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    //COMANDOS RESPONSAVEIS POR SETAR AS LINHAS DA TABELA PROBLEMAS↓
    public void setLineTable_Problema() throws Exception {
        if (home.getTableProblema().getSelectedRow() != -1) {
            home.getCodigo_campo_prob().setText(home.getTableProblema().getValueAt(home.getTableProblema().getSelectedRow(), 0).toString());
            home.getNome_campo_prob().setText(home.getTableProblema().getValueAt(home.getTableProblema().getSelectedRow(), 1).toString());
            home.getDescricao_campo_prob().setText(home.getTableProblema().getValueAt(home.getTableProblema().getSelectedRow(), 2).toString());

        }
    } 
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    //LER A TABELA DE CLIENTES↓
    public void readJTable_Cliente() throws Exception {
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
    
     //LER A TABELA DE CLIENTES USANDO O CPF↓
    public void readJTable_Cliente(String cpf) throws Exception {
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
     //LER A TABELA DE FUNCIONARIO↓
    public void readJTable_Funcionario() throws Exception {
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
    
    //LER A TABELA DE FUNCIONARIO USANDO A MATRICULA↓
    public void readJTable_Funcionario(String matricula) throws Exception {
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
    //LER A TABELA DE PROBLEMAS↓ 
    public void readJTable_Problema() throws Exception {
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
    
    //LER A TABELA DE PROBLEMAS USANDO O CODIGO↓
    public void readJTable_Problema(String codigo) throws Exception {
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

    //LER A TABELA DE ORDEM DE SERVIÇO↓
    public void readJTable_OS() throws Exception {
        DefaultTableModel model = (DefaultTableModel) home.getjTable_OsMain().getModel();
        model.setNumRows(0);
        OrdemServicoController OsControll = new OrdemServicoController();

        for (OrdemDeServico os : OsControll.read()) {
            model.addRow(new Object[]{
                os.getNumeroOS(),
                os.getFuncionarioOs().getNome(),
                os.getClienteOs().getNome(),
                os.getProblemaOs().getCodigo(),
                os.getDescricaoProblemaOS(),
                os.getDataCadastroOS(),
                os.getDescricaoServicoOS(),
                os.getDataCancelamentoOS(),
                os.getMotivoCancelamentoOS(),
                os.getStatus()
            });
        }
    }
    
    //LER A TABELA DE ORDEM DE SERVIÇO USANDO O NUMERO↓
    public void readJTable_OS(String numero) throws Exception {
        DefaultTableModel model = (DefaultTableModel) home.getjTable_OsMain().getModel();
        model.setNumRows(0);
        OrdemServicoController OsControll = new OrdemServicoController();

        for (OrdemDeServico os : OsControll.read(numero)) {
            model.addRow(new Object[]{
                os.getNumeroOS(),
                os.getFuncionarioOs().getMatricula(),
                os.getClienteOs().getCpf(),
                os.getProblemaOs().getCodigo(),
                os.getDescricaoProblemaOS(),
                os.getDataCadastroOS(),
                os.getDescricaoServicoOS(),
                os.getDataCancelamentoOS(),
                os.getMotivoCancelamentoOS(),
                os.getStatus()
            });
        }
        home.getjText_pesquisaOs().setText("");
    }
    
    
//----------------------------------------------------------------------------------------------------------------------------------------------------------  
    //ALTERA AS CORES DOS BOTOES (CLIENTE,FUNCIONARIO,PROBLEMA,ORDEM DE SERIVOÇO)↓
    public void setLblColor(JLabel lbl) {
        lbl.setBackground(new Color(187, 187, 187));
    }
    //RESETA AS CORES DOS BOTOES (CLIENTE,FUNCIONARIO,PROBLEMA,ORDEM DE SERIVOÇO)↓
    public void resetLblColor(JLabel lbl) {
        lbl.setBackground(new Color(255, 255, 255));
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------
}