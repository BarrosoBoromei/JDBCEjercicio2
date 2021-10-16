package Ej2.servicios;

import Ej2.entidades.Familia;
import Ej2.persistencia.FamiliaDAO;
import java.util.Collection;

public class FamiliaServicio {

private FamiliaDAO dao;

    public FamiliaServicio() {
        
        this.dao = new FamiliaDAO();
        
    }
    
    public Collection<Familia> listarFamiliasHijosMinimosEdadMaximaInferior(int H1, int EM1) throws Exception {

        try {

            Collection<Familia> familias = dao.listarFamiliasHijosMinimosEdadMaximaInferior(H1, EM1);

            return familias;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirFamiliasHijosMinimosEdadMaximaInferior( int H1, int EM1) throws Exception {

        try {

            Collection<Familia> familias = listarFamiliasHijosMinimosEdadMaximaInferior(H1, EM1);

            if (familias.isEmpty()) {
                throw new Exception("No existen familias para imprimir");
            } else {
                for (Familia f : familias) {
                    System.out.println(f);
                    System.out.println("");
                    System.out.println("");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    public Collection<Familia> listarFamiliasCorreo(String correo) throws Exception {

        try {

            Collection<Familia> familias = dao.listarFamiliasCorreo(correo);

            return familias;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirFamiliasCorreo( String correo) throws Exception {

        try {

            Collection<Familia> familias = listarFamiliasCorreo(correo);

            //Imprimimos los usuarios
            if (familias.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (Familia f : familias) {
                    System.out.println(f);
                    System.out.println("");
                    System.out.println("");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
