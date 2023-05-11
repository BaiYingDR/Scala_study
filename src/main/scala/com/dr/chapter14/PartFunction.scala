package com.dr.chapter14


/**
 * 被包在花括号内的一组case语句是一个便函数 ------- 一个并非对所有输入值都有定义的函数
 * 是PartialFunction[A，B]类的一个实例
 * 该类有两个方法：apply & isDefinedAt
 * apply 方法从匹配到的模式计算函数值
 * isDefinedAt 在输入至少匹配其中一个模式，否则返回false
 */
object PartFunction {

  def main(args: Array[String]): Unit = {

    val f: PartialFunction[Char, Int] = {
      case '+' => 1
      case '-' => -1
    }

    println(f('-'))
    println(f('+'))

    println(f.isDefinedAt('+'))
    println(f.isDefinedAt(0))
  }

}
