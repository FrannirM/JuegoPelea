package juego;

import java.util.Scanner;

public class JuegoUsuario {
    public static void main(String[] args) {

        System.out.println("Bienvenido al juego de pelea");

        var consola = new Scanner(System.in);
        System.out.println("Dale un nombre a tu peleador: ");
        var name = consola.nextLine();

        var peleador1 = new Peleador(name);
        System.out.println(peleador1);
    }
}
