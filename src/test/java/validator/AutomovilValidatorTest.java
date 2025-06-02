package validator;

import logica.Automovil;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import persistencia.AutomovilJpaController;

public class AutomovilValidatorTest {

    @Test
    public void testValidarAutomovil_DatosValidos() {
        AutomovilJpaController autoController = new AutomovilJpaController();
        Automovil auto = new Automovil();
        auto.setModelo("Corolla");
        auto.setMarca("Toyota");
        auto.setMotor("1.8L - 2.5L");
        auto.setColor("Rojo");
        auto.setPatente("ABC123");  // Asume que esta patente NO está en la base
        auto.setCantidadPuertas("4");

        boolean resultado = AutomovilValidator.validarAutomovil(auto, autoController);
        assertTrue(resultado, "El auto con datos válidos debe pasar la validación");
    }

    @Test
    public void testValidarAutomovil_ModeloInvalido() {
        AutomovilJpaController autoController = new AutomovilJpaController();
        Automovil auto = new Automovil();
        auto.setModelo("Co"); // Modelo demasiado corto (inválido)
        auto.setMarca("Toyota");
        auto.setMotor("1.8L - 2.5L");
        auto.setColor("Rojo");
        auto.setPatente("XYZ789");
        auto.setCantidadPuertas("4");

        boolean resultado = AutomovilValidator.validarAutomovil(auto, autoController);
        assertFalse(resultado, "El auto con modelo inválido no debe pasar la validación");
    }

    @Test
    public void testValidarAutomovil_PatenteExistente() {
        AutomovilJpaController autoController = new AutomovilJpaController();
        
        // Crear un auto con patente ya existente en la base
        Automovil autoExistente = new Automovil();
        autoExistente.setModelo("Focus");
        autoExistente.setMarca("Ford");
        autoExistente.setMotor("2.0L");
        autoExistente.setColor("Azul");
        autoExistente.setPatente("DUPLICADA123");
        autoExistente.setCantidadPuertas("4");
        
        // Aquí debes guardar autoExistente en la base para que exista antes de la validación
        try {
            autoController.create(autoExistente);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Automovil autoNuevo = new Automovil();
        autoNuevo.setModelo("Fiesta");
        autoNuevo.setMarca("Ford");
        autoNuevo.setMotor("1.6L");
        autoNuevo.setColor("Blanco");
        autoNuevo.setPatente("DUPLICADA123");  // Misma patente que autoExistente
        autoNuevo.setCantidadPuertas("4");

        boolean resultado = AutomovilValidator.validarAutomovil(autoNuevo, autoController);
        assertFalse(resultado, "El auto con patente duplicada no debe pasar la validación");

        // Limpieza: elimina autoExistente si quieres para no afectar otros tests
        try {
            autoController.destroy(autoExistente.getIdAuto()); 
        } catch (Exception e) {
            e.printStackTrace();
}
}
}