1、将函数赋给变量时，需要在最后加上 '_'

2、可以对函数做的事，
    1、调用他
    2、传递他，存放在变量中，或者作为参数传递给另一个函数'

3、参数推断
由于 valueAtOneQuarter 已经明确了传入的函数参数类型
所以可以简单的写成 valueAtOneQuarter(x => 3 * x)
如果参数在 => 右侧只出现一次，就可以用_替换
形如：valueAtOneQuarter(3*_)

4、闭包
函数在变量不在处于作用域时被调用


6、柯里化
将原来接受两个参数的函数变成新的接受一个参数的函数的过程，新的函数返回一个以原有第二个参数作为参数的函数
```scala
def mul(x: Int, y: Int) = x * y

def mulOneAtATime(x: Int) = (y: Int) => x * y

//调用时
mulOneAtATime(6)(7)
```

柯里化的多参数只不过时个虚饰，并不是scala的一个特别重要的性质
其实际的用途主要是将某个函数参数单拎出来，提供更多用于类型推断的信息

7、控制抽象
```scala
def runInThread(block:() =>Unit): Unit ={
  new Thread{
    override def run(): Unit ={
      block()
    }
  }.start()
}
```

