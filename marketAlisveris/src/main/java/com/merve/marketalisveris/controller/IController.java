
package com.merve.marketalisveris.controller;

import java.util.List;


public interface IController<E> {
    public E get(int id);
    public List<E> getAll();
    public void saveOrUpdate(E e);
    public void remove(E e);
    
}
