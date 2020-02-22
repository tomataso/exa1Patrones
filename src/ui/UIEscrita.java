package ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

import gestores.Gestor;


public class UIEscrita {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    // ---- Menú General -----
    public static void showPrincipalMenu() throws Exception, java.io.IOException {


        int opcion = -1;
        do {
            out.println("           ");
            out.println("----- Bienvenido a mi exámen -----");
            out.println("----- Menú Principal -----");
            out.println("----- Seleccione una opción -----");
            out.println("1. Ser Héroe");
            out.println("2. Ser Villano");
            out.println("3. Ser Civil");


            out.println("0. Salir");
            out.print("Digite la opcion:  ");

            out.println("           ");
            out.println("---------------");
            out.println("           ");

            opcion = Integer.parseInt(in.readLine());
            processOpPrincipalMenu(opcion);


        } while (opcion != 0);

    }


    public static void processOpPrincipalMenu(int pOpcion) throws Exception, java.io.IOException {

        switch (pOpcion) {
            case 1:
                System.out.println("Usted seleccionó: 1.  Ser Héroe");
                menuHeroe();
                break;
            case 2:
                System.out.println("Usted seleccionó: 2.  Ser Villano");
                menuVillano();
                break;
            case 3:
                System.out.println("Usted seleccionó: 3. Ser Civil");
                menuCivil();
                break;


            case 0:
                out.println("Adiós, gracias por usar la aplicación");
                break;
            default:
                out.println("Opción incorrecta.");
        }
    }


    // ---- Menú 1 ---- Heroe

    public static void menuHeroe() throws Exception, java.io.IOException {


        int opcion = -1;
        do {
            out.println("           ");
            out.println("----- Usted está en mi examén de Patrones -----");
            out.println("----- Usted es un super Héroe -----");
            out.println("----- Digite una acción-----");

            out.println("1. Ayudar");
            out.println("2. Atormentar");
            out.println("3. Pedir Ayuda");
            out.println("4. Correr");

            out.println("0. Regresar");

            out.println("           ");
            out.println("---------------");
            out.println("           ");

            opcion = Integer.parseInt(in.readLine());
            processOpcmenuHeroe(opcion);


        } while (opcion != 0);

    }


    public static void processOpcmenuHeroe(int pOpcion) throws Exception, java.io.IOException {


        switch (pOpcion) {
            case 1:
                System.out.println("Usted seleccionó: 1.  Ayudar ");
                out.println("           ");
                out.println("           ");
                System.out.println(Gestor.heroeAyudarMSG());
                out.println("           ");
                out.println("           ");
                break;
            case 2:
                System.out.println("Usted seleccionó: 2. Atormentar");
                out.println("           ");
                out.println("           ");
                System.out.println(Gestor.heroeAtormentarMSG());
                out.println("           ");
                out.println("           ");
                break;
            case 3:
                System.out.println("Usted seleccionó: 3. Pedir Ayuda");
                out.println("           ");
                out.println("           ");
                System.out.println(Gestor.heroePedirAyudaMSG());
                out.println("           ");
                out.println("           ");
                break;
            case 4:
                System.out.println("Usted seleccionó: 4. Correr");
                out.println("           ");
                out.println("           ");
                System.out.println(Gestor.heroeCorrerMSG());
                out.println("           ");
                out.println("           ");
                break;


            case 0:
                out.println("Regresar");
                break;
            default:
                out.println("Opción incorrecta.");
        }
    }

    // ---- Menú 2 ---- Villano

    public static void menuVillano() throws Exception, java.io.IOException {


        int opcion = -1;
        do {
            out.println("           ");
            out.println("----- Usted está en mi examén de Patrones -----");
            out.println("----- Usted es un Villano -----");
            out.println("----- Digite una acción-----");

            out.println("1. Ayudar");
            out.println("2. Atormentar");
            out.println("3. Pedir Ayuda");
            out.println("4. Correr");

            out.println("0. Regresar");

            out.println("           ");
            out.println("---------------");
            out.println("           ");

            opcion = Integer.parseInt(in.readLine());
            processOpcmenuVillano(opcion);


        } while (opcion != 0);

    }


    public static void processOpcmenuVillano(int pOpcion) throws Exception, java.io.IOException {


        switch (pOpcion) {
            case 1:
                System.out.println("Usted seleccionó: 1.  Ayudar ");
                out.println("           ");
                out.println("           ");
                System.out.println(Gestor.villanoeAyudarMSG());
                out.println("           ");
                out.println("           ");
                break;
            case 2:
                System.out.println("Usted seleccionó: 2. Atormentar");
                out.println("           ");
                out.println("           ");
                System.out.println(Gestor.villanoAtormentarMSG());
                out.println("           ");
                out.println("           ");
                break;
            case 3:
                System.out.println("Usted seleccionó: 3. Pedir Ayuda");
                out.println("           ");
                out.println("           ");
                System.out.println(Gestor.villanoPedirAyudaMSG());
                out.println("           ");
                out.println("           ");
                break;
            case 4:
                System.out.println("Usted seleccionó: 4. Correr");
                out.println("           ");
                out.println("           ");
                System.out.println(Gestor.villanoCorrerMSG());
                out.println("           ");
                out.println("           ");
                break;


            case 0:
                out.println("Regresar");
                break;
            default:
                out.println("Opción incorrecta.");
        }
    }

    // ---- Menú 3 ---- Civil

    public static void menuCivil() throws Exception, java.io.IOException {


        int opcion = -1;
        do {
            out.println("           ");
            out.println("----- Usted está en mi examén de Patrones -----");
            out.println("----- Usted es un Civil -----");
            out.println("----- Digite una acción-----");

            out.println("1. Ayudar");
            out.println("2. Atormentar");
            out.println("3. Pedir Ayuda");
            out.println("4. Correr");

            out.println("0. Regresar");

            out.println("           ");
            out.println("---------------");
            out.println("           ");

            opcion = Integer.parseInt(in.readLine());
            processOpcmenuCivil(opcion);


        } while (opcion != 0);

    }


    public static void processOpcmenuCivil(int pOpcion) throws Exception, java.io.IOException {


        switch (pOpcion) {
            case 1:
                System.out.println("Usted seleccionó: 1.  Ayudar ");
                out.println("           ");
                out.println("           ");
                System.out.println(Gestor.civilAyudarMSG());
                out.println("           ");
                out.println("           ");
                break;
            case 2:
                System.out.println("Usted seleccionó: 2. Atormentar");
                out.println("           ");
                out.println("           ");
                System.out.println(Gestor.civilAtormentarMSG());
                out.println("           ");
                out.println("           ");
                break;
            case 3:
                System.out.println("Usted seleccionó: 3. Pedir Ayuda");
                out.println("           ");
                out.println("           ");
                System.out.println(Gestor.civilPedirAyudaMSG());
                out.println("           ");
                out.println("           ");
                break;
            case 4:
                System.out.println("Usted seleccionó: 4. Correr");
                out.println("           ");
                out.println("           ");
                System.out.println(Gestor.civilCorrerMSG());
                out.println("           ");
                out.println("           ");
                break;


            case 0:
                out.println("Regresar");
                break;
            default:
                out.println("Opción incorrecta.");
        }
    }

}
