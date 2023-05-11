package com.dr.chapter12

import scala.math._

/*
* 带函数参数的函数
* */

class FunctionTest2 {
  val num = 3.14
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


  def valueAtOneQuarter(f: Double => Double): Double = f(0.25)

  def mulBy(factor: Double) = (x: Double) => factor * x

}
