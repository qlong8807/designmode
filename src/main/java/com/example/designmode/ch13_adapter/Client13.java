package com.example.designmode.ch13_adapter;

public class Client13 {
    public static void main(String[] args) {
        IUserInfo youngGirl = new UserInfo();
        for (int i = 0; i < 10; i++) {
            System.out.println(youngGirl.getMobileNumber());
        }

        IUserInfo younggirl2 = new OuterUserInfo();
        for (int i = 0; i < 10; i++) {
            System.out.println(younggirl2.getMobileNumber());
        }
    }
}
