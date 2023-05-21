package com.dr.chapter10

trait ConsoleLogger {

  def log(msg: String): Unit = {
    println(msg)
  }

}

trait Account {

  var balance: BigDecimal

  def withdraw(amount: Double)
}

class SavingAccount extends Account with ConsoleLogger {

  override def withdraw(amount: Double): Unit = {
    if (amount > balance) {
      log("insufficient funds")
    } else balance -= amount
  }

  override var balance: BigDecimal = _
}
