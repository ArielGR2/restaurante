package restaurante.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import restaurante.AccesoDatos.PedidoData;
import restaurante.AccesoDatos.EmpleadoData;
import restaurante.AccesoDatos.MesaData;
import restaurante.Entidades.Empleado;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Pedido;

public class GestorInformes extends javax.swing.JFrame {

    PedidoData pedido1 = new PedidoData();
    DefaultListModel listModel = new DefaultListModel();
    
    public GestorInformes() {
        initComponents();
        cargarComboMesas();
        cargarComboEmpleados();
        jListPedidos.setModel(listModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTHoraEntrada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLResultado1 = new javax.swing.JLabel();
        jD1Fecha = new com.toedter.calendar.JDateChooser();
        jD2Fecha = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcbEmpleados = new javax.swing.JComboBox<>();
        jcbMesas = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTHoraSalida = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jD3Fecha = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPedidos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Calcular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("INFORMES");

        jLabel2.setText("Dia ");

        jLabel3.setText("Dia");

        jLabel4.setText("Mesero");

        jLabel5.setText("Mesa");

        jTHoraEntrada.setText("18:00");

        jLabel6.setText("Hora de entrada");

        jLabel7.setText("Resultado de la consulta:");

        jD1Fecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jD1FechaPropertyChange(evt);
            }
        });

        jLabel8.setText("Calcular ingreso en un día determinado:");

        jLabel9.setText("Calcular en un día detreminado por Mesero:");

        jLabel10.setText("Calcular el ingreso en una mesa determinada en un rango horario:");

        jLabel11.setText("Hora de salida");

        jTHoraSalida.setText("23:30");

        jLabel12.setText("Dia ");

        jListPedidos.setPreferredSize(new java.awt.Dimension(0, 200));
        jScrollPane1.setViewportView(jListPedidos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(181, 181, 181)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jcbMesas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jD3Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel11)
                                            .addComponent(jTHoraEntrada)
                                            .addComponent(jTHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(45, 45, 45)
                                        .addComponent(jD2Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel4)
                                        .addGap(29, 29, 29)
                                        .addComponent(jcbEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addComponent(jButton2))
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(38, 38, 38)
                                        .addComponent(jD1Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 2, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel7)
                        .addGap(60, 60, 60)
                        .addComponent(jLResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2))
                    .addComponent(jD1Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jD2Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jcbEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addGap(74, 74, 74)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jD3Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLResultado1))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jD1FechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jD1FechaPropertyChange
        if (jD1Fecha.getDate() != null) {

            LocalDate fechaN = jD1Fecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            jLResultado1.setText("$ "+String.valueOf(pedido1.calculaMontoDia(fechaN)));
            cargaLista(pedido1.listarConsulta1(fechaN));
        }
    }//GEN-LAST:event_jD1FechaPropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (jD2Fecha.getDate() != null && jcbEmpleados.getSelectedIndex() > 0) {
            LocalDate fechaN = jD2Fecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Empleado empleado1 = (Empleado) jcbEmpleados.getSelectedItem();
            jLResultado1.setText(String.valueOf(pedido1.calculaMontoDiaMesero(fechaN, empleado1)));
            cargaLista(pedido1.listarConsulta2(fechaN,empleado1));
        } else {
            JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                if (jD3Fecha.getDate() != null && jcbMesas.getSelectedIndex() > 0 && verificarHorario(jTHoraEntrada.getText()) &&verificarHorario(jTHoraSalida.getText())) {
            LocalDate fechaN = jD3Fecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Mesa mesa = (Mesa)jcbMesas.getSelectedItem();
            String horaEntrada =  jTHoraEntrada.getText();
            String horaSalida =  jTHoraSalida.getText();
            jLResultado1.setText(String.valueOf(pedido1.calcularMontoEntreHoras(mesa, fechaN, horaEntrada, horaSalida)));
            cargaLista(pedido1.listarConsulta3(mesa, fechaN, horaEntrada, horaSalida));
        } else {
            JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestorInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestorInformes().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jD1Fecha;
    private com.toedter.calendar.JDateChooser jD2Fecha;
    private com.toedter.calendar.JDateChooser jD3Fecha;
    private javax.swing.JLabel jLResultado1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListPedidos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTHoraEntrada;
    private javax.swing.JTextField jTHoraSalida;
    private javax.swing.JComboBox<Empleado> jcbEmpleados;
    private javax.swing.JComboBox<Mesa> jcbMesas;
    // End of variables declaration//GEN-END:variables

//    public double calculaValorPedidoDia(int dia, int mes, int anio) {
//        PedidoData pedido1 = new PedidoData();
//        List<Pedido> lis = pedido1.listarPedidos();
//        double suma = 0;
//        for (Pedido aux : lis) {
//            suma = suma + aux.getPrecioPedido();
//
//        }
//
//        return suma;
//        //int dia = Integer.parseInt(jTFecha1.getText());
//        //jLResultado1.setText("Resultado");
//    }

    public void cargarComboEmpleados() {
        EmpleadoData eData = new EmpleadoData();
        jcbEmpleados.addItem(new Empleado());
        for (Empleado aux : eData.listarEmpleadosActivos()) {
            jcbEmpleados.addItem(aux);
        }
    }

    public void cargarComboMesas() {
        MesaData mData = new MesaData();
        jcbMesas.addItem(new Mesa());
        for (Mesa aux : mData.listarMesas()) {
            jcbMesas.addItem(aux);
        }
    }

    private boolean verificarHorario(String texto) {
        // Verifica que el string no esté vacío
        if (texto.isEmpty()) {
            return false;
        }
        // Verifica que el string no contenga letras
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra < 48 || letra > 58) {      //[48..58]Abarca numeros y :
                return false;
            }
        }
        return true;
    }
    
//    cargarLista(pedido1.listarConsulta1(fechaN))
//    cargarLista(pedido1.listarConsulta2(fechaN, Empleado ))
//    cargarLista(pedido1.listarConsulta3(Mesa, fechaN, horaEntrada, horaSalida))
    public void cargaLista(List<Pedido> lista){
        
        listModel.removeAllElements();
        for (Pedido aux: lista  ) {
            listModel.addElement(String.valueOf("Id Pedido "+ aux.getIdPedido()) +" - "+"Monto: $"+ aux.getPrecioPedido() );
        }
//        JList<Pedido> jListPedidos = new JList<>(listModel);
//        this.add(jListPedidos);
    }

}
