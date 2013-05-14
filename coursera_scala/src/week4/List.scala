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
