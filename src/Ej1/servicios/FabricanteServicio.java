package Ej1.servicios;

import Ej1.entidades.Fabricante;
import Ej1.persistencia.FabricanteDAO;
import java.util.Collection;

public class FabricanteServicio {

    private FabricanteDAO dao;

    public FabricanteServicio() {
        this.dao = new FabricanteDAO();
    }
    
    public void crearFabricante(String nombre) throws Exception {

        try {
            //Validamos
     
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            
            if (buscarFabricantePorNombre(nombre) != null) {
                throw new Exception("Ya existe un fabricante con el nombre indicado " + nombre);
            }

            //Creamos el fabricante
            Fabricante fabr = new Fabricante();
            fabr.setNombre(nombre);
            dao.guardarFabricante(fabr);
        } catch (Exception e) {
            throw e;
        }
    }

    public Fabricante buscarFabricantePorCodigo(Integer codigo) throws Exception {

        try {

            //Validamos
            if (codigo == null) {
                throw new Exception("Debe indicar el cod");
            }

            Fabricante fabr = dao.buscarFabricantePorCodigo(codigo);

            return fabr;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Fabricante buscarFabricantePorNombre(String nombre) throws Exception {

        try {

            //Validamos
            if (nombre == null) {
                throw new Exception("Debe indicar el nombre");
            }

            Fabricante fabr = dao.buscarFabricantePorNombre(nombre);

            return fabr;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarFabricante(String nombre) throws Exception {

        try {

            //Validamos 
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            dao.eliminarFabricante(nombre);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Collection<Fabricante> listarFabricantes() throws Exception {

        try {

            Collection<Fabricante> fabricantes = dao.listarFabricantes();

            return fabricantes;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirFabricantes() throws Exception {

        try {

            //Listamos los usuarios
            Collection<Fabricante> fabricantes = listarFabricantes();

            //Imprimimos los usuarios
            if (fabricantes.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (Fabricante f : fabricantes) {
                    System.out.println(f);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
 
}
