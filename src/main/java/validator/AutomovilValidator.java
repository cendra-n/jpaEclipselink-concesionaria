package validator;

import javax.swing.JOptionPane;
import logica.Automovil;
import persistencia.AutomovilJpaController;
/*
Esta clase valida los campos ingresados tanto para la operación create como para update.
Patente: Si el auto es nuevo, permite una patente vacia. Si el auto es usado, valida que la patente
el valor ingresado, tomando en cuenta tanto la patente vieja como la nueva.
*/

public class AutomovilValidator {

       public static boolean validarAutomovil(Automovil auto,AutomovilJpaController autoController) {
        if (auto == null) {
            JOptionPane.showMessageDialog(null, "Error: El auto no puede ser nulo.");
            return false;
        }
        
        if (!validarModelo(auto.getModelo())) {
            JOptionPane.showMessageDialog(null, "Error: El nombre del modelo debe tener entre 3 y 15 caracteres.");
            return false;
        }
        
        if (!validarMarca(auto.getMarca())) {
            JOptionPane.showMessageDialog(null, "Error: La marca debe tener entre 3 y 15 caracteres.");
            return false;
        }
        
        if (!validarMotor(auto.getMotor())) {
            JOptionPane.showMessageDialog(null, "Error: Debe seleccionar algunas de las 3 opciones de motor.");
            return false;
        }
        
        if (!validarColor(auto.getColor())) {
            JOptionPane.showMessageDialog(null, "Error: La color debe tener entre 4 y 10 caracteres.");
            return false;
        }
        
        if (auto.getPatente() != null && !auto.getPatente().trim().isEmpty()) {
            String patente = auto.getPatente().toUpperCase().trim();
            Integer id = auto.getIdAuto();
            if (autoController.existePatente(patente, id)) {
                JOptionPane.showMessageDialog(null, "Error: Ya existe un auto con esa patente.");
                return false;
            }
        }

        if (!validarPuertas(auto.getCantidadPuertas())) {
            JOptionPane.showMessageDialog(null, "Error: Debe seleccionar si el auto tiene 2,3,4 o 5 puertas");
            return false;
        }
    
        return true; 
   
    }
    
    private static boolean validarModelo(String modelo) {
        return modelo != null && modelo.length() >= 3 && modelo.length() <= 15;
    }
    
    private static boolean validarMarca(String marca) {
        return marca != null && marca.length() >= 3 && marca.length() <= 15;
    }
    
    private static boolean validarMotor(String motor) {
        return motor != null && (motor.equalsIgnoreCase("1.0L - 1.6L") || motor.equalsIgnoreCase("1.8L - 2.5L") || motor.equalsIgnoreCase("3.0L o más"));
    }
    
    private static boolean validarColor(String color) {
        return color != null && color.length() >= 4 && color.length() <= 10;
    }
    
    private static boolean validarPatente(String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            return true; 
        }
        
        patente = patente.toUpperCase(); 
        
        String regexVieja = "^[A-Z]{3}\\d{3}$";

        String regexNueva = "^[A-Z]{2}\\d{3}[A-Z]{2}$";

        return patente.matches(regexVieja) || patente.matches(regexNueva);
    }
    
    private static boolean validarPuertas(String puertas) {
        return puertas != null && (puertas.equalsIgnoreCase("2") || puertas.equalsIgnoreCase("3") || puertas.equalsIgnoreCase("4")|| puertas.equalsIgnoreCase("5"));
    } 

}
