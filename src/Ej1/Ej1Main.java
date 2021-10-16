package Ej1;

import Ej1.servicios.FabricanteServicio;
import Ej1.servicios.ProductoServicio;
import java.util.Scanner;

public class Ej1Main {

    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        FabricanteServicio FS = new FabricanteServicio();
        ProductoServicio PS = new ProductoServicio();
        
        // a) Lista el nombre de todos los productos que hay en la tabla producto.
        
        /*
        
        PS.imprimirProductos();
        
        */
        
        // b) Lista los nombres y los precios de todos los productos de la tabla producto. 
        
        /*
        
        PS.imprimirNombrePrecioProductos();
        
        */
        
        // c) Listar aquellos productos que su precio esté entre 120 y 202.
        
        /*
        
        PS.imprimirProductosPrecios(120,202);
        
        */
        
        // d) Buscar y listar todos los Portátiles de la tabla producto. 
        
        /*
        
        PS.imprimirPortatiles();
        
        */
        
        // e) Listar el nombre y el precio del producto más barato.
        
        /*
        
        PS.imprimirProductoMasBarato();
        
        */

        // f) Ingresar un producto.
        
        /*
        
        try {
            
            System.out.println("Ingresar nombre: ");
            String nombre1 = leer.next();
            
            System.out.println("Ingresar Precio: ");
            Double precio1 = leer.nextDouble();
            
            System.out.println("Ingresar codigo del fabricante: ");
            Integer codigo_fabricante1 = leer.nextInt();
            
            PS.crearProducto( nombre1, precio1, codigo_fabricante1);
            PS.imprimirProductos();
        
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
        */
        
        // g) Ingresar un fabricante.
        
        /*
        
        try {
            
            System.out.println("Ingresar nombre: ");
            String nombre2 = leer.next();
            
            FS.crearFabricante( nombre2);
            FS.imprimirFabricantes();
        
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
        */
        
        // h) Editar un producto.
        
        /*
        
        try {
            
            System.out.println("Ingresar nombre: ");
            String nombre3 = leer.next();
            
            System.out.println("Ingresar Precio: ");
            Double precio3 = leer.nextDouble();
            
            PS.modificarPrecioProducto( nombre3, precio3 );
            PS.imprimirProductos();
        
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
        */
        
        // i) Eliminar un producto.
        
        /*
        
        try {
            
            System.out.println("Ingresar nombre: ");
            String nombre4 = leer.next();
            
            PS.eliminarProducto( nombre4 );
            PS.imprimirProductos();
        
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
              
        //*/
        
    }
    
}
