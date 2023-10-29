package restaurante.Vistas;

import javax.swing.JOptionPane;
import restaurante.AccesoDatos.MesaData;
import restaurante.Entidades.Mesa;

public class FormularioMesa extends javax.swing.JInternalFrame {
      MesaData mData= new MesaData();
      GestorMesa gMesa;
    /**
     * Creates new form FormularioMesa
     */
    public FormularioMesa(GestorMesa ventanaPrincipal) {
        initComponents();
        this.gMesa= ventanaPrincipal;
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
        jLTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLNumero = new javax.swing.JLabel();
        jTNumero = new javax.swing.JTextField();
        jLCapacidad = new javax.swing.JLabel();
        jTCapacidad = new javax.swing.JTextField();
        crearBtn = new javax.swing.JPanel();
        jLCrear = new javax.swing.JLabel();
        cancelarBtn = new javax.swing.JPanel();
        jLCancelar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(25, 25, 25));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(300, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(25, 25, 25));
        background.setForeground(new java.awt.Color(204, 204, 204));

        jLTitulo.setBackground(new java.awt.Color(25, 25, 25));
        jLTitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(204, 204, 204));
        jLTitulo.setText("AGREGAR MESA");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        jLNumero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLNumero.setForeground(new java.awt.Color(204, 204, 204));
        jLNumero.setText("Número");

        jTNumero.setBackground(new java.awt.Color(102, 102, 102));

        jLCapacidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLCapacidad.setForeground(new java.awt.Color(204, 204, 204));
        jLCapacidad.setText("Capacidad");

        jTCapacidad.setBackground(new java.awt.Color(102, 102, 102));

        crearBtn.setBackground(new java.awt.Color(51, 51, 51));
        crearBtn.setForeground(new java.awt.Color(51, 51, 51));

        jLCrear.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLCrear.setForeground(new java.awt.Color(204, 204, 204));
        jLCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCrear.setText("CREAR");
        jLCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCrearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout crearBtnLayout = new javax.swing.GroupLayout(crearBtn);
        crearBtn.setLayout(crearBtnLayout);
        crearBtnLayout.setHorizontalGroup(
            crearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        crearBtnLayout.setVerticalGroup(
            crearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        cancelarBtn.setBackground(new java.awt.Color(51, 51, 51));
        cancelarBtn.setForeground(new java.awt.Color(51, 51, 51));

        jLCancelar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLCancelar.setForeground(new java.awt.Color(204, 204, 204));
        jLCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCancelar.setText("CANCELAR");
        jLCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cancelarBtnLayout = new javax.swing.GroupLayout(cancelarBtn);
        cancelarBtn.setLayout(cancelarBtnLayout);
        cancelarBtnLayout.setHorizontalGroup(
            cancelarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );
        cancelarBtnLayout.setVerticalGroup(
            cancelarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(crearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTCapacidad)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTNumero))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCrearMouseClicked
        // TODO add your handling code here:
        try{
            int numero = Integer.parseInt(jTNumero.getText());
            int capacidad = Integer.parseInt(jTCapacidad.getText());
            
            Mesa encontrada = mData.buscarMesa(numero);
            if (encontrada == null) {
                Mesa mesa = new Mesa(numero,capacidad);
                mData.agregarMesa(mesa);
            } else  {
                JOptionPane.showMessageDialog(this, "La mesa ya existe, no es necesario crearla.");
            
            }
            cerrarVentana();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Introducir un numero válido");
        }
    }//GEN-LAST:event_jLCrearMouseClicked

    private void jLCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCancelarMouseClicked
           cerrarVentana();
    }//GEN-LAST:event_jLCancelarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel cancelarBtn;
    private javax.swing.JPanel crearBtn;
    private javax.swing.JLabel jLCancelar;
    private javax.swing.JLabel jLCapacidad;
    private javax.swing.JLabel jLCrear;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTCapacidad;
    private javax.swing.JTextField jTNumero;
    // End of variables declaration//GEN-END:variables

 private void cerrarVentana() {
        dispose();
        gMesa.cargarTabla();
    }
}
