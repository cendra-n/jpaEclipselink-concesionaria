package logica;

import java.util.List;
import javax.swing.JOptionPane;
import persistencia.AutomovilJpaController;
import persistencia.ControladoraPersistencia;  
import validator.AutomovilValidator;

/**
 * Clase controladora que centraliza la lógica de negocio de la aplicación de concesionaria.
 * Actúa como intermediario entre la capa de persistencia y la interfaz gráfica,
 * validando datos y coordinando las operaciones CRUD para la entidad Automovil.
 */
public class ControladoraLogica {
    
    /**
     * Controladora de persistencia para operaciones con la base de datos
     */
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    /**
     * Controlador JPA para validaciones específicas de Automovil
     */
    AutomovilJpaController autoController = new AutomovilJpaController();

    /**
     * Guarda un nuevo automóvil en la base de datos después de validar los datos.
     * @param modelo Modelo del automóvil (no puede estar vacío)
     * @param marca Marca del automóvil (no puede estar vacía)
     * @param motor Tipo de motor del automóvil (no puede estar vacío)
     * @param color Color del automóvil (no puede estar vacío)
     * @param patente Número de patente (puede estar vacío para autos nuevos)
     * @param cantidadPuertas Cantidad de puertas (no puede estar vacía)
     * @see AutomovilValidator#validarAutomovil(Automovil, AutomovilJpaController)
     */
    public void guardarDatos(String modelo, String marca, String motor, String color, String patente, String cantidadPuertas) {
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantidadPuertas(cantidadPuertas);

        if (!AutomovilValidator.validarAutomovil(auto, autoController)) {
            JOptionPane.showMessageDialog(null, "Datos inválidos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            controlPersis.guardar(auto);
            JOptionPane.showMessageDialog(null, "La información fue guardada con éxito en la BD.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    
    /**
     * Obtiene la lista completa de automóviles registrados.
     * @return Lista de objetos Automovil
     */
    public List<Automovil> traerAutos() {
        return controlPersis.listaAutos();
    }

    /**
     * Elimina un automóvil de la base de datos por su ID.
     * @param numAuto ID del automóvil a eliminar
     */
    public void borrarAuto(int numAuto) {
        controlPersis.eliminarAuto(numAuto);
    }

    
    /**
     * Busca un automóvil específico por su ID.
     * @param idAuto ID del automóvil a buscar
     * @return Objeto Automovil encontrado o null si no existe
     */
    public Automovil traerAuto(int idAuto) {
        return controlPersis.buscarAuto(idAuto);
    }

    
    /**
     * Modifica los datos de un automóvil existente después de validar los cambios.
     * @param auto Objeto Automovil a modificar
     * @param modelo Nuevo modelo del automóvil
     * @param marca Nueva marca del automóvil
     * @param motor Nuevo tipo de motor
     * @param color Nuevo color
     * @param patente Nueva patente
     * @param cantidadPuertas Nueva cantidad de puertas
     * @see AutomovilValidator#validarAutomovil(Automovil, AutomovilJpaController)
     */
    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, String cantidadPuertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantidadPuertas(cantidadPuertas);
        
        if (!AutomovilValidator.validarAutomovil(auto, autoController)) {
            JOptionPane.showMessageDialog(null, "Datos inválidos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            controlPersis.modificarAuto(auto);
            JOptionPane.showMessageDialog(null, "La información fue Editada con éxito en la BD.", "Edición exitosa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

    
        
    
