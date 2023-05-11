package com.dr.chapter5

import scala.beans.BeanProperty


object TestClazz {
  def main(args: Array[String]): Unit = {
    val counter = new Counter

    counter.increment()
    counter.current
    counter.value
    counter.value =10
    counter.setValue(12)
  }
}

class Counter {

  // 该注解会自动生成 get 和 set 方法
  @BeanProperty
  //  private
  var value = 0

  // 方法默认公有
  def increment(): Unit = {
    value += 1
  }

  //无参方法
  def current(): Int = value

  // scala中调用方法，和java基本类型
  // 但是scala中调用无参方法，可以直接省略 '() '
  // 一般对于改值器方法使用()， 取值去掉（）

  //也可以在定义时强制风格
  def current1: Int = {
    value
  }

}
