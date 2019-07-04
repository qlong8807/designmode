package com.example.designmode.ch18_memento.v2;

public class Caretaker {
    //发起人对象
    private Originator originator;
    public Originator getOriginator() {
        return originator;
    }
    public void setOriginator(Originator originator) {
        this.originator = originator;
    }
}
