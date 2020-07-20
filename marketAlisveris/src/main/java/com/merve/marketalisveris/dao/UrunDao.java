package com.merve.marketalisveris.dao;

import com.merve.marketalisveris.model.Urun;
import com.merve.marketalisveris.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UrunDao implements BaseDao<Urun> {

    private final SessionFactory sessionFactory;
    private Transaction transaction;

    public UrunDao() {
        sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    }
    //Id ye göre ürün getiren method
    @Override
    public Urun get(int id) {
        Urun urun = null;
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            urun = session
                    .createQuery("from Urun u where u.id = :id", Urun.class)
                    .setParameter("id", id)
                    .getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return urun;
    }
    //Bütün ürünleri getiren method
    @Override
    public List<Urun> getAll() {
        List<Urun> odemelerList = null;
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            odemelerList = session
                    .createQuery("from Urun", Urun.class)
                    .getResultList();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return odemelerList;
    }
    //ürün güncelllemek veya kaydetmek için kullanılan method
    @Override
    public void saveOrUpdate(Urun urun) {
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();

            session.saveOrUpdate(urun);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
    // Ürün silmek için kullanılan method
    @Override
    public void remove(Urun urun) {
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();

            session.delete(urun);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
    // Ürün ismine göre ürün getiren method
    public Urun getByName(String name) {
        Urun urun = null;
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            urun = session
                    .createQuery("from Urun u where u.urunIsim = :name", Urun.class)
                    .setParameter("name", name)
                    .getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return urun;
    }
}
