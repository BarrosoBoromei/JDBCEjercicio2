package Ej1.servicios;

import Ej1.entidades.Producto;
import Ej1.persistencia.ProductoDAO;
import java.util.Collection;

public class ProductoServicio {

private ProductoDAO dao;

    public ProductoServicio() {
        this.dao = new ProductoDAO();
    }
    
    public void crearProducto( String nombre, Double precio, Integer codigo_fabricante) throws Exception {

        try {
            //Validamos
                 
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            
            if (precio == null) {
                throw new Exception("Debe indicar el precio");
            }
            
            if (codigo_fabricante == null) {
                throw new Exception("Debe indicar el codigo del fabircante");
            }
            
            if (buscarProductoPorNombre(nombre) != null) {
                throw new Exception("Ya existe un producto con el nombre indicado " + nombre);
            }

            //Creamos el producto
            Producto prod = new Producto();
            prod.setNombre(nombre);
            prod.setPrecio(precio);
            prod.setCodigo_fabricante(codigo_fabricante);
            dao.guardarProducto(prod);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Producto buscarProductoPorCodigo(Integer codigo) throws Exception {

        try {

            //Validamos
            if (codigo == null) {
                throw new Exception("Debe indicar el id");
            }

            Producto prod = dao.buscarProductoPorCodigo(codigo);

            return prod;
        } catch (Exception e) {
            throw e;
        }
    }

    public Producto buscarProductoPorNombre(String nombre) throws Exception {

        try {

            //Validamos
            if (nombre == null) {
                throw new Exception("Debe indicar el nombre");
            }

            Producto prod = dao.buscarProductoPorNombre(nombre);

            return prod;
        } catch (Exception e) {
            throw e;
        }
    }
   
    public void modificarPrecioProducto( String nombre, Double precio ) throws Exception{
        
        try {

            //Validamos
            
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            
            if (precio == null) {
                throw new Exception("Debe indicar el precio");
            }

            //Buscamos
            Producto prod = buscarProductoPorNombre( nombre );

            //Validamos
            if (!prod.getNombre().equals(nombre)) {
                throw new Exception("El nombre actual no es el regsitrado en el sistema");
            }

            //Modificamos
            prod.setPrecio(precio);

            dao.modificarProducto(prod);
        
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarProducto(String nombre) throws Exception {

        try {

            //Validamos 
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            dao.eliminarProducto(nombre);
            
        } catch (Exception e) {
            throw e;
        }
    }
 
    public Collection<Producto> listarProductos() throws Exception {

        try {

            Collection<Producto> productos = dao.listarProductos();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirProductos() throws Exception {

        try {

            //Listamos los usuarios
            Collection<Producto> productos = listarProductos();

            //Imprimimos los usuarios
            if (productos.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirNombrePrecioProductos() throws Exception {

        try {

            //Listamos los usuarios
            Collection<Producto> productos = listarProductos();

            //Imprimimos los usuarios
            if (productos.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.getNombre() + ": " + "Precio: " + p.getPrecio() );
                    System.out.println("");
                    System.out.println("");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
public Collection<Producto> listarProductosPrecios(int v1, int v2) throws Exception {

        try {

            Collection<Producto> productos = dao.listarProductosPrecio(v1, v2);

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

public void imprimirProductosPrecios(int v1, int v2) throws Exception {

        try {

            //Listamos los usuarios
            Collection<Producto> productos = listarProductosPrecios(v1, v2);

            //Imprimimos los usuarios
            if (productos.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p);
                    System.out.println("");
                    System.out.println("");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

public Collection<Producto> listarPortatiles() throws Exception {

        try {

            Collection<Producto> productos = dao.listarPortatiles();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

public void imprimirPortatiles() throws Exception {

        try {

            //Listamos los usuarios
            Collection<Producto> productos = listarPortatiles();

            //Imprimimos los usuarios
            if (productos.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p);
                    System.out.println("");
                    System.out.println("");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

public Collection<Producto> listarProductoMasBarato() throws Exception {

        try {

            Collection<Producto> productos = dao.listarProductoMasBarato();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

public void imprimirProductoMasBarato() throws Exception {

        try {

            //Listamos los usuarios
            Collection<Producto> productos = listarProductoMasBarato();

            //Imprimimos los usuarios
            if (productos.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p);
                    System.out.println("");
                    System.out.println("");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

}