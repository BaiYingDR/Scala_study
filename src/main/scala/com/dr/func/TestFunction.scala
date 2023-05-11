package com.dr.func

object TestFunction {

  def main(args: Array[String]): Unit = {
    //    println(f1)
    //    f2("11")
    //    f3(f2)

    //    var f = foo _ //传入函数整体
    //    println(f())

    //    var f = f4()
    //    f()
    //    f4()()

    //    val arr = operation(Array(1, 2, 3, 4), (x: Int) => {
    //      x + 1
    //    })
    //
    //    println(arr.mkString(","))
    //
    //    operation(Array(1, 2, 3, 4), _ + 1)

    //    def map(arr: Array[Int], op: Int => Int) = {
    //      for (elem <- arr) yield op(elem)
    //    }
    //
    //    val arr = map(Array(1, 2, 3, 4), (x: Int) => {
    //      x * x
    //    })
    //
    //    println(arr.mkString(","))


    f21(f2())


  }


  def f1: Int = {
    10;
  }

  def f2 = () => {
    println("calling f2....")
    10
  }

  def f21(a: => Int) = {
    println("calling f21...")
    println(a)
  }

  def f3(f: String => Unit) = {
    f("12")
  }

  def foo(): Int = {
    10
  }

  def f4() = {
    println("f4")

    def f5(): Unit = {
      println("f5")
    }

    f5 _
  }

  def operation(arr: Array[Int], op: Int => Int) = {
    for (elem <- arr) yield op(elem)
  }


}

