package com.dr.chapter14

object SwitchDemo {

  def main(args: Array[String]): Unit = {

    var sign = 0
    val ch = 'a'

    //    ch match {
    //      case '+' => sign = 1
    //      case '-' => sign = -1
    //      case _ => sign = 0
    //    }

    sign = ch match {
      case '+' => 1
      case '-' => -1
      case _ if Character.isDigit(ch) => Character.digit(ch, 10) // 守卫
      case _ => 0
    }

//    val obj = _

//    obj match {
//      case x: Int => x
//      case s: String => Integer.parseInt(s)
//      case _: BigInt => Int.MaxValue
//      case _ => 0
//    }


    // 匹配数据，列表，元祖
    val array = new Array[Int](0)
    array match {
      case Array(0) => '0'
      case Array(x, y) => x + " " + y
      case Array(0, _*) => "0"
      case _ => "sth else"
    }


  }

}
