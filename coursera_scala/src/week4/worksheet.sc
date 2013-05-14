import week4._
import week3._

object worksheet {
  val list: List[Int] = new Cons(1, new Cons(2, new Cons(3, new Nil)))
  
  val x: List[String] = Nil
  
  def f(xs: List[NonEmpty], x: Empty) = xs prepend x

  def nth[T](n: Int, l: List[T]): T =
    if (l.isEmpty) throw new IndexOutOfBoundsException()
    else if (n == 0) l.head
    else nth[T](n - 1, l.tail)

  nth(0, list)
}