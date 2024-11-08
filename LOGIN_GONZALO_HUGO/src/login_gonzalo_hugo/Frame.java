/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login_gonzalo_hugo;

import java.awt.Image;
import java.awt.Toolkit;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JDialog;

/**
 *
 * @author FP
 */
public class Frame extends javax.swing.JFrame {

    dialogo d1;

    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
        setTitle("Inicio de sesión en SQL");
    }

    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public void Crear(String usuario, String contrasena) {

        if (usuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String url = "jdbc:mysql://localhost:3306/login";
        String user = "root";
        String pass = "root";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DriverManager.getConnection(url, user, pass);
            String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, usuario);
            pstmt.setString(2, contrasena);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Usuario creado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al crear el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    public void Acceder(String usuario, String contrasena) {

        if (usuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String url = "jdbc:mysql://localhost:3306/login";
        String user = "root";
        String pass = "root";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, user, pass);

            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, usuario);
            pstmt.setString(2, contrasena);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Has entrado con el usuario y contraseña correctos, felicidades!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al acceder a la BBDD", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void Restablecer(String usuario, String contrasena) {

        if (usuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String url = "jdbc:mysql://localhost:3306/login";
        String user = "root";
        String pass = "root";

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DriverManager.getConnection(url, user, pass);

            String sqlCheck = "SELECT * FROM users WHERE username = ?";
            pstmt = conn.prepareStatement(sqlCheck);
            pstmt.setString(1, usuario);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String sqlUpdate = "UPDATE users SET password = ? WHERE username = ?";
                pstmt = conn.prepareStatement(sqlUpdate);
                pstmt.setString(1, contrasena);
                pstmt.setString(2, usuario);

                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Contraseña reestablecida exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al reestablecer la contraseña.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "El usuario no existe.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBanda = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelContenido = new javax.swing.JPanel();
        jLogin = new javax.swing.JLabel();
        jUsuario = new javax.swing.JLabel();
        jUsuarioField = new javax.swing.JTextField();
        jContrasena = new javax.swing.JLabel();
        jContrasenaField = new javax.swing.JPasswordField();
        jCrearUsuario = new javax.swing.JButton();
        jRestablecer = new javax.swing.JButton();
        jAccederUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión en SQL");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBanda.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelBandaLayout = new javax.swing.GroupLayout(jPanelBanda);
        jPanelBanda.setLayout(jPanelBandaLayout);
        jPanelBandaLayout.setHorizontalGroup(
            jPanelBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBandaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanelBandaLayout.setVerticalGroup(
            jPanelBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBandaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 630));

        jPanelContenido.setBackground(new java.awt.Color(204, 255, 255));

        jLogin.setBackground(new java.awt.Color(0, 153, 153));
        jLogin.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLogin.setText("LOGIN");
        jLogin.setOpaque(true);

        jUsuario.setBackground(new java.awt.Color(0, 153, 153));
        jUsuario.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jUsuario.setText("USUARIO");
        jUsuario.setAlignmentX(0.5F);
        jUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jUsuario.setOpaque(true);
        jUsuario.setPreferredSize(new java.awt.Dimension(70, 35));

        jUsuarioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuarioFieldActionPerformed(evt);
            }
        });

        jContrasena.setBackground(new java.awt.Color(0, 153, 153));
        jContrasena.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jContrasena.setText("CONTRASEÑA");
        jContrasena.setOpaque(true);
        jContrasena.setPreferredSize(new java.awt.Dimension(70, 35));

        jContrasenaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContrasenaFieldActionPerformed(evt);
            }
        });

        jCrearUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jCrearUsuario.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jCrearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jCrearUsuario.setText("CREAR USUARIO");
        jCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCrearUsuarioActionPerformed(evt);
            }
        });

        jRestablecer.setBackground(new java.awt.Color(0, 0, 0));
        jRestablecer.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jRestablecer.setForeground(new java.awt.Color(255, 255, 255));
        jRestablecer.setText("RESTABLECER CONTRASEÑA");
        jRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRestablecerActionPerformed(evt);
            }
        });

        jAccederUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jAccederUsuario.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jAccederUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jAccederUsuario.setText("ACCEDER USUARIO");
        jAccederUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAccederUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jUsuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jContrasenaField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jAccederUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 44, Short.MAX_VALUE))))
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jUsuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jContrasenaField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jAccederUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 390, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jContrasenaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContrasenaFieldActionPerformed
        jContrasenaField.setText("");
    }//GEN-LAST:event_jContrasenaFieldActionPerformed

    private void jCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCrearUsuarioActionPerformed
        d1 = new dialogo(this, true);
        d1.ponerNombre(jUsuarioField.getText().toString());
    }//GEN-LAST:event_jCrearUsuarioActionPerformed

    private void jAccederUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAccederUsuarioActionPerformed
        String usuario = jUsuarioField.getText().toString();
        Acceder(usuario, getMD5(new String(jContrasenaField.getPassword())));
    }//GEN-LAST:event_jAccederUsuarioActionPerformed

    private void jRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRestablecerActionPerformed
        String usuario = jUsuarioField.getText().toString();
        Restablecer(usuario, getMD5(new String(jContrasenaField.getPassword())));
    }//GEN-LAST:event_jRestablecerActionPerformed

    private void jUsuarioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuarioFieldActionPerformed
        jUsuarioField.setText("");
    }//GEN-LAST:event_jUsuarioFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAccederUsuario;
    private javax.swing.JLabel jContrasena;
    private javax.swing.JPasswordField jContrasenaField;
    private javax.swing.JButton jCrearUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLogin;
    private javax.swing.JPanel jPanelBanda;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JButton jRestablecer;
    private javax.swing.JLabel jUsuario;
    private javax.swing.JTextField jUsuarioField;
    // End of variables declaration//GEN-END:variables

}
