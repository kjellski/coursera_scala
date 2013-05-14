package week4

import week3.Empty
import week3.NonEmpty

trait List[+T] {
  def isEmpty: Boolean
  
  def prepend[U >: T](elem: U): List[U] = new Cons(elem, this)
  
  def head: T
  def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false  
}

object Nil extends List[Nothing] {
  def isEmpty: Boolean = true
  
  def head: Nothing = throw new NoSuchElementException("Nil.head");
  def tail: Nothing = throw new NoSuchElementException("Nil.tail");
}

object test{
  
  val x: List[String] = Nil
  
  def f(xs: List[NonEmpty], x: Empty) = xs prepend x

  def nth[T](n: Int, l: List[T]): T =
    if (l.isEmpty) throw new IndexOutOfBoundsException()
    else if (n == 0) l.head
    else nth[T](n - 1, l.tail)

  //nth(0, list)

}