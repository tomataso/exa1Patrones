package logica;

import interfaces.Acciones;

public class Villano extends Persona implements Acciones {

    private String alias;
    private String poderes;
    private String Capa;

    public Villano(String nombre, String apellidos, String genero, int edad, String alias, String poderes, String capa) {
        super(nombre, apellidos, genero, edad);
        this.alias = alias;
        this.poderes = poderes;
        Capa = capa;
    }

    @Override
    public String ayudar() {

        String respuesta = "El Villano: ¡Yo nunca ayudaría a nadie!";
        return respuesta;
    }

    @Override
    public String atormentar() {
        String respuesta = "El Villano Atormenta y dice: ¡Te atormentaré!, es mi cosa favorita buajajajaja.";
        return respuesta;
    }

    @Override
    public String pedir_Ayuda() {
        String respuesta = "El Villano: Incauto, yo solo necesito la ayuda de mi mismo.";
        return respuesta;
    }

    @Override
    public String correr() {
        String respuesta = "El Villano: Corre haciendo su risa maquiavelica.";
        return respuesta;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPoderes() {
        return poderes;
    }

    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }

    public String getCapa() {
        return Capa;
    }

    public void setCapa(String capa) {
        Capa = capa;
    }
}
