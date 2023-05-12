package com.dr.chapter3

import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConversions.bufferAsJavaList;

object TestArray {

  def main(args: Array[String]): Unit = {

    // 定长数组
    // 长度为10，所有元素初始化为0
    val nums = new Array[Int](10)

    val s: Array[String] = Array("Hello", "World")
    s(0) = "Google"


    // 变长数组
    val arrayBuffer = ArrayBuffer[Int](3, 2, 5)

    //在下标为 2 处插入 6
    arrayBuffer.insert(2, 6)
    //在下标为 0 处插入 7，8，9
    arrayBuffer.insert(0, 7, 8, 9)

    //remove同理，移除第二个元素
    arrayBuffer.remove(2)

    // 在数组尾部追加所有值
    arrayBuffer += (0, 7, 8, 9)

    // ++= 操作符追加任何集合
    arrayBuffer ++= Array(8, 13, 21)

    // 去除最后五个元素
    arrayBuffer.trimEnd(5)

    // 有时需要创建一个Array，但是不知道最终需要装多少元素，这种情况下
    // 先构建一个缓冲数据，再调用toArray方法
    arrayBuffer.toArray
    // 反过来也可以把 Array 转回 buffer
    arrayBuffer.toArray.toBuffer

    for (elem <- arrayBuffer) {
      println(elem)
    }

    // 数组转换
    // 转换动作不会修改原始数组，而是产生一个全新的数组

    // 对于for() yield 循环，从什么出发，就会得到一个新的什么
    //例如： 下面 变量a 是array， 那么得到的也是Array
    // 如果a 是Arraybuffer， 那么得到的就是一个新的ArrayBuffer
    val a = Array(2, 3, 5, 7, 11)
    val result: Array[Int] = for (elem <- a) yield 2 * elem // Array(4, 6, 10, 14, 22)

    // 在遍历一个集合时，可以使用条件判断处理
    for (elem <- a if elem % 2 == 0) yield 2 * elem



    //3.5 常用算法
    println(Array(1, 2, 3, 4, 5).sum)
    println(ArrayBuffer(1, 2, 3, 4, 5, 6).max)
    println(ArrayBuffer(1, 2, 3, 4, 5, 6).min)

    val b: ArrayBuffer[Int] = ArrayBuffer(1, 7, 2, 9)
    val bSorted: ArrayBuffer[Int] = b.sorted // bSorted :ArrayBuffer(1,2,7,9)

    val bSortedWith: ArrayBuffer[Int] = b.sortWith(_ > _)

    // 可以对一个Array排序，但是不能对ArrayBuffer排序
    scala.util.Sorting.quickSort(a)
    //    scala.util.Sorting.quickSort(b)

    println(a.mkString(" and ")) // 2 and 3 and 5 and 7 and 11

    // 多维数组
    val matrix: Array[Array[Double]] = Array.ofDim[Double](3, 4)
    matrix(1)(3) = 42

    //不规则的多维数组
    val triangle = new Array[Array[Int]](10)
    for (i <- 0 until triangle.length)
      triangle(i) = new Array[Int](i + 1)


    // 和 java 的互操作

    val command = ArrayBuffer("ls", "-al", "/home/rudai")
    val pb = new ProcessBuilder(command)
  }

}
