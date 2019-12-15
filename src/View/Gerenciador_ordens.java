package View;

import Controller.OrdemServicoController;
import Model.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import DAO.ClienteDAO;
import DAO.FuncionarioDAO;
import DAO.ProblemaDAO;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Gerenciador_ordens extends javax.swing.JFrame {

    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Problema> problemas = new ArrayList<>();

    public Gerenciador_ordens() throws Exception {
        initComponents();
        setLocationRelativeTo(null);

        startRead();
        readALL();

        jTextArea_descricao_problemaOS.setLineWrap(true);
        jTextArea_descricao_alteracao.setLineWrap(true);
    }
//---------------------------------------------------------------------------------------------------------------------------------

    void readALL() throws Exception {
        readJTableAll();
        readJTableOpen();
    }

    void startRead() {

        try {
            readComboBox_Cliente();
            readComboBox_Funcionario();
            readComboBox_Problema();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
//---------------------------------------------------------------------------------------------------------------------------------

    public void setLineTable_cadastrando() {
        if (jTable_OS_cadastro.getSelectedRow() != -1) {

            jText_numeroOS.setText(jTable_OS_cadastro.getValueAt(jTable_OS_cadastro.getSelectedRow(), 0).toString());
            jText_matricula_funcionarioOS.setText(jTable_OS_cadastro.getValueAt(jTable_OS_cadastro.getSelectedRow(), 1).toString());
            jText_cpf_clienteOs.setText(jTable_OS_cadastro.getValueAt(jTable_OS_cadastro.getSelectedRow(), 2).toString());
            jText_cod_problemaOS.setText(jTable_OS_cadastro.getValueAt(jTable_OS_cadastro.getSelectedRow(), 3).toString());
            jTextArea_descricao_problemaOS.setText(jTable_OS_cadastro.getValueAt(jTable_OS_cadastro.getSelectedRow(), 4).toString());
            jDateChooser_data_cadastroOS.setDate((Date) jTable_OS_cadastro.getValueAt(jTable_OS_cadastro.getSelectedRow(), 5));
        }
    }

    public void setLineTalbe_alterando() {
        if (jTable_OS_alterando.getSelectedRow() != -1) {

            jText_numeroOS_alteracao.setText(jTable_OS_alterando.getValueAt(jTable_OS_alterando.getSelectedRow(), 0).toString());

        }
    }
//---------------------------------------------------------------------------------------------------------------------------------
    //ATUALIZA A TABELA DA ORDEM DE SERVIÇO↓

    public void readJTableAll() throws Exception {
        DefaultTableModel model = (DefaultTableModel) jTable_OS_cadastro.getModel();

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
                os.getStatus()
            });
        }
    }

    public void readJTableOpen() throws Exception {
        DefaultTableModel model = (DefaultTableModel) jTable_OS_alterando.getModel();

        model.setNumRows(0);
        OrdemServicoController OsControll = new OrdemServicoController();

        ArrayList<OrdemDeServico> abertas = new ArrayList<>();

        for (OrdemDeServico os : OsControll.read()) {

            if (os.getStatus().equals("Aberta")) {
                model.addRow(new Object[]{
                    os.getNumeroOS(),
                    os.getFuncionarioOs().getNome(),
                    os.getClienteOs().getNome(),
                    os.getProblemaOs().getCodigo(),
                    os.getDescricaoProblemaOS(),
                    os.getDataCadastroOS(),
                    os.getStatus()
                });
            }
            abertas.add(os);
        }
    }

