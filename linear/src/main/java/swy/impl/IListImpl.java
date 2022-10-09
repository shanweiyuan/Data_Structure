package swy.impl;

import swy.service.IList;

public class IListImpl implements IList {

    private Object[] ListElem; //线性表存储空间
    private int curLen; //线性表当前长度

    public IListImpl() {
    }

    /**
     * 构造一个容量为 MaxSize 的空顺序表
     *
     * @param MaxSize 容量
     */
    public IListImpl(int MaxSize) {
        ListElem = new Object[MaxSize];
        this.curLen = 0;
    }

    /**
     * 置空
     */
    @Override
    public void clear() {
        curLen = 0;
    }

    /**
     * 判空
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return this.curLen == 0;
    }

    /**
     * 列表长度
     * @return curLen
     */
    @Override
    public int length() {
        return curLen;
    }

    /**
     * 读取顺序表中第i个元素
     *
     * @param i
     * @return
     * @throws Exception
     */
    @Override
    public Object get(int i) throws Exception {
        if (i < 0 || i > curLen - 1) {
            throw new Exception("第" + i + "个元素不存在");
        }
        return ListElem[i];
    }

    /**
     * 插入
     *
     * @param i 插入位置
     * @param x 插入信息
     * @throws Exception
     */
    @Override
    public void insert(int i, Object x) throws Exception {
        if (curLen == ListElem.length) {
            throw new Exception("顺序表已满");
        }
        if (i < 0 || i > curLen) {
            throw new Exception("插入位置不合法");
        }
        for (int j = curLen; j > i; j--) {
            ListElem[j] = ListElem[j - 1];
        }
        ListElem[i] = x;
        curLen++;
    }

    /**
     * 删除节点
     *
     * @param i
     * @throws Exception
     */
    @Override
    public void remove(int i) throws Exception {
        if (i < 0 || i > curLen - 1) {
            throw new Exception("删除位置不合法");
        }
        for (int j = i; j < curLen - 1; j++) {
            ListElem[j] = ListElem[j + 1];
        }
        curLen--;
    }

    /**
     * 查找
     * @param x
     * @return
     */
    @Override
    public int indexOf(Object x) {
        int j = 0;
        while (j < curLen && !ListElem[j].equals(x)) {
            j++;
        }
        if (j < curLen) {
            return j;
        } else {
            return -1;
        }
    }

    @Override
    public void display() {

    }
}
