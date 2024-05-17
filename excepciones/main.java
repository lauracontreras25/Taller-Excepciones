
package excepciones;

public class main {

    public static void main(String[] args) {
      try {
          throw new ExcepcionC("Excepcion de tipo ExcepcionC");  
        }
      catch (ExcepcionA e) {
          System.out.println("Excepcion atrapada: " + e.getMessage());
      }
    }
}

