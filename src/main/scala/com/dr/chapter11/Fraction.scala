package com.dr.chapter11

class Fraction(x: Int, y: Int) {

  private var den: Int = 0
  private var num: Int = 0


}

object Fraction {
  def apply(x: Int, y: Int) = new Fraction(x, y)

  def unapply(input: Fraction) = {
    if (input.den == 0) None
    else Some((input.num, input.den))
  }
}
