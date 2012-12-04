package week1.lec1basics

class Lec1 {
  def sqrt(x: Double) = {
    def abs(x: Double) = if (x < 0) -x else x

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs((guess * guess) - x) / x < 0.001

    def improve(guess: Double) = {
      val res = (guess + x / guess) / 2
      res
    }

    sqrtIter(1.0)
  } //> sqrt: (x: Double)Double

  val t = List(0.001, 0.1e-20, 1.0e20, 1.0e50) //> t  : List[Double] = List(0.001, 1.0E-21, 1.0E20, 1.0E50)

  t.foreach(f => {
    val result = sqrt(f)
    println("Result: " + result)
  })
}