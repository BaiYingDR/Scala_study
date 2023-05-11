package com.dr

object EnumTest {

  def main(args: Array[String]): Unit = {

    println(Color.RED)

  }

}


object Color extends Enumeration {
  val RED = Value(1, "red")
  val YELLOW = Value(2, "yellow")
  val BLUE = Value(3, "blue")
}
