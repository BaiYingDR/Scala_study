package com.dr.chapter6


class SingleTon{

}
/*
  object 语法结构，是在你需求某个类的单个实例时
  或者想为其他值或者函数找一个可以挂靠的地方，就会用到这个

  scala中没有 static 关键字，所以不存在静态这个概念
  可以用object 实现一样的功能

  该对象在执行newUniqueNumber方法时，同事调用构造器
  如果一个对象从未被调用，那么构造器也不会执行
 */
object SingleTon {
  private var lastNumber = 0

  def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }
}
