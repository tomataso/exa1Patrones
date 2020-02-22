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
