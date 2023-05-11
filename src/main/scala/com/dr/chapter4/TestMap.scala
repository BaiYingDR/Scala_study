package com.dr.chapter4

import java.util
import java.util.Properties
import scala.collection.mutable

object TestMap {

  def main(args: Array[String]): Unit = {


    // 不可变的的Map
    var scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

    // 可变的Map
    val scores1: mutable.Map[String, Int] = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

    // 空映射值需要选定一个映射实现并给出类型参数
    val scores2: Seq[(String, Int)] => mutable.HashMap[String, Int] = scala.collection.mutable.HashMap[String, Int]

    //    if(scores.contains("Bob")) scores("Bob") else 0
    // 如果直接使用scores.get(key) 返回一个options对象，要么是some，要么是None
    val bobScore: Int = scores.getOrElse("Bob", 0)

    // modify the value of key in Map
    scores1("Bob") = 10

    scores1("Fred") = 7

    for (elem <- scores1) {
      println(elem)
    }

    for (elem <- scores1.values) {
      println(elem)
    }

    for (elem <- scores1.keys) {
      println(elem)
    }

    // 已排序映射
    val scores3 = scala.collection.immutable.SortedMap("Alice" -> 10, "Fred" -> 7, "Bob" -> 3, "Cindy" -> 8)

    // 与java的互操作

    // 以java方法得到了一个java映射，如果想要把它转换成一个scala映射，需要映入以下语句
    import scala.collection.JavaConverters.mapAsScalaMap

//    val scores4: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]

    import scala.collection.JavaConverters.propertiesAsScalaMap
//    val props: scala.collection.Map[String, String] = System.getProperties()


  }

}
