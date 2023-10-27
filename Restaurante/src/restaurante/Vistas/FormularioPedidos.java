package restaurante.Vistas;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import restaurante.AccesoDatos.DetalleData;
import restaurante.AccesoDatos.EmpleadoData;
import restaurante.AccesoDatos.MesaData;
import restaurante.AccesoDatos.PedidoData;
import restaurante.AccesoDatos.ProductoData;
import restaurante.Entidades.Detalle;
import restaurante.Entidades.Empleado;
import restaurante.Entidades.EstadoMesa;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Pedido;
import restaurante.Entidades.Producto;

public class FormularioPedidos extends javax.swing.JInternalFrame {

    boolean pedidoCreado;
    Pedido pedido;

    GestorPedidos gPedidos;
    DetalleData dData = new DetalleData();
    EmpleadoData eData = new EmpleadoData();
    MesaData mData = new MesaData();
    PedidoData pData = new PedidoData();
    ProductoData prData = new ProductoData();

    private DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int x, int y) {
            return false;
        }

        @Override
        public Class<?> getColumnClass(int c) {
            if (c == 0) {
                return String.class;
            } else if (c == 1) {
                return Integer.class;
            }
            return Double.class;
        }
    };

    /**
     * Creates new form FormularioPedidos
     */
    public FormularioPedidos(GestorPedidos gPedidos) {
        initComponents();

        this.gPedidos = gPedidos;
        this.pedidoCreado = false;

        cabeceraTabla();
        cargarComboMesas();
        cargarComboEmpleados();

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
        titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        agregarBtn = new javax.swing.JPanel();
        jLAgregar = new javax.swing.JLabel();
        quitarBtn = new javax.swing.JPanel();
        jLQuitar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDetalle = new javax.swing.JTable();
        crearBtn = new javax.swing.JPanel();
        jLCrear = new javax.swing.JLabel();
        anularBtn = new javax.swing.JPanel();
        jLAnular = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextTotal = new javax.swing.JTextField();
        jComboMesas = new javax.swing.JComboBox<>();
        jLMesa = new javax.swing.JLabel();
        jLMesero = new javax.swing.JLabel();
        jComboEmpleados = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(500, 580));

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        titulo.setBackground(new java.awt.Color(25, 25, 25));
        titulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(204, 204, 204));
        titulo.setText("DETALLE PEDIDO");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        agregarBtn.setBackground(new java.awt.Color(51, 51, 51));
        agregarBtn.setForeground(new java.awt.Color(51, 51, 51));
        agregarBtn.setEnabled(false);
        agregarBtn.setMaximumSize(new java.awt.Dimension(100, 30));
        agregarBtn.setMinimumSize(new java.awt.Dimension(100, 30));

        jLAgregar.setBackground(new java.awt.Color(51, 51, 51));
        jLAgregar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLAgregar.setForeground(new java.awt.Color(204, 204, 204));
        jLAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAgregar.setText("AGREGAR");
        jLAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout agregarBtnLayout = new javax.swing.GroupLayout(agregarBtn);
        agregarBtn.setLayout(agregarBtnLayout);
        agregarBtnLayout.setHorizontalGroup(
            agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        agregarBtnLayout.setVerticalGroup(
            agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        quitarBtn.setBackground(new java.awt.Color(51, 51, 51));
        quitarBtn.setForeground(new java.awt.Color(51, 51, 51));
        quitarBtn.setMaximumSize(new java.awt.Dimension(100, 30));
        quitarBtn.setMinimumSize(new java.awt.Dimension(100, 30));

        jLQuitar.setBackground(new java.awt.Color(51, 51, 51));
        jLQuitar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLQuitar.setForeground(new java.awt.Color(204, 204, 204));
        jLQuitar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLQuitar.setText("QUITAR");
        jLQuitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLQuitar.setEnabled(false);
        jLQuitar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLQuitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLQuitarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout quitarBtnLayout = new javax.swing.GroupLayout(quitarBtn);
        quitarBtn.setLayout(quitarBtnLayout);
        quitarBtnLayout.setHorizontalGroup(
            quitarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLQuitar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        quitarBtnLayout.setVerticalGroup(
            quitarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jScrollPane1.setForeground(new java.awt.Color(60, 63, 65));

        jTDetalle.setAutoCreateRowSorter(true);
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

        crearBtn.setBackground(new java.awt.Color(51, 51, 51));
        crearBtn.setForeground(new java.awt.Color(51, 51, 51));
        crearBtn.setMaximumSize(new java.awt.Dimension(100, 30));
        crearBtn.setMinimumSize(new java.awt.Dimension(100, 30));

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
            .addComponent(jLCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        crearBtnLayout.setVerticalGroup(
            crearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        anularBtn.setBackground(new java.awt.Color(51, 51, 51));
        anularBtn.setForeground(new java.awt.Color(51, 51, 51));
        anularBtn.setMaximumSize(new java.awt.Dimension(100, 30));
        anularBtn.setMinimumSize(new java.awt.Dimension(100, 30));

        jLAnular.setBackground(new java.awt.Color(51, 51, 51));
        jLAnular.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLAnular.setForeground(new java.awt.Color(204, 204, 204));
        jLAnular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAnular.setText("ANULAR");
        jLAnular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAnular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLAnular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAnularMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout anularBtnLayout = new javax.swing.GroupLayout(anularBtn);
        anularBtn.setLayout(anularBtnLayout);
        anularBtnLayout.setHorizontalGroup(
            anularBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLAnular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        anularBtnLayout.setVerticalGroup(
            anularBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLAnular, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("TOTAL PEDIDO:");

        jTextTotal.setBackground(new java.awt.Color(51, 51, 51));
        jTextTotal.setForeground(new java.awt.Color(204, 204, 204));
        jTextTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLMesa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLMesa.setForeground(new java.awt.Color(204, 204, 204));
        jLMesa.setText("Mesa:");

        jLMesero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLMesero.setForeground(new java.awt.Color(204, 204, 204));
        jLMesero.setText("Mesero:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(crearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(238, 238, 238)
                                        .addComponent(anularBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLMesa)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(71, 71, 71)
                                    .addComponent(jLMesero)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(238, 238, 238)
                                    .addComponent(quitarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(titulo)))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jComboMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(quitarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anularBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCrearMouseClicked
        JOptionPane.showMessageDialog(null, "Alta exitosa.");
        pedido.setPrecioPedido(Double.parseDouble(jTextTotal.getText()));
        dispose();
    }//GEN-LAST:event_jLCrearMouseClicked

    private void jLAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarMouseClicked

        Mesa mesa = (Mesa) jComboMesas.getSelectedItem();
        Empleado empleado = (Empleado) jComboEmpleados.getSelectedItem();

        if (pData.buscarPedido(mesa, empleado) == null) {
            pedido = new Pedido(mesa, empleado);
            pData.agregarPedido(pedido);
            
            mesa.setEstado(EstadoMesa.ATENDIDA);
            mData.modificarMesa(mesa);
        } else {
            pedido = pData.buscarPedido(mesa, empleado);
        }

        FormularioDetalle formulario = new FormularioDetalle(this, pedido);

        int x = (this.getWidth() - formulario.getWidth()) / 2;
        int y = (this.getHeight() - formulario.getHeight()) / 2;

        add(formulario, 0);

        formulario.setVisible(true);
        formulario.setLocation(x, y);
    }//GEN-LAST:event_jLAgregarMouseClicked

    private void jLQuitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLQuitarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLQuitarMouseClicked

    private void jTDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDetalleMouseClicked
        int filaSeleccionada = jTDetalle.getSelectedRow();
        if (filaSeleccionada != -1) {
            jLAnular.setEnabled(true);
            anularBtn.setEnabled(true);
        } else {
            jLAnular.setEnabled(false);
            anularBtn.setEnabled(false);
        }
    }//GEN-LAST:event_jTDetalleMouseClicked

    private void jLAnularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAnularMouseClicked
        for (Detalle detalle : dData.listarDetallesPedido(pedido.getIdPedido())) {
            Producto producto = detalle.getProducto();
            producto.setStock(producto.getStock() + detalle.getCantProducto());
            prData.modificarProducto(producto);
        }
        pData.eliminarPedido(pedido.getIdPedido());
        dispose();
    }//GEN-LAST:event_jLAnularMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregarBtn;
    private javax.swing.JPanel anularBtn;
    private javax.swing.JPanel crearBtn;
    private javax.swing.JComboBox<Empleado> jComboEmpleados;
    private javax.swing.JComboBox<Mesa> jComboMesas;
    private javax.swing.JLabel jLAgregar;
    private javax.swing.JLabel jLAnular;
    private javax.swing.JLabel jLCrear;
    private javax.swing.JLabel jLMesa;
    private javax.swing.JLabel jLMesero;
    private javax.swing.JLabel jLQuitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTDetalle;
    private javax.swing.JTextField jTextTotal;
    private javax.swing.JPanel quitarBtn;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void cabeceraTabla() {
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio xU");
        modelo.addColumn("Subtotal");

        jTDetalle.setModel(modelo);

        //Centrar títulos de la tabla
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) jTDetalle.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        //Centrar contenido de tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        jTDetalle.setDefaultRenderer(Object.class, centerRenderer);
    }

    public void cargarTablaPedido() {
        try {
            eliminarFilas();
            for (Detalle detalle : dData.listarDetallesPedido(pedido.getIdPedido())) {
                modelo.addRow(new Object[]{
                    detalle.getProducto().getNombre(),
                    detalle.getCantProducto(),
                    detalle.getProducto().getPrecio(),
                    detalle.calcularSubtotal(detalle)
                });
            }
            double suma = calcularSumaColumna(jTDetalle, 3);
            jTextTotal.setText(String.valueOf(suma));
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No hay productos para mostrar");
        }
    }

    private void eliminarFilas() {
        int filas = jTDetalle.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            modelo.removeRow(filas);
        }
    }

    private void cargarComboMesas() {
        jComboMesas.addItem(new Mesa());
        for (Mesa mesa : mData.listarMesas()) {
            jComboMesas.addItem(mesa);
        }
    }

    private void cargarComboEmpleados() {
        jComboEmpleados.addItem(new Empleado());
        for (Empleado mesero : eData.listarEmpleadosActivos()) {
            jComboEmpleados.addItem(mesero);
        }
    }

    public double calcularSumaColumna(JTable tabla, int col) {
        double suma = 0.0;
        int rowCount = modelo.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            double valorCelda = (double) modelo.getValueAt(i, col);
            suma += valorCelda;
        }
        return suma;
    }
}
