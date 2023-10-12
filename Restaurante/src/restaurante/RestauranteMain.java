package restaurante;

import restaurante.AccesoDatos.*;
import restaurante.Entidades.*;

public class RestauranteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DetalleData dData = new DetalleData();
        EmpleadoData eData = new EmpleadoData();
        MesaData mesaData = new MesaData();
        PedidoData pedidoData = new PedidoData();
        //ProductoData prodData;

        /* PRUEBAS DE PRODUCTO DATA
        ------------------------------------------------------------------------
        Producto producto = new Producto("pizza",100,3000,true);
        Producto producto1 = new Producto("tacos",50,3500,true);
        Producto producto2 = new Producto("lomo", 50,5000,true);
        Producto producto3 = new Producto("gaseosas",400,1000,true);
        Producto producto4 = new Producto ("cerveza 1L", 400,2300,true);
        Producto producto5 = new Producto("agua mineral", 400,500,true);
        Producto producto6 = new Producto("hamburguesa",100,3300,true);
        prodData.agregarProducto(producto);
        prodData.agregarProducto(producto1);     
        prodData.agregarProducto(producto2);
        prodData.agregarProducto(producto3);
        prodData.agregarProducto(producto4);
        prodData.agregarProducto(producto5);
        prodData.agregarProducto(producto6);
        
        Producto productoB = prodData.buscarProducto(1);
        System.out.println(producto.toString());
        productoB.setNombre("pizza con jamón");
        prodData.modificarProducto(productoB);
        
        prodData.eliminarProducto(6);
        
        for(Producto prod:prodData.listarProductos()){
           System.out.println(prod.toString());    
        };
        ------------------------------------------------------------------------ 
        PRUEBAS DE MESA DATA
        ------------------------------------------------------------------------
        mesaData.agregarMesa(new Mesa(5, 4, EstadoMesa.LIBRE));
        
        Mesa mesa = mesaData.buscarMesa(5);
        mesa.setCapacidad(2);
        mesaData.modificarMesa(mesa);
        
        mesaData.eliminarMesa(5)
        
        for (Mesa m : mesaData.listarMesas()) {
            System.out.println(m.toString());

        };
        ------------------------------------------------------------------------
        PRUEBAS DE EMPLEADO DATA
        ------------------------------------------------------------------------
        Empleado empleado = new Empleado(22012365, "Juan Perez", true);

        ------------------------------------------------------------------------
        PRUEBAS DE PEDIDO DATA
        ------------------------------------------------------------------------
        Mesa mesa = mesaData.buscarMesa(5);
        Empleado empleado = eData.buscarEmpleado(22012365);
        
        Pedido pedido = new Pedido(mesa,empleado,EstadoPedido.PENDIENTE);
        
        pedidoData.agregarPedido(pedido);
        ------------------------------------------------------------------------
        PRUEBAS DE DETALLE DATA
        ------------------------------------------------------------------------        
         */
        Pedido pedido = pedidoData.buscarPedido(3);

        Producto producto1 = dData.productoData.buscarProducto("tacos");
        Producto producto2 = dData.productoData.buscarProducto("gaseosas");

        /*Detalle detalle1 = new Detalle(pedido, producto1, 2);
        Detalle detalle2 = new Detalle(pedido, producto2, 4);

        dData.agregarDetalle(detalle1);
        dData.agregarDetalle(detalle2);
        */
        
        for (Detalle d : dData.listarDetallesPedido(pedido.getIdPedido())) {
            pedido.setPrecioPedido(pedido.getPrecioPedido() + d.calcularSubtotal(d));
            System.out.println(pedido.getPrecioPedido());
        }
        pedidoData.modificarPedido(pedido);
    }

}
