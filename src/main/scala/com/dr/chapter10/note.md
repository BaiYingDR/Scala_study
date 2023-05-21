1、很多情况下都把 trait 理解成 java 中的 interface，但是实际上并不是，

trait中可以设定方法和字段的默认实现,interface 中只能包含抽象方法，不能包含字段

2、如果一个类扩展了多个trait，而且这多个trait中还存在相同的方法，那么看哪个trait在最后，就先调用哪个trait的方法

3、在trait中重写抽象方法，需要同时加上 abstract 和 override，否则会报错（10.6）

4、trait中未被初始化的字段在子类中必须重写

5、trait构造顺序：
    1、首先掉用超类构造
    2、trait构造器在超类构造之后，类构造之前执行
    3、trait从左到右构造
    4、每个trait中，父类trait先构造
    5、所有特质构造完毕，子类开始构造

6、特质不能有构造器参数，每个特质都有一个无参数的构造器，示例如下
```scala
import com.dr.chapter10.SavingAccount
// 直接报错
new SavingAccount with FileLogger("myApp.log") 
```
7、当trait扩展类时，编译器能够确保的一件事是所有混入该trait的类都认这个类作为父类

