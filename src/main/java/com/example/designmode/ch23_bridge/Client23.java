package com.example.designmode.ch23_bridge;

/**
 * 桥梁模式是一个非常简单的模式， 它只是使用了类间的聚合关系、 继承、 覆写等常用功
 * 能， 但是它却提供了一个非常清晰、 稳定的架构。
 */
public class Client23 {
    public static void main(String[] args) {
//定义一个实现化角色
        Implementor imp = new ConcreteImplementor1();
//定义一个抽象化角色
        Abstraction abs = new RefinedAbstraction(imp);
//执行行文
        abs.request();
    }
}
