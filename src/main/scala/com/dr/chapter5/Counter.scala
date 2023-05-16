package com.dr.chapter5

import java.util.Date
import scala.beans.BeanProperty
import scala.collection.mutable.ArrayBuffer

/**
 * 5.1
 */
object TestClazz {
  def main(args: Array[String]): Unit = {

    val counter = new Counter

    counter.increment()

    counter.current
    println(counter.value)
    counter.value = 10

    counter.setValue(12)
  }
}

/**
 * 在定义变量时，即使不声明private，编译后生成的类也会自动加上private
 * 但是在getter & setter方法有所区别
 * 未声明则生成public方法，声明了就private
 *
 * @BeanProperty 该注解会自动生成 get 和 set 方法
 * BeanProperty' annotation can be applied only to non-private fields，只能用于非私有变量
 *
 *
 * scala中调用方法，和java基本类型
 * 但是scala中调用无参方法，可以直接省略 '() '
 * 一般对于改值器方法使用()， 取值去掉（）
 * 即 new Counter().increment() & new Counter().current
 * 也可以在定义时强制风格
 */

/*
* scala 中，getter & setter 分别叫做 age & age_
*/
class Counter {

  @BeanProperty
  var value = 0 // 必须初始化字段

  private var name: String = _

  // 方法默认公有
  def increment(): Unit = {
    value += 1
  }

  //无参方法
  def current(): Int = value

  def current1: Int = {
    value
  }

}

/**
 *
 * 在scala 中，方法可以访问该类的 所有对象 的私有字段
 * 对应的，定义了 private[this] 就无法被访问，因为没有get 和set 方法，这样的字段成为对象私有
 * scala允许将访问赋权给指定的类，private[class_name]，类名必须是当前定义的类，或者包括该类的外部类
 * 该用法几乎见不到
 *
 *
 * 5.6 构造器
 *  主构造器不以 this 方法定义，而是与类定义交织在一起
 *  会执行类定义过程中的所有语句
 */
class Person {

  private var name = ""

  // private[this] 表示不需要 getter 和 setter 方法
  // 这样相当于定义该字段是 对象私有字段，别的对象的方法无法访问该对象的当前字段
  // 如果定义成 private[this] var value = 0，那么只有new出来的对象可以访问
  private[Person] var value = 0

  // val 只有 getter 没有 setter 方法
  val timestamp = new Date()


  def this(name: String) = {
    this() //主构造器，如果未显式定义则自动拥有无参主构造
    this.name = name
  }

  def this(name: String, value: Int) = {
    this(name)
    this.value = value
  }

  def isLess(other: Person) = value < other.value
}


/**
 * 5.8 嵌套类
 */
class Network {

  // 这种写法表示每一个对象都会有一个自己的Member对象
  class Member(var name: String) {
    val contact = new ArrayBuffer[Member]
  }

  private val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }

}

object Network {

  //表示每个Network对象都只有一个Member
  //相当于java中的一个 final 变量，多个对象共用一个
  class MemberCommon(var name: String) {

  }

}