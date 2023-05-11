package com.dr.chapter5

import scala.collection.mutable.ArrayBuffer

class Network {

  // 这种写法表示每一个对象都会有一个自己的Member对象
  class Member(var name: String) {
    val contact = new ArrayBuffer[Member]
  }

  private val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }

}


object Network {

  //表示每个Network对象都只有一个Member
//  class Member(var name: String) {

//  }

}
