package restaurante;

import restaurante.AccesoDatos.MesaData;
import restaurante.AccesoDatos.ProductoData;
import restaurante.Entidades.EstadoMesa;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Producto;

public class RestauranteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* PRUEBAS DE PRODUCTO DATA
        ProductoData prodData=new ProductoData();
        
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
         
        PRUEBAS DE MESA DATA
        MesaData mesaData = new MesaData();

        mesaData.agregarMesa(new Mesa(5, 4, EstadoMesa.LIBRE));
        
        Mesa mesa = mesaData.buscarMesa(5);
        mesa.setCapacidad(2);
        mesaData.modificarMesa(mesa);
        
        mesaData.eliminarMesa(5)
        
        for (Mesa m : mesaData.listarMesas()) {
            System.out.println(m.toString());

        };
        */
    }

}
