package com.example.designmode.ch23_bridge.example;

public class IPod extends Product {
    public void beProducted() {
        System.out.println("生产出的iPod是这样的...");
    }
    public void beSelled() {
        System.out.println("生产出的iPod卖出去了...");
    }
}
