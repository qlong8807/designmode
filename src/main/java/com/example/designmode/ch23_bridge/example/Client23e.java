package com.example.designmode.ch23_bridge.example;


/**
 * 1. 增加公司， 要么继承Corp类， 要么继承HouseCorp或ShanZhaiCorp， 不用再修改原有的
 * 类了。
 * 2. 增加产品， 继承Product类， 或者继承House类， 你要把房子分为公寓房、 别墅、 商业
 * 用房等。
 *
 * 你唯一要修改的就是Client类。 增加一个实现类， 高层模块也需要修改， 也就是说Corp类和
 * Product类都可以自由地扩展， 而不会对整个应用产生太大的变更， 这就是桥梁模式。
 */
public class Client23e {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("-------房地产公司是这样运行的-------");
//先找到房地产公司
        HouseCorp houseCorp =new HouseCorp(house);
//看我怎么挣钱
        houseCorp.makeMoney();
        System.out.println("\n");
//山寨公司生产的产品很多， 不过我只要指定产品就成了
        System.out.println("-------山寨公司是这样运行的-------");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
//        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(otherProduct);
        shanZhaiCorp.makeMoney();
    }
}
