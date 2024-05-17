//Laura Contreras
//15/05/2024
//Abrir y leer un archivo
package archivo;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archivo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo: ");
        String nombreArchivo = teclado.nextLine();

        try {
            File archivo = new File(nombreArchivo);
            try (Scanner lector = new Scanner(archivo)) {
                System.out.println("Contenido del archivo:");
                while (lector.hasNextLine()) {
                    System.out.println(lector.nextLine());
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo '" + nombreArchivo + "' no se encontro.");
        }
    }
}

