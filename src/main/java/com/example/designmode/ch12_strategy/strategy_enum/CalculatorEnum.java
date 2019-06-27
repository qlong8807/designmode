package com.example.designmode.ch12_strategy.strategy_enum;

/**
 * 策略枚举定义如下：
 * ● 它是一个枚举。
 * ● 它是一个浓缩了的策略模式的枚举.
 */
public enum  CalculatorEnum {

    //加法运算
    ADD("+"){
        public int exec(int a,int b){
            return a+b;
        }
    },
    //减法运算
    SUB("-"){
        public int exec(int a,int b){
            return a - b;
        }
    };
    String value = "";
    //定义成员值类型
    private CalculatorEnum(String _value){
        this.value = _value;
    }//获得枚举成员的值
    public String getValue(){
        return this.value;
    }//声明一个抽象函数
    public abstract int exec(int a,int b);
}
