package com.dr.implicits

object TestImplicitParameter {

  implicit val str: String = "hello world"


  def hello(implicit arg: String = "goodbye world!"): Unit = {
    println(arg)
  }

  def main(args: Array[String]): Unit = {
    hello
  }
}
