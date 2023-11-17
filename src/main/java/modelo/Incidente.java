
package modelo;

import java.time.*;


public class Incidente {
    private int idIncidente;
    private Prestacion prestacion;
    private String descripcion;
    private String problema;
    private Tecnico tecnico;
    private LocalDateTime tiempoDeResolucion;
    private boolean resuelto;

    public Incidente() {
    }
    
    public Incidente(Prestacion prestacion,String descripcion,String problema,Tecnico tecnico,LocalDateTime tiempoDeResolucion,boolean resuelto){
        this.prestacion=prestacion;
        this.descripcion=descripcion;
        this.problema=problema;
        this.tecnico=tecnico;
        this.tiempoDeResolucion=tiempoDeResolucion;
        this.resuelto=resuelto;
    }

    public int getIdIncidente() {
        return idIncidente;
    }

    public void setIdIncidente(int idIncidente) {
        this.idIncidente = idIncidente;
    }

    public Prestacion getPrestacion() {
        return prestacion;
    }

    public void setPrestacion(Prestacion prestacion) {
        this.prestacion = prestacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public LocalDateTime getTiempoDeResolucion() {
        return tiempoDeResolucion;
    }

    public void setTiempoDeResolucion(LocalDateTime tiempoDeResolucion) {
        this.tiempoDeResolucion = tiempoDeResolucion;
    }

    public boolean isResuelto() {
        return resuelto;
    }

    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }
    
}
