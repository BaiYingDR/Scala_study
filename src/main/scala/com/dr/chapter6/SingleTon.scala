package com.dr.chapter6

/**
 * 当需要用到既有实例方法又有静态方法的类时，可以使用伴生对象达到目的
 */
class SingleTon private(val id: Int, initialBalance: Double) {

}
/*
  object 语法结构，是在你需求某个类的单个实例时
  或者想为其他值或者函数找一个可以挂靠的地方，就会用到这个

  scala中没有 static 关键字，所以不存在静态这个概念
  可以用 object 实现一样的功能

  该对象在执行newUniqueNumber方法时，同事调用构造器
  如果一个对象从未被调用，那么构造器也不会执行
 */


/**
 * apply 方法： 通常一个apply方法返回的时伴生类的对象
 * 当出现 object(param1 , ... , param2)这类调用时，会自动调用其apply方法, 通常直接返回的时一个伴生类的对象
 * 例如： Array('David','Mary',...)
 *
 * Array(100) 和new Array(100)的区别在于:
 * 前一个表达式调用的是apply(100)
 * 后一个表达式调用的是构造器this(100)，结果是Array[Nothing]，包含100个null元素
 *
 */
object SingleTon {
  private var lastNumber = 0

  def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }

  def apply(initialBalance: Double) =
    new SingleTon(newUniqueNumber(), initialBalance)
}


/**
 * 枚举
 * 枚举值的 ID 可通过 id() 方法返回， 名称通过 toString() 方法返回
 */
object TrafficLightColor extends Enumeration {
//  val Red,Yellow,Green = Value

  //如果不指定，则D 在将前一个枚举值基础上加一，从零开始，缺省名称为字段名
  val Red = Value (0, "Stop")
  val Yellow = Value (10) // 名称为Yellow
  val Green = Value ("Go") // ID 为11
}
