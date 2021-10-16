package Ej2.entidades;

public class Familia {

    private Integer idFamilia;
    private String nombre;
    private Integer edadMinima;
    private Integer edadMaxima;
    private Integer numeroHijos;
    private String correoElectronico;
    private Integer idCasaFamilia;

    public Familia() {
    }

    public Familia(Integer idFamilia, String nombre, Integer edadMinima, Integer edadMaxima, Integer numeroHijos, String correoElectronico, Integer idCasaFamilia) {
        this.idFamilia = idFamilia;
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.numeroHijos = numeroHijos;
        this.correoElectronico = correoElectronico;
        this.idCasaFamilia = idCasaFamilia;
    }

    public Integer getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public Integer getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(Integer edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public Integer getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(Integer numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Integer getIdCasaFamilia() {
        return idCasaFamilia;
    }

    public void setIdCasaFamilia(Integer idCasaFamilia) {
        this.idCasaFamilia = idCasaFamilia;
    }

    @Override
    public String toString() {
        return "Familia{" + "idFamilia=" + idFamilia + ", nombre=" + nombre + ", edadMinima=" + edadMinima + ", edadMaxima=" + edadMaxima + ", numeroHijos=" + numeroHijos + ", correoElectronico=" + correoElectronico + ", idCasaFamilia=" + idCasaFamilia + '}';
    }
    
}
