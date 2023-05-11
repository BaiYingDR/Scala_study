package com.dr.chapter5

import java.util.Date

// var foo : Scala自动合成一个getter 和 setter。
// val foo : Scala自动合成一个getter。
// 由你来定义 foo 和 foo_= (setter)方法。
// 由你来定义 foo 方法

/**
 * 在scala 中，方法可以访问该类的 所有对象 的私有字段
 * 对应的，定义了 private[this] 就无法被访问，因为没有get 和set 方法，这样的字段成为对象私有
 * scala允许将访问赋权给指定的类，private[class_name]，类名必须是当前定义的类，或者包括该类的外部类
 * 该用法几乎见不到
 */
class Person {

  private var name = ""

  // private[this] 表示不需要 getter 和 setter 方法
  private[Person] var age = 0

  private var privateAge = 0

  // val 只有 getter 没有 setter 方法
  val timestamp = new Date()

  //自定义的 get 和 set 方法
  // 没什么必要，还会引起 定义冲突
  //  def age = privateAge
  //
  //  def age_=(newValue: Int): Unit = {
  //    privateAge = newValue
  //  }

  def this(name: String) = {
    this() //主构造器，如果未显式定义则自动拥有无参主构造
    this.name = name
  }

  def this(name: String, age: Int) = {
    this(name)
    this.age = age
  }


}

class Person1 {

}

object Person {

  def main(args: Array[String]): Unit = {
    val person = new Person("david")

    println(person.age)

    //这里不是对age属性进行赋值，而是调用其setter方法
    person.age = 21

    println(person.age)
  }

}


