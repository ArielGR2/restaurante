package restaurante.Vistas;

import javax.swing.JDesktopPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import restaurante.AccesoDatos.EmpleadoData;
import restaurante.Entidades.Empleado;

public class GestorEmpleados extends javax.swing.JInternalFrame {

    EmpleadoData edata = new EmpleadoData();

    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int x, int y) {
            return false;
        }
    };

    /**
     * Creates new form EmpleadoVistas
     */
    public GestorEmpleados() {
        initComponents();
        cabeceraTabla();
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTEmpleados = new javax.swing.JTable();
        agregarBtn = new javax.swing.JPanel();
        jLAgregar = new javax.swing.JLabel();
        modificarBtn = new javax.swing.JPanel();
        jLModificar = new javax.swing.JLabel();
        eliminarBtn = new javax.swing.JPanel();
        jLEliminar = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Gestor de Empleados");
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(500, 600));
        setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        jScrollPane1.setForeground(new java.awt.Color(60, 63, 65));

        jTEmpleados.setForeground(new java.awt.Color(60, 63, 65));
        jTEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTEmpleados);

        agregarBtn.setBackground(new java.awt.Color(51, 51, 51));
        agregarBtn.setForeground(new java.awt.Color(51, 51, 51));

        jLAgregar.setBackground(new java.awt.Color(51, 51, 51));
        jLAgregar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLAgregar.setForeground(new java.awt.Color(204, 204, 204));
        jLAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAgregar.setText("AGREGAR");
        jLAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout agregarBtnLayout = new javax.swing.GroupLayout(agregarBtn);
        agregarBtn.setLayout(agregarBtnLayout);
        agregarBtnLayout.setHorizontalGroup(
            agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        agregarBtnLayout.setVerticalGroup(
            agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        modificarBtn.setBackground(new java.awt.Color(51, 51, 51));
        modificarBtn.setEnabled(false);

        jLModificar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLModificar.setForeground(new java.awt.Color(204, 204, 204));
        jLModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLModificar.setText("MODIFICAR");
        jLModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLModificar.setEnabled(false);
        jLModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout modificarBtnLayout = new javax.swing.GroupLayout(modificarBtn);
        modificarBtn.setLayout(modificarBtnLayout);
        modificarBtnLayout.setHorizontalGroup(
            modificarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        modificarBtnLayout.setVerticalGroup(
            modificarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLModificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        eliminarBtn.setBackground(new java.awt.Color(51, 51, 51));
        eliminarBtn.setForeground(new java.awt.Color(204, 204, 204));
        eliminarBtn.setEnabled(false);

        jLEliminar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLEliminar.setForeground(new java.awt.Color(204, 204, 204));
        jLEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLEliminar.setText("ELIMINAR");
        jLEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLEliminar.setEnabled(false);
        jLEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout eliminarBtnLayout = new javax.swing.GroupLayout(eliminarBtn);
        eliminarBtn.setLayout(eliminarBtnLayout);
        eliminarBtnLayout.setHorizontalGroup(
            eliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        eliminarBtnLayout.setVerticalGroup(
            eliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modificarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarMouseClicked
        FormularioEmpleados formulario = new FormularioEmpleados();
        JDesktopPane desktopPane = getDesktopPane();

        desktopPane.add(formulario);
        
        int x = (desktopPane.getWidth() - formulario.getWidth()) / 2;
        int y = (desktopPane.getHeight() - formulario.getHeight()) / 2;

        formulario.setLocation(x, y);
        formulario.setVisible(true);


    }//GEN-LAST:event_jLAgregarMouseClicked

    private void jLModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLModificarMouseClicked

    private void jLEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLEliminarMouseClicked

    private void jTEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTEmpleadosMouseClicked
        // TODO add your handling code here:
        jLModificar.setEnabled(true);
        modificarBtn.setEnabled(true);
        jLEliminar.setEnabled(true);
        eliminarBtn.setEnabled(true);

    }//GEN-LAST:event_jTEmpleadosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregarBtn;
    private javax.swing.JPanel eliminarBtn;
    private javax.swing.JLabel jLAgregar;
    private javax.swing.JLabel jLEliminar;
    private javax.swing.JLabel jLModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTEmpleados;
    private javax.swing.JPanel modificarBtn;
    // End of variables declaration//GEN-END:variables

    private void cabeceraTabla() {
        modelo.addColumn("Id Mesero");
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Estado");

        jTEmpleados.setModel(modelo);

        //Centrar títulos de la tabla
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) jTEmpleados.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        //Centrar contenido de tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        jTEmpleados.setDefaultRenderer(Object.class, centerRenderer);
    }

    private void cargarTabla() {
        eliminarFilas();
        for (Empleado empleado : edata.listarEmpleadosActivos()) {
            modelo.addRow(new Object[]{
                empleado.getIdEmpleado(),
                empleado.getDni(),
                empleado.getNombre(),
                empleado.isEstado() == true ? "Activo" : "Inactivo"
            });
        }
    }

    private void eliminarFilas() {
        int filas = jTEmpleados.getRowCount() - 1; //al ser un indice le resto 1
        //Como ya iniciamos la variable contadora no la incluimos en el for.
        for (; filas >= 0; filas--) {
            modelo.removeRow(filas);
        }

    }

}