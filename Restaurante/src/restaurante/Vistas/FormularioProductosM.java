package restaurante.Vistas;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import restaurante.AccesoDatos.ProductoData;
import restaurante.Entidades.Producto;

public class FormularioProductosM extends javax.swing.JInternalFrame {

    ProductoData pData = new ProductoData();
    GestorProductos gProductos;
    private int id;
    private String nombreOriginal;
    private int stockOriginal;
    private String precioOriginal;
    private boolean edit_precio = false;

    /**
     * Creates new form FormularioEmpleados
     */

    public FormularioProductosM(GestorProductos ventanaPrincipal,int id,String psNombre,int psStock, String psPrecio) {
        this.nombreOriginal = psNombre;
        this.stockOriginal = psStock;
        this.precioOriginal = psPrecio;
        initComponents();
        
        this.gProductos = ventanaPrincipal;
        this.id = id;
        jTNombre.setText(psNombre);
        jTStock.setText(psStock+"");
        jTPrecio.setText(psPrecio);
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
        jLNombre = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLNombreAlert = new javax.swing.JLabel();
        jLStock = new javax.swing.JLabel();
        jTStock = new javax.swing.JTextField();
        jLStockAlert = new javax.swing.JLabel();
        jLPrecio = new javax.swing.JLabel();
        jTPrecio = new javax.swing.JTextField();
        jLPrecioAlert = new javax.swing.JLabel();
        modificarBtn = new javax.swing.JPanel();
        jLModificar = new javax.swing.JLabel();
        cancelarBtn = new javax.swing.JPanel();
        jLCancelar = new javax.swing.JLabel();

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
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("MODIFICAR PRODUCTOS");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        jLNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(204, 204, 204));
        jLNombre.setText("Nombre");

