package juego;

import java.util.Scanner;

public class Habilidades {
    //Atributos

    //Striking
    final private double jab = 16.7;
    final private double derechaDos = 38.5;
    final private double lowkick = 22.4;
    final private double croche = 44;
    final private double highkick = 77.5;
    final private double codazo = 19.7;
    final private double rodillazo = 55.3;

    //grappling
    final private double mataleon = 14;
    final private double doubleleg = 32.5;
    final private double leg = 12.1;
    final private double osotogari = 67.33;
    final private double leglock = 11;
    final private double grandandpound = 79.8;
    final private double triangulo = 57.3;

    //Metodo para elegir primer modificador
    static int elegirBackground(int modificadorBackground) {

        var salida = false;

        while (!salida) {
            System.out.println("Jugador 1 Elegi tu Background: ");
            System.out.println("""
                    1-Boxeo
                    2-Karate
                    3-Lucha
                    4-BJJ
                    5-Muay Thai
                    """);
            var tipoBackground = Integer.parseInt(var consola = new Scanner(System.in));
        }

        return modificadorBackground;
    }

}
