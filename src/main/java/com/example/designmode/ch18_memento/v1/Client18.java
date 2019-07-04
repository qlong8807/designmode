package com.example.designmode.ch18_memento.v1;

public class Client18 {
    /**
     * 虽然程序中不再重复定义Boy类的对象了， 但是我们还是要关心备
     * 忘录， 这对迪米特法则是一个亵渎， 它告诉我们只和朋友类通信， 那这个备忘录对象是我们
     * 必须要通信的朋友类吗？ 对高层模块来说， 它最希望要做的就是创建一个备份点， 然后在需
     * 要的时候再恢复到这个备份点就成了， 它不用关心到底有没有备忘录这个类。 那根据这一指
     * 导思想， 我们就需要把备忘录类再包装一下， 怎么包装呢？ 建立一个管理类， 就是管理这个
     * 备忘录
     * @param args
     */
    public static void main1(String[] args) {
        //声明出主角
        Boy boy = new Boy();
//初始化当前状态
        boy.setState("心情很棒！ ");
        System.out.println("=====男孩现在的状态======");
        System.out.println(boy.getState());
//需要记录下当前状态呀
        Memento mem = boy.createMemento();
//男孩去追女孩， 状态改变
        boy.changeState();
        System.out.println("\n=====男孩追女孩子后的状态======");
        System.out.println(boy.getState());
//追女孩失败， 恢复原状
        boy.restoreMemento(mem);
        System.out.println("\n=====男孩恢复后的状态======");
        System.out.println(boy.getState());
    }

    /**
     * 需要备份的时
     * 候就创建一个备份， 然后丢给备忘录管理者进行管理， 要取的时候再从管理者手中拿到这个
     * 备份。 这个备份者就类似于一个备份的仓库管理员， 创建一个丢进去， 需要的时候再拿出
     * 来。 这就是备忘录模式
     * @param args
     */
    public static void main(String[] args) {
        //声明出主角
        Boy boy = new Boy();
//声明出备忘录的管理者
        Caretaker caretaker = new Caretaker();
//初始化当前状态
        boy.setState("心情很棒！ ");
        System.out.println("=====男孩现在的状态======");
        System.out.println(boy.getState());
//需要记录下当前状态呀caretaker.setMemento(boy.createMemento());
//男孩去追女孩， 状态改变
        boy.changeState();
        System.out.println("\n=====男孩追女孩子后的状态======");
        System.out.println(boy.getState());
//追女孩失败， 恢复原状
        boy.restoreMemento(caretaker.getMemento());
        System.out.println("\n=====男孩恢复后的状态======");
        System.out.println(boy.getState());
    }
}
