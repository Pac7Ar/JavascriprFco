package models;

public class Genero {

    private Long id;
    private String nombre;
    //Creamos Constructor 
    public Genero(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    //Creamos getters y setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
