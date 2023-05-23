1、所有集合都扩展自Iterable特质

2、scala优先采用不可变集合，scala.collection下的伴生对象都是

3、如果你想要把列表中的某个节点变成列表中的最后一个节点，你不能将 next引用设为Nil，而应该将它设为LinkedList. empty。也不要将它设成null，不 然你在遍历该链表时会遇到空指针错误