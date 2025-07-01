package juego;

import java.util.Scanner;

import static juego.Habilidades.elegirBackground;

public class JuegoUsuario {
    public static void main(String[] args) {

        System.out.println("Bienvenido al juego de pelea");

        //Scanner
        var consola = new Scanner(System.in);

        //Nombre del peleador 1
        System.out.println("Jugador 1, dale un nombre a tu peleador: ");
        var name = consola.nextLine();
        var peleador1 = new Peleador(name);
        System.out.println(peleador1);

        //Nombre del peleador 1
        System.out.println("Jugador 2, dale un nombre a tu peleador: ");
        var name2 = consola.nextLine();
        var peleador2 = new Peleador(name2);
        System.out.println(peleador2);
        
        //Elegir primer modificador (background)
        var modificador1 = new Habilidades();
        elegirBackground();
    }
}
