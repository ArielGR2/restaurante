package restaurante.Vistas;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import restaurante.AccesoDatos.DetalleData;
import restaurante.AccesoDatos.ProductoData;
import restaurante.Entidades.Pedido;
import restaurante.Entidades.Producto;

public class FormularioDetalle extends javax.swing.JInternalFrame {

    int cantidad;

    FormularioPedidos fPedidos;
    Pedido pedido;
    Producto producto;

    DetalleData dData = new DetalleData();
    ProductoData pData = new ProductoData();

    private DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int x, int y) {
            return false;
        }

        @Override
        public Class<?> getColumnClass(int c) {
            if (c == 1) {
                return String.class;
            }
            return Integer.class;
        }
    };

    public FormularioDetalle(FormularioPedidos fPedidos, Pedido pedido) {
        initComponents();
        this.pedido = pedido;
        this.fPedidos = fPedidos;
        cabeceraTabla();
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
        crearBtn = new javax.swing.JPanel();
        jLCrear = new javax.swing.JLabel();
        cancelarBtn = new javax.swing.JPanel();
        jLCancelar = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLApellido1 = new javax.swing.JLabel();
        jTextCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDetalle = new javax.swing.JTable();

        setBackground(new java.awt.Color(25, 25, 25));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(300, 300));
        setMinimumSize(new java.awt.Dimension(300, 300));
        setPreferredSize(new java.awt.Dimension(300, 350));

        background.setBackground(new java.awt.Color(25, 25, 25));
        background.setForeground(new java.awt.Color(204, 204, 204));

        titulo.setBackground(new java.awt.Color(25, 25, 25));
        titulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(204, 204, 204));
        titulo.setText("AGREGAR PRODUCTOS");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        crearBtn.setBackground(new java.awt.Color(51, 51, 51));
        crearBtn.setForeground(new java.awt.Color(51, 51, 51));
        crearBtn.setEnabled(false);
        crearBtn.setMaximumSize(new java.awt.Dimension(100, 30));
        crearBtn.setMinimumSize(new java.awt.Dimension(100, 30));
        crearBtn.setPreferredSize(new java.awt.Dimension(100, 30));

        jLCrear.setBackground(new java.awt.Color(51, 51, 51));
        jLCrear.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLCrear.setForeground(new java.awt.Color(204, 204, 204));
        jLCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCrear.setText("CREAR");
        jLCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLCrear.setEnabled(false);
        jLCrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCrearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout crearBtnLayout = new javax.swing.GroupLayout(crearBtn);
        crearBtn.setLayout(crearBtnLayout);
        crearBtnLayout.setHorizontalGroup(
            crearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        crearBtnLayout.setVerticalGroup(
            crearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCrear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            .addComponent(jLCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        cancelarBtnLayout.setVerticalGroup(
            cancelarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTextNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextNombre.setText("Ingresa el nombre del producto");
        jTextNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextNombreFocusLost(evt);
            }
        });
        jTextNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextNombreMouseReleased(evt);
            }
        });
        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextNombreKeyReleased(evt);
            }
        });

        jLApellido1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLApellido1.setForeground(new java.awt.Color(204, 204, 204));
        jLApellido1.setText("Cantidad:");

        jTextCantidad.setBackground(new java.awt.Color(102, 102, 102));
        jTextCantidad.setForeground(new java.awt.Color(204, 204, 204));
        jTextCantidad.setEnabled(false);
        jTextCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCantidadActionPerformed(evt);
            }
        });
        jTextCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextCantidadKeyReleased(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(60, 63, 65));

        jTDetalle.setForeground(new java.awt.Color(60, 63, 65));
        jTDetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jTDetalle.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jTDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTDetalleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTDetalle);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(titulo))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(crearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(jLApellido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122))))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCantidad))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(crearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(114, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCancelarMouseClicked
        cerrarVentana();
    }//GEN-LAST:event_jLCancelarMouseClicked

    private void jLCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCrearMouseClicked
        //Agregar un funcionamiento para que si ya existe un detalle con el producto sume a la cantidad ya pedida
/*        try {
            System.out.println("click" + cantidad);
            if (cantidad < producto.getStock()) {
                Detalle detalle = new Detalle(pedido, producto, cantidad);
                pedido.getListaDetalles().add(detalle);
                dData.agregarDetalle(detalle);
                cerrarVentana();
            } else {
                JOptionPane.showMessageDialog(this, "La cantidad deseada supera el stock.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Introducir una cantidad válida.");
        }*/
    }//GEN-LAST:event_jLCrearMouseClicked

    private void jTextNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextNombreFocusLost
        if (jTextNombre.getText().isEmpty()) {
            jTextNombre.setText("Ingresa el nombre del producto");
        }
    }//GEN-LAST:event_jTextNombreFocusLost

    private void jTextNombreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextNombreMouseReleased
        if (!jTextNombre.isEnabled()) {
            return;
        }
        if (jTextNombre.getText().equals("Ingresa el nombre del producto")) {
            jTextNombre.setText("");
        }
    }//GEN-LAST:event_jTextNombreMouseReleased

    private void jTextNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyReleased
        eliminarFilas();
        String texto = jTextNombre.getText().toLowerCase();
        for (Producto p : pData.listarProductos()) {
            String nombre = p.getNombre().toLowerCase();
            if (nombre.startsWith(texto)) {
                modelo.addRow(new Object[]{
                    p.getIdProducto(),
                    p.getNombre(),
                    p.getStock()
                });
            }
        }
    }//GEN-LAST:event_jTextNombreKeyReleased

    private void jTDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDetalleMouseClicked
        int filaSelecionada = jTDetalle.getSelectedRow();
        if (filaSelecionada != -1) {
            int idProducto = (Integer) jTDetalle.getValueAt(jTDetalle.getSelectedRow(), 0);
            producto = pData.buscarProducto(idProducto);
            jTextCantidad.setEnabled(true);
        }
    }//GEN-LAST:event_jTDetalleMouseClicked

    private void jTextCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCantidadKeyReleased
        int num = Integer.parseInt(jTextCantidad.getText());
        if (num > producto.getStock()) {
            jTextCantidad.setForeground(Color.red);
        } else {
            jTextCantidad.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_jTextCantidadKeyReleased

    private void jTextCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCantidadActionPerformed
        int num = Integer.parseInt(jTextCantidad.getText());
        if (num < producto.getStock()) {
            cantidad = num;

            crearBtn.setEnabled(true);
            jLCrear.setEnabled(true);
        } else {
            crearBtn.setEnabled(false);
            jLCrear.setEnabled(false);
        }
    }//GEN-LAST:event_jTextCantidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel cancelarBtn;
    private javax.swing.JPanel crearBtn;
    private javax.swing.JLabel jLApellido1;
    private javax.swing.JLabel jLCancelar;
    private javax.swing.JLabel jLCrear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTDetalle;
    private javax.swing.JTextField jTextCantidad;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void cerrarVentana() {
        dispose();
        fPedidos.cargarTabla();
    }

    private void cabeceraTabla() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Stock");

        jTDetalle.setModel(modelo);

        //Centrar títulos de la tabla
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) jTDetalle.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        //Centrar contenido de tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        jTDetalle.setDefaultRenderer(Object.class, centerRenderer);
    }

    public void cargarTabla() {
        eliminarFilas();
        for (Producto producto : pData.listarProductos()) {
            if (producto.isDisponible()) {
                modelo.addRow(new Object[]{
                    producto.getIdProducto(),
                    producto.getNombre(),
                    producto.getStock()
                });
            }
        }
    }

    private void eliminarFilas() {
        int filas = jTDetalle.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            modelo.removeRow(filas);
        }
    }
}
