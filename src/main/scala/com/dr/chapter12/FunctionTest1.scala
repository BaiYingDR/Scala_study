package com.dr.chapter12

object FunctionTest1 {

  def main(args: Array[String]): Unit = {

    // 相当于 def triple(x: Double) = 3 * x
    // 将函数存放在变量中
    val triple = (x: Double) => 3 * x


    val a = Array("Hello", "World")
    val b = Array("Hello", "world")

    a.corresponds(b)(_.equalsIgnoreCase(_))

    // def corresponds[B](that: GenSeq[B])(p: (A,B) => Boolean): Boolean
    // 在这里，that 序列和前提函数p是分开的两个柯里化的参数。类型推断器可以分析 出B出自that 的类型，因此就可以利用这个信息来分析作为参数p传人的的函数
    // that 在这里是string类型的序列，因此，前提函数应有的类型为(String,String)=>Boolean
  }
}
