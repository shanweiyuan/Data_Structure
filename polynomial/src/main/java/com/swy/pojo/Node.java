package com.swy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述节点
 * @param：coef 系数
 * @param：exp 指数
 * @param：next 指针域
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Node {
    private int coef; //系数
    private int exp;  //指数
    public Node next; //指针域
    public Node(int coef,int exp){
        this.coef=coef;
        this.exp=exp;
        this.next=null;
    }
}
