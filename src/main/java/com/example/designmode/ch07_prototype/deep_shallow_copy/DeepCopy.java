package com.example.designmode.ch07_prototype.deep_shallow_copy;

import java.util.ArrayList;

public class DeepCopy implements Cloneable{
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();
    @Override
    public DeepCopy clone(){
        DeepCopy thing=null;
        try {
            thing = (DeepCopy)super.clone();
            thing.arrayList = (ArrayList<String>)this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    //设置ArrayList的值
    public void setValue(String value){
        this.arrayList.add(value);
    }
    //取得arrayList的值
    public ArrayList<String> getValue(){
        return this.arrayList;
    }

    @Override
    public String toString() {
        return "DeepCopy{" +
                "arrayList=" + arrayList +
                '}';
    }
}