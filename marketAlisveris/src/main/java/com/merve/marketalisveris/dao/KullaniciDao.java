package com.merve.marketalisveris.dao;

import com.merve.marketalisveris.model.Adres;
import com.merve.marketalisveris.model.Kullanici;
import com.merve.marketalisveris.util.HibernateUtil;
import com.merve.marketalisveris.controller.AdresController;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class KullaniciDao implements BaseDao<Kullanici> {

    private final SessionFactory sessionFactory;
    private Transaction transaction;

    public KullaniciDao() {
        sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    }
    // Id ye göre Kullanıcı getirir
    @Override
    public Kullanici get(int id) {
        Kullanici kullanici = null;
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            kullanici = session
                    .createQuery("from Kullanici k where k.id = :id", Kullanici.class)
                    .setParameter("id", id)
                    .getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return kullanici;
    }
    // bütün Kullanıcıları getiren method
    @Override
    public List<Kullanici> getAll() {
        List<Kullanici> users = null;
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            users = session
                    .createQuery("from Kullanici", Kullanici.class)
                    .getResultList();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return users;
    }
    // Kullanici kaydetmek veya güncellemek için kullanılan method
    @Override
    public void saveOrUpdate(Kullanici kullanici) {
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();

            session.saveOrUpdate(kullanici);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
   // kullanıcı silmek için kullanılan metod
    @Override
    public void remove(Kullanici kullanici) {
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();

            AdresController adresController = new AdresController();

            List<Adres> adresler = kullanici.getAdresler();
            for (Adres adres : adresler) {
                adresController.remove(adres);

                session.delete(kullanici);

                transaction.commit();
            }

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
   // kullanıcı adına göre kullanıcı getiren method
    public Kullanici getByUserName(String kullaniciAdi) {
        Kullanici kullanici = null;
        try ( Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            kullanici = session
                    .createQuery("from Kullanici k where k.kullaniciAdi = :kullaniciAdi", Kullanici.class)
                    .setParameter("kullaniciAdi", kullaniciAdi)
                    .getSingleResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return kullanici;
    }
}
