package com.dr.implicits

import com.dr.implicits.TestTransform.Teacher


object TestTransform extends PersonTrait {

  def main(args: Array[String]): Unit = {
    val teacher = new Teacher()
    teacher.eat()
    teacher.say()
  }

  class Teacher {
    def eat(): Unit = {
      println("eat")
    }
  }
}

trait PersonTrait {

}

object PersonTrait {

  // 隐式类 : 类型 1 = => 类型 2
  implicit class Person5(user: Teacher) {
    def say(): Unit = {
      println("say...")
    }
  }

}
