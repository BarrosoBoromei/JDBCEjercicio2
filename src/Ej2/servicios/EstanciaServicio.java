package Ej2.servicios;

import Ej2.entidades.Estancia;
import Ej2.persistencia.EstanciaDAO;
import java.util.Collection;

public class EstanciaServicio {

private EstanciaDAO dao;

    public EstanciaServicio() {
        
        this.dao = new EstanciaDAO();
        
    }
    
    public Collection<Estancia> listarEstanciasCruzadas() throws Exception {

        try {

            Collection<Estancia> estancias = dao.listarEstanciasCruzadas();

            return estancias;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirEstanciasCruzadas()throws Exception {

        try {

            Collection<Estancia> estancias = listarEstanciasCruzadas();

            //Imprimimos los usuarios
            if (estancias.isEmpty()) {
                throw new Exception("No existen estancias para imprimir");
            } else {
                for ( Estancia e: estancias) {
                    System.out.println(e);
                    System.out.println("");
                    System.out.println("");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    
}
