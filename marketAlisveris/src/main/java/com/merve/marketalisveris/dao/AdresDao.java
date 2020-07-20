package com.merve.marketalisveris.dao;

import com.merve.marketalisveris.model.Adres;
import com.merve.marketalisveris.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AdresDao implements BaseDao<Adres> {

    private final SessionFactory sessionFactory;
    private Transaction transaction;

    public AdresDao() {
        sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    }
   // id ye göre adres getiren method
    @Override
    public Adres get(int id) {
        Adres adres = null;
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            adres = session
                    .createQuery("from Adres a where a.id = :id", Adres.class)
                    .setParameter("id", id)
                    .getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return adres;
    } 
    // Bütün adresleri alan method
    @Override
    public List<Adres> getAll() {
        List<Adres> adresList = null;
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            adresList = session
                    .createQuery("from Adres", Adres.class)
                    .getResultList();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return adresList;
    }
    // Adres güncelleme ya da yeni Adres kaydetme için kullanılan method
    @Override
    public void saveOrUpdate(Adres adres) {
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();

            session.saveOrUpdate(adres);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
    
    // Adres silmek için kullanılan method
    @Override
    public void remove(Adres adres) {
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();

            session.delete(adres);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

    }
    
    //AdresBaşlığına göre Adresi alan method
    public Adres getByName(String name) {
        Adres adres = null;
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            adres = session
                    .createQuery("from Adres a where a.adresBaslik = :baslik", Adres.class)
                    .setParameter("baslik", name)
                    .getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return adres;
    }
}
