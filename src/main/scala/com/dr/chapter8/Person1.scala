package com.dr.chapter8


// def 只能重写另一个 def
// val 只能重写另一个 val 或者 不带参数的def
// var 只能重写另一个抽象的 var
abstract class Person1 {

  val pk: Int
  var name: String

  def id: Int

}


class Student(override val id: Int) extends Person1 {
  val pk: Int = 1
  var name: String = _
}

object Test {
  def main(args: Array[String]): Unit = {
    new Person1 {
      override val pk: Int = 1729
      override var name: String = "Fred"

      override def id: Int = {
        pk
      }
    }
  }
}
