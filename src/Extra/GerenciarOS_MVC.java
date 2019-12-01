package Extra;

import Controller.OrdemServicoController;
import Model.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GerenciarOS_MVC extends javax.swing.JFrame {

    private GController controller_g;

    public GerenciarOS_MVC() throws Exception {
        initComponents();
        setLocationRelativeTo(null);

        controller_g = new GController(this);
        controller_g.readJTableOS();
        startReadComboBox();

    }

    void startReadComboBox() {
        controller_g.readComboBox_Cliente();
        controller_g.readComboBox_Funcionario();
        controller_g.readComboBox_Problema();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_descricao_problemaOS = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_OS_cadastro = new javax.swing.JTable();
        jComboBoxFuncionarioOS = new javax.swing.JComboBox<>();
        jComboBoxClienteOS = new javax.swing.JComboBox<>();
        jComboBoxProblemaOS = new javax.swing.JComboBox<>();
        jDateChooser_data_cadastroOS = new com.toedter.calendar.JDateChooser();
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

        jPanel_cadastrarOs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_atualizar_os.setText("Atualizar");
        jPanel_cadastrarOs.add(jButton_atualizar_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        jButton_cadastrar_os.setText("Cadastrar");
        jButton_cadastrar_os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cadastrar_osActionPerformed(evt);
            }
        });
        jPanel_cadastrarOs.add(jButton_cadastrar_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jLabel1.setText("Numero OS:");
        jPanel_cadastrarOs.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 18, -1, -1));

        jLabel3.setText("Cod. Problema:");
        jPanel_cadastrarOs.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 152, -1, -1));

        jLabel4.setText("Descrição Problema:");
        jPanel_cadastrarOs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        jLabel5.setText("Data Cadastro:");
        jPanel_cadastrarOs.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel6.setText("Matricula do Funcionario:");
        jPanel_cadastrarOs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 62, -1, -1));

        jLabel7.setText("Cpf do Cliente:");
        jPanel_cadastrarOs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 108, -1, -1));

        jText_numeroOS.setEditable(false);
        jPanel_cadastrarOs.add(jText_numeroOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 40, -1));

        jText_cod_problemaOS.setEditable(false);
        jPanel_cadastrarOs.add(jText_cod_problemaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 135, -1));

        jText_matricula_funcionarioOS.setEditable(false);
        jPanel_cadastrarOs.add(jText_matricula_funcionarioOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 135, -1));

        jText_cpf_clienteOs.setEditable(false);
        jPanel_cadastrarOs.add(jText_cpf_clienteOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 135, -1));

        jTextArea_descricao_problemaOS.setColumns(20);
        jTextArea_descricao_problemaOS.setRows(5);
        jScrollPane2.setViewportView(jTextArea_descricao_problemaOS);

        jPanel_cadastrarOs.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 272, 134));

        jTable_OS_cadastro.setBackground(new java.awt.Color(59, 63, 66));
        jTable_OS_cadastro.setForeground(new java.awt.Color(255, 255, 255));
        jTable_OS_cadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Os", "Matricula Func", "Cpf Cliente", "Cod Problema", "Desc Problema", "Cadastrado", "Status OS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_OS_cadastro.setGridColor(new java.awt.Color(59, 63, 66));
        jTable_OS_cadastro.setSelectionBackground(new java.awt.Color(59, 63, 66));
        jTable_OS_cadastro.setSelectionForeground(new java.awt.Color(59, 63, 66));
        jTable_OS_cadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_OS_cadastroMouseClicked(evt);
            }
        });
        jTable_OS_cadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable_OS_cadastroKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_OS_cadastro);

        jPanel_cadastrarOs.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 262, 963, 324));

        jComboBoxFuncionarioOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFuncionarioOSActionPerformed(evt);
            }
        });
        jPanel_cadastrarOs.add(jComboBoxFuncionarioOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 57, -1, -1));

        jComboBoxClienteOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClienteOSActionPerformed(evt);
            }
        });
        jPanel_cadastrarOs.add(jComboBoxClienteOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jComboBoxProblemaOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProblemaOSActionPerformed(evt);
            }
        });
        jPanel_cadastrarOs.add(jComboBoxProblemaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));
        jPanel_cadastrarOs.add(jDateChooser_data_cadastroOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 140, -1));

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

            Funcionario funcionario = controller_g.getFuncionarios().get(jComboBoxFuncionarioOS.getSelectedIndex());
            Cliente cliente = controller_g.getClientes().get(jComboBoxClienteOS.getSelectedIndex());
            Problema problema = controller_g.getProblemas().get(jComboBoxProblemaOS.getSelectedIndex());

            os.setFuncionarioOs(funcionario);
            os.setClienteOs(cliente);
            os.setProblemaOs(problema);
            os.setDataCadastroOS(new java.sql.Date(jDateChooser_data_cadastroOS.getDate().getTime()));
            os.setDescricaoProblemaOS(jTextArea_descricao_problemaOS.getText());
            os.setNumeroOS(Integer.parseInt(jText_numeroOS.getText()));

            new OrdemServicoController().create(os);

            controller_g.readJTableOS();

        } catch (Exception e) {
            Logger.getLogger(GerenciarOS_MVC.class.getName()).log(Level.SEVERE, null, e.getMessage());
        }
    }//GEN-LAST:event_jButton_cadastrar_osActionPerformed

    private void jComboBoxFuncionarioOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFuncionarioOSActionPerformed
        controller_g.setNameJText_Funcionario();
    }//GEN-LAST:event_jComboBoxFuncionarioOSActionPerformed

    private void jComboBoxClienteOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClienteOSActionPerformed
        controller_g.setNameJText_Cliente();
    }//GEN-LAST:event_jComboBoxClienteOSActionPerformed

    private void jComboBoxProblemaOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProblemaOSActionPerformed
        controller_g.setNameJText_Problema();
    }//GEN-LAST:event_jComboBoxProblemaOSActionPerformed

    private void jTable_OS_cadastroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_OS_cadastroKeyReleased
        controller_g.readLineTableOs();
    }//GEN-LAST:event_jTable_OS_cadastroKeyReleased

    private void jTable_OS_cadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_OS_cadastroMouseClicked
        controller_g.readLineTableOs();
    }//GEN-LAST:event_jTable_OS_cadastroMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerenciarOS_MVC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarOS_MVC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarOS_MVC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarOS_MVC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GerenciarOS_MVC().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(GerenciarOS_MVC.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_atualizar_os;
    private javax.swing.JButton jButton_cadastrar_os;
    private javax.swing.JButton jButton_confirmar_cancelamento;
    private javax.swing.JComboBox<Object> jComboBoxClienteOS;
    private javax.swing.JComboBox<Object> jComboBoxFuncionarioOS;
    private javax.swing.JComboBox<Object> jComboBoxProblemaOS;
    private com.toedter.calendar.JDateChooser jDateChooser_data_cadastroOS;
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
    private javax.swing.JTable jTable_OS_cadastro;
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

    //-----------------------------------------------------------//-----------------------------------------------------------\\
    //ComboBoxs↓
    public JComboBox getjComboBoxClienteOS() {
        return jComboBoxClienteOS;
    }

    public void setjComboBoxClienteOS(JComboBox jComboBoxClienteOS) {
        this.jComboBoxClienteOS = jComboBoxClienteOS;
    }

    public JComboBox getjComboBoxFuncionarioOS() {
        return jComboBoxFuncionarioOS;
    }

    public void setjComboBoxFuncionarioOS(JComboBox jComboBoxFuncionarioOS) {
        this.jComboBoxFuncionarioOS = jComboBoxFuncionarioOS;
    }

    public JComboBox getjComboBoxProblemaOS() {
        return jComboBoxProblemaOS;
    }

    public void setjComboBoxProblemaOS(JComboBox jComboBoxProblemaOS) {
        this.jComboBoxProblemaOS = jComboBoxProblemaOS;
    }

    //-----------------------------------------------------------//-----------------------------------------------------------\\
    //Campos de Texto↓
    public JTextField getjText_cpf_clienteOs() {
        return jText_cpf_clienteOs;
    }

    public void setjText_cpf_clienteOs(JTextField jText_cpf_clienteOs) {
        this.jText_cpf_clienteOs = jText_cpf_clienteOs;
    }

    public JTextField getjText_matricula_funcionarioOS() {
        return jText_matricula_funcionarioOS;
    }

    public void setjText_matricula_funcionarioOS(JTextField jText_matricula_funcionarioOS) {
        this.jText_matricula_funcionarioOS = jText_matricula_funcionarioOS;
    }

    public JTextField getjText_numeroOS() {
        return jText_numeroOS;
    }

    public void setjText_numeroOS(JTextField jText_numeroOS) {
        this.jText_numeroOS = jText_numeroOS;
    }

    public JTextField getjText_cod_problemaOS() {
        return jText_cod_problemaOS;
    }

    public void setjText_cod_problemaOS(JTextField jText_cod_problemaOS) {
        this.jText_cod_problemaOS = jText_cod_problemaOS;
    }

    public JTextArea getjTextArea_descricao_problemaOS() {
        return jTextArea_descricao_problemaOS;
    }

    public void setjTextArea_descricao_problemaOS(JTextArea jTextArea_descricao_problemaOS) {
        this.jTextArea_descricao_problemaOS = jTextArea_descricao_problemaOS;
    }

    public JDateChooser getjDateChooser_data_cadastroOS() {
        return jDateChooser_data_cadastroOS;
    }

    public void setjDateChooser_data_cadastroOS(JDateChooser jDateChooser_data_cadastroOS) {
        this.jDateChooser_data_cadastroOS = jDateChooser_data_cadastroOS;
    }

    //-----------------------------------------------------------//-----------------------------------------------------------\\
    //Tables↓
    public JTable getjTable_OS_cadastro() {
        return jTable_OS_cadastro;
    }

    public void setjTable_OS_cadastro(JTable jTable_OS_cadastro) {
        this.jTable_OS_cadastro = jTable_OS_cadastro;
    }

    public JTable getjTable_OS_cancelamento() {
        return jTable_OS_cancelamento;
    }

    public void setjTable_OS_cancelamento(JTable jTable_OS_cancelamento) {
        this.jTable_OS_cancelamento = jTable_OS_cancelamento;
    }

}
