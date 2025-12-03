/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import bd.DAOMascota;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Mascota;

/**
 *
 * @author Laboratorio
 */
public class Menu extends javax.swing.JFrame {

    private GestorMain gestor;

    DAOMascota daoMascota;

    



    //primer inicio
    public Menu() {
        
        
        
        
        try {
            this.daoMascota = new DAOMascota();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        this.gestor = new GestorMain();
        
            try {
        ArrayList<Mascota> mascotasBD = new ArrayList<>(daoMascota.getMascotas("")); 
        for (Mascota m : mascotasBD) {
            gestor.agregarMascotas(m);
        }
    } catch (SQLException ex) {
        System.out.println("Error al cargar mascotas: " + ex.getMessage());
    }
    }

    //para volver al menu y mantener el gestor
    public Menu(GestorMain gestor) {
        try {
            this.daoMascota = new DAOMascota();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        this.gestor = gestor;
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        lblIconoMenu = new javax.swing.JLabel();
        panelColor = new javax.swing.JPanel();
        lblIconoMascota = new javax.swing.JLabel();
        lblBienvenida = new javax.swing.JLabel();
        pnlGestionarMascota = new javax.swing.JPanel();
        lblGestionarMascota = new javax.swing.JLabel();
        pnlAgendarCita = new javax.swing.JPanel();
        lblAgendarCita = new javax.swing.JLabel();
        pnlSalir = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        lblMenu1 = new javax.swing.JLabel();
        lblBienvenida1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(251, 252, 253));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 560));

        panelFondo.setBackground(new java.awt.Color(251, 252, 253));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/IconoMenuPrincipal.png"))); // NOI18N
        panelFondo.add(lblIconoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 80));

        panelColor.setBackground(new java.awt.Color(1, 136, 123));
        panelColor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconoMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icono blanco.png"))); // NOI18N
        panelColor.add(lblIconoMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 110, 110));

        panelFondo.add(panelColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 230, 560));

        lblBienvenida.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(1, 136, 123));
        lblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenida.setText("Cerrar Sesion");
        lblBienvenida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBienvenidaMouseClicked(evt);
            }
        });
        panelFondo.add(lblBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 140, 40));

        pnlGestionarMascota.setBackground(new java.awt.Color(1, 136, 123));
        pnlGestionarMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlGestionarMascotaMouseClicked(evt);
            }
        });

        lblGestionarMascota.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        lblGestionarMascota.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionarMascota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGestionarMascota.setText("GESTIONAR MASCOTAS");
        lblGestionarMascota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGestionarMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGestionarMascotaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlGestionarMascotaLayout = new javax.swing.GroupLayout(pnlGestionarMascota);
        pnlGestionarMascota.setLayout(pnlGestionarMascotaLayout);
        pnlGestionarMascotaLayout.setHorizontalGroup(
            pnlGestionarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGestionarMascota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        pnlGestionarMascotaLayout.setVerticalGroup(
            pnlGestionarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGestionarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelFondo.add(pnlGestionarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 180, 40));

        pnlAgendarCita.setBackground(new java.awt.Color(1, 136, 123));
        pnlAgendarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAgendarCitaMouseClicked(evt);
            }
        });

        lblAgendarCita.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        lblAgendarCita.setForeground(new java.awt.Color(255, 255, 255));
        lblAgendarCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendarCita.setText("AGENDAR CITA");
        lblAgendarCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgendarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgendarCitaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAgendarCitaLayout = new javax.swing.GroupLayout(pnlAgendarCita);
        pnlAgendarCita.setLayout(pnlAgendarCitaLayout);
        pnlAgendarCitaLayout.setHorizontalGroup(
            pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgendarCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        pnlAgendarCitaLayout.setVerticalGroup(
            pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgendarCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelFondo.add(pnlAgendarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 180, 40));

        pnlSalir.setBackground(new java.awt.Color(255, 102, 102));
        pnlSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSalirMouseClicked(evt);
            }
        });

        lblSalir.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("SALIR");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlSalirLayout = new javax.swing.GroupLayout(pnlSalir);
        pnlSalir.setLayout(pnlSalirLayout);
        pnlSalirLayout.setHorizontalGroup(
            pnlSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        pnlSalirLayout.setVerticalGroup(
            pnlSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelFondo.add(pnlSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 180, 40));

        lblMenu1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu1.setText("Menu Principal");
        panelFondo.add(lblMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 210, 40));

        lblBienvenida1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        lblBienvenida1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenida1.setText("Bienvenido "+Sesion.clienteActual.getNombreUsuario().toUpperCase());
        lblBienvenida1.setSize(lblBienvenida1.getPreferredSize());
        panelFondo.add(lblBienvenida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlGestionarMascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlGestionarMascotaMouseClicked

    }//GEN-LAST:event_pnlGestionarMascotaMouseClicked

    private void lblGestionarMascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGestionarMascotaMouseClicked
        MenuGestionMascotas menuMascotas = new MenuGestionMascotas(gestor);
        menuMascotas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblGestionarMascotaMouseClicked

    private void pnlAgendarCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAgendarCitaMouseClicked
        MenuGestionCitas ventanaCitas = new MenuGestionCitas(gestor);
        ventanaCitas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlAgendarCitaMouseClicked

    private void lblAgendarCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgendarCitaMouseClicked
        MenuGestionCitas ventanaCitas = new MenuGestionCitas(gestor);
        ventanaCitas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAgendarCitaMouseClicked

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void pnlSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSalirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlSalirMouseClicked

    private void lblBienvenidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBienvenidaMouseClicked
        int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas cerrar sesion?", "Confirmar", JOptionPane.YES_NO_OPTION);
        
        if (opcion == JOptionPane.YES_OPTION){
        
        Sesion.clienteActual = null;
        
        
        Login login = new Login(gestor);
        login.setVisible(true);
        this.dispose();
        
        
        } else {
            
        }
        
    }//GEN-LAST:event_lblBienvenidaMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAgendarCita;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblBienvenida1;
    private javax.swing.JLabel lblGestionarMascota;
    private javax.swing.JLabel lblIconoMascota;
    private javax.swing.JLabel lblIconoMenu;
    private javax.swing.JLabel lblMenu1;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel panelColor;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel pnlAgendarCita;
    private javax.swing.JPanel pnlGestionarMascota;
    private javax.swing.JPanel pnlSalir;
    // End of variables declaration//GEN-END:variables
}
