
package com.merve.marketalisveris.controller;

import com.merve.marketalisveris.dao.AdresDao;
import com.merve.marketalisveris.model.Adres;
import java.util.List;


public class AdresController implements IController<Adres>{
   private final AdresDao adresDao;

    public AdresController(){
        adresDao = new AdresDao();
    }

    @Override
    public Adres get(int id) {
       Adres adres = adresDao.get(id);
       return adres;
    }

    @Override
    public List<Adres> getAll() {
        List<Adres> adreses = adresDao.getAll();
        return adreses;
    }

    @Override
    public void saveOrUpdate(Adres e) {
        adresDao.saveOrUpdate(e);
    }

    @Override
    public void remove(Adres e) {
       adresDao.remove(e);
    }
    
    public Adres getByName(String name){
        return adresDao.getByName(name);
    }
}