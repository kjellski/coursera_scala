package week4

object nth {
  def nth[T](n: Int, l: List[T]): T =
    if (l.isEmpty) throw new IndexOutOfBoundsException()
    else if (n == 0) l.head
    else nth[T](n - 1, l.tail)                    //> nth: [T](n: Int, l: week4.List[T])T

  var list = new Cons(1, new Cons(2, new Cons(3, Nil)))
                                                  //> list  : week4.Cons[Int] = week4.Cons@1df07586
  nth(0, list)                                    //> res0: Int = 1
}