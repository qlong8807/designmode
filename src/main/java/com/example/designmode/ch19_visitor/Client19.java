package com.example.designmode.ch19_visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 看看这个程序是怎么实现的：
 * ● 第一， 通过循环遍历所有元素。
 * ● 第二， 每个员工对象都定义了一个访问者。
 * ● 第三， 员工对象把自己作为一个参数调用访问者visit方法。
 * ● 第四， 访问者调用自己内部的计算逻辑， 计算出相应的数据和表格元素。
 * ● 第五， 访问者打印出报表和数据。
 */
public class Client19 {
    public static void main(String[] args) {
        for(Employee emp:mockEmployee()){
            emp.accept(new Visitor());
            //TODO 这里可以使用多个访问者
        }
    }
    //模拟出公司的人员情况， 我们可以想象这个数据是通过持久层传递过来的
    public static List<Employee> mockEmployee(){
        List<Employee> empList = new ArrayList<Employee>();
//产生张三这个员工
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序， 绝对的蓝领、 苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);
//产生李四这个员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("页面美工， 审美素质太不流行了！ ");
        liSi.setName("李四");liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);
//再产生一个经理
        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上是负值， 但是我会拍马屁呀");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);
        return empList;
    }
}
