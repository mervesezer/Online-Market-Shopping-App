
package com.merve.marketalisveris.controller;

import com.merve.marketalisveris.dao.KategoriDao;
import com.merve.marketalisveris.model.Kategori;
import java.util.List;


public class KategoriController implements IController<Kategori>{
   private final KategoriDao kategoriDao;

    public KategoriController(){
        kategoriDao = new KategoriDao();
    }

    @Override
    public Kategori get(int id) {
       Kategori user = kategoriDao.get(id);
       return user;
    }

    @Override
    public List<Kategori> getAll() {
        List<Kategori> users = kategoriDao.getAll();
        return users;
    }

    @Override
    public void saveOrUpdate(Kategori e) {
        kategoriDao.saveOrUpdate(e);
    }

    @Override
    public void remove(Kategori e) {
       kategoriDao.remove(e);
    }
}