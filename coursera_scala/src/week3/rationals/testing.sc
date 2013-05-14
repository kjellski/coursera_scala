import week3.rationals.Rational

object testing {
  val x = new Rational(1,3)                       //> x  : week3.rationals.Rational = 1/3
  val y = new Rational(5,7)                       //> y  : week3.rationals.Rational = 5/7
  val z = new Rational(3,2)                       //> z  : week3.rationals.Rational = 3/2
  
  x + y                                           //> res0: week3.rationals.Rational = 22/21
  -x                                              //> res1: week3.rationals.Rational = 1/-3
  
  x - y - z                                       //> res2: week3.rationals.Rational = -79/42
  
  x < y                                           //> res3: Boolean = true
  
  y.max(x)                                        //> res4: week3.rationals.Rational = 5/7
}