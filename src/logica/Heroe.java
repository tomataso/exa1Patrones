package logica;

import interfaces.Acciones;

public class Heroe extends Persona implements Acciones {

    private String alias;
    private String poderes;
    private String Capa;


    public Heroe(String nombre, String apellidos, String genero, int edad, String alias, String poderes, String capa) {
        super(nombre, apellidos, genero, edad);
        this.alias = alias;
        this.poderes = poderes;
        Capa = capa;
    }

    @Override
    public String ayudar() {

        String respuesta = "El Héroe te ayuda y dice: ¡Tranquilo noble cuidadano yo te protegeré!";
        return respuesta;
    }

    @Override
    public String atormentar() {
        String respuesta = "El Héroe: No hace nada, por qué un heroenunca atormenta.";
        return respuesta;
    }

    @Override
    public String pedir_Ayuda() {
        String respuesta = "El Héroe: No pide ayuda (por qué no necesita ayuda, solo ayuda para parar de ser tan genial).";
        return respuesta;
    }

    @Override
    public String correr() {
        String respuesta = "El Héroe: Corre a toda velocidad a capturar a los malos.";
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
