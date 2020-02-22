package gestores;


import ui.UIEscrita;

import logica.Heroe;
import logica.Villano;
import logica.Civil;


public class Gestor {

    //  IMPORTANTE ACALARACIÖN: Esto vendría de una base de datos, pero como no la tengo "queme los datos" para poder cumplir con el ejerció. A nivel de diseño esto no pertenecería aquí.

    static Heroe heroe = new Heroe("César ", "Quintanilla", "Masculino", 25, "Calcetín con Rombos Man", "Discurso épico, baile del desmadre y opinión sin prejuicios", "Un calcetín negro con rombos verdes y rojos.");
    static Villano villano = new Villano("Felonious  ", "Gru", "Masculino", 45, "Gru!", "Super inteligencia, adorado por los Minions y plan maestro", "Bufanda y completamente vestido de negro.");
    static Civil civil = new Civil("Paquita  ", "Doe", "Femenino", 33);

//  ------- ACCIONES DEL HÉROE -------

    public static String heroeAyudarMSG() {


        String respuesta = heroe.ayudar();


        return respuesta;


    }

    public static String heroeAtormentarMSG() {


        String respuesta = heroe.atormentar();


        return respuesta;


    }

    public static String heroePedirAyudaMSG() {


        String respuesta = heroe.pedir_Ayuda();


        return respuesta;


    }

    public static String heroeCorrerMSG() {


        String respuesta = heroe.correr();


        return respuesta;


    }

    //  ------- ACCIONES DEL VILLANO -------

    public static String villanoeAyudarMSG() {


        String respuesta = villano.ayudar();


        return respuesta;


    }

    public static String villanoAtormentarMSG() {


        String respuesta = villano.atormentar();


        return respuesta;


    }

    public static String villanoPedirAyudaMSG() {


        String respuesta = villano.pedir_Ayuda();


        return respuesta;


    }

    public static String villanoCorrerMSG() {


        String respuesta = villano.correr();


        return respuesta;


    }

    //  ------- ACCIONES DEL CIVIL -------

    public static String civilAyudarMSG() {


        String respuesta = civil.ayudar();


        return respuesta;


    }

    public static String civilAtormentarMSG() {


        String respuesta = civil.atormentar();


        return respuesta;


    }

    public static String civilPedirAyudaMSG() {


        String respuesta = civil.pedir_Ayuda();


        return respuesta;


    }

    public static String civilCorrerMSG() {


        String respuesta = civil.correr();


        return respuesta;


    }

}
