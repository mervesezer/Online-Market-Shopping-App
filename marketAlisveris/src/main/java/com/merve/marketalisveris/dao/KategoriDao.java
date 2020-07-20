package com.merve.marketalisveris.dao;

import com.merve.marketalisveris.model.Kategori;
import com.merve.marketalisveris.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class KategoriDao implements BaseDao<Kategori> {

    private final SessionFactory sessionFactory;
    private Transaction transaction;

    public KategoriDao() {
        sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    }
    
    // id ye göre Kategori getiren method
    @Override
    public Kategori get(int id) {
        Kategori altKategori = null;
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            altKategori = session
                    .createQuery("from Kategori k where k.id = :id", Kategori.class)
                    .setParameter("id", id)
                    .getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return altKategori;
    }
    
    //Bütün kategorileri alan method
    @Override
    public List<Kategori> getAll() {
        List<Kategori> altKategoriler = null;
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            altKategoriler = session
                    .createQuery("from Kategori", Kategori.class)
                    .getResultList();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return altKategoriler;
    }
    // Kategori kaydetmek ya da güncellemek için kullanılan method
    @Override
    public void saveOrUpdate(Kategori kategori) {
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();

            session.saveOrUpdate(kategori);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
    
    //Kategori silmeye yarayan method
    @Override
    public void remove(Kategori kategori) {
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();

            session.delete(kategori);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

    }
}
