package Ej2.persistencia;

import Ej2.entidades.Casa;
import Ej2.entidades.Cliente;
import Ej2.entidades.Estancia;
import java.util.ArrayList;
import java.util.Collection;

public class EstanciaDAO extends DAO{
    
    public Collection<Estancia> listarEstanciasCruzadas() throws Exception {
        
        try {
            String sql = "SELECT * FROM estancias";

            consultarBase(sql);

            Estancia est = null;
            Collection<Estancia> estancias = new ArrayList();
            while (resultado.next()) {
                est = new Estancia();
                est.setIdEstancia(resultado.getInt(1));
                est.setNombreHuesped(resultado.getString(4));
                est.setFechaDesde(resultado.getDate(5));
                est.setFechaHasta(resultado.getDate(6));
                Integer idCasa = resultado.getInt(3);
                Casa casa = CasaDAO.buscarCasaPorCodigo(idCasa);
                est.setCasa(casa);
                //Integer idCliente = resultado.getInt(2);
                //Cliente cl = ClienteDAO.buscarClientePorCodigo(idCliente);
                //est.setCliente(cl);
                estancias.add(est);
            }
            desconectarBase();
            return estancias;
        
     } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
}
