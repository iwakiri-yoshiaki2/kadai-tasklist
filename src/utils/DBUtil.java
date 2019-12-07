package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    public static final String PERSISTENCE_UNIT_NAME = "tasks_content";

    public static EntityManagerFactory emf;

    public static EntityManager createEntityManager(){
        return _getEntityManagerFactory().createEntityManager();
    }

    public static EntityManagerFactory _getEntityManagerFactory(){
        if (emf == null){
            emf = Persistence.createEntityManagerFactory("PERSISTENCE_UNIT_NAME");
        }
        return emf;
    }

}
