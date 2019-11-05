package View;

import Controller.ClienteController;
import Controller.FuncionarioController;
import Controller.HomeController;
import Controller.ProblemaController;
import Model.Cliente;
import Model.Funcionario;
import Model.Problema;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Home extends javax.swing.JFrame {

    private HomeController Controller;

    public Home() throws Exception {
        initComponents();
        
        //Modelo Tabela Cliente↓↓
        DefaultTableModel modelo = (DefaultTableModel) tableClientes.getModel();
        tableClientes.setRowSorter(new TableRowSorter(modelo));
        
        //Iniciar lendo a tableCliente↓
        Controller = new HomeController(this);
        Controller.readJTableCliente();
        
        //Iniciar setando a cor do botão cliente↓
        Controller.setLblColor(btn_cliente);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        btn_cliente = new javax.swing.JLabel();
        btn_funcionario = new javax.swing.JLabel();
        btn_problema = new javax.swing.JLabel();
        btn_ordemServico = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        homee = new javax.swing.JPanel();
        clientes = new javax.swing.JPanel();
        Lista_de_tabelas = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        jLabelNome = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelBusca = new javax.swing.JLabel();
        nome_campo_cli = new javax.swing.JTextField();
        rg_campo_cli = new javax.swing.JTextField();
        cpf_campo_cli = new javax.swing.JTextField();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        ClientesTitle = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        campo_busca_cli = new javax.swing.JTextField();
        jLabelRg1 = new javax.swing.JLabel();
        funcionarios = new javax.swing.JPanel();
        Lista_de_tabelas1 = new javax.swing.JScrollPane();
        tableFuncionario = new javax.swing.JTable();
        jLabel_nome_func = new javax.swing.JLabel();
        jLabel_rg_func = new javax.swing.JLabel();
        jLabel_cpf_func = new javax.swing.JLabel();
        nome_campo_func = new javax.swing.JTextField();
        rg_campo_func = new javax.swing.JTextField();
        cpf_campo_func = new javax.swing.JTextField();
        jButton_confirmar_cadastro_func = new javax.swing.JButton();
        jButton_atualizar_func = new javax.swing.JButton();
        ClientesTitle1 = new javax.swing.JLabel();
        jLabel_cpf_func1 = new javax.swing.JLabel();
        salario_campo_func = new javax.swing.JTextField();
        jLabel_cpf_func2 = new javax.swing.JLabel();
        matricula_campo_func = new javax.swing.JTextField();
        jButton_excluir_func = new javax.swing.JButton();
        jLabelBusca1 = new javax.swing.JLabel();
        campo_busca_func = new javax.swing.JTextField();
        btn_buscar1 = new javax.swing.JButton();
        problemas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        codigo_campo_prob = new javax.swing.JTextField();
        nome_campo_prob = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao_campo_prob = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProblema = new javax.swing.JTable();
        jButton_confirmar_cadastro_prob = new javax.swing.JButton();
        jButton_atualizar_prob = new javax.swing.JButton();
        jButton_excluir_prob = new javax.swing.JButton();
        campo_busca_prob = new javax.swing.JTextField();
        jLabelBusca2 = new javax.swing.JLabel();
        btn_buscar2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ordemDeServicos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableOrdemdeServico = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setUndecorated(true);

        header.setBackground(new java.awt.Color(255, 255, 255));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/bgCabeca.png"))); // NOI18N

        btn_cliente.setBackground(new java.awt.Color(255, 255, 255));
        btn_cliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/cliente32-icon.png"))); // NOI18N
        btn_cliente.setOpaque(true);
        btn_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clienteMouseClicked(evt);
            }
        });

        btn_funcionario.setBackground(new java.awt.Color(255, 255, 255));
        btn_funcionario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_funcionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/usuario32-icon.png"))); // NOI18N
        btn_funcionario.setOpaque(true);
        btn_funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_funcionarioMouseClicked(evt);
            }
        });

        btn_problema.setBackground(new java.awt.Color(255, 255, 255));
        btn_problema.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_problema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_problema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/agenda32-icon.png"))); // NOI18N
        btn_problema.setOpaque(true);
        btn_problema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_problemaMouseClicked(evt);
            }
        });

        btn_ordemServico.setBackground(new java.awt.Color(255, 255, 255));
        btn_ordemServico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_ordemServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ordemServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/relatorioTrabalho32-icon.png"))); // NOI18N
        btn_ordemServico.setOpaque(true);
        btn_ordemServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ordemServicoMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_cliente)
                .addGap(18, 18, 18)
                .addComponent(btn_funcionario)
                .addGap(18, 18, 18)
                .addComponent(btn_problema)
                .addGap(43, 43, 43)
                .addComponent(Logo)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btn_ordemServico)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap())))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_funcionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_problema, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ordemServico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(Logo)
                        .addGap(0, 6, Short.MAX_VALUE))))
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        homee.setBackground(new java.awt.Color(255, 255, 255));
        homee.setLayout(new java.awt.CardLayout());

        clientes.setBackground(new java.awt.Color(59, 63, 66));
        clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lista_de_tabelas.setBorder(null);

        tableClientes.setBackground(new java.awt.Color(59, 63, 66));
        tableClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tableClientes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableClientes.setForeground(new java.awt.Color(255, 255, 255));
        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "RG", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableClientes.setGridColor(new java.awt.Color(59, 63, 66));
        tableClientes.setRowHeight(20);
        tableClientes.setSelectionBackground(new java.awt.Color(59, 63, 66));
        tableClientes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientesMouseClicked(evt);
            }
        });
        tableClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableClientesKeyReleased(evt);
            }
        });
        Lista_de_tabelas.setViewportView(tableClientes);

        clientes.add(Lista_de_tabelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 0, 524, 250));

        jLabelNome.setBackground(new java.awt.Color(187, 187, 187));
        jLabelNome.setForeground(new java.awt.Color(187, 187, 189));
        jLabelNome.setText("Nome ↓");
        clientes.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabelCpf.setForeground(new java.awt.Color(187, 187, 186));
        jLabelCpf.setText("CPF ↓");
        clientes.add(jLabelCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabelBusca.setBackground(new java.awt.Color(187, 187, 188));
        jLabelBusca.setForeground(new java.awt.Color(187, 187, 189));
        jLabelBusca.setText("Busca ↓");
        clientes.add(jLabelBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, -1, -1));

        nome_campo_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_campo_cliActionPerformed(evt);
            }
        });
        nome_campo_cli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nome_campo_cliKeyTyped(evt);
            }
        });
        clientes.add(nome_campo_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 196, -1));

        rg_campo_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rg_campo_cliActionPerformed(evt);
            }
        });
        rg_campo_cli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rg_campo_cliKeyTyped(evt);
            }
        });
        clientes.add(rg_campo_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 120, -1));

        cpf_campo_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpf_campo_cliActionPerformed(evt);
            }
        });
        cpf_campo_cli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpf_campo_cliKeyTyped(evt);
            }
        });
        clientes.add(cpf_campo_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 120, -1));

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        clientes.add(jButtonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        clientes.add(jButtonAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 85, -1));

        ClientesTitle.setBackground(new java.awt.Color(187, 187, 187));
        ClientesTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ClientesTitle.setForeground(new java.awt.Color(187, 187, 199));
        ClientesTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ClientesTitle.setText("Clientes");
        clientes.add(ClientesTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 104, 55));

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        clientes.add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 79, -1));

        btn_buscar.setText("Pesquisar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        clientes.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, -1, -1));

        campo_busca_cli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_busca_cliKeyTyped(evt);
            }
        });
        clientes.add(campo_busca_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 120, -1));

        jLabelRg1.setBackground(new java.awt.Color(187, 187, 188));
        jLabelRg1.setForeground(new java.awt.Color(187, 187, 189));
        jLabelRg1.setText("RG ↓");
        clientes.add(jLabelRg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        homee.add(clientes, "card2");

        funcionarios.setBackground(new java.awt.Color(59, 63, 66));
        funcionarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableFuncionario.setBackground(new java.awt.Color(59, 63, 66));
        tableFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        tableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "RG", "CPF", "Salario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableFuncionario.setGridColor(new java.awt.Color(59, 63, 66));
        tableFuncionario.setRowHeight(20);
        tableFuncionario.setSelectionBackground(new java.awt.Color(59, 63, 66));
        tableFuncionario.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFuncionarioMouseClicked(evt);
            }
        });
        tableFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableFuncionarioKeyReleased(evt);
            }
        });
        Lista_de_tabelas1.setViewportView(tableFuncionario);

        funcionarios.add(Lista_de_tabelas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 0, 524, 250));

        jLabel_nome_func.setForeground(new java.awt.Color(187, 187, 186));
        jLabel_nome_func.setText("Nome");
        funcionarios.add(jLabel_nome_func, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel_rg_func.setForeground(new java.awt.Color(187, 187, 186));
        jLabel_rg_func.setText("RG");
        funcionarios.add(jLabel_rg_func, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel_cpf_func.setForeground(new java.awt.Color(187, 187, 186));
        jLabel_cpf_func.setText("CPF");
        funcionarios.add(jLabel_cpf_func, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        nome_campo_func.setForeground(new java.awt.Color(0, 0, 0));
        nome_campo_func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_campo_funcActionPerformed(evt);
            }
        });
        nome_campo_func.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nome_campo_funcKeyTyped(evt);
            }
        });
        funcionarios.add(nome_campo_func, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 170, -1));

        rg_campo_func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rg_campo_funcActionPerformed(evt);
            }
        });
        rg_campo_func.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rg_campo_funcKeyTyped(evt);
            }
        });
        funcionarios.add(rg_campo_func, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 110, -1));

        cpf_campo_func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpf_campo_funcActionPerformed(evt);
            }
        });
        cpf_campo_func.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpf_campo_funcKeyTyped(evt);
            }
        });
        funcionarios.add(cpf_campo_func, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 110, -1));

        jButton_confirmar_cadastro_func.setText("Confirmar");
        jButton_confirmar_cadastro_func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_confirmar_cadastro_funcActionPerformed(evt);
            }
        });
        funcionarios.add(jButton_confirmar_cadastro_func, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jButton_atualizar_func.setText("Atualizar");
        jButton_atualizar_func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_atualizar_funcActionPerformed(evt);
            }
        });
        funcionarios.add(jButton_atualizar_func, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 85, -1));

        ClientesTitle1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ClientesTitle1.setForeground(new java.awt.Color(187, 187, 186));
        ClientesTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ClientesTitle1.setText("Funcionarios");
        funcionarios.add(ClientesTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 58));

        jLabel_cpf_func1.setForeground(new java.awt.Color(187, 187, 186));
        jLabel_cpf_func1.setText("Salario");
        funcionarios.add(jLabel_cpf_func1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        salario_campo_func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salario_campo_funcActionPerformed(evt);
            }
        });
        salario_campo_func.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salario_campo_funcKeyTyped(evt);
            }
        });
        funcionarios.add(salario_campo_func, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 110, 20));

        jLabel_cpf_func2.setForeground(new java.awt.Color(187, 187, 186));
        jLabel_cpf_func2.setText("Matricula");
        funcionarios.add(jLabel_cpf_func2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        matricula_campo_func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matricula_campo_funcActionPerformed(evt);
            }
        });
        funcionarios.add(matricula_campo_func, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 40, -1));

        jButton_excluir_func.setText("Excluir");
        jButton_excluir_func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_excluir_funcActionPerformed(evt);
            }
        });
        funcionarios.add(jButton_excluir_func, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 79, -1));

        jLabelBusca1.setBackground(new java.awt.Color(187, 187, 188));
        jLabelBusca1.setForeground(new java.awt.Color(187, 187, 189));
        jLabelBusca1.setText("Busca ↓");
        funcionarios.add(jLabelBusca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, -1, -1));

        campo_busca_func.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_busca_funcKeyTyped(evt);
            }
        });
        funcionarios.add(campo_busca_func, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 120, -1));

        btn_buscar1.setText("Pesquisar");
        btn_buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar1ActionPerformed(evt);
            }
        });
        funcionarios.add(btn_buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, -1, -1));

        homee.add(funcionarios, "card3");

        problemas.setBackground(new java.awt.Color(59, 63, 66));
        problemas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(187, 187, 189));
        jLabel1.setText("Problemas");
        problemas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 130, 50));
        problemas.add(codigo_campo_prob, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 51, -1));

        nome_campo_prob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_campo_probActionPerformed(evt);
            }
        });
        nome_campo_prob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nome_campo_probKeyTyped(evt);
            }
        });
        problemas.add(nome_campo_prob, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 158, -1));

        jLabel2.setForeground(new java.awt.Color(187, 187, 189));
        jLabel2.setText("Nome");
        problemas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel3.setForeground(new java.awt.Color(187, 187, 189));
        jLabel3.setText("Descrição");
        problemas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        descricao_campo_prob.setColumns(20);
        descricao_campo_prob.setRows(5);
        jScrollPane1.setViewportView(descricao_campo_prob);

        problemas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 280, 150));

        tableProblema.setBackground(new java.awt.Color(59, 63, 66));
        tableProblema.setForeground(new java.awt.Color(255, 255, 255));
        tableProblema.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", ""},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableProblema.setGridColor(new java.awt.Color(59, 63, 66));
        tableProblema.setSelectionBackground(new java.awt.Color(59, 63, 66));
        tableProblema.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableProblema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProblemaMouseClicked(evt);
            }
        });
        tableProblema.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableProblemaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tableProblema);

        problemas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 556, 250));

        jButton_confirmar_cadastro_prob.setBackground(new java.awt.Color(59, 63, 66));
        jButton_confirmar_cadastro_prob.setForeground(new java.awt.Color(0, 0, 0));
        jButton_confirmar_cadastro_prob.setText("Confirmar");
        jButton_confirmar_cadastro_prob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_confirmar_cadastro_probActionPerformed(evt);
            }
        });
        problemas.add(jButton_confirmar_cadastro_prob, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jButton_atualizar_prob.setBackground(new java.awt.Color(59, 63, 66));
        jButton_atualizar_prob.setForeground(new java.awt.Color(0, 0, 0));
        jButton_atualizar_prob.setText("Atualizar");
        jButton_atualizar_prob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_atualizar_probActionPerformed(evt);
            }
        });
        problemas.add(jButton_atualizar_prob, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        jButton_excluir_prob.setBackground(new java.awt.Color(59, 63, 66));
        jButton_excluir_prob.setForeground(new java.awt.Color(0, 0, 0));
        jButton_excluir_prob.setText("Excluir");
        jButton_excluir_prob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_excluir_probActionPerformed(evt);
            }
        });
        problemas.add(jButton_excluir_prob, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        campo_busca_prob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_busca_probKeyTyped(evt);
            }
        });
        problemas.add(campo_busca_prob, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 120, -1));

        jLabelBusca2.setBackground(new java.awt.Color(187, 187, 188));
        jLabelBusca2.setForeground(new java.awt.Color(187, 187, 189));
        jLabelBusca2.setText("Busca ↓");
        problemas.add(jLabelBusca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, -1, -1));

        btn_buscar2.setText("Pesquisar");
        btn_buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar2ActionPerformed(evt);
            }
        });
        problemas.add(btn_buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, -1, -1));

        jLabel5.setForeground(new java.awt.Color(187, 187, 189));
        jLabel5.setText("Codigo");
        problemas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        homee.add(problemas, "card4");

        ordemDeServicos.setBackground(new java.awt.Color(59, 63, 66));

        tableOrdemdeServico.setBackground(new java.awt.Color(59, 63, 66));
        tableOrdemdeServico.setForeground(new java.awt.Color(255, 255, 255));
        tableOrdemdeServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero", "Drescrição Serviço", "Cod Problema", "Drescrição Problema", "Data Cadastro", "Data Cancelamento", "Motivo Cancelamento", "Cod Funcionario", "Cpf Cliente"
            }
        ));
        tableOrdemdeServico.setGridColor(new java.awt.Color(59, 63, 66));
        tableOrdemdeServico.setSelectionBackground(new java.awt.Color(59, 63, 66));
        tableOrdemdeServico.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tableOrdemdeServico);

        jButton2.setText("Cadastrar OS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ordemDeServicosLayout = new javax.swing.GroupLayout(ordemDeServicos);
        ordemDeServicos.setLayout(ordemDeServicosLayout);
        ordemDeServicosLayout.setHorizontalGroup(
            ordemDeServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
            .addGroup(ordemDeServicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ordemDeServicosLayout.setVerticalGroup(
            ordemDeServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordemDeServicosLayout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
        );

        homee.add(ordemDeServicos, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clienteMouseClicked

        //Tornar a camada CLIENTE visivel↓
            clientes.setVisible(true);
            funcionarios.setVisible(false);
            problemas.setVisible(false);
            ordemDeServicos.setVisible(false);
       
        //Seta a cor nos BOTÕES↓
            Controller.setLblColor(btn_cliente);
            Controller.resetLblColor(btn_funcionario);
            Controller.resetLblColor(btn_problema);
            Controller.resetLblColor(btn_ordemServico);
        

    }//GEN-LAST:event_btn_clienteMouseClicked

    private void btn_funcionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_funcionarioMouseClicked
        try {
            //Tornar a camada FUNCIONARIO visivel↓
                clientes.setVisible(false);
                funcionarios.setVisible(true);
                problemas.setVisible(false);
                ordemDeServicos.setVisible(false);
        
            //Seta a cor nos BOTÕES↓
                Controller.setLblColor(btn_funcionario);
                Controller.resetLblColor(btn_cliente);
                Controller.resetLblColor(btn_problema);
                Controller.resetLblColor(btn_ordemServico);
                
            //Atualiza a tabela FUNCIONARIO↓
                Controller.readJTableFuncionario();

        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_funcionarioMouseClicked

    private void btn_problemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_problemaMouseClicked
        try {
           
            //Quebra a linha da TextArea↓
                descricao_campo_prob.setLineWrap(true);
        
            //Tornar a camada PROBLEMA visivel↓
                clientes.setVisible(false);
                funcionarios.setVisible(false);
                problemas.setVisible(true);
                ordemDeServicos.setVisible(false);
         
            //Seta a cor nos BOTÕES↓
                Controller.setLblColor(btn_problema);
                Controller.resetLblColor(btn_cliente);
                Controller.resetLblColor(btn_funcionario);
                Controller.resetLblColor(btn_ordemServico);
        
            //Atualiza a tabela PROBLEMA↓
            Controller.readJTableProblema();
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_problemaMouseClicked

    private void btn_ordemServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ordemServicoMouseClicked
          
            //Tornar a camada ORDEM DE SERVIÇO visivel↓
                clientes.setVisible(false);
                funcionarios.setVisible(false);
                problemas.setVisible(false);
                ordemDeServicos.setVisible(true);
           
            //Seta a cor nos BOTÕES↓
                Controller.setLblColor(btn_ordemServico);
                Controller.resetLblColor(btn_cliente);
                Controller.resetLblColor(btn_funcionario);
                Controller.resetLblColor(btn_problema);
         

    }//GEN-LAST:event_btn_ordemServicoMouseClicked

    private void cpf_campo_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpf_campo_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpf_campo_cliActionPerformed

    private void nome_campo_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_campo_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_campo_cliActionPerformed

    private void rg_campo_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rg_campo_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rg_campo_cliActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
            //BOTÃO DE CONFIRMAR CADASTRO DO CLIENTE↓↓
//----------------------------------------------------------------------------------\\

        try {
            //Passa os dados do CLIENTE para o CONTROLLADOR↓
                Cliente cliente = new Cliente();
                ClienteController cliController = new ClienteController();

                cliente.setNome(nome_campo_cli.getText());
                cliente.setRg(rg_campo_cli.getText());
                cliente.setCpf(cpf_campo_cli.getText());
                cliController.create(cliente);

            //LIMPA OS CAMPOS APOS O CADASTRO↓
                campo_busca_cli.setText("");
                nome_campo_cli.setText("");
                rg_campo_cli.setText("");
                cpf_campo_cli.setText("");

            //Atualizar a tabela CLIENTE↓
                Controller.readJTableCliente();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
            //BOTÃO DE ATUALIZAR O CLIENTE CADASTRADO↓
//----------------------------------------------------------------------------------\\

            //IF usado para verificar que linha da tabela estou clicando↓
        if (tableClientes.getSelectedRow() != -1) {
            try {
            
            //Passa os dados ATUALIZADOS do CLIENTE para o CONTROLLADOR↓
                Cliente cliente = new Cliente();
                ClienteController cliController = new ClienteController();

                cliente.setNome(nome_campo_cli.getText());
                cliente.setRg(rg_campo_cli.getText());
                cliente.setCpf(cpf_campo_cli.getText());
                cliente.setCpf(tableClientes.getValueAt(tableClientes.getSelectedRow(), 2).toString());
                cliController.update(cliente);

            //LIMPA OS CAMPOS APOS O UPDATE↓
                campo_busca_cli.setText("");
                nome_campo_cli.setText("");
                rg_campo_cli.setText("");
                cpf_campo_cli.setText("");
                
            //Atualizar a tabela CLIENTE↓
                Controller.readJTableCliente();

            } catch (Exception ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para alterar");
        }

    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void nome_campo_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_campo_funcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_campo_funcActionPerformed

    private void rg_campo_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rg_campo_funcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rg_campo_funcActionPerformed

    private void cpf_campo_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpf_campo_funcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpf_campo_funcActionPerformed

    private void jButton_confirmar_cadastro_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_confirmar_cadastro_funcActionPerformed

            //BOTÃO DE CONFIRMAR CADASTRO DO FUNCIONARIO↓↓
//----------------------------------------------------------------------------------\\        
        try {
            //Passa os dados do FUNCIONARIO para o CONTROLLADOR↓
                Funcionario funcionario = new Funcionario();
                FuncionarioController funController = new FuncionarioController();

                funcionario.setMatricula(Integer.parseInt(matricula_campo_func.getText()));
                funcionario.setNome(nome_campo_func.getText());
                funcionario.setRg(rg_campo_func.getText());
                funcionario.setCpf(cpf_campo_func.getText());
                funcionario.setSalario(Float.parseFloat(salario_campo_func.getText()));
                funController.create(funcionario);

            //LIMPA OS CAMPOS APOS O CADASTRO↓
                campo_busca_func.setText("");
                matricula_campo_func.setText("");
                nome_campo_func.setText("");
                rg_campo_func.setText("");
                cpf_campo_func.setText("");
                salario_campo_func.setText("");

            //Atualizar a tabela FUNCIONARIO↓
                Controller.readJTableFuncionario();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar o funcionario" + ex);
        }

    }//GEN-LAST:event_jButton_confirmar_cadastro_funcActionPerformed

    private void jButton_atualizar_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_atualizar_funcActionPerformed
            //BOTÃO DE ATUALIZAR O FUNCIONARIO CADASTRADO↓↓
//----------------------------------------------------------------------------------\\

            //IF usado para verificar que linha da tabela estou clicando↓
        if (tableFuncionario.getSelectedRow() != -1) {
            try {
            //Passa os dados do FUNCIONARIO para o CONTROLLADOR↓
                Funcionario funcionario = new Funcionario();
                FuncionarioController funController = new FuncionarioController();

                funcionario.setMatricula(Integer.parseInt(matricula_campo_func.getText()));
                funcionario.setNome(nome_campo_func.getText());
                funcionario.setRg(rg_campo_func.getText());
                funcionario.setCpf(cpf_campo_func.getText());
                funcionario.setSalario(Float.parseFloat(salario_campo_func.getText()));
                funcionario.setMatricula((int) tableFuncionario.getValueAt(tableFuncionario.getSelectedRow(), 0));
                funController.update(funcionario);
                
            //LIMPA OS CAMPOS APOS O UPDATE↓
                campo_busca_func.setText("");
                matricula_campo_func.setText("");
                nome_campo_func.setText("");
                rg_campo_func.setText("");
                cpf_campo_func.setText("");
                salario_campo_func.setText("");
                
            //Atualizar a tabela FUNCIONARIO↓
                Controller.readJTableFuncionario();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Algo de errado não está certo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para alterar");
        }
    }//GEN-LAST:event_jButton_atualizar_funcActionPerformed

    private void salario_campo_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salario_campo_funcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salario_campo_funcActionPerformed

    private void matricula_campo_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matricula_campo_funcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matricula_campo_funcActionPerformed

    private void nome_campo_probActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_campo_probActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_campo_probActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Abre o JFrame de CADASTRO OS↓
        CadastroOS cadastroOs = new CadastroOS();
        cadastroOs.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tableClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableClientesKeyReleased
        try {
        //↑↑Faz com que eu consiga jogar os dados da TABELA para os campos usando as SETAS DO TECLADO
           Controller.readLineTableCliente();
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tableClientesKeyReleased

    private void tableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientesMouseClicked
        try {
        //↑↑Faz com que eu consiga jogar os dados da TABELA para os campos usando o CLICK DO MOUSE
           Controller.readLineTableCliente();
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_tableClientesMouseClicked

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
            //BOTÃO DE EXCLUIR OS DADOS DO CLIENTE↓↓
//----------------------------------------------------------------------------------\\
            //IF usado para verificar que linha da tabela estou clicando↓
        if (tableClientes.getSelectedRow() != -1) {
            try {
            //Remove os dados do CLIENTE↓
                Cliente cliente = new Cliente();
                ClienteController cliController = new ClienteController();

                cliente.setCpf(tableClientes.getValueAt(tableClientes.getSelectedRow(), 2).toString());
                cliController.delete(cliente);

            //LIMPA OS CAMPOS APOS O CADASTRO↓
                campo_busca_cli.setText("");
                nome_campo_cli.setText("");
                rg_campo_cli.setText("");
                cpf_campo_cli.setText("");

            //Atualizar a tabela CLIENTE↓
                Controller.readJTableCliente();
                
            } catch (Exception ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir");
        }

    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void tableFuncionarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableFuncionarioKeyReleased
        //↑↑Faz com que eu consiga jogar os dados da TABELA para os campos usando as SETAS DO TECLADO 
        try {

            Controller.readLineTableFuncionario();

        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tableFuncionarioKeyReleased

    private void tableFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFuncionarioMouseClicked
        //↑↑Faz com que eu consiga jogar os dados da TABELA para os campos usando o CLICK DO MOUSE
        try {

            Controller.readLineTableFuncionario();

        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tableFuncionarioMouseClicked

    private void jButton_excluir_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_excluir_funcActionPerformed
            //BOTÃO DE EXCLUIR OS DADOS DO FUNCIONARIO↓↓
//----------------------------------------------------------------------------------\\
            //IF usado para verificar que linha da tabela estou clicando↓
        if (tableFuncionario.getSelectedRow() != -1) {

            //Remove os dados do CLIENTE↓
            Funcionario funcionario = new Funcionario();
            FuncionarioController funController = new FuncionarioController();

            funcionario.setMatricula((int) tableFuncionario.getValueAt(tableFuncionario.getSelectedRow(), 0));

            try {
                funController.delete(funcionario);

            } catch (Exception ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }

           //LIMPA OS CAMPOS APOS O CADASTRO↓
            campo_busca_func.setText("");
            matricula_campo_func.setText("");
            nome_campo_func.setText("");
            rg_campo_func.setText("");
            cpf_campo_func.setText("");
            salario_campo_func.setText("");
            
            try {   
            //Atualizar a tabela FUNCIONARIO↓
                Controller.readJTableFuncionario();

            } catch (Exception ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir");
        }


    }//GEN-LAST:event_jButton_excluir_funcActionPerformed

    private void tableProblemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProblemaMouseClicked
  //↑↑Faz com que eu consiga jogar os dados da TABELA para os campos usando o CLICK DO MOUSE
        try {
            Controller.readLineTableProblema();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO NO USO DO CONTROLLER" + ex);
        }
    }//GEN-LAST:event_tableProblemaMouseClicked

    private void tableProblemaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableProblemaKeyReleased
   //↑↑Faz com que eu consiga jogar os dados da TABELA para os campos usando as SETAS DO TECLADO     
        try {
            Controller.readLineTableProblema();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO NO USO DO CONTROLLER" + ex);
        }
    }//GEN-LAST:event_tableProblemaKeyReleased

    private void jButton_confirmar_cadastro_probActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_confirmar_cadastro_probActionPerformed
            //BOTÃO DE CONFIRMAR CADASTRO DO PROBLEMA↓↓
//----------------------------------------------------------------------------------\\
        try {
            //Passa os dados do PROBLEMA para o CONTROLLADOR↓
            Problema problema = new Problema();
            ProblemaController probController = new ProblemaController();

            problema.setCodigo(Integer.parseInt(codigo_campo_prob.getText()));
            problema.setNome(nome_campo_prob.getText());
            problema.setDescricao(descricao_campo_prob.getText());
            probController.create(problema);

            //LIMPA OS CAMPOS APOS O CADASTRO↓
            campo_busca_prob.setText("");
            codigo_campo_prob.setText("");
            nome_campo_prob.setText("");
            descricao_campo_prob.setText("");

            //Atualizar a tabela PROBLEMA↓
            Controller.readJTableProblema();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar" + ex);
        }


    }//GEN-LAST:event_jButton_confirmar_cadastro_probActionPerformed

    private void nome_campo_cliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nome_campo_cliKeyTyped
        //Não permite o uso de NUMEROS e SIMBOLOS ↓↓
       String caracteres = "0123456789/*-+,!@#$%¨&)(}{][^~´`;:><ºª§=¨¬£³²¹|_.";

        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_nome_campo_cliKeyTyped

    private void rg_campo_cliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rg_campo_cliKeyTyped
        //Não permite o uso de LETRAS e SIMBOLOS ↓↓
        String caracteres = "0123456789";

        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_rg_campo_cliKeyTyped

    private void cpf_campo_cliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpf_campo_cliKeyTyped
        //Não permite o uso de LETRAS e SIMBOLOS ↓↓
        String caracteres = "0123456789";

        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_cpf_campo_cliKeyTyped

    private void nome_campo_funcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nome_campo_funcKeyTyped
         //Não permite o uso de NUMEROS e SIMBOLOS ↓↓
        String caracteres = "0123456789/*-+,!@#$%¨&)(}{][^~´`;:><ºª§=¨¬£³²¹|_.";

        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_nome_campo_funcKeyTyped

    private void rg_campo_funcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rg_campo_funcKeyTyped
         //Não permite o uso de LETRAS e SIMBOLOS ↓↓
        String caracteres = "0123456789";

        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_rg_campo_funcKeyTyped

    private void cpf_campo_funcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpf_campo_funcKeyTyped
        //Não permite o uso de LETRAS e SIMBOLOS ↓↓
        String caracteres = "0123456789";

        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_cpf_campo_funcKeyTyped

    private void salario_campo_funcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salario_campo_funcKeyTyped
        //Não permite o uso de LETRAS e SIMBOLOS ↓↓
        String caracteres = "0123456789";

        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_salario_campo_funcKeyTyped

    private void jButton_atualizar_probActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_atualizar_probActionPerformed
         //BOTÃO DE ATUALIZAR O PROBLEMA CADASTRADO↓
//----------------------------------------------------------------------------------\\
            //IF usado para verificar que linha da tabela estou clicando↓
        if (tableProblema.getSelectedRow() != -1) {

            try {
              //Passa os dados ATUALIZADOS do PROBLEMA para o CONTROLLADOR↓
                Problema problema = new Problema();
                ProblemaController probController = new ProblemaController();

                problema.setCodigo(Integer.parseInt(codigo_campo_prob.getText()));
                problema.setNome(nome_campo_prob.getText());
                problema.setDescricao(descricao_campo_prob.getText());
                probController.update(problema);
                
             //LIMPA OS CAMPOS↓
                campo_busca_prob.setText("");
                codigo_campo_prob.setText("");
                nome_campo_prob.setText("");
                descricao_campo_prob.setText("");

                //Atualizar a tabela PROBLEMA↓
                Controller.readJTableProblema();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar" + ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir");
        }
    }//GEN-LAST:event_jButton_atualizar_probActionPerformed

    private void jButton_excluir_probActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_excluir_probActionPerformed
            //BOTÃO DE EXCLUIR OS DADOS DO PROBLEMA↓↓
//----------------------------------------------------------------------------------\\
            //IF usado para verificar que linha da tabela estou clicando↓
        if (tableProblema.getSelectedRow() != -1) {
            try {
                //REMOVE OS DADDOS DO PROBLEMA↓↓
                Problema problema = new Problema();
                ProblemaController probController = new ProblemaController();

                problema.setCodigo((int) tableProblema.getValueAt(tableProblema.getSelectedRow(), 0));
                probController.delete(problema);

                //LIMPA OS CAMPOS↓
                campo_busca_prob.setText("");
                codigo_campo_prob.setText("");
                nome_campo_prob.setText("");
                descricao_campo_prob.setText("");

                //Atualizar a tabela PROBLEMA↓
                Controller.readJTableProblema();

            } catch (Exception ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir");
        }
    }//GEN-LAST:event_jButton_excluir_probActionPerformed

    private void nome_campo_probKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nome_campo_probKeyTyped
        //Não permite o uso de NUMEROS e SIMBOLOS ↓↓
        String caracteres = "0123456789/*-+,!@#$%¨&)(}{][^~´`;:><ºª§=¨¬£³²¹|_.";

        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_nome_campo_probKeyTyped

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        //X usado para fechar a aplicação
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        //Busca o CLIENTE isoladamente atraves do CPF↓↓
        try {
            Controller.readJTableClienteForCPF(campo_busca_cli.getText());
            
                //LIMPA OS CAMPOS↓
                campo_busca_cli.setText("");
                nome_campo_cli.setText("");
                rg_campo_cli.setText("");
                cpf_campo_cli.setText("");
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void campo_busca_cliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_busca_cliKeyTyped
         //Não permite o uso de LETRAS e SIMBOLOS ↓↓
        String caracteres = "0123456789";

        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_campo_busca_cliKeyTyped

    private void campo_busca_funcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_busca_funcKeyTyped
          //Não permite o uso de LETRAS e SIMBOLOS ↓↓
        String caracteres = "0123456789";

        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_campo_busca_funcKeyTyped

    private void btn_buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar1ActionPerformed
        //Busca o FUNCIONARIO isoladamente atraves da MATRICULA↓↓
        try {
            Controller.readJTableFuncionarioForMatricula(campo_busca_func.getText());
            
//LIMPA OS CAMPOS APOS O CADASTRO↓
            campo_busca_func.setText("");
            matricula_campo_func.setText("");
            nome_campo_func.setText("");
            rg_campo_func.setText("");
            cpf_campo_func.setText("");
            salario_campo_func.setText("");
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_buscar1ActionPerformed

    private void campo_busca_probKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_busca_probKeyTyped
        //Não permite o uso de LETRAS e SIMBOLOS ↓↓
        String caracteres = "0123456789";

        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_campo_busca_probKeyTyped

    private void btn_buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar2ActionPerformed
          //Busca o PROBLEMA isoladamente atraves do CODIGO↓↓
        try {
            Controller.readJTableProblemaForCodigo(campo_busca_prob.getText());
            
//LIMPA OS CAMPOS APOS O CADASTRO↓
            campo_busca_prob.setText("");
            codigo_campo_prob.setText("");
            nome_campo_prob.setText("");
            descricao_campo_prob.setText("");
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_buscar2ActionPerformed
//------------------------------------------------------------

//------------------------------------------------------------
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Home().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClientesTitle;
    private javax.swing.JLabel ClientesTitle1;
    private javax.swing.JScrollPane Lista_de_tabelas;
    private javax.swing.JScrollPane Lista_de_tabelas1;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_buscar1;
    private javax.swing.JButton btn_buscar2;
    private javax.swing.JLabel btn_cliente;
    private javax.swing.JLabel btn_funcionario;
    private javax.swing.JLabel btn_ordemServico;
    private javax.swing.JLabel btn_problema;
    private javax.swing.JTextField campo_busca_cli;
    private javax.swing.JTextField campo_busca_func;
    private javax.swing.JTextField campo_busca_prob;
    private javax.swing.JPanel clientes;
    private javax.swing.JTextField codigo_campo_prob;
    private javax.swing.JTextField cpf_campo_cli;
    private javax.swing.JTextField cpf_campo_func;
    private javax.swing.JTextArea descricao_campo_prob;
    private javax.swing.JPanel funcionarios;
    private javax.swing.JPanel header;
    private javax.swing.JPanel homee;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButton_atualizar_func;
    private javax.swing.JButton jButton_atualizar_prob;
    private javax.swing.JButton jButton_confirmar_cadastro_func;
    private javax.swing.JButton jButton_confirmar_cadastro_prob;
    private javax.swing.JButton jButton_excluir_func;
    private javax.swing.JButton jButton_excluir_prob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelBusca;
    private javax.swing.JLabel jLabelBusca1;
    private javax.swing.JLabel jLabelBusca2;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRg1;
    private javax.swing.JLabel jLabel_cpf_func;
    private javax.swing.JLabel jLabel_cpf_func1;
    private javax.swing.JLabel jLabel_cpf_func2;
    private javax.swing.JLabel jLabel_nome_func;
    private javax.swing.JLabel jLabel_rg_func;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField matricula_campo_func;
    private javax.swing.JTextField nome_campo_cli;
    private javax.swing.JTextField nome_campo_func;
    private javax.swing.JTextField nome_campo_prob;
    private javax.swing.JPanel ordemDeServicos;
    private javax.swing.JPanel problemas;
    private javax.swing.JTextField rg_campo_cli;
    private javax.swing.JTextField rg_campo_func;
    private javax.swing.JTextField salario_campo_func;
    private javax.swing.JTable tableClientes;
    private javax.swing.JTable tableFuncionario;
    private javax.swing.JTable tableOrdemdeServico;
    private javax.swing.JTable tableProblema;
    // End of variables declaration//GEN-END:variables

    // ---------------------------------------------------------------------------
    //Getter e Setter BOTOES↓
    public JLabel getBtn_cliente() {
        return btn_cliente;
    }

    public void setBtn_cliente(JLabel btn_cliente) {
        this.btn_cliente = btn_cliente;
    }

    public JLabel getBtn_funcionario() {
        return btn_funcionario;
    }

    public void setBtn_funcionario(JLabel btn_funcionario) {
        this.btn_funcionario = btn_funcionario;
    }

    public JLabel getBtn_ordemServico() {
        return btn_ordemServico;
    }

    public void setBtn_ordemServico(JLabel btn_ordemServico) {
        this.btn_ordemServico = btn_ordemServico;
    }

    public JLabel getBtn_problema() {
        return btn_problema;
    }

    public void setBtn_problema(JLabel btn_problema) {
        this.btn_problema = btn_problema;
    }

//------------------------------------------------------------------------
    //Getter e Setter TABELAS↓
    public JTable getTableClientes() {
        return tableClientes;
    }

    public void setTableClientes(JTable tableClientes) {
        this.tableClientes = tableClientes;
    }

    public JTable getTableFuncionario() {
        return tableFuncionario;
    }

    public void setTableFuncionario(JTable tableFuncionario) {
        this.tableFuncionario = tableFuncionario;
    }

    public JTable getTableProblema() {
        return tableProblema;
    }

    public void setTableProblema(JTable tableProblema) {
        this.tableProblema = tableProblema;
    }

    public JTable getTableOrdemdeServico() {
        return tableOrdemdeServico;
    }

    public void setTableOrdemdeServico(JTable tableOrdemdeServico) {
        this.tableOrdemdeServico = tableOrdemdeServico;
    }

    // ---------------------------------------------------------------------------
    //Getter e Setter PANEL↓
    public JPanel getClientes() {
        return clientes;
    }

    public void setClientes(JPanel clientes) {
        this.clientes = clientes;
    }

    public JPanel getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(JPanel funcionarios) {
        this.funcionarios = funcionarios;
    }

    public JPanel getProblemas() {
        return problemas;
    }

    public void setProblemas(JPanel problemas) {
        this.problemas = problemas;
    }

    public JPanel getOrdemDeServicos() {
        return ordemDeServicos;
    }

    public void setOrdemDeServicos(JPanel ordemDeServicos) {
        this.ordemDeServicos = ordemDeServicos;
    }
//-------------------------------------------------------------------

    //Getter e Setter CAMPOS↓
    public JTextField getCodigo_campo_prob() {
        return codigo_campo_prob;
    }

    public void setCodigo_campo_prob(JTextField codigo_campo_prob) {
        this.codigo_campo_prob = codigo_campo_prob;
    }

    public JTextField getCpf_campo_cli() {
        return cpf_campo_cli;
    }

    public void setCpf_campo_cli(JTextField cpf_campo_cli) {
        this.cpf_campo_cli = cpf_campo_cli;
    }

    public JTextField getCpf_campo_func() {
        return cpf_campo_func;
    }

    public void setCpf_campo_func(JTextField cpf_campo_func) {
        this.cpf_campo_func = cpf_campo_func;
    }

    public JTextArea getDescricao_campo_prob() {
        return descricao_campo_prob;
    }

    public void setDescricao_campo_prob(JTextArea descricao_campo_prob) {
        this.descricao_campo_prob = descricao_campo_prob;
    }

    public JTextField getMatricula_campo_func() {
        return matricula_campo_func;
    }

    public void setMatricula_campo_func(JTextField matricula_campo_func) {
        this.matricula_campo_func = matricula_campo_func;
    }

    public JTextField getNome_campo_cli() {
        return nome_campo_cli;
    }

    public void setNome_campo_cli(JTextField nome_campo_cli) {
        this.nome_campo_cli = nome_campo_cli;
    }

    public JTextField getNome_campo_func() {
        return nome_campo_func;
    }

    public void setNome_campo_func(JTextField nome_campo_func) {
        this.nome_campo_func = nome_campo_func;
    }

    public JTextField getNome_campo_prob() {
        return nome_campo_prob;
    }

    public void setNome_campo_prob(JTextField nome_campo_prob) {
        this.nome_campo_prob = nome_campo_prob;
    }

    public JTextField getRg_campo_cli() {
        return rg_campo_cli;
    }

    public void setRg_campo_cli(JTextField rg_campo_cli) {
        this.rg_campo_cli = rg_campo_cli;
    }

    public JTextField getRg_campo_func() {
        return rg_campo_func;
    }

    public void setRg_campo_func(JTextField rg_campo_func) {
        this.rg_campo_func = rg_campo_func;
    }

    public JTextField getSalario_campo_func() {
        return salario_campo_func;
    }

    public void setSalario_campo_func(JTextField salario_campo_func) {
        this.salario_campo_func = salario_campo_func;
    }

}
