package com.dr.chapter14

import scala.util.matching.Regex

object SwitchDemo {

  def main(args: Array[String]): Unit = {

    var sign = 0
    val ch = 'a'

    //    ch match {
    //      case '+' => sign = 1
    //      case '-' => sign = -1
    //      case _ => sign = 0
    //    }

    sign = ch match {
      case '+' => 1
      case '-' => -1
      case _ if Character.isDigit(ch) => Character.digit(ch, 10) // 守卫
      case _ => 0
    }

    val str = List(1, "6", 1923698347, 'c')

    // 如果case 关键字后面跟着一个变量名，那么匹配到的表达式会被赋值给那个变量
    str.foreach {
      case '+' => sign = -1
      case '-' => sign = -1
      case ch => sign = 0
    }

    // 类型模式匹配
    // 做类型模式匹配时，必须给出一个变量名
    str.map {
      case x: Int => x
      case s: String => Integer.parseInt(s)
      case _: BigInt => Int.MaxValue
      case _ => 0
    }

    // 匹配发生在运行期间，在java虚拟机中 泛型的类型是被擦掉的，所以不能使用类型来匹配特定的Map类型
    // case m: Map[String,Int] => ... ❌
    // case m: Map[_, _] => .... ✅

    // 匹配数据，列表，元祖
    val array = new Array[Int](0)
    array match {
      case Array(0) => '0'
      case Array(x, y) => x + " " + y
      case Array(0, _*) => "0" // 任意从0开始的数组
      case _ => "sth else"
    }

    // 只有list可以使用这个 :: 操作符
    str match {
      case 0 :: Nil => "0"
      case x :: y :: Nil => x + " " + y
      case 0 :: tail => "0 ..."
      case _ => "something else"
    }


    //提取器
    val pattern: Regex = "([0-9]+) ([a-z]+)".r

    "99 bottles" match {
      case pattern(num, item) => println(num, item)  // (99,bottles)
      case _ => println("nothing here")
    }
  }

}
