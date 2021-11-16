
import java.util.Scanner;

public class Vista {

    public int menu_p(Radio radio) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        try {
            if (radio instanceof RadioC) {
                System.out.println("\n¿Que desea hacer?\n1.Encender/Apagar\n2.Cambiar volumen\n3.Modo Radio\n4.Modo Reproduccion\n5.Modo Telefono\n6.Modo Productividad");
                i = scan.nextInt();
                while (i <= 0 || i >= 7) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    i = scan.nextInt();
                }
            } else if (radio instanceof RadioS) {
                System.out.println("\n¿Que desea hacer?\n1.Encender/Apagar\n2.Cambiar volumen\n3.Modo Radio\n4.Modo Reproduccion\n5.Modo Telefono\n6.Modo Productividad");
                i = scan.nextInt();
                while (i <= 0 || i >= 7) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    i = scan.nextInt();
                }
            } else if (radio instanceof RadioA) {
                System.out.println("\n¿Que desea hacer?\n1.Encender/Apagar\n2.Cambiar volumen\n3.Modo Radio\n4.Modo Reproduccion\n5.Modo Telefono\n6.Modo Productividad");
                i = scan.nextInt();
                while (i <= 0 || i >= 7) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    i = scan.nextInt();
                }
            } else {
                System.out.println("\n¿Que desea hacer?\n1.Encender/Apagar\n2.Cambiar volumen\n3.Modo Radio\n4.Modo Reproduccion\n5.Modo Telefono");
                i = scan.nextInt();
                while (i <= 0 || i >= 6) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    i = scan.nextInt();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return i;
    }

    public int menu_r() {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("\n¿Que desea hacer?\n1.Cambar FM a AM\n2.Cambiar emisora (intervalos de 0.5)\n3.Guatdar emisora\n4.Cargar emisora");
            i = scan.nextInt();
            while (i <= 0 || i >= 5) {
                System.out.println("\n*********Ingrese una opcion valida*********");
                i = scan.nextInt();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return i;
    }

    public int menu_re() {
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("\n¿Que desea hacer?\n1.Seleccionar lista de reproduccion\n2.Cambiar cancion\n3.Escuchar cancion");
            opcion = scan.nextInt();
            while (opcion <= 0 || opcion >= 4) {
                System.out.println("\n*********Ingrese una opcion valida*********");
                opcion = scan.nextInt();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return opcion;
    }

    public int menu_t(Radio radio) {
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        try {
            if (radio instanceof RadioS) {
                System.out.println("\n¿Que desea hacer?\n1.Conectar/Desconectar telefono\n2.Mostrar contactos\n3.Llamar a contacto\n4.Finalizar llamada\n5.Cambiar a bocinas o auriculares");
                opcion = scan.nextInt();
                while (opcion <= 0 || opcion >= 6) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    opcion = scan.nextInt();
                }
            } else if (radio instanceof RadioA) {
                System.out.println("\n¿Que desea hacer?\n1.Conectar/Desconectar telefono\n2.Mostrar contactos\n3.Llamar a contacto\n4.Finalizar llamada\n5.Llamar al ultimo contacto con el que se hablo");
                opcion = scan.nextInt();
                while (opcion <= 0 || opcion >= 6) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    opcion = scan.nextInt();
                }
            } else if (radio instanceof RadioC) {
                System.out.println("\n¿Que desea hacer?\n1.Conectar/Desconectar telefono\n2.Mostrar contactos\n3.Llamar a contacto\n4.Finalizar llamada\n5.Cambiar a llamada en espera");
                opcion = scan.nextInt();
                while (opcion <= 0 || opcion >= 6) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    opcion = scan.nextInt();
                }
            } else{
                System.out.println("\n¿Que desea hacer?\n1.Conectar/Desconectar telefono\n2.Mostrar contactos\n3.Llamar a contacto\n4.Finalizar llamada");
                opcion = scan.nextInt();
                while (opcion <= 0 || opcion >= 5) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    opcion = scan.nextInt();
                }
            }
        } catch (Exception e) {

        }
        return opcion;
    }
    
    public int menu_pro(Radio radio){
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        try{
            if(radio instanceof RadioS){
                System.out.println("\n¿Que desea hacer?\n1.Planificar Viajes");
                opcion = scan.nextInt();
                while (opcion <= 0 || opcion >= 2) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    opcion = scan.nextInt();
                }
            } else if (radio instanceof RadioA){
                System.out.println("\n¿Que desea hacer?\n1.Ver tarjetas de presentacion");
                opcion = scan.nextInt();
                while (opcion <= 0 || opcion >= 2) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    opcion = scan.nextInt();
                }
            } else if (radio instanceof RadioC){
                System.out.println("\n¿Que desea hacer?\n1.Ver pronostico del tiempo");
                opcion = scan.nextInt();
                while (opcion <= 0 || opcion >= 2) {
                    System.out.println("\n*********Ingrese una opcion valida*********");
                    opcion = scan.nextInt();
                }
            } else{
                System.out.println("\nEste radio no cuenta con el Modo Productividad");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return opcion;
    }
}
