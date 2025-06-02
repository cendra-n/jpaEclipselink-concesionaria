package logica;
import igu.Principal;

/**
 * Esta clase inicia la aplicación de la concesionaria de autos.
 * Esta clase contiene el método main que sirve como punto de entrada
 * para la ejecución del sistema. Se encarga de inicializar y mostrar
 * la ventana principal de la aplicación.
 */


public class ConcesionariaJpa {

    public static void main(String[] args) {
        Principal menu = new Principal();
        menu.setVisible(true); 
        menu.setLocationRelativeTo(null); 
    }
}
