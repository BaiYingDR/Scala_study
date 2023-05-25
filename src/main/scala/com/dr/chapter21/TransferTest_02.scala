package com.dr.chapter21

import com.dr.chapter11.Fraction


object TransferTest_01 {

  def main(args: Array[String]): Unit = {

    implicit def int2Fraction(n: Int) = Fraction(n, 1)

    val result: Any = 3 * Fraction(4, 5)
  }

}
