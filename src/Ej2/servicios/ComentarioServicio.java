package Ej2.servicios;

import Ej2.persistencia.ComentarioDAO;

public class ComentarioServicio {

private ComentarioDAO dao;

    public ComentarioServicio() {
        
        this.dao = new ComentarioDAO();
        
    }
    
}
