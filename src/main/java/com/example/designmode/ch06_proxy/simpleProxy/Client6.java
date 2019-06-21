package com.example.designmode.ch06_proxy.simpleProxy;

import java.time.*;

public class Client6 {

    public static void main(String[] args) {
        //定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
//然后再定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy(player);
//开始打游戏， 记下时间戳
        System.out.println("开始时间是1： "+ Instant.now().getEpochSecond());
        System.out.println("开始时间是2： "+ Instant.now().getNano());
        System.out.println("开始时间是： "+ Instant.now());
        proxy.login("zhangSan", "password");
//开始杀怪
        proxy.killBoss();
//升级
        proxy.upgrade();
//记录结束游戏时间
        System.out.println("结束时间是： "+ LocalDateTime.now());
        System.out.println("local time "+ LocalTime.now());
        System.out.println("local date "+ LocalDate.now());
        System.out.println("开始时间是3： "+ Instant.now().getNano());
        DayOfWeek thursday = LocalDate.parse("2017-07-20").getDayOfWeek();
        System.out.println("周四: " + thursday);
        int twenty = LocalDate.parse("2017-07-20").getDayOfMonth();
        System.out.println("twenty: " + twenty);
    }
}
