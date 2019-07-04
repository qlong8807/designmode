package com.example.designmode.ch18_memento.v2;

public class Client18v2 {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("aaa");
        System.out.println("初始状态："+originator.getState());
        System.out.println("添加备忘。。。");
        Originator clone = originator.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.setOriginator(clone);
        System.out.println("====change state======");
        originator.setState("bbb");
        System.out.println("修改后状态："+originator.getState());
        System.out.println("恢复状态。。。");
        originator.setState(caretaker.getOriginator().getState());
        System.out.println("恢复后状态："+originator.getState());
    }
}