//---------------------------------------------------------------------------------------------------------------------------------
    public void readComboBox_Cliente() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            ArrayList<Cliente> clientes = new ArrayList<>();
            ClienteDAO dao = new ClienteDAO();

            clientes = dao.read();

            for (Cliente cliente : clientes) {
                model.addElement(cliente.getNome());
            }
            jComboBoxClienteOS.setModel(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void setNameJText_Cliente() {
        try {
            ClienteDAO cli = new ClienteDAO();
            Cliente cliente = cli.read().get(jComboBoxClienteOS.getSelectedIndex());

            jText_cpf_clienteOs.setText(cliente.getCpf());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
//---------------------------------------------------------------------------------------------------------------------------------

    public void readComboBox_Funcionario() {

        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            ArrayList<Funcionario> funcionarios = new ArrayList<>();
            FuncionarioDAO dao = new FuncionarioDAO();

            funcionarios = dao.read();

            for (Funcionario funcionario : funcionarios) {
                model.addElement(funcionario.getNome());
            }

            jComboBoxFuncionarioOS.setModel(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void setNameJText_Funcionario() {
        try {
            FuncionarioDAO dao = new FuncionarioDAO();
            Funcionario funcionario = dao.read().get(jComboBoxFuncionarioOS.getSelectedIndex());

            jText_matricula_funcionarioOS.setText(Integer.toString(funcionario.getMatricula()));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
//---------------------------------------------------------------------------------------------------------------------------------     

    public void readComboBox_Problema() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            ArrayList<Problema> problemas = new ArrayList<>();
            ProblemaDAO dao = new ProblemaDAO();

            problemas = dao.read();

            for (Problema problema : problemas) {
                model.addElement(problema.getNome());
            }

            jComboBoxProblemaOS.setModel(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void setNameJText_Problema() {
        try {
            ProblemaDAO dao = new ProblemaDAO();
            Problema problema = dao.read().get(jComboBoxProblemaOS.getSelectedIndex());

            jText_cod_problemaOS.setText(Integer.toString(problema.getCodigo()));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
//---------------------------------------------------------------------------------------------------------------------------------     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_OS_alterando = new javax.swing.JTable();
        jText_numeroOS_alteracao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel_data = new javax.swing.JLabel();
        jRadioButton_Solucionar = new javax.swing.JRadioButton();
        jRadioButton_Cancelar = new javax.swing.JRadioButton();
        jLabel_descricao = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea_descricao_alteracao = new javax.swing.JTextArea();
        jButton_confirmar_alteracao = new javax.swing.JButton();
        jText_busca_os_alteracao = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser_alteracao = new com.toedter.calendar.JDateChooser();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel_cadastrarOs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_atualizar_os.setText("Atualizar");
        jButton_atualizar_os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_atualizar_osActionPerformed(evt);
            }
        });
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
        jPanel_cadastrarOs.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel6.setText("Matricula do Funcionario:");
        jPanel_cadastrarOs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 62, -1, -1));

        jLabel7.setText("Cpf do Cliente:");
        jPanel_cadastrarOs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 108, -1, -1));

        jText_numeroOS.setEditable(false);
        jPanel_cadastrarOs.add(jText_numeroOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 40, -1));

        jText_cod_problemaOS.setEditable(false);
        jPanel_cadastrarOs.add(jText_cod_problemaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 50, -1));

        jText_matricula_funcionarioOS.setEditable(false);
        jPanel_cadastrarOs.add(jText_matricula_funcionarioOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 50, -1));

        jText_cpf_clienteOs.setEditable(false);
        jPanel_cadastrarOs.add(jText_cpf_clienteOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 90, -1));

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
        jPanel_cadastrarOs.add(jDateChooser_data_cadastroOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 140, -1));

        jTabbedPane.addTab("Ordens de Serviços", jPanel_cadastrarOs);

        jTable_OS_alterando.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Os", "Matricula Func", "Cpf Cliente", "Cod Problema", "Desc Problema", "Cadastrado", "Status OS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_OS_alterando.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_OS_alterandoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_OS_alterando);

        jText_numeroOS_alteracao.setEditable(false);

        jLabel10.setText("Numero OS:");

        jLabel_data.setText("Data:");

        buttonGroup1.add(jRadioButton_Solucionar);
        jRadioButton_Solucionar.setText("Solucionar");
        jRadioButton_Solucionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_SolucionarActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_Cancelar);
        jRadioButton_Cancelar.setText("Cancelar");
        jRadioButton_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_CancelarActionPerformed(evt);
            }
        });

        jLabel_descricao.setText("Descrição ↓");

        jTextArea_descricao_alteracao.setColumns(20);
        jTextArea_descricao_alteracao.setRows(5);
        jScrollPane5.setViewportView(jTextArea_descricao_alteracao);

        jButton_confirmar_alteracao.setText("Confirmar");
        jButton_confirmar_alteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_confirmar_alteracaoActionPerformed(evt);
            }
        });

        jLabel11.setText("Buscar OS ↓");

        javax.swing.GroupLayout jPanel_cancelarOsLayout = new javax.swing.GroupLayout(jPanel_cancelarOs);
        jPanel_cancelarOs.setLayout(jPanel_cancelarOsLayout);
        jPanel_cancelarOsLayout.setHorizontalGroup(
            jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                        .addGroup(jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel10)
                                .addGap(12, 12, 12)
                                .addComponent(jText_numeroOS_alteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jRadioButton_Solucionar)
                                .addGap(5, 5, 5)
                                .addComponent(jRadioButton_Cancelar))
                            .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel_data)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser_alteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jLabel_descricao))
                            .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton_confirmar_alteracao)
                                .addGap(60, 60, 60)
                                .addGroup(jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel11))
                                    .addComponent(jText_busca_os_alteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_cancelarOsLayout.setVerticalGroup(
            jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_cancelarOsLayout.createSequentialGroup()
                        .addGroup(jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton_Solucionar)
                            .addComponent(jRadioButton_Cancelar)
                            .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_numeroOS_alteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel_data))
                    .addComponent(jDateChooser_alteracao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel_descricao)
                .addGap(10, 10, 10)
                .addGroup(jPanel_cancelarOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton_confirmar_alteracao))
                    .addGroup(jPanel_cancelarOsLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel11)
                        .addGap(7, 7, 7)
                        .addComponent(jText_busca_os_alteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

        //Confirmação de CADASTRO do OS↓
        int confirmacao = JOptionPane.showConfirmDialog(null, "Certeza que quer cadastrar essa Ordem?", "Confirmação", JOptionPane.YES_OPTION);

        //Caso confirmação seja SIM↓
        if (confirmacao == JOptionPane.YES_OPTION) {

            try {
                OrdemDeServico os = new OrdemDeServico();

                os.getFuncionarioOs().setMatricula(Integer.parseInt(jText_matricula_funcionarioOS.getText()));
                os.getClienteOs().setCpf(jText_cpf_clienteOs.getText());
                os.getProblemaOs().setCodigo(Integer.parseInt(jText_cod_problemaOS.getText()));
                os.setDataCadastroOS(new java.sql.Date(jDateChooser_data_cadastroOS.getDate().getTime()));
                os.setDescricaoProblemaOS(jTextArea_descricao_problemaOS.getText());

                new OrdemServicoController().create(os);

                readALL();

                //LIMPA OS CAMPOS DE TEXTO↓
                jText_numeroOS.setText("");
                jText_matricula_funcionarioOS.setText("");
                jText_cpf_clienteOs.setText("");
                jText_cod_problemaOS.setText("");
                jTextArea_descricao_problemaOS.setText("");
                jDateChooser_data_cadastroOS.setDate(null);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        //Caso confirmação seja NÃO ele simplesmente ignora ↑
    }//GEN-LAST:event_jButton_cadastrar_osActionPerformed

    private void jComboBoxFuncionarioOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFuncionarioOSActionPerformed
        setNameJText_Funcionario();
    }//GEN-LAST:event_jComboBoxFuncionarioOSActionPerformed

    private void jComboBoxClienteOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClienteOSActionPerformed
        setNameJText_Cliente();
    }//GEN-LAST:event_jComboBoxClienteOSActionPerformed

    private void jComboBoxProblemaOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProblemaOSActionPerformed
        setNameJText_Problema();
    }//GEN-LAST:event_jComboBoxProblemaOSActionPerformed

    private void jTable_OS_cadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_OS_cadastroMouseClicked
        setLineTable_cadastrando();
    }//GEN-LAST:event_jTable_OS_cadastroMouseClicked

    private void jTable_OS_alterandoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_OS_alterandoMouseClicked
        setLineTalbe_alterando();
    }//GEN-LAST:event_jTable_OS_alterandoMouseClicked

    private void jButton_atualizar_osActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_atualizar_osActionPerformed
        //Confirmação de ATUALIZAÇÃO do OS↓
        int confirmacao = JOptionPane.showConfirmDialog(null, "Certeza que quer Atualizar essa Ordem? ", "Confirmação", JOptionPane.YES_OPTION);

        //Caso confirmação seja SIM↓
        if (confirmacao == JOptionPane.YES_OPTION) {

            try {
                OrdemDeServico os = new OrdemDeServico();

                os.setNumeroOS(Integer.parseInt(jText_numeroOS.getText()));
                os.getFuncionarioOs().setMatricula(Integer.parseInt(jText_matricula_funcionarioOS.getText()));
                os.getClienteOs().setCpf(jText_cpf_clienteOs.getText());
                os.getProblemaOs().setCodigo(Integer.parseInt(jText_cod_problemaOS.getText()));
                os.setDataCadastroOS(new java.sql.Date(jDateChooser_data_cadastroOS.getDate().getTime()));
                os.setDescricaoProblemaOS(jTextArea_descricao_problemaOS.getText());

                new OrdemServicoController().update(os);

                readALL();

                //LIMPA OS CAMPOS DE TEXTO↓
                jText_numeroOS.setText("");
                jText_matricula_funcionarioOS.setText("");
                jText_cpf_clienteOs.setText("");
                jText_cod_problemaOS.setText("");
                jTextArea_descricao_problemaOS.setText("");
                jDateChooser_data_cadastroOS.setDate(null);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        //Caso confirmação seja NÃO ele simplesmente ignora ↑
    }//GEN-LAST:event_jButton_atualizar_osActionPerformed

    private void jRadioButton_SolucionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_SolucionarActionPerformed
        jTextArea_descricao_alteracao.setVisible(true);
        jButton_confirmar_alteracao.setEnabled(true);
        jDateChooser_alteracao.setEnabled(true);

        jLabel_data.setText("Data Solucionada:");
        jLabel_descricao.setText("Descrição do Serviço↓");
    }//GEN-LAST:event_jRadioButton_SolucionarActionPerformed

    private void jRadioButton_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_CancelarActionPerformed
        jTextArea_descricao_alteracao.setVisible(true);
        jButton_confirmar_alteracao.setEnabled(true);
        jDateChooser_alteracao.setEnabled(true);

        jLabel_data.setText("Data Cancelamento: ");
        jLabel_descricao.setText("Motivo do Cancelamento ↓");
    }//GEN-LAST:event_jRadioButton_CancelarActionPerformed

    private void jButton_confirmar_alteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_confirmar_alteracaoActionPerformed

        try {
            OrdemDeServico os = new OrdemDeServico();
            OrdemServicoController controll = new OrdemServicoController();

            if (jRadioButton_Solucionar.isSelected()) {
                os.setNumeroOS(Integer.parseInt(jText_numeroOS_alteracao.getText()));
                os.setDataSolucaoOS(new java.sql.Date(jDateChooser_alteracao.getDate().getTime()));
                os.setDescricaoServicoOS(jTextArea_descricao_alteracao.getText());
                controll.solucionar(os);
            }
            if (jRadioButton_Cancelar.isSelected()) {
                os.setNumeroOS(Integer.parseInt(jText_numeroOS_alteracao.getText()));
                os.setDataCancelamentoOS(new java.sql.Date(jDateChooser_alteracao.getDate().getTime()));
                os.setMotivoCancelamentoOS(jTextArea_descricao_alteracao.getText());
                controll.cancelar(os);
            }

            readALL();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_jButton_confirmar_alteracaoActionPerformed

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
            java.util.logging.Logger.getLogger(Gerenciador_ordens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerenciador_ordens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerenciador_ordens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerenciador_ordens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Gerenciador_ordens().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Gerenciador_ordens.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_atualizar_os;
    private javax.swing.JButton jButton_cadastrar_os;
    private javax.swing.JButton jButton_confirmar_alteracao;
    private javax.swing.JComboBox<Object> jComboBoxClienteOS;
    private javax.swing.JComboBox<Object> jComboBoxFuncionarioOS;
    private javax.swing.JComboBox<Object> jComboBoxProblemaOS;
    private com.toedter.calendar.JDateChooser jDateChooser_alteracao;
    private com.toedter.calendar.JDateChooser jDateChooser_data_cadastroOS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_data;
    private javax.swing.JLabel jLabel_descricao;
    private javax.swing.JPanel jPanel_cadastrarOs;
    private javax.swing.JPanel jPanel_cancelarOs;
    private javax.swing.JRadioButton jRadioButton_Cancelar;
    private javax.swing.JRadioButton jRadioButton_Solucionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable jTable_OS_alterando;
    private javax.swing.JTable jTable_OS_cadastro;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea_descricao_alteracao;
    private javax.swing.JTextArea jTextArea_descricao_problemaOS;
    private javax.swing.JTextField jText_busca_os_alteracao;
    private javax.swing.JTextField jText_cod_problemaOS;
    private javax.swing.JTextField jText_cpf_clienteOs;
    private javax.swing.JTextField jText_matricula_funcionarioOS;
    private javax.swing.JTextField jText_numeroOS;
    private javax.swing.JTextField jText_numeroOS_alteracao;
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
}
