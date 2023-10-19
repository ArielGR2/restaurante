package restaurante.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import restaurante.AccesoDatos.MesaData;
import restaurante.Entidades.Empleado;
import restaurante.Entidades.Mesa;

public class GestorMesa extends javax.swing.JInternalFrame {

    MesaData mData = new MesaData();

    private DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int x, int y) {
            if (y == 2) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Class<?> getColumnClass(int c) {
            if (c == 2) {
                return String.class;
            }
            return Integer.class;
        }
    };

    /**
     * Creates new form GestorMesa
     */
    public GestorMesa() {
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
        jTMesas = new javax.swing.JTable();
        agregarBtn = new javax.swing.JPanel();
        jLAgregar = new javax.swing.JLabel();
        modificarBtn = new javax.swing.JPanel();
        jLModificar = new javax.swing.JLabel();
        eliminarBtn = new javax.swing.JPanel();
        jLEliminar = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Gestor de Mesas");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jScrollPane1.setForeground(new java.awt.Color(60, 63, 65));

        jTMesas.setForeground(new java.awt.Color(60, 63, 65));
        jTMesas.setModel(new javax.swing.table.DefaultTableModel(
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
        jTMesas.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jTMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTMesasMouseClicked(evt);
            }
        });
        jTMesas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTMesasPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTMesas);

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
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modificarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTMesasMouseClicked
        // TODO add your handling code here:
        jLEliminar.setEnabled(true);
        eliminarBtn.setEnabled(true);
    }//GEN-LAST:event_jTMesasMouseClicked

    private void jTMesasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTMesasPropertyChange
        // TODO add your handling code here:
        if (jTMesas.isEditing()) {
            jLModificar.setEnabled(true);
            modificarBtn.setEnabled(true);
        }
    }//GEN-LAST:event_jTMesasPropertyChange

    private void jLAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarMouseClicked
        FormularioMesa formulario = new FormularioMesa(this);
        JDesktopPane desktopPane = getDesktopPane();

        desktopPane.add(formulario);

        int x = (desktopPane.getWidth() - formulario.getWidth()) / 2;
        int y = (desktopPane.getHeight() - formulario.getHeight()) / 2;

        formulario.setLocation(x, y);
        formulario.setVisible(true);
    }//GEN-LAST:event_jLAgregarMouseClicked

    private void jLModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarMouseClicked
        int filas = jTMesas.getRowCount();
        boolean pendiente = false;

        for (int f = 0; f < filas; f++) {
            int numMesa = (Integer) modelo.getValueAt(f, 0);
            int capacidad = (Integer) modelo.getValueAt(f, 1);
            int id = mData.buscarMesa(numMesa).getIdMesa();

            //Revisamos si hay modificación, si la hay modificamos la mesa y el booleano pasa a true.
            for (Mesa m : mData.listarMesas()) {
                if (m.getIdMesa() == id && (m.getNumMesa() != numMesa || m.getCapacidad() != capacidad)) {
                    m.setNumMesa(numMesa);
                    m.setCapacidad(capacidad);
                    mData.modificarMesa(m);
                    pendiente = true;
                }
            }
        }
        //Si no queda en false y da el mensaje
        if (!pendiente) {
            JOptionPane.showMessageDialog(this, "No hay modificaciones.");
            return;
        }
    }//GEN-LAST:event_jLModificarMouseClicked

    private void jLEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLEliminarMouseClicked
        int numeroMesa = (Integer) modelo.getValueAt(jTMesas.getSelectedRow(), 0);
        mData.eliminarMesa(numeroMesa);
        cargarTabla();
    }//GEN-LAST:event_jLEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregarBtn;
    private javax.swing.JPanel eliminarBtn;
    private javax.swing.JLabel jLAgregar;
    private javax.swing.JLabel jLEliminar;
    private javax.swing.JLabel jLModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMesas;
    private javax.swing.JPanel modificarBtn;
    // End of variables declaration//GEN-END:variables

    private void cabeceraTabla() {
        modelo.addColumn("Numero");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Estado");

        jTMesas.setModel(modelo);

        //Centrar títulos de la tabla
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) jTMesas.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        //Centrar contenido de tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        jTMesas.setDefaultRenderer(Object.class, centerRenderer);

        jTMesas.setEditingColumn(0);
        jTMesas.setEditingColumn(1);

    }

    public void cargarTabla() {
        eliminarFilas();
        for (Mesa mesa : mData.listarMesas()) {
            modelo.addRow(new Object[]{
                mesa.getNumMesa(),
                mesa.getCapacidad(),
                mesa.getEstado()
            });
        }
    }

    private void eliminarFilas() {
        int filas = jTMesas.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            modelo.removeRow(filas);
        }
    }
}
