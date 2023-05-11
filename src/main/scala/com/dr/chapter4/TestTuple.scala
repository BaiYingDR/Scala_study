package com.dr.chapter4

object TestTuple {

  def main(args: Array[String]): Unit = {

    val t = (1, 3.14, "Fred")
    println(t._2)

    //拉链操作
    val symbols = Array("<", "-", ">")
    val counts: Array[Int] = Array(2, 10, 2)
    val pairs: Array[(String, Int)] = symbols.zip(counts)

    pairs.foreach(print(_))

  }

}
