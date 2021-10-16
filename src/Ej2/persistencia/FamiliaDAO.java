package Ej2.persistencia;

import Ej2.entidades.Familia;
import java.util.ArrayList;
import java.util.Collection;

public class FamiliaDAO extends DAO {

    public Collection<Familia> listarFamiliasHijosMinimosEdadMaximaInferior(int H1, int EM1) throws Exception {

        try {
            String sql = "SELECT * FROM familias WHERE num_hijos>=" + H1 + " AND " + "edad_maxima<=" + EM1;

            consultarBase(sql);

            Familia flia = null;
            Collection<Familia> familias = new ArrayList();
            while (resultado.next()) {
                flia = new Familia();
                flia.setIdFamilia(resultado.getInt(1));
                flia.setNombre(resultado.getString(2));
                flia.setEdadMinima(resultado.getInt(3));
                flia.setEdadMaxima(resultado.getInt(4));
                flia.setNumeroHijos(resultado.getInt(5));
                flia.setCorreoElectronico(resultado.getString(6));
                flia.setIdCasaFamilia(resultado.getInt(7));
                familias.add(flia);
            }
            desconectarBase();
            return familias;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public Collection<Familia> listarFamiliasCorreo(String correo) throws Exception {

        try {
            String sql = "SELECT * FROM familias WHERE email LIKE '%" + correo + "%'";

            consultarBase(sql);

            Familia flia = null;
            Collection<Familia> familias = new ArrayList();
            while (resultado.next()) {
                flia = new Familia();
                flia.setIdFamilia(resultado.getInt(1));
                flia.setNombre(resultado.getString(2));
                flia.setEdadMinima(resultado.getInt(3));
                flia.setEdadMaxima(resultado.getInt(4));
                flia.setNumeroHijos(resultado.getInt(5));
                flia.setCorreoElectronico(resultado.getString(6));
                flia.setIdCasaFamilia(resultado.getInt(7));
                familias.add(flia);
            }
            desconectarBase();
            return familias;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
