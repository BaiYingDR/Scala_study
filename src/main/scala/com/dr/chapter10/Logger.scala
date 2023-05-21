package com.dr.chapter10

/**
 * trait 中未被实现的方法默认就是抽象的
 */
trait Logger {

  def log(msg: String)

}

/**
 * Logger with Cloneable with Serializable 这里是一个整体，然后再由类来扩展
 */
class ConsoleLogger extends Logger with Cloneable with Serializable {

  // trait 的方法重写加不加override都可以
  override def log(msg: String): Unit = println(msg)
}
