package com.example.designmode.ch01_singleton;

public class Singleton2 {
    private static Singleton2 singleton;
    //限制产生多个对象
    private Singleton2(){
    }
    //通过该方法获得实例对象
    public static Singleton2 getSingleton(){
        if(null == singleton){
            synchronized (Singleton2.class) {
                if (null == singleton) {
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
    //类中其他方法， 尽量是static
    public void doSomething(){
        System.out.println("单例类做什么呢...");
    }
}