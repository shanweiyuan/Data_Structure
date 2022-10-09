package com.swy.service.impl;

import com.swy.pojo.Node;
import com.swy.service.IList;
public class IListImpl implements IList {

    public Node first;
    public Node last;

    /**
     * 创建链表
     *
     * @param coef 系数
     * @param exp  指数
     */
    @Override
    public void create_link(int coef, int exp) {
        Node newnode = new Node(coef, exp);
        if (isEmpty()) {
            first = newnode;
            last = newnode;
        } else {
            last.next = newnode;
            last = newnode;
        }
    }

    @Override
    public IListImpl sum_link(IListImpl b) {
        int sum[] = new int[10];
        int i = 0, maxnumber;
        IListImpl tempLinkedList = new IListImpl();
        IListImpl a = new IListImpl();
        int tempexp[] = new int[10];
        Node ptr = b.first;
        a = this;
        while (a.first != null) {
            b.first = ptr;
            while (b.first != null) {
                if (a.first.getExp() == b.first.getExp()) {
                    sum[i] = a.first.getCoef() + b.first.getCoef();
                    tempexp[i] = a.first.getExp();
                    a.first = a.first.next;
                    b.first = b.first.next;
                    i++;
                } else if (b.first.getExp() > a.first.getExp()) {
                    sum[i] = b.first.getCoef();
                    tempexp[i] = b.first.getExp();
                    b.first = b.first.next;
                    i++;
                } else {
                    if (a.first.getExp() > b.first.getExp()) {
                        sum[i] = b.first.getExp();
                        tempexp[i] = b.first.getExp();
                        b.first = b.first.next;
                        i++;
                    } else if (a.first.getExp() > b.first.getExp()) {
                        sum[i] = a.first.getCoef();
                        tempexp[i] = a.first.getExp();
                    }
                    a.first = a.first.next;
                    i++;
                }
            }
            maxnumber = i - 1;
            for (int j = 0; j < maxnumber + 1; j++)
                tempLinkedList.create_link(sum[j], maxnumber - j);

        }
        return tempLinkedList;
    }

    /**
     * 判空
     *
     * @return 头节点与尾节点相同则为空返回 true
     */
    @Override
    public boolean isEmpty() {
        return first == null;
    }



    @Override
    public void print_link() {
        Node current = first;
        while (current != null) {
            if (current.getExp() == 1 && current.getExp() != 0) {
                System.out.print(current.getExp() + "X + ");
            } else if (current.getExp() != 0 && current.getCoef() != 0) {
                System.out.print(current.getCoef() + "x^" + current.getExp() + "+");
            } else if (current.getCoef() != 0) {
                System.out.print(current.getCoef());
            }
            current = current.next;


        }
        System.out.println();
    }
}
