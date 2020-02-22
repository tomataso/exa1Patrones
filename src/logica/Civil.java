package logica;

import interfaces.Acciones;

public class Civil extends Persona implements Acciones {


    public Civil(String nombre, String apellidos, String genero, int edad) {
        super(nombre, apellidos, genero, edad);
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
