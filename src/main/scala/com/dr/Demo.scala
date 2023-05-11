package com.dr

import java.util.Date

object Demo {

  def main(args: Array[String]): Unit = {

    println(f1()(1))

  }

  def f1(): Int => Int = {
    var a: Int = 10

    def f2(b: Int) = {
      a + b
    }

    f2 _
  }

  def f = () => {
    10
  }

  def f3(): Int = {
    10
  }

}
