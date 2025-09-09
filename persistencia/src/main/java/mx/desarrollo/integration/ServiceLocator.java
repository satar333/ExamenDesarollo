package mx.desarrollo.integration;

import mx.desarrollo.dao.AlumnoDAO;
import mx.desarrollo.dao.UsuarioDAO;
import jakarta.persistence.EntityManager;
import mx.desarrollo.persistence.HibernateUtil;

public class ServiceLocator {

    private static AlumnoDAO alumDAO;
    private static UsuarioDAO usuDAO;

    private static EntityManager getEntityManager(){
        return HibernateUtil.getEntityManager();
    }

    /**
     * se crea la instancia para alumno DAO si esta no existe
     */
    public static AlumnoDAO getInstanceAlumnoDAO(){
        if(alumDAO == null){
            alumDAO = new AlumnoDAO(getEntityManager());
            return alumDAO;
        } else{
            return alumDAO;
        }
    }
    /**
     * se crea la instancia de usuarioDAO si esta no existe
     */
    public static UsuarioDAO getInstanceUsuarioDAO(){
        if(usuDAO == null){
            usuDAO = new UsuarioDAO(getEntityManager());
            return usuDAO;
        } else{
            return usuDAO;
        }
    }

}