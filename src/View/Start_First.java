package View;

import DAO.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Start_First extends javax.swing.JFrame {

    public Start_First() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Inserir Dados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Criar Tabelas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton3)
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            createDataTables();
            System.out.println("Tabelas Criadas");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            insertDataTables();
            System.out.println("Valores inseridos");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Start_First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start_First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start_First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start_First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start_First().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
//------------------------------------------------------------------------------------------------------------------------

    public static void createDataTables() throws SQLException, ClassNotFoundException {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;

        //Creando Tabela USUARIO↓
        stmt = con.prepareStatement(" CREATE TABLE usuario(\n"
                + "id int AUTO_INCREMENT PRIMARY KEY,\n"
                + "login varchar (50) NOT NULL,\n"
                + "senha varchar (100) NOT NULL  \n"
                + ")");
        stmt.executeUpdate();

        //Creando Tabela CLIENTE↓
        stmt = con.prepareStatement("CREATE TABLE cliente (\n"
                + "nome varchar(100) NOT NULL,\n"
                + "rg varchar(10) NOT NULL,\n"
                + "cpf varchar(11) PRIMARY KEY\n"
                + ")");
        stmt.executeUpdate();

        //Creando Tabela FUNCIONARIO↓
        stmt = con.prepareStatement("CREATE TABLE funcionario (\n"
                + "matricula int AUTO_INCREMENT PRIMARY KEY ,\n"
                + "nome varchar(100)  NOT NULL,\n"
                + "rg varchar(10) NOT NULL,\n"
                + "cpf varchar(11) NOT NULL UNIQUE,\n"
                + "salario numeric(8,2)  NOT NULL\n"
                + ")");
        stmt.executeUpdate();

        //Creando Tabela PROBLEMA↓
        stmt = con.prepareStatement("CREATE TABLE problema (\n"
                + "codigo int AUTO_INCREMENT PRIMARY KEY,\n"
                + "nome varchar(30) NOT NULL,\n"
                + "descricao varchar(255)\n"
                + ")");
        stmt.executeUpdate();

        //Creando Tabela ORDEM DE SERVICO↓
        stmt = con.prepareStatement("CREATE TABLE ordemservico (\n"
                + "numero int AUTO_INCREMENT PRIMARY KEY,\n"
                + "matricula_funcionario int NOT NULL,\n"
                + "cpf_cliente varchar(11) NOT NULL,\n"
                + "codigo_problema int NOT NULL,\n"
                + "descricaoproblema varchar(255) NOT NULL,\n"
                + "datacadastro date NOT NULL,\n"
                + "datasolucao date,\n"
                + "datacancelamento date,\n"
                + "descricaoservico varchar(255),\n"
                + "motivocancelamento varchar(255),\n"
                + "FOREIGN KEY(matricula_funcionario) REFERENCES funcionario (matricula),\n"
                + "FOREIGN KEY(cpf_cliente) REFERENCES cliente (cpf),\n"
                + "FOREIGN KEY(codigo_problema) REFERENCES problema (codigo)\n"
                + ")");
        stmt.executeUpdate();

        ConexaoBanco.closeConnetion(con, stmt);
    }

    public static void insertDataTables() throws SQLException, ClassNotFoundException {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;

        //Inserindo USUARIOS↓
        stmt = con.prepareStatement(" INSERT INTO usuario (login, senha)\n"
                + "    VALUES ('lukasnox', 'mago'),\n"
                + "           ('cnery', 'gordo') ");
        stmt.executeUpdate();

        //Inserino CLIENTES↓
        stmt = con.prepareStatement(" INSERT INTO cliente (nome, rg, cpf) \n"
                + "VALUES \n"
                + "('Lukas', '9311567', '10645045403'),\n"
                + "('Cassiano', '5445214', '11111111111'),\n"
                + "('Marco', '4577878', '22222222222'),\n"
                + "('Gustavo', '7885521', '33333333333'),\n"
                + "('Caio', '7879998', '44444444444'),\n"
                + "('Rya', '9999999', '55555555555') ");
        stmt.executeUpdate();

        //Inserindo FUNCIONARIOS↓
        stmt = con.prepareStatement("INSERT INTO funcionario (`matricula`, `nome`, `rg`, `cpf`, `salario`) \n"
                + "VALUES \n"
                + "(NULL, 'Marco Lindo', '666666', '77777777777', '1500'),\n"
                + "(NULL, 'Cassiano Viado', '3325648', '66666666666', '1500'),\n"
                + "(NULL, 'GustOvão', '1211232', '88888888888', '1500'),\n"
                + "(NULL, 'Leon Tzum', '7878798', '99999999999', '1500'),\n"
                + "(NULL, 'Afonso Braguilha', '5547632', '00000000001', '1500');");
        stmt.executeUpdate();

        //Inserindo PROBLEMAS
        stmt = con.prepareStatement("INSERT INTO problema (`codigo`, `nome`, `descricao`) \n"
                + "VALUES \n"
                + "(NULL, 'Placa Mãe', 'A placa mão simplesmente nao funciona mais!!'),\n"
                + "(NULL, 'Religião', 'Ela vem iludindo a sociedade por muito tempo!! CHEGA!!'),\n"
                + "(NULL, 'Passagem', 'falta passagem para vim para faculdade'),\n"
                + "(NULL, 'IA altamente desenvolvida', 'meu pc é uma IA altamente desenvolvida e tem suas proprias vontades')");
        stmt.executeUpdate();
        
/*
        //Inserindo ORDEM DE SERIVÇO↓
        stmt = con.prepareStatement("INSERT INTO ordemservico (numero, matricula_funcionario, cpf_cliente, codigo_problema, descricaoproblema, datacadastro, datasolucao, datacancelamento, descricaoservico, motivocancelamento)\n"
                + "VALUES \n"
                + "(NULL, '1', '11111111111', '1', 'só a igreja pode salvar', '2019-12-02', NULL, NULL, NULL, NULL),\n"
                + "(NULL, '2', '22222222222', '2', 'ele ta voltando, eu creio', '2019-12-10', NULL, NULL, NULL, NULL),\n"
                + "(NULL, '3', '33333333333', '3', 'bateria é muito booom', '2019-12-04', NULL, NULL, NULL, NULL),\n"
                + "(NULL, '4', '44444444444', '4', 'caramba vei q projeto lindo', '2019-12-12', NULL, NULL, NULL, NULL),\n"
                + "(NULL, '5', '55555555555', '5', 'pokemon, gta, avon, natura', '2019-12-14', NULL, NULL, NULL, NULL);");
        stmt.executeUpdate();
*/
        ConexaoBanco.closeConnetion(con, stmt);
    }

}
