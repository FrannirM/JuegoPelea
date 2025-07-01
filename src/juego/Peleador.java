package juego;

public class Peleador {
    //Atributos
    private int vida = 100;
    final private int cantidadHabilidades = 6;
    private String nombre;
    private double ataque;
    private double defensa;

    //Constructor
    public Peleador (String nombre) {
        this.nombre = nombre;
        System.out.println("Nombre del peleador: " + nombre);
    }

    //metodo elegir tipo luchador
    public int elegirLuchador (int elegirLuchador) {
        var salida = false;
        while (!salida) {
            System.out.println("Elegi tu luchador: ");
            System.out.println("""
                    
                    """);
        }
        return elegirLuchador;
    }
}


