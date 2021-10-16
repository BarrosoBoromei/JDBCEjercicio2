package Ej1.persistencia;

import Ej1.entidades.Fabricante;
import java.util.ArrayList;
import java.util.Collection;

public class FabricanteDAO extends DAO {

    public void guardarFabricante(Fabricante fabr) throws Exception {
        try {
            if (fabr == null) {
                throw new Exception("Debe indicar el fabriante");
            }

            String sql = "INSERT INTO Fabricante( nombre)"
                    + "VALUES ( '" + fabr.getNombre() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarFabricante(Fabricante fabr) throws Exception {
        try {
            if (fabr == null) {
                throw new Exception("Debe indicar el fabricante que desea modificar");
            }

            String sql = "UPDATE Fabricante SET "
                    + "nombre = '" + fabr.getNombre() + "' , codigo = '" + fabr.getCodigo() +
                    "' WHERE codigo = '" + fabr.getCodigo() + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
     public void eliminarFabricante(String nombre) throws Exception {
        try {

            String sql = "DELETE FROM Usuario WHERE nombre = '" + nombre + "'";
            
            insertarModificarEliminar(sql);
        
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

     public Fabricante buscarFabricantePorCodigo(Integer codigo) throws Exception {
        try {

            String sql = "SELECT * FROM Fabricante"
                    + " WHERE codigo = '" + codigo + "'";

            consultarBase(sql);

            Fabricante fabr = null;
            while (resultado.next()) {
                fabr = new Fabricante();
                fabr.setCodigo(resultado.getInt(1));
                fabr.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabr;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
        
    }
     
     public Fabricante buscarFabricantePorNombre(String nombre) throws Exception {
        
         try {

            String sql = "SELECT * FROM Fabricante"
                    + " WHERE nombre = '" + nombre + "'";

            consultarBase(sql);

            Fabricante fabr = null;
            while (resultado.next()) {
                fabr = new Fabricante();
                fabr.setCodigo(resultado.getInt(1));
                fabr.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabr;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
        
    }
     
    public Collection<Fabricante> listarFabricantes() throws Exception {
        
        try {
            String sql = "SELECT * FROM Fabricante ";

            consultarBase(sql);

            Fabricante fabr = null;
            Collection<Fabricante> fabricantes = new ArrayList();
            while (resultado.next()) {
                fabr = new Fabricante();
                fabr.setCodigo(resultado.getInt(1));
                fabr.setNombre(resultado.getString(2));
                fabricantes.add(fabr);
            }
            desconectarBase();
            return fabricantes;
        
     } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
}