package juego;

import java.util.Scanner;

public class Habilidades {
    //Atributos

    //Striking
    final private double jab = 16.7;
    final private double derechaDos = 38.5;
    final private double lowkick = 22.4;

    //grappling
    final private double mataleon = 14;
    final private double doubleleg = 32.5;
    final private double osotogari = 31.33;

    //Metodo para elegir primer modificador ||
    static void elegirBackground() {
        int tipoBackground1 = 0, tipoBackground2 = 0;
        var salida = false;
        var consola = new Scanner(System.in);

        while (!salida) {

            System.out.println("Jugador 1 Elegi tu Background: ");
            System.out.println("""
                    1-Boxeo
                    2-Karate
                    3-Lucha
                    4-BJJ
                    5-Muay Thai
                    """);
             tipoBackground1 = Integer.parseInt(consola.nextLine());

            if (tipoBackground1 == 1 || tipoBackground1 == 2 || tipoBackground1 == 3 || tipoBackground1 == 4 || tipoBackground1 == 5) {
                System.out.println("Jugador 2 Elegi tu Background: ");
                System.out.println("""
                    1-Boxeo
                    2-Karate
                    3-Lucha
                    4-BJJ
                    5-Muay Thai
                    """);
                tipoBackground2 = Integer.parseInt(consola.nextLine());
                salida = true;
            } else System.out.println("ERROR, VUELVA A INTENTARLO");
        }

    }



    //Metodo para elegir segundo modificador ||
    static void elegirHabilidades() {
        int tipoHabilidad1 = 0, tipoHabilidad2 = 0;
        var salida = false;
        var consola = new Scanner(System.in);

        while (!salida) {

            System.out.println("Jugador 1 Elegi tus habilidades, solo pueden ser tres: ");
            System.out.println("""
                    1-Jab
                    2-Mataleon
                    3-Derechazo
                    4-Double Leg
                    5-LowKick
                    6-OsotoGari
                    """);
            for (var i = 0; i < 3; i++) {
                tipoHabilidad1 = Integer.parseInt(consola.nextLine());
                switch (tipoHabilidad1) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    default:
                        break;
                }
            }


            if (tipoHabilidad1 == 1) {
                System.out.println("Jugador 2 Elegi tu Background: ");
                System.out.println("""
                    1-Boxeo
                    2-Karate
                    3-Lucha
                    4-BJJ
                    5-Muay Thai
                    """);
                tipoBackground2 = Integer.parseInt(consola.nextLine());
                salida = true;
            } else System.out.println("ERROR, VUELVA A INTENTARLO");
        }

    }

}
