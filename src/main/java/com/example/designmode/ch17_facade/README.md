门面模式
>不改变子系统对外暴露的接口、 方法， 只改变内部的处理逻辑， 其他兄弟模块的调用产生了
 不同的结果
 
 >Provide a unified interface to a set of interfaces in a subsystem.Facade defines a higher-level
  interface that makes the subsystem easier to use.（要求一个子系统的外部与其内部的通信必须通
  过一个统一的对象进行。 门面模式提供一个高层次的接口， 使得子系统更易于使用。 ）
  
只要有门面对象在， 就可以做到“金玉其外， 败絮其中”。

# 门面模式的优点
* 减少系统的相互依赖
* 提高了灵活性
* 提高安全性

# 门面模式的缺点
  门面模式最大的缺点就是不符合开闭原则， 对修改关闭， 对扩展开放






