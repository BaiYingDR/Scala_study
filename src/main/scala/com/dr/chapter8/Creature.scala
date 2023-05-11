package com.dr.chapter8

/*
  超类构造
  超类构造结束
  子类构造
  子类构造结束
  0
*/
class Creature {
  println("超类构造")
  val range: Int = 10
  val env: Array[Int] = new Array[Int](range)
  println("超类构造结束")
}


class Ant extends Creature {
  println("子类构造")
  override val range = 2
  println("子类构造结束")
}


object CreatureTest {
  def main(args: Array[String]): Unit = {

    val ant = new Ant
    println(ant.env.length)

  }
}