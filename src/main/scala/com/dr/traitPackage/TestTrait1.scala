package com.dr.traitPackage

object TestTrait1 {

  def main(args: Array[String]): Unit = {

    val teacher = new Teacher

    teacher.say()
    teacher.eat()


//    val t2 = new Teacher with SexTrait {
//      override var gender: String = "male"
//    }
//
//    println(t2.gender)

  }

}

trait PersonTrait {

  var name: String = _

  def eat(): Unit = {
    println("eat")
  }

  var age: Int

  def say(): Unit
}


trait SexTrait {

  var gender: String = _

}

class Teacher extends PersonTrait with java.io.Serializable {
  override var age: Int = _

  override def say(): Unit = {
    println("say")
  }
}
