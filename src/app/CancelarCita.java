/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import bd.DAOCita;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cita;

/**
 *
 * @author Joaquin
 */
public class CancelarCita extends javax.swing.JFrame {

    private GestorMain gestor;

    public CancelarCita(GestorMain gestor) {
        initComponents();
        this.gestor = gestor;
        mostrarCitasEnTabla();

    }

    private void mostrarCitasEnTabla() {
        String[] columnas = {"ID CITA", "ID Mascota", "Nombre Mascota", "Veterinario", "Día", "Hora"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        try {
            DAOCita daoCita = new DAOCita();
            ArrayList<Cita> citas = daoCita.getListaCitas();

            for (int i = 0; i < citas.size(); i++) {
                Cita c = citas.get(i);
                Object[] fila = {
                    c.getIdCita(),
                    c.getIdMascota(),
                    c.getNombreMascota(),
                    c.getVeterinario(),
                    c.getDia(),
                    c.getHora()
                };
                modelo.addRow(fila);
            }

        } catch (SQLException ex) {
            System.out.println("Error al obtener citas: " + ex.getMessage());
        }

        tblCitas.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spCitas = new javax.swing.JScrollPane();
        tblCitas = new javax.swing.JTable();
        panelVolverMenu = new javax.swing.JPanel();
        lblVolverMenu = new javax.swing.JLabel();
        lblTituloCancelar = new javax.swing.JLabel();
        txtIdCita = new javax.swing.JTextField();
        lblIngreseCita = new javax.swing.JLabel();
        pnlCancelarCita = new javax.swing.JPanel();
        lblCancelarCita = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre Mascota", "Veterinario", "Dia", "Hora"
            }
        ));
        spCitas.setViewportView(tblCitas);

        panelVolverMenu.setBackground(new java.awt.Color(245, 245, 220));
        panelVolverMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelVolverMenuMouseEntered(evt);
            }
        });

        lblVolverMenu.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        lblVolverMenu.setForeground(new java.awt.Color(102, 153, 255));
        lblVolverMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVolverMenu.setText("VOLVER ATRAS");
        lblVolverMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVolverMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVolverMenuMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelVolverMenuLayout = new javax.swing.GroupLayout(panelVolverMenu);
        panelVolverMenu.setLayout(panelVolverMenuLayout);
        panelVolverMenuLayout.setHorizontalGroup(
            panelVolverMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVolverMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        panelVolverMenuLayout.setVerticalGroup(
            panelVolverMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVolverMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        lblTituloCancelar.setFont(new java.awt.Font("Roboto Black", 1, 22)); // NOI18N
        lblTituloCancelar.setText("Cancelar Cita");

        lblIngreseCita.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        lblIngreseCita.setText("Ingrese ID Cita");

        pnlCancelarCita.setBackground(new java.awt.Color(102, 153, 255));
        pnlCancelarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCancelarCitaMouseEntered(evt);
            }
        });

        lblCancelarCita.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        lblCancelarCita.setForeground(new java.awt.Color(255, 255, 255));
        lblCancelarCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCancelarCita.setText("CANCELAR CITA");
        lblCancelarCita.setToolTipText("");
        lblCancelarCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCancelarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelarCitaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCancelarCitaMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlCancelarCitaLayout = new javax.swing.GroupLayout(pnlCancelarCita);
        pnlCancelarCita.setLayout(pnlCancelarCitaLayout);
        pnlCancelarCitaLayout.setHorizontalGroup(
            pnlCancelarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCancelarCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCancelarCitaLayout.setVerticalGroup(
            pnlCancelarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCancelarCita, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtIdCita, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelVolverMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlCancelarCita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblIngreseCita, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloCancelar))
                .addGap(48, 48, 48)
                .addComponent(spCitas, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTituloCancelar)
                        .addGap(45, 45, 45)
                        .addComponent(lblIngreseCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlCancelarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(spCitas, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblVolverMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMenuMouseClicked
        MenuGestionCitas menuCitas = new MenuGestionCitas(gestor);
        menuCitas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVolverMenuMouseClicked

    private void lblVolverMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMenuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblVolverMenuMouseEntered

    private void panelVolverMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVolverMenuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelVolverMenuMouseEntered

    private void lblCancelarCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarCitaMouseClicked
        try {
            int idBuscado = Integer.parseInt(txtIdCita.getText().trim());

            DAOCita oDAOCita = new DAOCita();
            ArrayList<model.Cita> lista = oDAOCita.getListaCitas();

            model.Cita citaEncontrada = null;
            for (model.Cita c : lista) {
                if (c.getIdCita() == idBuscado) {
                    citaEncontrada = c;
                    break;
                }
            }

            if (citaEncontrada != null) {
                oDAOCita.borrarCita(citaEncontrada.getIdCita());
                mostrarCitasEnTabla();
                JOptionPane.showMessageDialog(this, "Cita Cancelada con Exito.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "ID no válido");
            }

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ingrese un número válido");
        } catch (SQLException ex) {
            Logger.getLogger(ActualizarCita.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_lblCancelarCitaMouseClicked

    private void lblCancelarCitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarCitaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCancelarCitaMouseEntered

    private void pnlCancelarCitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCancelarCitaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlCancelarCitaMouseEntered

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCancelarCita;
    private javax.swing.JLabel lblIngreseCita;
    private javax.swing.JLabel lblTituloCancelar;
    private javax.swing.JLabel lblVolverMenu;
    private javax.swing.JPanel panelVolverMenu;
    private javax.swing.JPanel pnlCancelarCita;
    private javax.swing.JScrollPane spCitas;
    private javax.swing.JTable tblCitas;
    private javax.swing.JTextField txtIdCita;
    // End of variables declaration//GEN-END:variables
}
