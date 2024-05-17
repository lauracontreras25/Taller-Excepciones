//Laura Contreras
//15/05/2024
//Division por 0
package division;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        int numerador, denominador;
        
        try {
            System.out.print("Ingrese el numerador: ");
            numerador = teclado.nextInt();
            
            System.out.print("Ingrese el denominador: ");
            denominador = teclado.nextInt();
            
            int resultado = numerador / denominador;
            System.out.println("El resultado de la division de " + numerador + " entre " + denominador + " es " + resultado);
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente un número entero.");
        } catch (ArithmeticException ex) {
            System.out.println("No se puede dividir por cero.");
        } finally {
            teclado.close();
        }
    }
}
              
          
    


        

    
   
