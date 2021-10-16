package Ej2.servicios;

import Ej2.entidades.Casa;
import Ej2.persistencia.CasaDAO;
import java.util.Collection;
import java.util.Date;

public class CasaServicio {
 
    private CasaDAO dao;

    public CasaServicio() {
        this.dao = new CasaDAO();
    }
    
    public Collection<Casa> listarCasasDisponibles(String D1, String D2,String pais) throws Exception {

        try {

            Collection<Casa> casas = dao.listarCasasDisponibles(D1, D2, pais);

            return casas;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirCasasDisponibles( String D1, String D2, String pais) throws Exception {

        try {

            Collection<Casa> casas = listarCasasDisponibles(D1, D2, pais);

            //Imprimimos los usuarios
            if (casas.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (Casa c : casas) {
                    System.out.println(c);
                    System.out.println("");
                    System.out.println("");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
 
     public Collection<Casa> listarCasasDisponibles(String D1, String D2) throws Exception {

        try {

            Collection<Casa> casas = dao.listarCasasDisponibles(D1, D2);

            return casas;
        } catch (Exception e) {
            throw e;
        }
    }

     public void imprimirCasasDisponibles( String D1, String D2) throws Exception {

        try {

            Collection<Casa> casas = listarCasasDisponibles(D1, D2);

            //Imprimimos los usuarios
            if (casas.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (Casa c : casas) {
                    System.out.println(c);
                    System.out.println("");
                    System.out.println("");
                }
            }
        } catch (Exception e) {
            throw e;
        }
     }
}
