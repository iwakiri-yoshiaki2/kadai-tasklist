package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    public static final String PERSISTENCE_UNIT_NAME = "tasklist";

    public static EntityManagerFactory emf;

    public static EntityManager createEntityManager(){
        return _getEntityManagerFactory().createEntityManager();//createEntityManager()がどう作用するかが分からない
    }

    public static EntityManagerFactory _getEntityManagerFactory(){
        if (emf == null){
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return emf;
    }

}
