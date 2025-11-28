/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import bd.DAOCita;
import com.toedter.calendar.JCalendar;
import java.awt.BorderLayout;
import java.util.ArrayList;
import model.Cita;
import model.Mascota;
import model.Veterinario;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Joaquin
 */
public class AgendarCita extends javax.swing.JFrame {

    private ArrayList<Veterinario> veterinarios;

    private GestorMain gestor;

    private JCalendar calendar;

    public AgendarCita(GestorMain gestor) {
        initComponents();
        this.gestor = gestor;
        inicializarVeterinarios();
        inicializarMascotas();
        calendar = new JCalendar();
        pnlCalendario.setLayout(new BorderLayout()); // importante para que se muestre correctamente
        pnlCalendario.add(calendar, BorderLayout.CENTER);
        pnlCalendario.revalidate();
        pnlCalendario.repaint();
    }

    private void inicializarVeterinarios() {
        veterinarios = new ArrayList<>();
        veterinarios.add(new Veterinario("Dr. Martín Torres", "Atención General", "+56 9 8456 3271"));
        veterinarios.add(new Veterinario("Dra. Camila Rojas", "Vacunación y Control", "+56 9 9123 4567"));
        veterinarios.add(new Veterinario("Dr. Felipe Muñoz", "Cirugía Menor", "+56 9 7765 9842"));
        veterinarios.add(new Veterinario("Dra. Valentina Pérez", "Odontología Animal", "+56 9 6523 1189"));
        veterinarios.add(new Veterinario("Dr. Ignacio Herrera", "Urgencias", "+56 9 9012 7755"));

        cmbVeterinarios.removeAllItems();
        for (Veterinario v : veterinarios) {

            cmbVeterinarios.addItem(v.toString());

        }
    }

