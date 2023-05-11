package com.dr.chapter3

import scala.collection.mutable.ArrayBuffer

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
  }

}
