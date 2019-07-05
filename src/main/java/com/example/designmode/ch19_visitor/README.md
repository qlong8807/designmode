
# 访问者模式（Visitor Pattern） 
>是一个相对简单的模式， 其定义如下： Represent an
  operation to be performed on the elements of an object structure. Visitor lets you define a new
  operation without changing the classes of the elements on which it operates. （封装一些作用于某种
  数据结构中的各元素的操作， 它可以在不改变数据结构的前提下定义作用于这些元素的新的
  操作。 ）


# 角色：
## ● ConcreteVisitor——具体访问者
它影响访问者访问到一个类后该怎么干， 要做什么事情。
## ● Element——抽象元素
接口或者抽象类， 声明接受哪一类访问者访问， 程序上是通过accept方法中的参数来定
义的。
## ● ConcreteElement——具体元素
实现accept方法， 通常是visitor.visit(this)， 基本上都形成了一种模式了。
## ● ObjectStruture——结构对象
元素产生者， 一般容纳在多个不同类、 不同接口的容器， 如List、 Set、 Map等， 在项目
中， 一般很少抽象出这个角色。

# 访问者模式的优点
* 符合单一职责原则
* 优秀的扩展性
* 灵活性非常高

# 访问者模式的缺点
* 具体元素对访问者公布细节
  访问者要访问一个类就必然要求这个类公布一些方法和数据， 也就是说访问者关注了其
  他类的内部细节， 这是迪米特法则所不建议的。
* 具体元素变更比较困难
  具体元素角色的增加、 删除、 修改都是比较困难的， 就上面那个例子， 你想想， 你要是
  想增加一个成员变量， 如年龄age， Visitor就需要修改， 如果Visitor是一个还好办， 多个呢？
  业务逻辑再复杂点呢？
* 违背了依赖倒置转原则










