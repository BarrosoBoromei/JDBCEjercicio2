package Ej2.servicios;

import Ej2.persistencia.ClienteDAO;

public class ClienteServicio {

private ClienteDAO dao;

    public ClienteServicio() {
        
        this.dao = new ClienteDAO();
        
    }
    
}
