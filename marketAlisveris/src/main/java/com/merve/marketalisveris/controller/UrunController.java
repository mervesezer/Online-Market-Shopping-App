
package com.merve.marketalisveris.controller;

import com.merve.marketalisveris.dao.UrunDao;
import com.merve.marketalisveris.model.Urun;
import java.util.List;


public class UrunController implements IController<Urun>{
   private final UrunDao urunDao;

    public UrunController(){
        urunDao = new UrunDao();
    }

    @Override
    public Urun get(int id) {
       Urun urun = urunDao.get(id);
       return urun;
    }

    @Override
    public List<Urun> getAll() {
        List<Urun> urunlerList = urunDao.getAll();
        return urunlerList;
    }

    @Override
    public void saveOrUpdate(Urun e) {
        urunDao.saveOrUpdate(e);
    }

    @Override
    public void remove(Urun e) {
       urunDao.remove(e);
    }
    
    public Urun getByName(String name){
        return urunDao.getByName(name);
    }
}