    // Cargar mascotas desde la BD
    private void inicializarMascotas() {

        DefaultComboBoxModel<Mascota> modelo = new DefaultComboBoxModel<>();
        for (Mascota m : gestor.getListaMascotas()) {
            modelo.addElement(m);  // guardamos el objeto completo
        }
        cmbMascotas.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblAgendarHora = new javax.swing.JLabel();
        lblSeleccionarMascota = new javax.swing.JLabel();
        lblSeleccionarVeterinario = new javax.swing.JLabel();
        panelAgendar = new javax.swing.JPanel();
        lblActualizar = new javax.swing.JLabel();
        panelVolverMenu = new javax.swing.JPanel();
        lblVolverMenu = new javax.swing.JLabel();
        cmbMascotas = new javax.swing.JComboBox<>();
        cmbVeterinarios = new javax.swing.JComboBox<>();
        lblIdMascota1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMotivo = new javax.swing.JTextArea();
        pnlCalendario = new javax.swing.JPanel();
        panelSeleccionHora = new javax.swing.JPanel();
        cmbHoras = new javax.swing.JComboBox<>();
        lblSeleccionarDia = new javax.swing.JLabel();
        lblSeleccionarMascota3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAgendarHora.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblAgendarHora.setText("Agende su hora");

        lblSeleccionarMascota.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        lblSeleccionarMascota.setText("Seleccione a su mascota ");

        lblSeleccionarVeterinario.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        lblSeleccionarVeterinario.setText("Seleccione un veterinario disponible");

        panelAgendar.setBackground(new java.awt.Color(102, 153, 255));
        panelAgendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelAgendarMouseEntered(evt);
            }
        });

        lblActualizar.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        lblActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblActualizar.setText("AGENDAR");
        lblActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblActualizarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelAgendarLayout = new javax.swing.GroupLayout(panelAgendar);
        panelAgendar.setLayout(panelAgendarLayout);
        panelAgendarLayout.setHorizontalGroup(
            panelAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        panelAgendarLayout.setVerticalGroup(
            panelAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelVolverMenu.setBackground(new java.awt.Color(245, 245, 220));
        panelVolverMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelVolverMenuMouseEntered(evt);
            }
        });

        lblVolverMenu.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        lblVolverMenu.setForeground(new java.awt.Color(102, 153, 255));
        lblVolverMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVolverMenu.setText("CANCELAR");
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
            .addComponent(lblVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelVolverMenuLayout.setVerticalGroup(
            panelVolverMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVolverMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        cmbMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMascotasActionPerformed(evt);
            }
        });

        cmbVeterinarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblIdMascota1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        lblIdMascota1.setText("Escriba el motivo de su cita");

        txtAreaMotivo.setColumns(20);
        txtAreaMotivo.setRows(5);
        jScrollPane1.setViewportView(txtAreaMotivo);

        javax.swing.GroupLayout pnlCalendarioLayout = new javax.swing.GroupLayout(pnlCalendario);
        pnlCalendario.setLayout(pnlCalendarioLayout);
        pnlCalendarioLayout.setHorizontalGroup(
            pnlCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );
        pnlCalendarioLayout.setVerticalGroup(
            pnlCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        cmbHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00", "12:00", "15:00", "17:00" }));
        cmbHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHorasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSeleccionHoraLayout = new javax.swing.GroupLayout(panelSeleccionHora);
        panelSeleccionHora.setLayout(panelSeleccionHoraLayout);
        panelSeleccionHoraLayout.setHorizontalGroup(
            panelSeleccionHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionHoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panelSeleccionHoraLayout.setVerticalGroup(
            panelSeleccionHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionHoraLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(cmbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        lblSeleccionarDia.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        lblSeleccionarDia.setText("Seleccione un Dia");

        lblSeleccionarMascota3.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        lblSeleccionarMascota3.setText("Seleccione Hora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(panelVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(lblIdMascota1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSeleccionarVeterinario)
                                    .addComponent(cmbVeterinarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblSeleccionarMascota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAgendarHora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(130, 130, 130)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSeleccionarMascota3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelSeleccionHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSeleccionarDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblAgendarHora)
                        .addGap(18, 18, 18)
                        .addComponent(lblSeleccionarMascota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSeleccionarVeterinario)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSeleccionarMascota3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelSeleccionHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(cmbVeterinarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIdMascota1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblSeleccionarDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseClicked

        Mascota seleccionada = (Mascota) cmbMascotas.getSelectedItem();
        if (seleccionada == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor selecciona una mascota.");
            return;
        }
        int idMascota = seleccionada.getId(); // ya tienes el ID directo

        String veterinario = (String) cmbVeterinarios.getSelectedItem();
        Date fechaSeleccionada = calendar.getDate(); 
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String dia = sdf.format(fechaSeleccionada); // ahora dia = "2025-11-28"
        
        String hora = (String) cmbHoras.getSelectedItem();
        String motivo = txtAreaMotivo.getText();

        // Validación de campos
        if (veterinario == null || dia == null || hora == null || motivo.trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor completa todos los campos.");
            return;
        }

        try {
            DAOCita oDAOCita = new DAOCita();

            
            Cita nuevaCita = new Cita();
            nuevaCita.setIdMascota(idMascota); 
            nuevaCita.setVeterinario(veterinario);
            nuevaCita.setDia(dia);
            nuevaCita.setHora(hora);
            nuevaCita.setMotivo(motivo);
            nuevaCita.setIdCliente(Sesion.clienteActual.getId());
            
            oDAOCita.crearCita(nuevaCita);
            gestor.agregarCita(nuevaCita);

            javax.swing.JOptionPane.showMessageDialog(this, "Cita Agendada Correctamente.");

            // Volver al menú
            MenuGestionCitas menuCitas = new MenuGestionCitas(gestor);
            menuCitas.setVisible(true);
            this.dispose();

        } catch (SQLException ex) {
            System.out.println("Error al agendar cita: " + ex);
        }

    }//GEN-LAST:event_lblActualizarMouseClicked

    private void lblActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseEntered

    }//GEN-LAST:event_lblActualizarMouseEntered

    private void panelAgendarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAgendarMouseEntered

    }//GEN-LAST:event_panelAgendarMouseEntered

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

    private void cmbMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMascotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMascotasActionPerformed

    private void cmbHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHorasActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbHoras;
    private javax.swing.JComboBox<Mascota> cmbMascotas;
    private javax.swing.JComboBox<String> cmbVeterinarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblAgendarHora;
    private javax.swing.JLabel lblIdMascota1;
    private javax.swing.JLabel lblSeleccionarDia;
    private javax.swing.JLabel lblSeleccionarMascota;
    private javax.swing.JLabel lblSeleccionarMascota3;
    private javax.swing.JLabel lblSeleccionarVeterinario;
    private javax.swing.JLabel lblVolverMenu;
    private javax.swing.JPanel panelAgendar;
    private javax.swing.JPanel panelSeleccionHora;
    private javax.swing.JPanel panelVolverMenu;
    private javax.swing.JPanel pnlCalendario;
    private javax.swing.JTextArea txtAreaMotivo;
    // End of variables declaration//GEN-END:variables
}
