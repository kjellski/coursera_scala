import week4._

object worksheet {
  val x: List[String] = Nil                       //> x  : week4.List[String] = week4.Nil$@23239010
  
  def f(xs: List[NonEmpty], x: Empty) = xs prepend x
                                                  //> f: (xs: week4.List[week4.NonEmpty], x: week4.Empty)week4.List[week4.IntSet]
                                                  //| 

}