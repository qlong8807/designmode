package com.example.designmode.ch03_abstract_factory;

public class PcDellFactory implements PcFactory{


    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyBoard();
    }
}
