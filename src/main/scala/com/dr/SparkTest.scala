package com.dr


object Test {

  def main(args: Array[String]): Unit = {

    println(Person1())

    println(Person1("david"))
  }
}

class Person1 (cName: String) {
  var name: String = cName

  override def toString: String = {
    "name is "+name
  }
}

object Person1 {
  def apply(): Person1 = {
    new Person1("xx")
  }

  def apply(name: String): Person1 = {
    new Person1(name)
  }
}
