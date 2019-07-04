package com.example.designmode.ch18_memento.v5;

import com.example.designmode.ch18_memento.v4.Originator;

/**
 * 备份多个历史状态。再进一步，为了安全，可以把Memento类改为Originator类的内部类。
 */
public class Client18v5 {
    public static void main(String[] args) {

        //定义出发起人
        Originator originator = new Originator();
//定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
//创建两个备忘录
        caretaker.setMemento("001",originator.createMemento());
        caretaker.setMemento("002",originator.createMemento());
//恢复一个指定标记的备忘录
        originator.restoreMemento(caretaker.getMemento("001"));
    }
}
