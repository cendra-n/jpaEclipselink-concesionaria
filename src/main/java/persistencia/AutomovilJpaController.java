package persistencia;

import logica.Automovil;
import persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;

/**
 * Controlador JPA para la entidad Automovil que gestiona las operaciones CRUD
 * con la base de datos. Implementa Serializable para permitir la serialización
 * de sus instancias.
 */
public class AutomovilJpaController implements Serializable {
    
    private EntityManagerFactory emf = null;

    /**
     * Constructor que recibe un EntityManagerFactory configurado. 
     * @param emf EntityManagerFactory a utilizar para crear EntityManagers
     */
    public AutomovilJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    /**
     * Constructor por defecto que inicializa el EntityManagerFactory
     * con la unidad de persistencia "concesionariaPU".
     */
    public AutomovilJpaController() {
        emf = Persistence.createEntityManagerFactory("concesionariaPU");
    }

    /**
     * Obtiene un nuevo EntityManager para operaciones con la base de datos.
     * @return EntityManager creado a partir del EntityManagerFactory
     */
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    /**
     * Obtiene el EntityManagerFactory utilizado por este controlador.
     * @return EntityManagerFactory actual
     */
    public EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }

    /**
     * Crea un nuevo registro de Automovil en la base de datos. 
     * @param automovil Objeto Automovil a persistir
     */
    public void create(Automovil automovil) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(automovil);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    /**
     * Actualiza un registro existente de Automovil en la base de datos.
     * 
     * @param automovil Objeto Automovil con los datos actualizados
     * @throws Exception Si ocurre un error durante la actualización
     * @throws NonexistentEntityException Si el automóvil no existe en la base de datos
     */
    public void edit(Automovil automovil) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            if (em.find(Automovil.class, automovil.getIdAuto()) == null) {
                throw new NonexistentEntityException("El automovil con id " + automovil.getIdAuto()+ " no existe.");
            }
            automovil = em.merge(automovil);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    /**
     * Elimina un registro de Automovil de la base de datos por su ID.
     * 
     * @param id ID del automóvil a eliminar
     * @throws Exception Si ocurre un error durante la eliminación
     */
    public void destroy(int id) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Automovil automovil = em.getReference(Automovil.class, id);
            em.remove(automovil);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    /**
     * Obtiene una lista con todos los registros de Automovil en la base de datos.
     * 
     * @return Lista de objetos Automovil
     */
    public List<Automovil> findAutomovilEntities() {
        EntityManager em = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Automovil.class));
        return em.createQuery(cq).getResultList();
    }

    /**
     * Busca un Automovil específico por su ID.
     * 
     * @param id ID del automóvil a buscar
     * @return Objeto Automovil encontrado o null si no existe
     */
    public Automovil findAutomovil(int id) {
        EntityManager em = getEntityManager();
        return em.find(Automovil.class, id);
    }

    /**
     * Verifica si ya existe un automóvil con la patente especificada,
     * excluyendo opcionalmente un ID específico (útil para operaciones de actualización).
     * 
     * @param patente Número de patente a verificar
     * @param idActual ID del automóvil actual (puede ser null para nuevas creaciones)
     * @return true si existe un automóvil con esa patente (excluyendo idActual), false en caso contrario
     */
    public boolean existePatente(String patente, Integer idActual) {
       EntityManager em = getEntityManager();
       try {
           List<Automovil> resultado = em.createQuery(
               "SELECT a FROM Automovil a WHERE a.patente = :patente", Automovil.class)
               .setParameter("patente", patente)
               .getResultList();

           for (Automovil a : resultado) {
               if (idActual == null || a.getIdAuto() != idActual) {
                   return true;
               }
           }

           return false;
       } finally {
           em.close();
       }
   }
}