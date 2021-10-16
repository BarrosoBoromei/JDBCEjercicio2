package Ej2.persistencia;

import Ej2.entidades.Cliente;

public class ClienteDAO extends DAO{
    
    static public Cliente buscarClientePorCodigo(Integer codigo) throws Exception {
        try {

            String sql = "SELECT * FROM clientes"
                    + " WHERE id_cliente = '" + codigo + "'";

            consultarBase(sql);

            Cliente cl = null;
            while (resultado.next()) {
                cl = new Cliente();
                cl.setIdCliente(resultado.getInt(1));
                cl.setNombre(resultado.getString(2));
                cl.setCalle(resultado.getString(3));
                cl.setNumero(resultado.getInt(4));
                cl.setCodigoPostal(resultado.getInt(5));
                cl.setCiudad(resultado.getString(6));
                cl.setPais(resultado.getString(7));
                cl.setCorreoElectronico(resultado.getString(8));
            }
            //desconectarBase();
            return cl;
        } catch (Exception e) {
            //desconectarBase();
            throw e;
        }
    }
    
}
