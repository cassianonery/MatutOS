package View;

import Controller.OrdemServicoController;
import Model.OrdemDeServico;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GerenciarOS extends javax.swing.JFrame {

    public GerenciarOS() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel_cadastrarOs = new javax.swing.JPanel();
        jButton_atualizar_os = new javax.swing.JButton();
        jButton_cadastrar_os = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jText_numeroOS = new javax.swing.JTextField();
        jText_cod_problemaOS = new javax.swing.JTextField();
        jText_matricula_funcionarioOS = new javax.swing.JTextField();
        jText_cpf_clienteOs = new javax.swing.JTextField();
        jFormattedText_data_cadastroOS = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_descricao_problemaOS = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_OS_cadastro_atualizar = new javax.swing.JTable();
        jPanel_cancelarOs = new javax.swing.JPanel();
        jButton_confirmar_cancelamento = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jFormattedText_data_cancelamento = new javax.swing.JFormattedTextField();
        jText_numeroOS_cancelamento = new javax.swing.JTextField();
        jText_busca_os_cancelamento = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea_movito_cancelamento = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_OS_cancelamento = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea_descricao_servicoOS = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton_status_solucionado = new javax.swing.JRadioButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton_atualizar_os.setText("Atualizar");

        jButton_cadastrar_os.setText("Cadastrar");
        jButton_cadastrar_os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cadastrar_osActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero OS:");

        jLabel3.setText("Cod. Problema:");

        jLabel4.setText("Descrição Problema:");

        jLabel5.setText("Data Cadastro:");

        jLabel6.setText("Matricula do Funcionario:");

        jLabel7.setText("Cpf do Cliente:");

        jText_numeroOS.setEditable(false);

        jFormattedText_data_cadastroOS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jTextArea_descricao_problemaOS.setColumns(20);
        jTextArea_descricao_problemaOS.setRows(5);
        jScrollPane2.setViewportView(jTextArea_descricao_problemaOS);

        jTable_OS_cadastro_atualizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Os", "Serviço", "Cod Problema", "Desc Problema", "Cadastrado", "Matricula Func", "Cpf Cliente", "Status OS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable_OS_cadastro_atualizar);

        javax.swing.GroupLayout jPanel_cadastrarOsLayout = new javax.swing.GroupLayout(jPanel_cadastrarOs);
        jPanel_cadastrarOs.setLayout(jPanel_cadastrarOsLayout);
        jPanel_cadastrarOsLayout.setHorizontalGroup(
            jPanel_cadastrarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_cadastrarOsLayout.createSequentialGroup()
                .addGroup(jPanel_cadastrarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel_cadastrarOsLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(jPanel_cadastrarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_cadastrarOsLayout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(jLabel4)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_cadastrarOsLayout.createSequentialGroup()
                                .addComponent(jButton_cadastrar_os)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_atualizar_os)
                                .addGap(40, 40, 40)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE))
                    .addGroup(jPanel_cadastrarOsLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel_cadastrarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_cadastrarOsLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jText_numeroOS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jText_matricula_funcionarioOS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_cadastrarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_cpf_clienteOs, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_cadastrarOsLayout.createSequentialGroup()
                                .addComponent(jFormattedText_data_cadastroOS, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jText_cod_problemaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_cadastrarOsLayout.setVerticalGroup(
            jPanel_cadastrarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_cadastrarOsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel_cadastrarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_numeroOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jText_matricula_funcionarioOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jText_cpf_clienteOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel_cadastrarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jText_cod_problemaOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedText_data_cadastroOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel_cadastrarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_cadastrarOsLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_cadastrarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_cadastrar_os)
                            .addComponent(jButton_atualizar_os)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Ordens de Serviços", jPanel_cadastrarOs);

        jButton_confirmar_cancelamento.setText("Confirmar");

        jLabel8.setText("Data:");

        jLabel9.setText("Motivo do cancelamento ↓");

        jLabel10.setText("Numero OS:");

        jLabel11.setText("Buscar OS ↓");

        jFormattedText_data_cancelamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jText_numeroOS_cancelamento.setEditable(false);

        jTextArea_movito_cancelamento.setColumns(20);
        jTextArea_movito_cancelamento.setRows(5);
        jScrollPane5.setViewportView(jTextArea_movito_cancelamento);

        jTable_OS_cancelamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Os", "Serviço", "Cod Problema", "Desc Problema", "Cadastrado", "Matricula Func", "Cpf Cliente", "Status OS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable_OS_cancelamento);

        jTextArea_descricao_servicoOS.setColumns(20);
        jTextArea_descricao_servicoOS.setRows(5);
        jScrollPane6.setViewportView(jTextArea_descricao_servicoOS);

        jLabel12.setText("Descrição do Serviço ↓");

        jRadioButton_status_solucionado.setText("Solucionada");

        javax.swing.GroupLayout jPanel_cancelarOsLayout = new javax.swing.GroupLayout(jPanel_cancelarOs);
        jPanel_cancelarOs.setLayout(jPanel_cancelarOsLayout);
        jPanel_cancelarOsLayout.setHorizontalGroup(
            jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                        .addGroup(jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_busca_os_cancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel11)))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton_confirmar_cancelamento)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                .addGroup(jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                        .addGroup(jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel9)
                                .addGap(245, 245, 245)
                                .addComponent(jLabel12))
                            .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jText_numeroOS_cancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedText_data_cancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_cancelarOsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jRadioButton_status_solucionado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel_cancelarOsLayout.setVerticalGroup(
            jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jText_numeroOS_cancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jFormattedText_data_cancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jRadioButton_status_solucionado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_busca_os_cancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                        .addGroup(jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addComponent(jScrollPane5))
                            .addComponent(jButton_confirmar_cancelamento))
                        .addGap(12, 12, 12)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane.addTab("Cancelamentos e Soluções", jPanel_cancelarOs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_cadastrar_osActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cadastrar_osActionPerformed

        try {
            OrdemDeServico os = new OrdemDeServico();
            OrdemServicoController osController = new OrdemServicoController();

            SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
           
            os.setDataCadastroOS((java.sql.Date) form.parse(jFormattedText_data_cadastroOS.getText()));
            os.setDescricaoProblemaOS(jTextArea_descricao_problemaOS.getText());
            os.getClienteOs().setCpf(jText_cpf_clienteOs.getText());
            os.getProblemaOs().setCodigo(Integer.parseInt(jText_cod_problemaOS.getText()));
            os.getFuncionarioOs().setMatricula(Integer.parseInt(jText_matricula_funcionarioOS.getText()));
             
            osController.create(os);

        } catch (Exception ex) {
            Logger.getLogger(GerenciarOS.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton_cadastrar_osActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciarOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_atualizar_os;
    private javax.swing.JButton jButton_cadastrar_os;
    private javax.swing.JButton jButton_confirmar_cancelamento;
    private javax.swing.JFormattedTextField jFormattedText_data_cadastroOS;
    private javax.swing.JFormattedTextField jFormattedText_data_cancelamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel_cadastrarOs;
    private javax.swing.JPanel jPanel_cancelarOs;
    private javax.swing.JRadioButton jRadioButton_status_solucionado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable jTable_OS_cadastro_atualizar;
    private javax.swing.JTable jTable_OS_cancelamento;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea_descricao_problemaOS;
    private javax.swing.JTextArea jTextArea_descricao_servicoOS;
    private javax.swing.JTextArea jTextArea_movito_cancelamento;
    private javax.swing.JTextField jText_busca_os_cancelamento;
    private javax.swing.JTextField jText_cod_problemaOS;
    private javax.swing.JTextField jText_cpf_clienteOs;
    private javax.swing.JTextField jText_matricula_funcionarioOS;
    private javax.swing.JTextField jText_numeroOS;
    private javax.swing.JTextField jText_numeroOS_cancelamento;
    // End of variables declaration//GEN-END:variables
}
