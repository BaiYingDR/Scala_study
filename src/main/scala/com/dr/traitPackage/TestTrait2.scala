package com.dr.traitPackage

object TestTrait2 {

  def main(args: Array[String]): Unit = {

    val ball = new MyBall
    println(ball.describe())
  }

}


class MyBall extends Category with Color {
  override def describe(): String = {
    "my ball is " + super.describe()
  }
}

trait Ball {
  def describe(): String = {
    "ball"
  }
}


trait Color extends Ball {
  override def describe(): String = {
    "blue " + super.describe()
  }
}


trait Category extends Ball {
  override def describe(): String = {
    "foot-" + super.describe()
  }
}
