
package modelo;


public class Especialidad {
    private String nombre;
    private String descripcion;
    private String problemaQueResuelve;
    private Tecnico tecnico;

    public Especialidad() {
    }

    public Especialidad(String nombre, String descripcion, String problemaQueResuelve, Tecnico tecnico) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.problemaQueResuelve = problemaQueResuelve;
        this.tecnico = tecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProblemaQueResuelve() {
        return problemaQueResuelve;
    }

    public void setProblemaQueResuelve(String problemaQueResuelve) {
        this.problemaQueResuelve = problemaQueResuelve;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    
    
}
