import java.util.Scanner;

public class EsteticaPerros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo dinámico para almacenar objetos de tipo RecibeMascota
        RecibeMascota[] esteticaPerros = new RecibeMascota[5]; // Puedes ajustar el tamaño según tus necesidades

        // Crear una instancia de la clase RecibeMascota y asignar valores a los atributos
        RecibeMascota mascota1 = new RecibeMascota("Max", 2, "Golden Retriever", "Mediano", "Ana");

        // Agregar el objeto creado al arreglo
        esteticaPerros[0] = mascota1;

        // Mostrar la cantidad de perros en la estética
        System.out.println("Perros actuales en la estética: " + contarPerros(esteticaPerros));

        // Cerrar el Scanner
        scanner.close();
    }

    // Método para contar la cantidad de perros en la estética
    private static int contarPerros(RecibeMascota[] esteticaPerros) {
        int contador = 0;
        for (RecibeMascota mascota : esteticaPerros) {
            if (mascota != null) {
                contador++;
            }
        }
        return contador;
    }
}

class RecibeMascota {
    // Atributos
    private String nombrePerro;
    private int edad;
    private String raza;
    private String tamaño;
    private String nombreDueño;

    // Constructor
    public RecibeMascota(String nombrePerro, int edad, String raza, String tamaño, String nombreDueño) {
        this.nombrePerro = nombrePerro;
        this.edad = edad;
        this.raza = raza;
        this.tamaño = tamaño;
        this.nombreDueño = nombreDueño;
    }
}
