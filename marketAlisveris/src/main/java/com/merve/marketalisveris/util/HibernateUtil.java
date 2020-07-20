package com.merve.marketalisveris.util;

import com.merve.marketalisveris.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static HibernateUtil instance;
    
    private final SessionFactory sessionFactory;
    
    private HibernateUtil(){
        sessionFactory = new Configuration()
                .addAnnotatedClass(Adres.class)
                .addAnnotatedClass(Kategori.class)
                .addAnnotatedClass(Kullanici.class)
                .addAnnotatedClass(Urun.class)
                .buildSessionFactory();
    }
    
    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    
    public static HibernateUtil getInstance(){
        if(instance == null) instance = new HibernateUtil();
        
        return instance;
    }
}
