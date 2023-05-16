package com.dr.chapter8

/**
 * 辅助构造器永远不可能直接调用超类的构造器，只有主构造可以，且时自动调用
 * 调用顺序为先调用超类，再调用子类
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


/**
 * def只能重写另 一个def
 * val只能重写另一个val或不带参数的def。
 * var只能重写另一个抽象的var
 */

/*
abstract 表示一个不能被实例化的类，因为某几个方法没有完整定义
 */
abstract class Person {

  // 一般来说，可以声明 id 为 val，然后在子类中重写，但是这种写法并不常见
  // 更多的是使用def 定义，再在子类的定义中直接重写
  def id: Int

  //抽象类中，抽象字段可以不做初始化
  var name: String
  val age: Int
}

class Employee(override val id: Int) extends Person {

  // 子类中重写超类中的抽象字段时不需要override关键字
  var name: String = ""
  val age: Int = 0
}


object CreatureTest {
  def main(args: Array[String]): Unit = {

    val ant = new Ant
    println(ant.env.length)

    //匿名子类
    new Person {
      override def id: Int = 6

      def greeting = "Hi"

      var name: String = _
      val age: Int = 6
    }

  }
}