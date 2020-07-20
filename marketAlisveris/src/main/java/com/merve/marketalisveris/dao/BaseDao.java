
package com.merve.marketalisveris.dao;

import java.util.List;


public interface BaseDao<E> {
    public E get(int id);
    public List<E> getAll();
    public void saveOrUpdate(E e);
    public void remove(E e);
    
}
