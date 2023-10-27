package restaurante.Vistas;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import restaurante.AccesoDatos.PedidoData;
import restaurante.Entidades.Pedido;

public class GestorPedidos extends javax.swing.JInternalFrame {
    
    PedidoData pData = new PedidoData();
    Principal ventanaPrincipal;
    
    private DefaultTableModel modelo = new DefaultTableModel() {
        
        @Override
        public boolean isCellEditable(int x, int y) {
            return false;
        }
        
        @Override
        public Class<?> getColumnClass(int c) {
            if (c == 2 && c == 4) {
                return String.class;
            } else if (c == 3) {
                return Double.class;
            }
            return Integer.class;
        }
    };

    /**
     * Creates new form GestorPedidos
     *
     * @param ventanaPrincipal
     */
    public GestorPedidos(Principal ventanaPrincipal) {
        initComponents();
        this.ventanaPrincipal = ventanaPrincipal;
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
        titulo = new javax.swing.JLabel();
        todosBtn = new javax.swing.JPanel();
        jLTodos = new javax.swing.JLabel();
        xMesaBtn = new javax.swing.JPanel();
        jLxMesa = new javax.swing.JLabel();
        xMeseroBtn = new javax.swing.JPanel();
        jLxMesero = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPedidos = new javax.swing.JTable();
        agregarBtn = new javax.swing.JPanel();
        jLAgregar = new javax.swing.JLabel();
        anularBtn = new javax.swing.JPanel();
        jLAnular = new javax.swing.JLabel();
        modificarBtn = new javax.swing.JPanel();
        jLModificar = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Gestor de Pedidos");
        setPreferredSize(new java.awt.Dimension(600, 700));

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        titulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(204, 204, 204));
        titulo.setText("LISTAR PEDIDOS");

        todosBtn.setBackground(new java.awt.Color(51, 51, 51));
        todosBtn.setForeground(new java.awt.Color(51, 51, 51));

