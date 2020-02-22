package logica;

public class Persona  {


    private String nombre;
    private String apellidos;
    private String genero;
    private int Edad;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String genero, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        Edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
}
