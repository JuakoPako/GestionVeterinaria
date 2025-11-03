/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

/**
 *
 * @author Joaquin
 */
public class GestionCitasMenu extends javax.swing.JFrame {

    private GestorCitas gestorCitas;
    
    public GestionCitasMenu(GestorCitas gestorCitas) {
        initComponents();
        this.gestorCitas = gestorCitas;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        lblGestionDeMascotas = new javax.swing.JLabel();
        pnlAgendarCita = new javax.swing.JPanel();
        lblAgendarCita = new javax.swing.JLabel();
        pnlVerCitas = new javax.swing.JPanel();
        lblVerCitas = new javax.swing.JLabel();
        pnlActualizarCita = new javax.swing.JPanel();
        lblActualizarCita = new javax.swing.JLabel();
        pnlCancelarCita = new javax.swing.JPanel();
        lblCancelarCitas = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        lblGestionDeMascotas.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblGestionDeMascotas.setText("Gestion de Citas");

        pnlAgendarCita.setBackground(new java.awt.Color(51, 102, 255));
        pnlAgendarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAgendarCitaMouseEntered(evt);
            }
        });

        lblAgendarCita.setFont(new java.awt.Font("Roboto Condensed Light", 1, 12)); // NOI18N
        lblAgendarCita.setForeground(new java.awt.Color(255, 255, 255));
        lblAgendarCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendarCita.setText("Agendar Citas");
        lblAgendarCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgendarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgendarCitaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAgendarCitaMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlAgendarCitaLayout = new javax.swing.GroupLayout(pnlAgendarCita);
        pnlAgendarCita.setLayout(pnlAgendarCitaLayout);
        pnlAgendarCitaLayout.setHorizontalGroup(
            pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgendarCitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgendarCita, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAgendarCitaLayout.setVerticalGroup(
            pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgendarCita, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnlVerCitas.setBackground(new java.awt.Color(51, 102, 255));
        pnlVerCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlVerCitasMouseEntered(evt);
            }
        });

        lblVerCitas.setFont(new java.awt.Font("Roboto Condensed Light", 1, 12)); // NOI18N
        lblVerCitas.setForeground(new java.awt.Color(255, 255, 255));
        lblVerCitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVerCitas.setText("Ver Citas");
        lblVerCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVerCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVerCitasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVerCitasMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlVerCitasLayout = new javax.swing.GroupLayout(pnlVerCitas);
        pnlVerCitas.setLayout(pnlVerCitasLayout);
        pnlVerCitasLayout.setHorizontalGroup(
            pnlVerCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVerCitasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblVerCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlVerCitasLayout.setVerticalGroup(
            pnlVerCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVerCitas, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnlActualizarCita.setBackground(new java.awt.Color(51, 102, 255));
        pnlActualizarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlActualizarCitaMouseEntered(evt);
            }
        });

        lblActualizarCita.setFont(new java.awt.Font("Roboto Condensed Light", 1, 12)); // NOI18N
        lblActualizarCita.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizarCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblActualizarCita.setText("Actualizar Cita");
        lblActualizarCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblActualizarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActualizarCitaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblActualizarCitaMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlActualizarCitaLayout = new javax.swing.GroupLayout(pnlActualizarCita);
        pnlActualizarCita.setLayout(pnlActualizarCitaLayout);
        pnlActualizarCitaLayout.setHorizontalGroup(
            pnlActualizarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizarCitaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblActualizarCita, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlActualizarCitaLayout.setVerticalGroup(
            pnlActualizarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizarCita, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnlCancelarCita.setBackground(new java.awt.Color(51, 102, 255));
        pnlCancelarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCancelarCitaMouseEntered(evt);
            }
        });

        lblCancelarCitas.setFont(new java.awt.Font("Roboto Condensed Light", 1, 12)); // NOI18N
        lblCancelarCitas.setForeground(new java.awt.Color(255, 255, 255));
        lblCancelarCitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCancelarCitas.setText("Cancelar Cita");
        lblCancelarCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCancelarCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelarCitasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCancelarCitasMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlCancelarCitaLayout = new javax.swing.GroupLayout(pnlCancelarCita);
        pnlCancelarCita.setLayout(pnlCancelarCitaLayout);
        pnlCancelarCitaLayout.setHorizontalGroup(
            pnlCancelarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCancelarCitaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblCancelarCitas, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCancelarCitaLayout.setVerticalGroup(
            pnlCancelarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCancelarCitas, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlVerCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlActualizarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCancelarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lblGestionDeMascotas)
                .addGap(179, 179, 179)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(pnlAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(pnlVerCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(pnlActualizarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(pnlCancelarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblGestionDeMascotas))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAgendarCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgendarCitaMouseClicked

    }//GEN-LAST:event_lblAgendarCitaMouseClicked

    private void lblAgendarCitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgendarCitaMouseEntered

    }//GEN-LAST:event_lblAgendarCitaMouseEntered

    private void pnlAgendarCitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAgendarCitaMouseEntered

    }//GEN-LAST:event_pnlAgendarCitaMouseEntered

    private void lblVerCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerCitasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblVerCitasMouseClicked

    private void lblVerCitasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerCitasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblVerCitasMouseEntered

    private void pnlVerCitasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVerCitasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlVerCitasMouseEntered

    private void lblActualizarCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarCitaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblActualizarCitaMouseClicked

    private void lblActualizarCitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarCitaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblActualizarCitaMouseEntered

    private void pnlActualizarCitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlActualizarCitaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlActualizarCitaMouseEntered

    private void lblCancelarCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarCitasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCancelarCitasMouseClicked

    private void lblCancelarCitasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarCitasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCancelarCitasMouseEntered

    private void pnlCancelarCitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCancelarCitaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlCancelarCitaMouseEntered

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActualizarCita;
    private javax.swing.JLabel lblAgendarCita;
    private javax.swing.JLabel lblCancelarCitas;
    private javax.swing.JLabel lblGestionDeMascotas;
    private javax.swing.JLabel lblVerCitas;
    private javax.swing.JPanel pnlActualizarCita;
    private javax.swing.JPanel pnlAgendarCita;
    private javax.swing.JPanel pnlCancelarCita;
    private javax.swing.JPanel pnlVerCitas;
    // End of variables declaration//GEN-END:variables
}
