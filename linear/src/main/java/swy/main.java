package swy;

import swy.impl.IListImpl;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {

        IListImpl L = new IListImpl(10);

        //插入数据
        for (int i = 0; i < 10; i++) {
            L.insert(i,i);
        }

        System.out.print("all param:"+"  ");
        for (int i = 0; i < 10; i++) {
            System.out.print(L.get(i)+" ");
        }

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("输入第i的元素:");
        int i=sc.nextInt();

        if (i<1 || i>L.length()){
            System.out.println("err");
        }else {
            int result = (int) L.get(i - 2);
            System.out.println("第个"+i+"个元素的前驱的值是："+result);
        }
    }
}
