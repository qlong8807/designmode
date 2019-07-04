package com.example.designmode.ch18_memento.v3;


/**
 * 可能你要发问了， 这和备忘录模式的定义不相符， 它定义是“在该对象之外保存这个状
 * 态”， 而你却把这个状态保存在了发起人内部。 是的， 设计模式定义的诞生比Java的出世略
 * 早， 它没有想到Java程序是这么有活力， 有远见， 而且在面向对象的设计中， 即使把一个类
 * 封装在另一个类中也是可以做到的， 何况一个小小的对象复制， 这是它的设计模式完全没有
 * 预见到的， 我们把它弥补回来。
 *
 * 使用Clone方式的备忘录模式， 可以使用在比较简单的场景或者比较单一的场景
 * 中， 尽量不要与其他的对象产生严重的耦合关系。
 */
public class Client18v3 {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("aaa");
        System.out.println("初始状态："+originator.getState());
        System.out.println("添加备忘。。。");
        originator.createMemento();
        System.out.println("====change state======");
        originator.setState("bbb");
        System.out.println("修改后状态："+originator.getState());
        System.out.println("恢复状态。。。");
        originator.restoreMemento();
        System.out.println("恢复后状态："+originator.getState());
    }
}
