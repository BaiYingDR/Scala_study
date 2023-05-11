package com.dr

object Constructor {

  def main(args: Array[String]): Unit = {
    new Person().Person()
  }

}

class Person {
  var name: String = _
  var age: Int = _
  println("call main constructor")


  def this(name: String) = {
    this
    this.name = name
  }

  def this(name: String, age: Int) = {
    this(name)
    this.age = age
  }

  def Person(): Unit = {
    println("call person person() method")
  }
}


object Person{

  //这里用来定义java体系下的静态变量

}