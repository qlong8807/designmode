package com.example.designmode.ch06_proxy.forceProxy;

public class ClientForce6 {

    public static void main(String[] args) {
        System.err.println("自己创建代理角色");
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = new GamePlayerProxy(player);
        proxy.login("zhangSan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("-----------------------------");
        System.err.println("从真实角色处获取代理角色");
        IGamePlayer p1 = player.getProxy();
        p1.login("李四","pwd");
        p1.killBoss();
        p1.upgrade();
    }
}
