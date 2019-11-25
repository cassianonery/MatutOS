package DAO;

import Interface.InterfaceOrdemDeServico;
import Model.OrdemDeServico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class OrdemServicoDAO implements InterfaceOrdemDeServico {

    @Override
    public void create(OrdemDeServico os) throws Exception {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(" INSERT INTO os (descricaoservico,descricaoproblema) "
                    + " VALUES (?,?) ");
           
            stmt.setString(1, os.getDescricaoServicoOS());
            stmt.setString(2, os.getDescricaoProblemaOS());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao salvar no Banco: !" + ex);
        } finally {
            ConexaoBanco.closeConnetion(con, stmt);
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
