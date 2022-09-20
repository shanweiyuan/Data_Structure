package com.swy.impl;

import com.swy.service.IList;
import com.swy.service.Node;

public class LinkList implements IList {

    public Node head;

    public LinkList() {
        head = new Node();
    }

    public LinkList(int n,boolean Order) {
        this();
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public Object get(int i) throws Exception {
        return null;
    }

    @Override
    public void insert(int i, Object x) throws Exception {

    }

    @Override
    public void remove(int i) throws Exception {

    }

    @Override
    public int indexOf(Object x) {
        return 0;
    }

    @Override
    public void display() {

    }
}
