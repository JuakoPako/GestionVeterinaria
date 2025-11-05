/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.util.ArrayList;
import model.Cita;
import model.Mascota;
import model.Veterinario;

/**
 *
 * @author Joaquin
 */
public class AgendarCita extends javax.swing.JFrame {

    private ArrayList<Veterinario> veterinarios;
    
    private GestorCitas gestorCitas;
    private GestorMascotas gestorMascotas;
    
    
    public AgendarCita(GestorCitas gestorCitas, GestorMascotas gestorMascotas) {
        initComponents();
        this.gestorCitas = gestorCitas;
        this.gestorMascotas = gestorMascotas;
        inicializarVeterinarios();
        inicializarMascotas();
        
    }
    
    
    private void inicializarVeterinarios() {
        veterinarios = new ArrayList<>();
        veterinarios.add(new Veterinario("Dr. Martín Torres", "Atención General", "+56 9 8456 3271"));
        veterinarios.add(new Veterinario("Dra. Camila Rojas", "Vacunación y Control", "+56 9 9123 4567"));
        veterinarios.add(new Veterinario("Dr. Felipe Muñoz", "Cirugía Menor", "+56 9 7765 9842"));
        veterinarios.add(new Veterinario("Dra. Valentina Pérez", "Odontología Animal", "+56 9 6523 1189"));
        veterinarios.add(new Veterinario("Dr. Ignacio Herrera", "Urgencias", "+56 9 9012 7755"));
        
        cmbVeterinarios.removeAllItems();
        for (Veterinario v :  veterinarios) {
        
            cmbVeterinarios.addItem(v.toString());
            
        }
    }
    
    
    private void inicializarMascotas() {
        cmbMascotas.removeAllItems();
        for (Mascota m: gestorMascotas.getListaMascotas()) {
            cmbMascotas.addItem(m.getNombre());
        }
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblAgendarHora = new javax.swing.JLabel();
        lblSeleccionarMascota = new javax.swing.JLabel();
        lblSeleccionarVeterinario = new javax.swing.JLabel();
        panelAgendar = new javax.swing.JPanel();
        lblRegistrar = new javax.swing.JLabel();
        panelVolverMenu = new javax.swing.JPanel();
        lblVolverMenu = new javax.swing.JLabel();
        cmbMascotas = new javax.swing.JComboBox<>();
        cmbVeterinarios = new javax.swing.JComboBox<>();
        lblIdMascota1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMotivo = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lblSeleccionarMascota1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lblSeleccionarMascota2 = new javax.swing.JLabel();
        cmbDia = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAgendarHora.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblAgendarHora.setText("Agende su hora");

        lblSeleccionarMascota.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        lblSeleccionarMascota.setText("Seleccione a su mascota ");

        lblSeleccionarVeterinario.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        lblSeleccionarVeterinario.setText("Seleccione un veterinario disponible");

        panelAgendar.setBackground(new java.awt.Color(51, 102, 255));
        panelAgendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelAgendarMouseEntered(evt);
            }
        });

        lblRegistrar.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        lblRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrar.setText("AGENDAR");
        lblRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelAgendarLayout = new javax.swing.GroupLayout(panelAgendar);
        panelAgendar.setLayout(panelAgendarLayout);
        panelAgendarLayout.setHorizontalGroup(
            panelAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        panelAgendarLayout.setVerticalGroup(
            panelAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelVolverMenu.setBackground(new java.awt.Color(245, 245, 220));
        panelVolverMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelVolverMenuMouseEntered(evt);
            }
        });

        lblVolverMenu.setFont(new java.awt.Font("Roboto Condensed Light", 1, 14)); // NOI18N
        lblVolverMenu.setForeground(new java.awt.Color(51, 102, 255));
        lblVolverMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVolverMenu.setText("VOLVER AL MENU");
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

        cmbMascotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        lblSeleccionarMascota1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        lblSeleccionarMascota1.setText("Seleccione una Hora");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("09:00");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("11:00");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("15:00");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("18:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton2))
                    .addComponent(lblSeleccionarMascota1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSeleccionarMascota1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addContainerGap())
        );

        lblSeleccionarMascota2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        lblSeleccionarMascota2.setText("Seleccione un Dia");

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" }));
        cmbDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSeleccionarMascota2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSeleccionarMascota2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(panelAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(panelVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblIdMascota1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 77, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSeleccionarVeterinario)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblSeleccionarMascota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAgendarHora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(cmbMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbVeterinarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblAgendarHora)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblSeleccionarMascota)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmbMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblSeleccionarVeterinario))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbVeterinarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIdMascota1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseClicked
        
        String nombreMascota = (String) cmbMascotas.getSelectedItem();
        String veterinario = (String) cmbVeterinarios.getSelectedItem();
        String dia = (String) cmbDia.getSelectedItem();
        String hora = "";
        String motivo = txtAreaMotivo.getText();

        if (nombreMascota.isEmpty() || veterinario.isEmpty() || dia.isEmpty() || hora.isEmpty() || motivo.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor completa todos los campos.");
            return;
        }
        Cita nuevaCita = new Cita(nombreMascota, nombreMascota, veterinario, dia, hora, motivo);
        gestorCitas.agregarCita(nuevaCita);
        javax.swing.JOptionPane.showMessageDialog(this, "Cita Agendada Correctamente.");
        GestionCitasMenu menuCitas = new GestionCitasMenu(gestorCitas, gestorMascotas);
        menuCitas.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblRegistrarMouseClicked

    private void lblRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseEntered

    }//GEN-LAST:event_lblRegistrarMouseEntered

    private void panelAgendarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAgendarMouseEntered

    }//GEN-LAST:event_panelAgendarMouseEntered

    private void lblVolverMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMenuMouseClicked
        GestionCitasMenu menuCitas = new GestionCitasMenu(gestorCitas, gestorMascotas);
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

    private void cmbDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDiaActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbMascotas;
    private javax.swing.JComboBox<String> cmbVeterinarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgendarHora;
    private javax.swing.JLabel lblIdMascota1;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lblSeleccionarMascota;
    private javax.swing.JLabel lblSeleccionarMascota1;
    private javax.swing.JLabel lblSeleccionarMascota2;
    private javax.swing.JLabel lblSeleccionarVeterinario;
    private javax.swing.JLabel lblVolverMenu;
    private javax.swing.JPanel panelAgendar;
    private javax.swing.JPanel panelVolverMenu;
    private javax.swing.JTextArea txtAreaMotivo;
    // End of variables declaration//GEN-END:variables
}
