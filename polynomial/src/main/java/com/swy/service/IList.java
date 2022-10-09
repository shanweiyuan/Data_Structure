package com.swy.service;

import com.swy.service.impl.IListImpl;

public interface IList {
    public boolean isEmpty();
    public void create_link(int coef,int exp);
    public void print_link();
    public IListImpl sum_link(IListImpl b);
}
