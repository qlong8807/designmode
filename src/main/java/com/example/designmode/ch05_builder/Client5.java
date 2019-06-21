package com.example.designmode.ch05_builder;

import java.util.ArrayList;

/**
 * 此类把顺序也写到这里了。
 * 也可以把顺序再包装一层，此类直接调用包装类就好。
 * <p/>
 * <p>
 * 使用场景
 * ● 相同的方法， 不同的执行顺序， 产生不同的事件结果时， 可以采用建造者模式。
 * ● 多个部件或零件， 都可以装配到一个对象中， 但是产生的运行结果又不相同时， 则可
 * 以使用该模式。
 * ● 产品类非常复杂， 或者产品类中的调用顺序不同产生了不同的效能， 这个时候使用建
 * 造者模式非常合适。
 * ● 在对象创建过程中会使用到系统中的一些其他对象， 这些对象在产品对象的创建过程
 * 中不易得到时， 也可以采用建造者模式封装该对象的创建过程。
 * </p>
 * <p>
 *     该种场景只能是一个补偿方法， 因为一个对象不容易获得， 而在设计阶段竟然没有发觉， 而要通过创建者模式柔化创建
 *  过程， 本身已经违反设计的最初目标。
 *  建造者模式关注的是零件类型和装配工艺（顺序） ， 这是它与工厂方法模式最大不同的地方.
 * </p>
 * <p>
 *     建造者模式最主要的功能是基本方法的
 * 调用顺序安排， 也就是这些基本方法已经实现了， 通俗地说就是零件的装配， 顺序不同产生
 * 的对象也不同； 而工厂方法则重点是创建， 创建零件是它的主要职责， 组装顺序则不是它关
 * 心的。
 * </p>
 * 在使用建造者模式的时候考虑一下模板方法模式
 */
public class Client5 {

    public static void main(String[] args) {
        /*
         * 客户告诉XX公司， 我要这样一个模型， 然后XX公司就告诉我老大
         * 说要这样一个模型， 这样一个顺序， 然后我就来制造
         */
//存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom"); //客户要求， run时候时候先发动引擎
        sequence.add("start"); //启动起来
        sequence.add("stop"); //开了一段就停下来
//要一个奔驰车：
        BenzBuilder benzBuilder = new BenzBuilder();//把顺序给这个builder类， 制造出这样一个车出来
        benzBuilder.setSequence(sequence);
//制造出一个奔驰车
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
//奔驰车跑一下看看
        benz.run();
    }
}
