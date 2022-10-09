package swy;

import swy.impl.IListImpl;

public class demo {
    public static void main(String[] args) throws Exception {

        IListImpl L = new IListImpl(10);



        L.insert(0,'a');
        L.insert(1,'z');
        L.insert(2,'d');
        L.insert(3,'m');
        L.insert(4,'z');
        int z = L.indexOf('z');
        if (z!=-1){
            System.out.println("顺序表中第一次出现的值为'z'的数据元素的位置为:"+z);
        }else {
            System.out.println("不包含");
        }
    }
}
