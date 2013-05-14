import week4.types._

object worksheet {

  def singleton[T](elem: T) =
    new Cons[T](elem, new Nil[T])                 //> singleton: [T](elem: T)week4.types.Cons[T]

  def nth[T](n: Int, l: List[T]): T =
    if (l.isEmpty) throw new IndexOutOfBoundsException()
    else if (n == 0) l.head
    else nth[T](n - 1, l.tail)                    //> nth: [T](n: Int, l: week4.types.List[T])T

  var list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : week4.types.Cons[Int] = week4.types.Cons@2f0f9471

  nth(0, list)                                    //> res0: Int = 1
  
    
}