package com.dr.chapter13

import scala.collection.mutable

/**
 * scala中，列表要么Nil，要么是一个head元素加上一个tail
 * 而tail又是一个列表
 */
object ListDemo {
  def main(args: Array[String]): Unit = {

    /*
    * 这里head的值是4 ，tail是List(2)
    * 再近一步，digits.tail.head 是2，而digits.tail.tail 是Nil
    * */
    val digits = List(4, 2)

    val ints: List[Int] = 9 :: digits // List(9,4,2)

    /*
    * 如何遍历scala中的list
    * */
    //    def sum(lst: List[Int]): Int = {
    //      if (lst == Nil) 0 else lst.head + sum(lst.tail)
    //    }
    //
    //    def sum1(lst: List[Int]): Int = {
    //      lst match {
    //        case Nil => 0
    //        case h :: t => h + sum(t)
    //      }
    //    }

    // 以上，可直接替换为
    ints.sum


    val lst: mutable.LinkedList[Int] = scala.collection.mutable.LinkedList(1, -2, 3, -4)
    var cur = lst
    while (cur != Nil) {
      if (cur.elem < 0) cur.elem = 0
      cur = cur.next
    }


    val list = List(1, 7, 2, 9)
    println(list.reduceLeft(_ - _)) // ((1-7)-2)-9 = -17
    println(list.reduceRight(_ - _)) // 1-(7-(2-9)) = -13
    println(list.foldLeft(0)(_ - _)) // 0-1-7-2-9 = -19
    println(list.foldRight(0)(_ - _)) // 1-(7-(2-(9-0)) = -13


    println(1.to(10).scanLeft(0)(_ + _)) //Vector(0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55)
  }
}
