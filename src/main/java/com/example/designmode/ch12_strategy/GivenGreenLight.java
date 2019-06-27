package com.example.designmode.ch12_strategy;

public class GivenGreenLight implements IStrategy {
    public void operate() {
        System.out.println("求吴国太开绿灯,放行！ ");
    }
}