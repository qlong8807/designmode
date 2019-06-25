package com.example.designmode.ch09_command;


public class AddRequirementCommand extends Command {
    //执行增加一项需求的命令
    public void execute() {
//找到需求组
        super.rg.find();
//增加一份需求
        super.rg.add();
//页面也要增加
        super.pg.add();
//功能也要增加
        super.cg.add();
//给出计划
        super.rg.plan();
    }
}