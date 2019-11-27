package Controller;

import DAO.ClienteDAO;
import DAO.FuncionarioDAO;
import Model.Cliente;
import Model.Funcionario;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import View.GerenciarOS;

public class GerenciarOsController {

    private GerenciarOS gerenciar;

    public GerenciarOsController(GerenciarOS gerenciar) {
        this.gerenciar = gerenciar;
    }

    public void readComboBox_Cliente() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ClienteDAO dao = new ClienteDAO();
        try {
            clientes = dao.read();
        } catch (Exception ex) {
            Logger.getLogger(GerenciarOS.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Cliente cliente : clientes) {
            model.addElement(cliente.getCpf());
        }
        gerenciar.getjComboBoxClienteOS().setModel(model);
    }

    public void setNameJText_Cliente() {
        try {
            ClienteDAO cli = new ClienteDAO();
            Cliente cliente;
            cliente = cli.read().get(gerenciar.getjComboBoxClienteOS().getSelectedIndex());

            gerenciar.getjText_cpf_clienteOs().setText(cliente.getNome());
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
                model.addElement(new Object[]{funcionario.getMatricula()});
            }

            gerenciar.getjComboBoxClienteOS().setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(GerenciarOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setNameJText_Funcionario() {
        try {
            FuncionarioDAO dao = new FuncionarioDAO();
            Funcionario funcionario;
            funcionario = dao.read().get(gerenciar.getjComboBoxFuncionarioOS().getSelectedIndex());

            gerenciar.getjText_matricula_funcionarioOS().setText(funcionario.getNome());
        } catch (Exception ex) {
            Logger.getLogger(GerenciarOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
