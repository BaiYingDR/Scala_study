package com.dr.chapter11

case class Currency(value: Double, unit: String)

object CaseClassTest {

  def main(args: Array[String]): Unit = {

    val currency: Currency = Currency(10, "1")

  }

}
