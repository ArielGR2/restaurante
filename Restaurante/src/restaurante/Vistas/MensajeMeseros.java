package restaurante.Vistas;

import restaurante.AccesoDatos.EmpleadoData;
import restaurante.Entidades.Empleado;

public class MensajeMeseros extends javax.swing.JInternalFrame {

    EmpleadoData eData = new EmpleadoData();
    GestorPedidos gPedidos;

    /**
     * Creates new form FormularioEmpleados
     * @param ventanaPrincipal
     */
    public MensajeMeseros(GestorPedidos ventanaPrincipal) {
        initComponents();
        this.gPedidos = ventanaPrincipal;
        cargarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboEmpleados = new javax.swing.JComboBox<>();
        cancelarBtn = new javax.swing.JPanel();
        jLCancelar = new javax.swing.JLabel();
        aceptarBtn = new javax.swing.JPanel();
        jLAceptar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(25, 25, 25));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(300, 250));

        background.setBackground(new java.awt.Color(25, 25, 25));
        background.setForeground(new java.awt.Color(204, 204, 204));
        background.setPreferredSize(new java.awt.Dimension(300, 300));

        titulo.setBackground(new java.awt.Color(204, 204, 204));
        titulo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        titulo.setForeground(new java.awt.Color(204, 204, 204));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("SELECCIONE MESERO");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        cancelarBtn.setBackground(new java.awt.Color(51, 51, 51));
        cancelarBtn.setForeground(new java.awt.Color(51, 51, 51));
        cancelarBtn.setMaximumSize(new java.awt.Dimension(100, 30));
        cancelarBtn.setMinimumSize(new java.awt.Dimension(100, 30));
        cancelarBtn.setPreferredSize(new java.awt.Dimension(100, 30));

        jLCancelar.setBackground(new java.awt.Color(51, 51, 51));
        jLCancelar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLCancelar.setForeground(new java.awt.Color(204, 204, 204));
        jLCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCancelar.setText("CANCELAR");
        jLCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cancelarBtnLayout = new javax.swing.GroupLayout(cancelarBtn);
        cancelarBtn.setLayout(cancelarBtnLayout);
        cancelarBtnLayout.setHorizontalGroup(
            cancelarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        cancelarBtnLayout.setVerticalGroup(
            cancelarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        aceptarBtn.setBackground(new java.awt.Color(51, 51, 51));
        aceptarBtn.setForeground(new java.awt.Color(51, 51, 51));
        aceptarBtn.setMaximumSize(new java.awt.Dimension(100, 30));
        aceptarBtn.setMinimumSize(new java.awt.Dimension(100, 30));

        jLAceptar.setBackground(new java.awt.Color(51, 51, 51));
        jLAceptar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLAceptar.setForeground(new java.awt.Color(204, 204, 204));
        jLAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAceptar.setText("ACEPTAR");
        jLAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAceptarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout aceptarBtnLayout = new javax.swing.GroupLayout(aceptarBtn);
        aceptarBtn.setLayout(aceptarBtnLayout);
        aceptarBtnLayout.setHorizontalGroup(
            aceptarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        aceptarBtnLayout.setVerticalGroup(
            aceptarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(aceptarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(titulo))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jComboEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jComboEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aceptarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCancelarMouseClicked
        dispose();
        gPedidos.cargarTabla();
    }//GEN-LAST:event_jLCancelarMouseClicked

    private void jLAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAceptarMouseClicked
        int idEmpleado = ((Empleado) jComboEmpleados.getSelectedItem()).getIdEmpleado();
        System.out.println(idEmpleado);
        gPedidos.cargarTablaMesero(idEmpleado);
        dispose();
    }//GEN-LAST:event_jLAceptarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aceptarBtn;
    private javax.swing.JPanel background;
    private javax.swing.JPanel cancelarBtn;
    private javax.swing.JComboBox<Empleado> jComboEmpleados;
    private javax.swing.JLabel jLAceptar;
    private javax.swing.JLabel jLCancelar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables


    private void cargarCombo() {
        jComboEmpleados.addItem(new Empleado());
        for (Empleado mesero : eData.listarEmpleadosActivos()) {
            jComboEmpleados.addItem(mesero);
        }
    }
}
