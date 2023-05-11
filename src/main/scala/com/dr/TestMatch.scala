package com.dr

//class User01(val name: String, val age: Int)
//
//object User01 {
//
//  def apply(name: String, age: Int): User01 = new User01(name, age)
//
//  def unapply(user01: User01): Option[(String, Int)] = {
//    if (user01 == null)
//      None
//    else
//      Some(user01.name, user01.age)
//  }
//}


case class User01(name: String, age: Int)

object TestMatch {

  def main(args: Array[String]): Unit = {
    val user01: User01 = User01("zhangsan", 11)
    val result = user01 match {
      case User01("zhangsan", 11) => "yes"
      case _ => "no"
    }
    println(result)
  }
}

