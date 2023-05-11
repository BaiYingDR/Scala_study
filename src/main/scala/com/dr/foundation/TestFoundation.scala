package com.dr.foundation

object TestFoundation {


  def main(args: Array[String]): Unit = {

    //    val x = 1
    //    val r = if (x > 1) 1 else if (x == 0) 0 else -1
    //
    //    println(r)


    for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar

    def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)

    def sum(args: Int*) = {
      var result = 0

      for (elem <- args) {
        result += elem
      }

      result
    }

//    def recursiveSum(args: Int*): Int = {
//      if (args.length == 0) {
//        println(0)
//      }
//        else
//        args.head + recursiveSum(args.tail: _*)
//      }
//    }
  }
}
