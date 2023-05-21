1、scala中所有的操作符都应当是左结合的 只有冒号（:）结尾的操作和赋值操作符是右结合

```scala
1 :: 2 :: Nil
//等同于
1 :: (2 :: Nil)
// Nil. :: 2. :: 1
```

2、apply和update方法

```scala
f(args1, args2)
//如果f不是函数或者方法，那么这个表达式就等同于调用好
f.apply(args1, args2)
```

常用在伴生对象中，用来构造对象而不用显式的使用new

```scala
f(argl, arg2) = value
// 等同于
f.update(args1, args2, value)
```

常见于数组和映射

3、提取器：带有一个unapply对象的方法

```scala
val author = "Cay Horstmann"
val Name(first, last) = author //等同于调用Name.unapply(author)
```

4、每个`case class`都自动具备apply和unapply方法

5、带单个参数活无参数的提取器

在scala中，不存在只带一个组件的元祖，如果unapply方法要提取单值，则应该返回一个目标类型的option

```scala
object Number {
  def unApply(input: String): Option[Int] = {
    try {
      Some(Integer.parseInt(input.trim))
    } catch {
      case ex: NumberFormatException => None
    }
  }
}

val Number(n) = "1729"

```

6、unapplySeq方法 要提取任意长度值的序列，应该用unapplySeq命名方法

会返回一个Option[Seq[A]]，其中A是被提取的值的类型

```scala
object Name {
  def unapplySeq(input: String): Option[Seq[String]] = {
    if (input.trim == "") 
      None 
    else 
      Some(input.trim.split("\\s+"))
      
  }
}
```