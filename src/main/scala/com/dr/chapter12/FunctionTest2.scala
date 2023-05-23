package com.dr.chapter12

import scala.math._

/*
* 带函数参数的函数
* */

class FunctionTest2 {
  val num = 3.14
  // _ 表示确实指的是这个函数，而不是忘记给参数
  val fun = ceil _
}


object FunctionTest2 {

  def main(args: Array[String]): Unit = {

    println(valueAtOneQuarter(ceil _))
    println(valueAtOneQuarter(sqrt _))


    val quintuple = mulBy(5)
    quintuple(20)


    (1 to 9).map(10 * _)

    val fun = 3 * (_: Double)

    "mary has a little lamb".split(" ").sortWith(_.length < _.length).foreach(println(_))

  }


  // 参数是可以接受 Double 并且返回 Double 的函数，
  // 类型就是 ((Double) => Double) => Double
  def valueAtOneQuarter(f: Double => Double): Double = f(0.25)

  // 参数类型：（Double）=> ((Double) => Double)
  def mulBy(factor: Double) = (x: Double) => factor * x

}
