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
import javax.swing.table.DefaultTableModel;
import model.Cita;

/**
 *
 * @author Joaquin
 */
public class ActualizarCita extends javax.swing.JFrame {

    private GestorMain gestor;

    public ActualizarCita(GestorMain gestor) {
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
            System.out.println("" + ex);
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
        lblGestionDeMascotas = new javax.swing.JLabel();
        txtEntradaID = new javax.swing.JTextField();
        lblIngreseCita = new javax.swing.JLabel();
        pnlVerCitas = new javax.swing.JPanel();
        lblActualizarCita = new javax.swing.JLabel();

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

        lblGestionDeMascotas.setFont(new java.awt.Font("Roboto Black", 1, 22)); // NOI18N
        lblGestionDeMascotas.setText("Actualizar Cita");

        txtEntradaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaIDActionPerformed(evt);
            }
        });

        lblIngreseCita.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        lblIngreseCita.setText("Ingrese ID Cita");

        pnlVerCitas.setBackground(new java.awt.Color(102, 153, 255));
        pnlVerCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlVerCitasMouseEntered(evt);
            }
        });

        lblActualizarCita.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        lblActualizarCita.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizarCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblActualizarCita.setText("ACTUALIZAR CITA");
        lblActualizarCita.setToolTipText("");
        lblActualizarCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblActualizarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActualizarCitaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblActualizarCitaMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlVerCitasLayout = new javax.swing.GroupLayout(pnlVerCitas);
        pnlVerCitas.setLayout(pnlVerCitasLayout);
        pnlVerCitasLayout.setHorizontalGroup(
            pnlVerCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizarCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlVerCitasLayout.setVerticalGroup(
            pnlVerCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizarCita, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtEntradaID, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelVolverMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlVerCitas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblIngreseCita, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGestionDeMascotas))
                .addGap(48, 48, 48)
                .addComponent(spCitas, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGestionDeMascotas)
                        .addGap(45, 45, 45)
                        .addComponent(lblIngreseCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEntradaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlVerCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void lblActualizarCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarCitaMouseClicked
        try {
            int idBuscado = Integer.parseInt(txtEntradaID.getText().trim());

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
                EditarCita editar = new EditarCita(gestor, citaEncontrada, idBuscado);
                editar.setVisible(true);
                this.dispose();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "ID no válido");
            }

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ingrese un número válido");
        } catch (SQLException ex) {
            System.out.println(""+ex);
        }
    }//GEN-LAST:event_lblActualizarCitaMouseClicked

    private void lblActualizarCitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarCitaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblActualizarCitaMouseEntered

    private void pnlVerCitasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVerCitasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlVerCitasMouseEntered

    private void txtEntradaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntradaIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblActualizarCita;
    private javax.swing.JLabel lblGestionDeMascotas;
    private javax.swing.JLabel lblIngreseCita;
    private javax.swing.JLabel lblVolverMenu;
    private javax.swing.JPanel panelVolverMenu;
    private javax.swing.JPanel pnlVerCitas;
    private javax.swing.JScrollPane spCitas;
    private javax.swing.JTable tblCitas;
    private javax.swing.JTextField txtEntradaID;
    // End of variables declaration//GEN-END:variables
}
