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

    }

    @Override
    public String atormentar() {

    }

    @Override
    public String pedir_Ayuda() {

    }

    @Override
    public String correr() {

    }

}
