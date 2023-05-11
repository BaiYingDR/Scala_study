package com.dr.implicits

object TestImplicitFunction {

  implicit def convert(arg: Int): MyRichInt = {
    return new MyRichInt(arg)
  }

  def main(args: Array[String]): Unit = {
    println(2.myMax(6))
  }

}


class MyRichInt(val self: Int) {
  def myMax(i: Int): Int = {
    if (self < i) i else self
  }

  def myMin(i: Int): Int = {
    if (self < i) self else i
  }
}
