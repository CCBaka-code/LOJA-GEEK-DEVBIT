/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import javax.swing.JOptionPane; //Serve para exibir caixas de dialogo de mensagens
import java.sql.Connection; //Conectar ao Banco de dados
import java.sql.SQLException; //Para mostrar erros relacionados ao Banco de dados
import java.sql.PreparedStatement; //Para inserir os dados no banco de dados usando o comando SQL INSERT
import java.sql.DriverManager; //Para informar o nome do Banco de dados, a senha etc.
import java.sql.ResultSet;  //Guardar o que um comando SELECT retorna do banco de dados
/**
 *
 * @author guidi
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSenha = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblLogin = new javax.swing.JLabel();
        btnLogar = new javax.swing.JButton();
        btnCadastre = new javax.swing.JButton();
        lblNaoTemConta = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        lblImagem = new javax.swing.JLabel();

        setTitle("Login");
        getContentPane().setLayout(null);

        lblSenha.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(0, 255, 255));
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(60, 140, 80, 20);

        lblUsuario.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 255, 255));
        lblUsuario.setText("Usuario");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(60, 70, 70, 20);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(60, 90, 320, 40);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(60, 160, 320, 40);

        lblLogin.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(51, 255, 255));
        lblLogin.setText("Login");
        getContentPane().add(lblLogin);
        lblLogin.setBounds(180, 24, 60, 30);

        btnLogar.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnLogar.setForeground(new java.awt.Color(0, 255, 255));
        btnLogar.setText("Logar");
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogar);
        btnLogar.setBounds(80, 220, 270, 30);

        btnCadastre.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnCadastre.setForeground(new java.awt.Color(0, 255, 255));
        btnCadastre.setText("Cadastre-se");
        btnCadastre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastreActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastre);
        btnCadastre.setBounds(330, 290, 110, 30);

        lblNaoTemConta.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblNaoTemConta.setForeground(new java.awt.Color(255, 255, 255));
        lblNaoTemConta.setText("Ainda não tem conta?");
        getContentPane().add(lblNaoTemConta);
        lblNaoTemConta.setBounds(200, 290, 130, 30);

        jCheckBox1.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 255, 255));
        jCheckBox1.setText("Mostrar senha");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(60, 200, 110, 21);

        lblImagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\gabri\\Downloads\\Design sem nome (2).png")); // NOI18N
        getContentPane().add(lblImagem);
        lblImagem.setBounds(0, 0, 440, 320);

        setSize(new java.awt.Dimension(454, 357));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
            new telaPrincipal().setVisible(true); //Abre a tela Principal  
    }//GEN-LAST:event_btnLogarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnCadastreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastreActionPerformed
        new loginCadastro().setVisible(true); //Abre a tela de Cadastro
    }//GEN-LAST:event_btnCadastreActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastre;
    private javax.swing.JButton btnLogar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNaoTemConta;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
