package com.dr.chapter13

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object MethodTest {

  def main(args: Array[String]): Unit = {

    val seq = Seq(1, 2, 3, 4, 5, 6)

    val seq2 = Seq(6, 7, 8, 9, 10)

    val arr: Array[Int] = Array(1, 2, 3, 4, 5, 6)

    val arraybuffer: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5, 6)

    val arraybuffer2: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5)

    val set = Set(1, 2, 3, 4, 5, 6, 7)

    val set2 = Set(1, 2, 3, 4, 5, 6)

    val map = Map(1 -> "a", 2 -> "b")

    val lst1 = List(1, 2, 3)
    val lst2 = List(3, 4, 5, 6)

    val mutableMap: mutable.Map[Int, String] = mutable.Map(1 -> "a", 2 -> "b")


    println(seq :+ 7) // List(1, 2, 3, 4, 5, 6, 7)
    println(7 +: seq) // List(7, 1, 2, 3, 4, 5, 6)

    println(set + 7) // Set(5, 1, 6, 2, 7, 3, 4)
    println(map + (3 -> "c")) // Map(1 -> a, 2 -> b, 3 -> c)
    println(arraybuffer + " 1") // ArrayBuffer(1, 2, 3, 4, 5, 6) 1

    println(set - 7) // Set(5, 1, 6, 2, 3, 4)
    println(map - 3) // Map(1 -> a, 2 -> b)
    println(arraybuffer - 1) // ArrayBuffer(2, 3, 4, 5, 6)

    println(seq ++ seq2) // List(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10)
    println(seq2 ++: seq) // List(6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6)

    println(set -- set2) // Set(7)
    println(arraybuffer -- arraybuffer2) // ArrayBuffer(6)

    println(4 :: lst1) // List(4, 1, 2, 3)
    println(lst2 ::: lst1) // List(3, 4, 5, 6, 1, 2, 3)

    println(set | set2) // Set(5, 1, 6, 2, 7, 3, 4)
    println(set & set2) // Set(5, 1, 6, 2, 3, 4)
    println(set &~ set2) // Set(7) 两个集的差异


    println(mutableMap += (3 -> "c")) //Map(2 -> b, 1 -> a, 3 -> c)
    //    println(mutableMap ++= (3 -> "c")) //Map(2 -> b, 1 -> a, 3 -> c)

    println(7 +=: arraybuffer) // ArrayBuffer(7, 1, 2, 3, 4, 5, 6)
    println(arraybuffer ++=: arraybuffer2) // ArrayBuffer(7, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5)


    // iterable 适用方法
    println(arraybuffer.head + "," + arraybuffer.last) // 7,6
    println(arraybuffer.headOption + "," + arraybuffer.lastOption) // Some(7),Some(6)

    println(arraybuffer.init + "," + arraybuffer.tail) // ArrayBuffer(7, 1, 2, 3, 4, 5),ArrayBuffer(1, 2, 3, 4, 5, 6)

    println(arraybuffer.length + "," + arraybuffer.isEmpty)

    println(arraybuffer.map(_ * 2))


  }


}
