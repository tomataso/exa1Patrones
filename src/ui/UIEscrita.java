package ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

import gestores.Gestor;



public class UIEscrita {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;


    public static void showPrincipalMenu() throws Exception, java.io.IOException {


        int opcion = -1;
        do {
            out.println("----- Bienvenido a mi examen -----");
            out.println("----- Menu Principal -----");
            out.println("1. Ser Heroe");
            out.println("2. Ser Villano");
            out.println("3. Ser Civil");


            out.println("0. Salir");
            out.print("Digite la opcion:  ");
            opcion = Integer.parseInt(in.readLine());
            processOpPrincipalMenu(opcion);
        } while (opcion != 0);

    }


    public static void processOpPrincipalMenu(int pOpcion) throws Exception, java.io.IOException {
        switch (pOpcion) {
            case 1:
                System.out.println("Usted selecciono: 1.  Ser Heroe");

                break;
            case 2:
                System.out.println("Usted selecciono: 2.  Ser Villano");

                break;
            case 3:
                System.out.println("Usted selecciono: 3. Ser Civil"
                break;


            case 0:
                out.println("Adiós, gracias por usar la aplicación");
                break;
            default:
                out.println("Opción incorrecta.");
        }
    }



}
