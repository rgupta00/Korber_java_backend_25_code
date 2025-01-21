package com.busycoder.empapp.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.query.hql.spi.SemanticPathPart;

public class EntityManagerFactoryUtil {
    private static EntityManagerFactory emf;
    static {
        emf= Persistence.createEntityManagerFactory("busycoder");
    }

    public static EntityManagerFactory getEmf(){
        return emf;
    }
}
