package com.example.designmode.ch07_prototype.deep_shallow_copy;

public class CopyTest {

    public static void main(String[] args) {
        ShallowCopy s1 = new ShallowCopy();
        s1.setValue("张三");
        ShallowCopy s2 = s1.clone();
        s2.setValue("李四");
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);

        DeepCopy d1 = new DeepCopy();
        d1.setValue("张三");
        DeepCopy d2 = d1.clone();
        d2.setValue("李四");
        System.out.println("d1:"+d1);
        System.out.println("d2:"+d2);

    }
}
