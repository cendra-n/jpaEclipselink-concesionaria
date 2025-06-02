package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Automovil;

/**
 * Controladora de persistencia que actúa como fachada para operaciones JPA.
 * Gestiona las operaciones de persistencia para la entidad Automovil,
 * utilizando AutomovilJpaController como implementación subyacente.
 * Proporciona un punto único de acceso a las operaciones CRUD y manejo
 * de conexiones con la base de datos.
 */
public class ControladoraPersistencia {
    
    /**
     * Controlador JPA para operaciones con la entidad Automovil
     */
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    /**
     * Guarda un nuevo automóvil en la base de datos.
     * @param auto Objeto Automovil a persistir
     * @throws Exception Si ocurre un error durante la persistencia
     */
    public void guardar(Automovil auto) {
        try {
            autoJpa.create(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Obtiene todos los automóviles registrados en la base de datos.
     * @return Lista de objetos Automovil
     */
    public List<Automovil> listaAutos() {
       return autoJpa.findAutomovilEntities();
    }

    /**
     * Elimina un automóvil de la base de datos por su ID.
     * @param numAuto ID del automóvil a eliminar
     * @throws Exception Si ocurre un error durante la eliminación
     */
    public void eliminarAuto(int numAuto) {
        try {
            autoJpa.destroy(numAuto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Busca un automóvil específico por su ID.
     * @param idAuto ID del automóvil a buscar
     * @return Objeto Automovil encontrado o null si no existe
     */
    public Automovil buscarAuto(int idAuto) {
        return autoJpa.findAutomovil(idAuto);
    }

    /**
     * Actualiza los datos de un automóvil existente en la base de datos.
     * @param auto Objeto Automovil con los datos actualizados
     * @throws Exception Si ocurre un error durante la actualización
     */
    public void modificarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Cierra la conexión con la base de datos si está abierta.
     * Método importante para liberar recursos cuando la aplicación
     * ya no necesita acceder a la base de datos.
     */
    public void cerrarConexion() {
        if (autoJpa != null && autoJpa.getEntityManagerFactory().isOpen()) {
            autoJpa.getEntityManagerFactory().close();
        }
    }
}