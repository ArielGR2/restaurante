package restaurante.Vistas;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import restaurante.AccesoDatos.MesaData;
import restaurante.AccesoDatos.PedidoData;
import restaurante.Entidades.EstadoMesa;
import restaurante.Entidades.EstadoPedido;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Pedido;

public class GestorPedidos extends javax.swing.JInternalFrame {

    MesaData mData = new MesaData();
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

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
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
        estadoBtn = new javax.swing.JPanel();
        jLModEstado = new javax.swing.JLabel();
        pendienteRadioBtn = new javax.swing.JRadioButton();
        entregadoRadioBtn = new javax.swing.JRadioButton();
        pagadoRadioBtn = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        detalleBtn = new javax.swing.JPanel();
        jLDetalle = new javax.swing.JLabel();

        buttonGroup.add(pendienteRadioBtn);
        buttonGroup.add(entregadoRadioBtn);
        buttonGroup.add(pagadoRadioBtn);

        setClosable(true);
        setTitle("Gestor de Pedidos");
        setPreferredSize(new java.awt.Dimension(600, 700));

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        titulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(204, 204, 204));
        titulo.setText("LISTAR PEDIDOS");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

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

        estadoBtn.setBackground(new java.awt.Color(51, 51, 51));
        estadoBtn.setForeground(new java.awt.Color(51, 51, 51));
        estadoBtn.setEnabled(false);

        jLModEstado.setBackground(new java.awt.Color(51, 51, 51));
        jLModEstado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLModEstado.setForeground(new java.awt.Color(204, 204, 204));
        jLModEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLModEstado.setText("MODIFICAR ESTADO");
        jLModEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLModEstado.setEnabled(false);
        jLModEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLModEstadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout estadoBtnLayout = new javax.swing.GroupLayout(estadoBtn);
        estadoBtn.setLayout(estadoBtnLayout);
        estadoBtnLayout.setHorizontalGroup(
            estadoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLModEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        estadoBtnLayout.setVerticalGroup(
            estadoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLModEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        pendienteRadioBtn.setBackground(new java.awt.Color(25, 25, 25));
        pendienteRadioBtn.setForeground(new java.awt.Color(204, 204, 204));
        pendienteRadioBtn.setText("PENDIENTE");
        pendienteRadioBtn.setEnabled(false);

        entregadoRadioBtn.setBackground(new java.awt.Color(25, 25, 25));
        entregadoRadioBtn.setForeground(new java.awt.Color(204, 204, 204));
        entregadoRadioBtn.setText("ENTREGADO");
        entregadoRadioBtn.setEnabled(false);
        entregadoRadioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entregadoRadioBtnMouseClicked(evt);
            }
        });

        pagadoRadioBtn.setBackground(new java.awt.Color(25, 25, 25));
        pagadoRadioBtn.setForeground(new java.awt.Color(204, 204, 204));
        pagadoRadioBtn.setText("PAGADO");
        pagadoRadioBtn.setEnabled(false);
        pagadoRadioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagadoRadioBtnMouseClicked(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));

        detalleBtn.setBackground(new java.awt.Color(51, 51, 51));
        detalleBtn.setForeground(new java.awt.Color(51, 51, 51));
        detalleBtn.setEnabled(false);

        jLDetalle.setBackground(new java.awt.Color(51, 51, 51));
        jLDetalle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLDetalle.setForeground(new java.awt.Color(204, 204, 204));
        jLDetalle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDetalle.setText("VER DETALLE");
        jLDetalle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLDetalle.setEnabled(false);
        jLDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLDetalleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout detalleBtnLayout = new javax.swing.GroupLayout(detalleBtn);
        detalleBtn.setLayout(detalleBtnLayout);
        detalleBtnLayout.setHorizontalGroup(
            detalleBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        detalleBtnLayout.setVerticalGroup(
            detalleBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLDetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(todosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(xMesaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(xMeseroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(estadoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(pendienteRadioBtn)
                                .addGap(18, 18, 18)
                                .addComponent(entregadoRadioBtn)
                                .addGap(18, 18, 18)
                                .addComponent(pagadoRadioBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(anularBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(detalleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(todosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xMesaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xMeseroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anularBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detalleBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(entregadoRadioBtn)
                        .addComponent(pagadoRadioBtn)
                        .addComponent(pendienteRadioBtn))
                    .addComponent(estadoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
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
        if (jLAnular.isEnabled() && anularBtn.isEnabled()) {
            int idPedido = (Integer) jTPedidos.getValueAt(jTPedidos.getSelectedRow(), 0);
            pData.eliminarPedido(idPedido);
            cargarTabla();
        }
    }//GEN-LAST:event_jLAnularMouseClicked

    private void jTPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPedidosMouseClicked
        int filaSeleccionada = jTPedidos.getSelectedRow();
        if (filaSeleccionada != -1) {
            jLAnular.setEnabled(true);
            anularBtn.setEnabled(true);

            jLDetalle.setEnabled(true);
            detalleBtn.setEnabled(true);

            radioButtons();
        }
    }//GEN-LAST:event_jTPedidosMouseClicked

    private void jLTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLTodosMouseClicked
        cargarTabla();
    }//GEN-LAST:event_jLTodosMouseClicked

    private void jLxMesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLxMesaMouseClicked
        int numMesa;
        try {
            numMesa = Integer.valueOf(JOptionPane.showInputDialog(this, "Introduzca el número de la mesa:", "", JOptionPane.QUESTION_MESSAGE));

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

        } catch (NumberFormatException nfe) {
            numMesa = 0;
        }

    }//GEN-LAST:event_jLxMesaMouseClicked

    private void jLxMeseroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLxMeseroMouseClicked

        MensajeMeseros mensaje = new MensajeMeseros(this);

        int x = (this.getWidth() - mensaje.getWidth()) / 2;
        int y = (this.getHeight() - mensaje.getHeight()) / 2;

        add(mensaje, 0);

        mensaje.setVisible(true);
        mensaje.setLocation(x, y);

    }//GEN-LAST:event_jLxMeseroMouseClicked

    private void jLModEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModEstadoMouseClicked
        if (jLModEstado.isEnabled() && estadoBtn.isEnabled()) {
            int idPedido = (Integer) jTPedidos.getValueAt(jTPedidos.getSelectedRow(), 0);
            Pedido pedido = pData.buscarPedido(idPedido);

            if (entregadoRadioBtn.isSelected()) {
                pedido.setEstado(EstadoPedido.ENTREGADO);
                pData.modificarPedido(pedido);
            } else if (pagadoRadioBtn.isSelected()) {
                //Al pagar el pedido verifico si es el último a pagar y si lo es la mesa pasa a libre
                pedido.setEstado(EstadoPedido.PAGADO);
                pData.modificarPedido(pedido);

                Mesa mesa = pedido.getMesa();

                int pedidosMesa = pData.listarPedidosMesa(mesa.getNumMesa()).size();
                int pedidosPagos = pData.listarPedidosMesaPagos(mesa.getNumMesa()).size();

                if (pedidosPagos == pedidosMesa) {
                    mesa.setEstado(EstadoMesa.LIBRE);
                    mData.modificarMesa(mesa);
                    JOptionPane.showMessageDialog(this, "Mesa desocupada.");
                }
            }
            cargarTabla();
            anularBotones();
        }
    }//GEN-LAST:event_jLModEstadoMouseClicked

    private void jLDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLDetalleMouseClicked
        if (jLDetalle.isEnabled() && detalleBtn.isEnabled()) {
            int idPedido = (Integer) jTPedidos.getValueAt(jTPedidos.getSelectedRow(), 0);
            Pedido pedido = pData.buscarPedido(idPedido);

            ListaDetalles listado = new ListaDetalles(pedido);

            int x = (this.getWidth() - listado.getWidth()) / 2;
            int y = (this.getHeight() - listado.getHeight()) / 2;

            add(listado, 0);

            listado.setVisible(true);
            listado.setLocation(x, y);
        }
    }//GEN-LAST:event_jLDetalleMouseClicked

    private void entregadoRadioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entregadoRadioBtnMouseClicked
        if (entregadoRadioBtn.isSelected()) {
            jLModEstado.setEnabled(true);
            estadoBtn.setEnabled(true);
        }

    }//GEN-LAST:event_entregadoRadioBtnMouseClicked

    private void pagadoRadioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagadoRadioBtnMouseClicked
        if (pagadoRadioBtn.isSelected()) {
            jLModEstado.setEnabled(true);
            estadoBtn.setEnabled(true);
        }
    }//GEN-LAST:event_pagadoRadioBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregarBtn;
    private javax.swing.JPanel anularBtn;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JPanel detalleBtn;
    private javax.swing.JRadioButton entregadoRadioBtn;
    private javax.swing.JPanel estadoBtn;
    private javax.swing.JLabel jLAgregar;
    private javax.swing.JLabel jLAnular;
    private javax.swing.JLabel jLDetalle;
    private javax.swing.JLabel jLModEstado;
    private javax.swing.JLabel jLTodos;
    private javax.swing.JLabel jLxMesa;
    private javax.swing.JLabel jLxMesero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTPedidos;
    private javax.swing.JRadioButton pagadoRadioBtn;
    private javax.swing.JRadioButton pendienteRadioBtn;
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
                pedido.getPrecioPedido(),
                pedido.getEstado()
            });
        }
        anularBotones();
    }

    private void anularBotones() {
        jLModEstado.setEnabled(false);
        estadoBtn.setEnabled(false);

        jLAnular.setEnabled(false);
        anularBtn.setEnabled(false);

        pendienteRadioBtn.setEnabled(false);
        entregadoRadioBtn.setEnabled(false);
        pagadoRadioBtn.setEnabled(false);
    }

    private void radioButtons() {
        String estado = (jTPedidos.getValueAt(jTPedidos.getSelectedRow(), 4)).toString();
        switch (estado) {
            case "PENDIENTE":
                pendienteRadioBtn.setSelected(true);
                pendienteRadioBtn.setEnabled(false);
                entregadoRadioBtn.setEnabled(true);
                break;
            case "ENTREGADO":
                entregadoRadioBtn.setSelected(true);
                entregadoRadioBtn.setEnabled(false);
                pagadoRadioBtn.setEnabled(true);
                break;
            default:
                pagadoRadioBtn.setSelected(true);
                pagadoRadioBtn.setEnabled(false);
                break;
        }
    }
}