        jTNombre.setBackground(new java.awt.Color(102, 102, 102));
        jTNombre.setForeground(new java.awt.Color(204, 204, 204));
        jTNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNombreFocusLost(evt);
            }
        });
        jTNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTNombreMouseReleased(evt);
            }
        });
        jTNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTNombreKeyReleased(evt);
            }
        });

        jLNombreAlert.setBackground(new java.awt.Color(25, 25, 25));
        jLNombreAlert.setForeground(new java.awt.Color(204, 204, 204));
        jLNombreAlert.setText(" ");

        jLStock.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLStock.setForeground(new java.awt.Color(204, 204, 204));
        jLStock.setText("Stock");

        jTStock.setBackground(new java.awt.Color(102, 102, 102));
        jTStock.setForeground(new java.awt.Color(204, 204, 204));
        jTStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTStock.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTStockFocusLost(evt);
            }
        });
        jTStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTStockMouseReleased(evt);
            }
        });
        jTStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTStockKeyReleased(evt);
            }
        });

        jLStockAlert.setBackground(new java.awt.Color(25, 25, 25));
        jLStockAlert.setForeground(new java.awt.Color(204, 204, 204));
        jLStockAlert.setText(" ");

        jLPrecio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLPrecio.setForeground(new java.awt.Color(204, 204, 204));
        jLPrecio.setText("Precio");

        jTPrecio.setBackground(new java.awt.Color(102, 102, 102));
        jTPrecio.setForeground(new java.awt.Color(204, 204, 204));
        jTPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTPrecioFocusLost(evt);
            }
        });
        jTPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTPrecioMouseReleased(evt);
            }
        });
        jTPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTPrecioKeyReleased(evt);
            }
        });

        jLPrecioAlert.setBackground(new java.awt.Color(25, 25, 25));
        jLPrecioAlert.setForeground(new java.awt.Color(204, 204, 204));
        jLPrecioAlert.setText(" ");

        modificarBtn.setBackground(new java.awt.Color(51, 51, 51));
        modificarBtn.setForeground(new java.awt.Color(51, 51, 51));
        modificarBtn.setMaximumSize(new java.awt.Dimension(100, 30));
        modificarBtn.setMinimumSize(new java.awt.Dimension(100, 30));
        modificarBtn.setPreferredSize(new java.awt.Dimension(100, 30));

        jLModificar.setBackground(new java.awt.Color(51, 51, 51));
        jLModificar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLModificar.setForeground(new java.awt.Color(204, 204, 204));
        jLModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLModificar.setText("MODIFICAR");
        jLModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout modificarBtnLayout = new javax.swing.GroupLayout(modificarBtn);
        modificarBtn.setLayout(modificarBtnLayout);
        modificarBtnLayout.setHorizontalGroup(
            modificarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        modificarBtnLayout.setVerticalGroup(
            modificarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
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
        jLCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
            .addComponent(jLCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLNombreAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(backgroundLayout.createSequentialGroup()
                                    .addComponent(modificarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                    .addComponent(jLPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addGap(45, 45, 45)
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLPrecioAlert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addGroup(backgroundLayout.createSequentialGroup()
                                    .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(jLStock, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLStockAlert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTStock, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTNombre)
                    .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLNombreAlert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLStock, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLStockAlert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTPrecio)
                    .addComponent(jLPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLPrecioAlert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(modificarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
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

    private void jLModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarMouseClicked
        try {
            if (!verificacionCampos()){
                return;
            }
            String nombre = jTNombre.getText();
            if (!verificacionNombre(nombreOriginal, nombre)){
                JOptionPane.showMessageDialog(this, "¡Error! El nombre del producto ya existe. ");
                return;
            }
            int stock = Integer.parseInt(jTStock.getText());
            double precio = Double.parseDouble(!jTPrecio.getText().startsWith("$")?jTPrecio.getText():jTPrecio.getText().substring(1,jTPrecio.getText().length()));

            Producto producto = pData.buscarProducto(id);
            //Si no lo encuentra lo crea, si lo encuentra lo da de alta
            if (producto != null) {
                producto.setNombre(nombre);
                producto.setStock(stock);
                producto.setPrecio(precio);
                producto.setDisponible(stock>0?true:false);
                pData.modificarProducto(producto);
            } else {
                JOptionPane.showMessageDialog(this, "¡ERROR! El producto que deseas modificar no existe. ");
            }
            cerrarVentana();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al modificar producto. Stock y Precio no pueden contener letras. ");
        }
    }//GEN-LAST:event_jLModificarMouseClicked

    private void jTPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPrecioKeyReleased
        // TODO add your handling code here:
        if (!jTPrecio.getText().startsWith("$")){
            jTPrecio.setText("$".concat(jTPrecio.getText()));
        }
        if (!checkFiltroNum(evt.getKeyChar())){
            jTPrecio.setText(quitarLetrasString(jTPrecio.getText()));
        }
    }//GEN-LAST:event_jTPrecioKeyReleased

    private void jTStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTStockKeyReleased
        // TODO add your handling code here:
        if (!checkFiltroNum(evt.getKeyChar())){
            jTStock.setText(quitarLetrasString(jTStock.getText()));
        }
    }//GEN-LAST:event_jTStockKeyReleased

    private void jTNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreKeyReleased

    private void jTNombreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTNombreMouseReleased
        // TODO add your handling code here:
        jTNombre.setText("");
        jLNombreAlert.setText("Actual: "+nombreOriginal);
        jLNombreAlert.setForeground(new Color(102,255,255));
    }//GEN-LAST:event_jTNombreMouseReleased

    private void jTNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNombreFocusLost
        // TODO add your handling code here:
        if (jTNombre.getText().isEmpty()) {
            jTNombre.setText(nombreOriginal);
        }
        jLNombreAlert.setText(" ");
    }//GEN-LAST:event_jTNombreFocusLost

    private void jTStockMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTStockMouseReleased
        // TODO add your handling code here:
        jTStock.setText("");
        jLStockAlert.setText("Actual: "+stockOriginal);
        jLStockAlert.setForeground(new Color(102,255,255));
    }//GEN-LAST:event_jTStockMouseReleased

    private void jTStockFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTStockFocusLost
        // TODO add your handling code here:
        if (jTStock.getText().isEmpty()) {
            jTStock.setText(stockOriginal+"");
        }
        jLStockAlert.setText(" ");
    }//GEN-LAST:event_jTStockFocusLost

    private void jTPrecioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPrecioMouseReleased
        // TODO add your handling code here:
        jTPrecio.setText("");
        jLPrecioAlert.setText("Actual: "+precioOriginal);
        jLPrecioAlert.setForeground(new Color(102,255,255));
        edit_precio = true;
    }//GEN-LAST:event_jTPrecioMouseReleased

    private void jTPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPrecioFocusLost
        // TODO add your handling code here:
        if (jTPrecio.getText().isEmpty()) {
            jTPrecio.setText(precioOriginal);
        }
        jLPrecioAlert.setText(" ");
        edit_precio = false;
    }//GEN-LAST:event_jTPrecioFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel cancelarBtn;
    private javax.swing.JLabel jLCancelar;
    private javax.swing.JLabel jLModificar;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombreAlert;
    private javax.swing.JLabel jLPrecio;
    private javax.swing.JLabel jLPrecioAlert;
    private javax.swing.JLabel jLStock;
    private javax.swing.JLabel jLStockAlert;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTextField jTStock;
    private javax.swing.JPanel modificarBtn;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void cerrarVentana() {
        dispose();
        gProductos.cargarTabla();
    }
    
    private boolean checkFiltroNum(int t){ // CHECK SOLO NUMEROS EN INT
        if (!(t == 8 || t == 10 || t == 27 || (t == 46 && edit_precio == true) || (t >= 48 && t <= 57))){
            JOptionPane.showMessageDialog(this, "Solo puedes ingresar numeros. ");
            return false;
        }
        return true;
    }
    
    private boolean numTFVerificacion(String cad){ // CHECK SOLO NUMEROS EN STRING
        byte[] t = cad.getBytes(StandardCharsets.US_ASCII);
        for (int i = 0; i < cad.length(); i++) {
            if (!(t[i] == 8 || t[i] == 10 || t[i] == 27 || (t[i] == 46 && edit_precio == true) || (t[i] >= 48 && t[i] <= 57))){
                return false;
            }
        }
        return true;
    }
    
    private boolean verificacionCampos() {
        if (jTNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduce el nombre del producto. ");
            return false;
        } else if (jTStock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduce el Stock del producto. ");
            return false;
        } else if (jTPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduce el Precio del producto. ");
            return false;
        }
        if (jTStock.getText().startsWith("-")){
            JOptionPane.showMessageDialog(this, "No puedes ingresar numeros negativos al Stock. ");
            return false;
        }else if (jTPrecio.getText().startsWith("-")){
           JOptionPane.showMessageDialog(this, "No puedes ingresar numeros negativos al Stock. ");
           return false;
        }
        
        return true;
    }
    
    private String quitarLetrasString(String text){
        String textf = "";
        int cant_puntos = 0;
        for (int i=0;i<text.length();i++){
            String letra = text.charAt(i)+"";
            if (numTFVerificacion(letra) || (letra.equals("$") && i == 0)){
                textf = textf.concat(letra);
            }
        }
        return textf;
    }
    
    private boolean verificacionNombre(String nombre, String nombref){
        if (nombre.equals(nombref)) {
            return true;
        }else{
            Producto nombreExistente = pData.buscarProducto(nombref);
            if (nombreExistente == null){
                return true;
            }
        }
        return false;
    }
}
