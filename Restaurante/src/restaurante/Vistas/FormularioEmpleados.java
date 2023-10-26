package restaurante.Vistas;

import javax.swing.JOptionPane;
import restaurante.AccesoDatos.EmpleadoData;
import restaurante.Entidades.Empleado;

public class FormularioEmpleados extends javax.swing.JInternalFrame {

    EmpleadoData eData = new EmpleadoData();
    GestorEmpleados gEmpleados;

    /**
     * Creates new form FormularioEmpleados
     */

    public FormularioEmpleados(GestorEmpleados gEmpleados) {
        initComponents();
        this.gEmpleados = gEmpleados;
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
        jLDni = new javax.swing.JLabel();
        jTextDni = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLApellido = new javax.swing.JLabel();
        jTextApellido = new javax.swing.JTextField();
        crearBtn = new javax.swing.JPanel();
        jLCrear = new javax.swing.JLabel();
        cancelarBtn = new javax.swing.JPanel();
        jLCancelar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(25, 25, 25));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(300, 300));
        setMinimumSize(new java.awt.Dimension(300, 300));
        setPreferredSize(new java.awt.Dimension(300, 300));

        background.setBackground(new java.awt.Color(25, 25, 25));
        background.setForeground(new java.awt.Color(204, 204, 204));

        titulo.setBackground(new java.awt.Color(25, 25, 25));
        titulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(204, 204, 204));
        titulo.setText("AGREGAR EMPLEADOS");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        jLDni.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLDni.setForeground(new java.awt.Color(204, 204, 204));
        jLDni.setText("DNI");

        jTextDni.setBackground(new java.awt.Color(102, 102, 102));
        jTextDni.setForeground(new java.awt.Color(204, 204, 204));

        jLNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(204, 204, 204));
        jLNombre.setText("Nombre");

        jTextNombre.setBackground(new java.awt.Color(102, 102, 102));
        jTextNombre.setForeground(new java.awt.Color(204, 204, 204));

        jLApellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLApellido.setForeground(new java.awt.Color(204, 204, 204));
        jLApellido.setText("Apellido");

        jTextApellido.setBackground(new java.awt.Color(102, 102, 102));
        jTextApellido.setForeground(new java.awt.Color(204, 204, 204));

        crearBtn.setBackground(new java.awt.Color(51, 51, 51));
        crearBtn.setForeground(new java.awt.Color(51, 51, 51));
        crearBtn.setMaximumSize(new java.awt.Dimension(100, 30));
        crearBtn.setMinimumSize(new java.awt.Dimension(100, 30));
        crearBtn.setPreferredSize(new java.awt.Dimension(100, 30));

        jLCrear.setBackground(new java.awt.Color(51, 51, 51));
        jLCrear.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLCrear.setForeground(new java.awt.Color(204, 204, 204));
        jLCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCrear.setText("CREAR");
        jLCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(crearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLDni, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(jLApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(45, 45, 45)
                                .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(titulo)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextDni)
                    .addComponent(jLDni, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextNombre)
                    .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextApellido)
                    .addComponent(jLApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(crearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(25, 25, 25))
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
        try {
            int dni = Integer.parseInt(jTextDni.getText());
            String nombre = jTextNombre.getText();
            String apellido = jTextApellido.getText();
            Empleado encontrado = eData.buscarEmpleadoDni(dni);
            //Si no lo encuentra lo crea, si lo encuentra lo da de alta
            if (encontrado == null && verificarString(nombre) && verificarString(apellido)) {
                Empleado empleado = new Empleado(dni, nombre, apellido);
                eData.agregarEmpleado(empleado);
            }
            if (encontrado != null && encontrado.isEstado()) {
                JOptionPane.showMessageDialog(this, "El empleado ya existe, no es necesario crearlo.");
            } else {
                encontrado.setEstado(true);
                eData.modificarEmpleado(encontrado);
            }
            cerrarVentana();
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Introducir un DNI válido");
        } catch (NullPointerException npe){
            JOptionPane.showMessageDialog(this, "No debe haber campos vacíos");
        }
    }//GEN-LAST:event_jLCrearMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel cancelarBtn;
    private javax.swing.JPanel crearBtn;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLCancelar;
    private javax.swing.JLabel jLCrear;
    private javax.swing.JLabel jLDni;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextDni;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void cerrarVentana() {
        dispose();
        gEmpleados.cargarTabla();
    }
    
      private boolean verificarString(String texto) {
        // Verifica que el string no este vacio
        if (texto.isEmpty()) {
            return false;
        }
        // Verifica que el string no contenga numeros 
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if ((letra < 65 || letra > 90) && (letra < 97 || letra > 122)) {
                return false;
            }
        }
        return true;
    }
}
