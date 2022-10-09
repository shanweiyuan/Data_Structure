package com.swy;

import com.swy.service.impl.IListImpl;

public class run {
    public static void main(String[] args) {
        IListImpl a = new IListImpl();
        IListImpl b = new IListImpl();
        IListImpl c = new IListImpl();

        int data1[]={8,54,7,0,1,3,0,4,2};
        int data2[]={-2,6,0,0,0,5,6,8,6,9};
        System.out.print("原始多项式为: \nA=");

        for (int i=0;i<data1.length;i++){
            a.create_link(data1[i],data1.length-i-1);
        }

        for (int i = 0; i < data2.length; i++) {
            b.create_link(data2[i],data2.length-i-1);
        }

        a.print_link();
        System.out.print("B=");
        b.print_link();
        System.out.print("多项式相加的结果为: \nC=");
        c=a.sum_link(b);
        c.print_link();

    }
}
