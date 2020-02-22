package logica;

import interfaces.Acciones;

public class Civil extends Persona implements Acciones {


    public Civil(String nombre, String apellidos, String genero, int edad) {
        super(nombre, apellidos, genero, edad);
    }

     @Override
    public String ayudar() {

        String respuesta = "El Ciudadano Civil: no te puedo ayudar, pero si puedo chuparme el codo con la lengua.";
        return respuesta;
    }

    @Override
    public String atormentar() {
        String respuesta = "El Ciudadano Civil:  tampoco te puedo atormentar, a menos que sea tu dentista :B ";
        return respuesta;
    }

    @Override
    public String pedir_Ayuda() {
        String respuesta = "El Ciudadano Civil: AYUUUUUDAAA AYUUDAAA CALZETIN CON ROMBOS MAN! O EL CHAPULÍN COLORADO AYUUUUDAAA";
        return respuesta;
    }

    @Override
    public String correr() {
        String respuesta = "El Ciudadano Civil: Corre como si no hubiera mañana dejando una estela de humo, lagrimas y sudor por detrás";
        return respuesta;
    }




}
