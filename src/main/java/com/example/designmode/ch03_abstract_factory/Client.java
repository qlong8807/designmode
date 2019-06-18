package com.example.designmode.ch03_abstract_factory;

public class Client {

    public static void main(String[] args) {
        PcFactory dell = new PcDellFactory();
        dell.createKeyboard().sayHi();
        dell.createMouse().sayHi();

        PcFactory hp = new PcHPFactory();
        hp.createMouse().sayHi();
        hp.createKeyboard().sayHi();
    }
}
