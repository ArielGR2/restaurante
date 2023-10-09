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
        // TODO code application logic here

        /*       Producto producto = new Producto("pizza",100,3000,true);
        ProductoData prodData=new ProductoData();  
       prodData.agregarProducto(producto);


        Producto producto = new Producto("hamburguesa",100,3300,true);
        Producto producto1 = new Producto("tacos",50,3500,true);
        Producto producto2 = new Producto("lomo", 50,5000,true);
        Producto producto3 = new Producto("gaseosas",400,1000,true);
        Producto producto4 = new Producto ("cerveza 1L", 400,2300,true);
        Producto producto5 = new Producto("agua mineral", 400,500,true);
        prodData.agregarProducto(producto);
        prodData.agregarProducto(producto1);     
        prodData.agregarProducto(producto2);
        prodData.agregarProducto(producto3);
        prodData.agregarProducto(producto4);
        prodData.agregarProducto(producto5);
        
    }
        
        for(Producto prod:prodData.listarProductos()){
            System.out.println(prod.toString());
            
        };
        prodData.modificarProducto(producto);
        Producto producto= prodData.buscarProducto(1);
        System.out.println(producto.toString());
        producto.setNombre("pizza con jamón");
        prodData.modificarProducto(producto);
        prodData.eliminarProducto(6);
         */
        
        MesaData mesaData = new MesaData();
        
        //mesaData.agregarMesa(new Mesa(6, 4, EstadoMesa.LIBRE));
    }

}
