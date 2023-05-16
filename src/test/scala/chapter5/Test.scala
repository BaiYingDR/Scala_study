package chapter5

import com.dr.chapter5.Counter
import org.junit.Test

class TestChapter5 {


  @Test
  def test_01(): Unit = {
    val counter = new Counter

    counter.increment()
    println(counter.current())
    println(counter.current1)

    println(counter.value) //调用的是counter.value()
    counter.value = 20 //调用的是counter.value = (21)

    // 下面的这两个方法是由 @BeanProperrties 生成的
    // 如果不加此注解，就只会自动生成 value 和 value_ 方法
    println(counter.getValue)
    counter.setValue(21)

  }

  @Test
  def test_02 = {

  }
}
