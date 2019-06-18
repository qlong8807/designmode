package com.example.designmode.ch03_abstract_factory;

public class PcHPFactory implements PcFactory{


    @Override
    public Mouse createMouse() {
        return new HPMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HPKeyBoard();
    }
}
