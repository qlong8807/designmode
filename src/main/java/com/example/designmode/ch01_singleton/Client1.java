package com.example.designmode.ch01_singleton;

public class Client1 {
    public static void main(String[] args) {

        Singleton.getSingleton().doSomething();

        Singleton2.getSingleton().doSomething();
    }
}
