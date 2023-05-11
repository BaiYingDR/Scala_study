package com.dr.chapter14

/**
 * case class 是一个特殊类，进过优化被用于模式匹配
 */

abstract class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

object CaseClazzDemo {

  def main(args: Array[String]): Unit = {

    val amt = Currency(29.95, "EUR")
    // 这个方法没什么卵用，毕竟case class 中的变量全都是val 的，不如直接共享这个对象引用
    val price = amt.copy()

    //但是可以使用带名参数修改属性
    amt.copy(value = 10.95)

  }


}
