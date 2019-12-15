package View;

import Controller.Views.LoginController;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TITLE = new javax.swing.JLabel();
        jLabel_X = new javax.swing.JLabel();
        btn_entrar = new javax.swing.JButton();
        jLabel_senha = new javax.swing.JLabel();
        jLabel_login1 = new javax.swing.JLabel();
        campo_login = new javax.swing.JTextField();
        campo_senha = new javax.swing.JPasswordField();
        painelLogin = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TITLE.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        TITLE.setForeground(new java.awt.Color(255, 255, 255));
        TITLE.setText("USUARIO");
        jPanel1.add(TITLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jLabel_X.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_X.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_X.setText("X");
        jLabel_X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_XMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_X, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 0, 30, 30));

        btn_entrar.setText("Entrar");
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        jLabel_senha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_senha.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_senha.setText("SENHA");
        jPanel1.add(jLabel_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, 30));

        jLabel_login1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_login1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_login1.setText("LOGIN");
        jPanel1.add(jLabel_login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        campo_login.setBackground(new java.awt.Color(255, 255, 255));
        campo_login.setForeground(new java.awt.Color(0, 0, 0));
        campo_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_loginKeyTyped(evt);
            }
        });
        jPanel1.add(campo_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 130, -1));

        campo_senha.setBackground(new java.awt.Color(255, 255, 255));
        campo_senha.setForeground(new java.awt.Color(0, 0, 0));
        campo_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_senhaActionPerformed(evt);
            }
        });
        jPanel1.add(campo_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 130, -1));

        painelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/painel-login.png"))); // NOI18N
        jPanel1.add(painelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 30, -1, -1));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/26733526_1586583374754288_1552726415392439726_n.jpg"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 319, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed

        LoginController controll = new LoginController();
        try {
            if (controll.checkLogin(campo_login.getText(), campo_senha.getText())) {
                new Home().setVisible(true);
                this.disable();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ou Senha Incorretos");
            }

        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btn_entrarActionPerformed

    private void jLabel_XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_XMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_XMouseClicked

    private void campo_loginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_loginKeyTyped
        //Não permite o uso de NUMEROS e SIMBOLOS ↓↓
        String caracteres = "0123456789/*-+,!@#$%¨&)(}{][^~´`;:><ºª§=¨¬£³²¹|_.";

        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_campo_loginKeyTyped

    private void campo_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_senhaActionPerformed
        btn_entrarActionPerformed(evt);
    }//GEN-LAST:event_campo_senhaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel TITLE;
    private javax.swing.JButton btn_entrar;
    private javax.swing.JTextField campo_login;
    private javax.swing.JPasswordField campo_senha;
    private javax.swing.JLabel jLabel_X;
    private javax.swing.JLabel jLabel_login1;
    private javax.swing.JLabel jLabel_senha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel painelLogin;
    // End of variables declaration//GEN-END:variables
}
