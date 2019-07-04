# 备忘录模式的定义
Without violating encapsulation,capture and externalize an object's internal state so that the
object can be restored to this state later.（在不破坏封装性的前提下， 捕获一个对象的内部状
态， 并在该对象之外保存这个状态。 这样以后就可将该对象恢复到原先保存的状态。 ）

# 使用方式
```java
public class Client {
    public static void main(String[] args) {
        //定义出发起人
        Originator originator = new Originator();
        //定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        //创建一个备忘录
        caretaker.setMemento(originator.createMemento());
        //恢复一个备忘录
        originator.restoreMemento(caretaker.getMemento());
    }
}
```
# 备忘录模式的使用场景
* 需要保存和恢复数据的相关状态场景。
* 提供一个可回滚（rollback） 的操作； 比如Word中的CTRL+Z组合键， IE浏览器中的后
  退按钮， 文件管理器上的backspace键等。
* 需要监控的副本场景中。 例如要监控一个对象的属性， 但是监控又不应该作为系统的
  主业务来调用， 它只是边缘应用， 即使出现监控不准、 错误报警也影响不大， 因此一般的做
  法是备份一个主线程中的对象， 然后由分析程序来分析。
* 数据库连接的事务管理就是用的备忘录模式， 想想看， 如果你要实现一个JDBC驱
  动， 你怎么来实现事务？ 还不是用备忘录模式嘛！

# v2  v3
>使用Clone方式的备忘录模式， 可以使用在比较简单的场景或者比较单一的场景
中， 尽量不要与其他的对象产生严重的耦合关系。








