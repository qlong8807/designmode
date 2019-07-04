package com.example.designmode.ch18_memento.v4;


public class Caretaker {
    //发起人对象
    private Memento memento;
    public Memento getMemento() {
        return memento;
    }
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
