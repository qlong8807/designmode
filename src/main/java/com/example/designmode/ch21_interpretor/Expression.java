package com.example.designmode.ch21_interpretor;

import java.util.HashMap;

/**
 * 抽象类非常简单， 仅一个方法interpreter负责对传递进来的参数和值进行解析和匹配， 其
 * 中输入参数为HashMap类型， key值为模型中的参数， 如a、 b、 c等， value为运算时取得的具
 * 体数字。
 */
public abstract class Expression {
    //解析公式和数值， 其中var中的key值是公式中的参数， value值是具体的数字
    public abstract int interpreter(HashMap<String,Integer> var);
}