        jLTodos.setBackground(new java.awt.Color(51, 51, 51));
        jLTodos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLTodos.setForeground(new java.awt.Color(204, 204, 204));
        jLTodos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTodos.setText("TODOS");
        jLTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLTodosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout todosBtnLayout = new javax.swing.GroupLayout(todosBtn);
        todosBtn.setLayout(todosBtnLayout);
        todosBtnLayout.setHorizontalGroup(
            todosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTodos, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        todosBtnLayout.setVerticalGroup(
            todosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTodos, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        xMesaBtn.setBackground(new java.awt.Color(51, 51, 51));
        xMesaBtn.setForeground(new java.awt.Color(51, 51, 51));

        jLxMesa.setBackground(new java.awt.Color(51, 51, 51));
        jLxMesa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLxMesa.setForeground(new java.awt.Color(204, 204, 204));
        jLxMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLxMesa.setText("POR MESA");
        jLxMesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLxMesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLxMesaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout xMesaBtnLayout = new javax.swing.GroupLayout(xMesaBtn);
        xMesaBtn.setLayout(xMesaBtnLayout);
        xMesaBtnLayout.setHorizontalGroup(
            xMesaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLxMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        xMesaBtnLayout.setVerticalGroup(
            xMesaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLxMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        xMeseroBtn.setBackground(new java.awt.Color(51, 51, 51));
        xMeseroBtn.setForeground(new java.awt.Color(51, 51, 51));

        jLxMesero.setBackground(new java.awt.Color(51, 51, 51));
        jLxMesero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLxMesero.setForeground(new java.awt.Color(204, 204, 204));
        jLxMesero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLxMesero.setText("POR MESERO");
        jLxMesero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLxMesero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLxMeseroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout xMeseroBtnLayout = new javax.swing.GroupLayout(xMeseroBtn);
        xMeseroBtn.setLayout(xMeseroBtnLayout);
        xMeseroBtnLayout.setHorizontalGroup(
            xMeseroBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLxMesero, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        xMeseroBtnLayout.setVerticalGroup(
            xMeseroBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLxMesero, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jScrollPane1.setForeground(new java.awt.Color(60, 63, 65));

        jTPedidos.setForeground(new java.awt.Color(60, 63, 65));
        jTPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTPedidos.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jTPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTPedidos);

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
            .addComponent(jLAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        agregarBtnLayout.setVerticalGroup(
            agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        anularBtn.setBackground(new java.awt.Color(51, 51, 51));
        anularBtn.setForeground(new java.awt.Color(51, 51, 51));
        anularBtn.setEnabled(false);

        jLAnular.setBackground(new java.awt.Color(51, 51, 51));
        jLAnular.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLAnular.setForeground(new java.awt.Color(204, 204, 204));
        jLAnular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAnular.setText("ANULAR");
        jLAnular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLAnular.setEnabled(false);
        jLAnular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAnularMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout anularBtnLayout = new javax.swing.GroupLayout(anularBtn);
        anularBtn.setLayout(anularBtnLayout);
        anularBtnLayout.setHorizontalGroup(
            anularBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLAnular, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        anularBtnLayout.setVerticalGroup(
            anularBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLAnular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        modificarBtn.setBackground(new java.awt.Color(51, 51, 51));
        modificarBtn.setForeground(new java.awt.Color(51, 51, 51));
        modificarBtn.setEnabled(false);

        jLModificar.setBackground(new java.awt.Color(51, 51, 51));
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
            .addComponent(jLModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        modificarBtnLayout.setVerticalGroup(
            modificarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(titulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(todosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xMesaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xMeseroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anularBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(todosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xMesaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xMeseroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 519, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modificarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anularBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(209, Short.MAX_VALUE)))
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

    private void jLAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAgregarMouseClicked
        FormularioPedidos formulario = new FormularioPedidos(this);
        
        
        int x = (this.getWidth() - formulario.getWidth()) / 2;
        int y = (this.getHeight() - formulario.getHeight()) / 2;
        
        add(formulario, 0);
        
        formulario.setVisible(true);
        formulario.setLocation(x, y);
    }//GEN-LAST:event_jLAgregarMouseClicked

    private void jLAnularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAnularMouseClicked
        int idPedido = (Integer) jTPedidos.getValueAt(jTPedidos.getSelectedRow(), 0);
        pData.eliminarPedido(idPedido);
        cargarTabla();
    }//GEN-LAST:event_jLAnularMouseClicked

    private void jTPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPedidosMouseClicked
        int filaSeleccionada = jTPedidos.getSelectedRow();
        if (filaSeleccionada != -1) {
            jLModificar.setEnabled(true);
            modificarBtn.setEnabled(true);
            
            jLAnular.setEnabled(true);
            anularBtn.setEnabled(true);
        }
    }//GEN-LAST:event_jTPedidosMouseClicked

    private void jLTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLTodosMouseClicked
        cargarTabla();
    }//GEN-LAST:event_jLTodosMouseClicked

    private void jLxMesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLxMesaMouseClicked
        int numMesa = Integer.valueOf(JOptionPane.showInputDialog(this, "Introduzca el número de la mesa:", "", JOptionPane.QUESTION_MESSAGE));
        
        eliminarFilas();
        
        for (Pedido pedido : pData.listarPedidosMesa(numMesa)) {
            modelo.addRow(new Object[]{
                pedido.getIdPedido(),
                pedido.getMesa().getNumMesa(),
                pedido.getEmpleado(),
                pedido.getPrecioPedido(),
                pedido.getEstado()
            });
        }
        anularBotones();
    }//GEN-LAST:event_jLxMesaMouseClicked

    private void jLxMeseroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLxMeseroMouseClicked
        
        MensajeMeseros mensaje = new MensajeMeseros(this);
        
        int x = (this.getWidth() - mensaje.getWidth()) / 2;
        int y = (this.getHeight() - mensaje.getHeight()) / 2;
        
        add(mensaje, 0);
        mensaje.setVisible(true);
        mensaje.setLocation(x, y);
        
    }//GEN-LAST:event_jLxMeseroMouseClicked

    private void jLModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLModificarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregarBtn;
    private javax.swing.JPanel anularBtn;
    private javax.swing.JLabel jLAgregar;
    private javax.swing.JLabel jLAnular;
    private javax.swing.JLabel jLModificar;
    private javax.swing.JLabel jLTodos;
    private javax.swing.JLabel jLxMesa;
    private javax.swing.JLabel jLxMesero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTPedidos;
    private javax.swing.JPanel modificarBtn;
    private javax.swing.JLabel titulo;
    private javax.swing.JPanel todosBtn;
    private javax.swing.JPanel xMesaBtn;
    private javax.swing.JPanel xMeseroBtn;
    // End of variables declaration//GEN-END:variables

    private void cabeceraTabla() {
        modelo.addColumn("ID");
        modelo.addColumn("Mesa");
        modelo.addColumn("Empleado");
        modelo.addColumn("Monto");
        modelo.addColumn("Estado");
        
        jTPedidos.setModel(modelo);

        //Centrar títulos de la tabla
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) jTPedidos.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        //Centrar contenido de tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        jTPedidos.setDefaultRenderer(Object.class, centerRenderer);
    }
    
    public void cargarTabla() {
        eliminarFilas();
        for (Pedido pedido : pData.listarPedidos()) {
            modelo.addRow(new Object[]{
                pedido.getIdPedido(),
                pedido.getMesa().getNumMesa(),
                pedido.getEmpleado(),
                pedido.getPrecioPedido(),
                pedido.getEstado()
            });
        }
        anularBotones();
    }
    
    private void eliminarFilas() {
        int filas = jTPedidos.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            modelo.removeRow(filas);
        }
    }
    
    public void cargarTablaMesero(int idEmpleado) {
        eliminarFilas();
        for (Pedido pedido : pData.listarPedidosEmpleado(idEmpleado)) {
            modelo.addRow(new Object[]{
                pedido.getIdPedido(),
                pedido.getMesa().getNumMesa(),
                pedido.getListaDetalles(),
                pedido.getPrecioPedido(),
                pedido.getEstado()
            });
        }
        anularBotones();
    }
    
    private void anularBotones() {
        jLModificar.setEnabled(false);
        modificarBtn.setEnabled(false);
        
        jLAnular.setEnabled(false);
        anularBtn.setEnabled(false);
    }
}
