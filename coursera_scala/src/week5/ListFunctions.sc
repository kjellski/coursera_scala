package week5

object ListFunctions {
  val list1 = List(0, 1, 2)                       //> list1  : List[Int] = List(0, 1, 2)
  val list2 = List(3, 4, 5)                       //> list2  : List[Int] = List(3, 4, 5)

  list1.length                                    //> res0: Int = 3
  list1.last                                      //> res1: Int = 2
  list1.init                                      //> res2: List[Int] = List(0, 1)
  list1.take(2)                                   //> res3: List[Int] = List(0, 1)
  list1.drop(2)                                   //> res4: List[Int] = List(2)
  list1(2)                                        //> res5: Int = 2

  "Sowieso".indexOf("i")                          //> res6: Int = 3

  def last[T](xs: List[T]): T = xs match {
    case List() => throw new Error("last of empty list1")
    case List(x) => x
    case y :: ys => last(ys)
  }                                               //> last: [T](xs: List[T])T

  def init[T](xs: List[T]): List[T] = xs match {
    case List() => throw new Error("last of empty list1")
    case List(x) => List()
    case y :: ys => y :: init(ys)
  }                                               //> init: [T](xs: List[T])List[T]


  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case List() => ys
    case z :: zs => z :: concat(zs, ys)
  }                                               //> concat: [T](xs: List[T], ys: List[T])List[T]
  
  def reverse[T](xs: List[T]): List[T] = xs match {
    case List() => xs
    case y :: ys => reverse(ys) ++ List(y)
  } // O(n^2) ==> :(                              //> reverse: [T](xs: List[T])List[T]

  last(list1)                                     //> res7: Int = 2
  init(list1)                                     //> res8: List[Int] = List(0, 1)

  val list12 = concat(list1, list2)               //> list12  : List[Int] = List(0, 1, 2, 3, 4, 5)
  reverse(list12)                                 //> res9: List[Int] = List(5, 4, 3, 2, 1, 0)
  
  def removeAt[T](n: Int, xs: List[T]): List[T] = xs.take(n) ::: xs.drop(n + 1)
                                                  //> removeAt: [T](n: Int, xs: List[T])List[T]
  removeAt(5, list12)                             //> res10: List[Int] = List(0, 1, 2, 3, 4)
  removeAt(1, List("Hello ", "fucking ", " World!"))
                                                  //> res11: List[String] = List("Hello ", " World!")
}