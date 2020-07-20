package com.merve.marketalisveris.controller;

import com.merve.marketalisveris.dao.KullaniciDao;
import com.merve.marketalisveris.model.Kullanici;
import java.util.List;

public class KullaniciController implements IController<Kullanici> {

    private final KullaniciDao userDao;

    public KullaniciController() {
        userDao = new KullaniciDao();
    }

    @Override
    public Kullanici get(int id) {
        Kullanici user = userDao.get(id);
        return user;
    }

    @Override
    public List<Kullanici> getAll() {
        List<Kullanici> users = userDao.getAll();
        return users;
    }

    @Override
    public void saveOrUpdate(Kullanici e) {
        userDao.saveOrUpdate(e);
    }

    @Override
    public void remove(Kullanici e) {
        userDao.remove(e);
    }

    public Kullanici getByUserName(String kullaniciAdi) {
        Kullanici kullanici = userDao.getByUserName(kullaniciAdi);
        return kullanici;
    }
}
