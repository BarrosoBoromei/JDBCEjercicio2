package Ej1.persistencia;

import Ej1.entidades.Producto;
import java.util.ArrayList;
import java.util.Collection;

public class ProductoDAO extends DAO {

    public void guardarProducto(Producto prod) throws Exception {
        try {
            if (prod == null) {
                throw new Exception("Debe indicar el ptoducto");
            }

            String sql = "INSERT INTO Producto( nombre, precio, codigo_fabricante)"
                    + "VALUES ( '" + prod.getNombre() + "' , '" +
                    prod.getPrecio() + "' , '" + prod.getCodigo_fabricante() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public void modificarProducto(Producto prod) throws Exception {
        try {
            if (prod == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }

            String sql = "UPDATE Producto SET " +
            " precio = '" + prod.getPrecio() +
            "' WHERE nombre = '" + prod.getNombre() + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
     public void eliminarProducto(String nombre) throws Exception {
        try {

            String sql = "DELETE FROM Producto WHERE nombre = '" + nombre + "'";
            
            insertarModificarEliminar(sql);
        
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }    
    
     public Producto buscarProductoPorCodigo(Integer codigo) throws Exception {
        try {

            String sql = "SELECT * FROM Fabricante"
                    + " WHERE codigo = '" + codigo + "'";

            consultarBase(sql);

            Producto prod = null;
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigo_fabricante(resultado.getInt(4));
            }
            desconectarBase();
            return prod;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
        
    }
     
     public Producto buscarProductoPorNombre(String nombre) throws Exception {
        try {

            String sql = "SELECT * FROM Producto"
                    + " WHERE nombre = '" + nombre + "'";

            consultarBase(sql);

            Producto prod = null;
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigo_fabricante(resultado.getInt(4));
            }
            desconectarBase();
            return prod;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
        
    }
     
     public Collection<Producto> listarProductos() throws Exception {
        
        try {
            String sql = "SELECT * FROM Producto ";

            consultarBase(sql);

            Producto prod = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigo_fabricante(resultado.getInt(4));
                productos.add(prod);
            }
            desconectarBase();
            return productos;
        
     } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
 
     public Collection<Producto> listarProductosPrecio(int v1, int v2) throws Exception {
        
        try {
            String sql = "SELECT * FROM Producto WHERE precio>=" + v1 + " AND " + "precio<=" + v2;

            consultarBase(sql);

            Producto prod = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigo_fabricante(resultado.getInt(4));
                productos.add(prod);
            }
            desconectarBase();
            return productos;
        
     } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
     
     public Collection<Producto> listarPortatiles() throws Exception {
        
        try {
            String sql = "SELECT * FROM Producto WHERE nombre LIKE '%portatil%'";

            consultarBase(sql);

            Producto prod = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigo_fabricante(resultado.getInt(4));
                productos.add(prod);
            }
            desconectarBase();
            return productos;
        
     } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
     
     public Collection<Producto> listarProductoMasBarato() throws Exception {
        
        try {
            String sql = "SELECT * FROM Producto ORDER BY precio LIMIT 1";

            consultarBase(sql);

            Producto prod = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigo_fabricante(resultado.getInt(4));
                productos.add(prod);
            }
            desconectarBase();
            return productos;
        
     } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
     
}