package com.example.designmode.ch22_flyweight.composite;


import java.util.ArrayList;
import java.util.List;

/**
 * 从运行结果可以看出，一个复合享元对象的所有单纯享元对象元素的外蕴状态都是与复合享元对象的外蕴状态相等的。即外运状态都等于Composite Call。
 * 从运行结果可以看出，一个复合享元对象所含有的单纯享元对象的内蕴状态一般是不相等的。即内蕴状态分别为b、c、a。
 * 从运行结果可以看出，复合享元对象是不能共享的。即使用相同的对象compositeState通过工厂分别两次创建出的对象不是同一个对象。
 * 从运行结果可以看出，单纯享元对象是可以共享的。即使用相同的对象state通过工厂分别两次创建出的对象是同一个对象。
 */
public class Client22c {


    public static void main(String[] args) {
        List<Character> compositeState = new ArrayList<Character>();
        compositeState.add('a');
        compositeState.add('b');
        compositeState.add('c');
        compositeState.add('a');
        compositeState.add('b');

        FlyweightFactory flyFactory = new FlyweightFactory();
        Flyweight compositeFly1 = flyFactory.factory(compositeState);
        Flyweight compositeFly2 = flyFactory.factory(compositeState);
        compositeFly1.operation("Composite Call");

        System.out.println("---------------------------------");
        System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));

        Character state = 'a';
        Flyweight fly1 = flyFactory.factory(state);
        Flyweight fly2 = flyFactory.factory(state);
        System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
    }
}
