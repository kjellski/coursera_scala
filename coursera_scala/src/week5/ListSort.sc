package week5

object ListSort {
  val fruit = List("apples", "oranges", "pears")  //> fruit  : List[String] = List(apples, oranges, pears)
  val diag3 = List(List(1,0,0), List(0,1,0), List(0,0,1))
                                                  //> diag3  : List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
                                                  //| 
  val test = Nil.::(12).::(1).::(-1).::(42).::(13)//> test  : List[Int] = List(13, 42, -1, 1, 12)
 
  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys =>
      if (y < x) y :: insert(x, ys)
      else x :: y :: ys
  }                                               //> insert: (x: Int, xs: List[Int])List[Int]
 
  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, isort(ys))
  }                                               //> isort: (xs: List[Int])List[Int]
  
  isort(test)                                     //> res0: List[Int] = List(-1, 1, 12, 13, 42)
  
  def mergesort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    
    if (n == 0) xs
    else {
//      def merge(xs: List[Int], ys: List[Int]): List[Int] = xs match {
//        case Nil => ys
//        case x :: xs1 =>
//          ys match {
//            case Nil => xs
//            case y :: ys1 =>
//              if (x < y) x :: merge(xs1, ys)
//              else y :: merge(xs, ys1)
//          }
      def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (x < y) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }
      val (fst, snd) = xs.splitAt(n)
      merge(mergesort(fst), mergesort(snd))
    }
  }                                               //> mergesort: (xs: List[Int])List[Int]
  
  mergesort(TestLists.list2 ++ TestLists.list1)   //> res1: List[Int] = List(0, 1, 2, 3, 4, 5)
}