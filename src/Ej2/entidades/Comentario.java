package Ej2.entidades;

public class Comentario {
    
    private Integer idComentario;
    private Integer idCasa;
    private String comentario;

    public Comentario(Integer idComentario, Integer idCasa, String comentario) {
        this.idComentario = idComentario;
        this.idCasa = idCasa;
        this.comentario = comentario;
    }

    public Comentario() {
    }

    public Integer getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public Integer getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(Integer idCasa) {
        this.idCasa = idCasa;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Comentario{" + "idComentario=" + idComentario + ", idCasa=" + idCasa + ", comentario=" + comentario + '}';
    }
    
}
