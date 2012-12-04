object testing {
  val x = new Rational(1,3)                       //> x  : Rational = 1/3
  val y = new Rational(5,7)                       //> y  : Rational = 5/7
  val z = new Rational(3,2)                       //> z  : Rational = 3/2
  
  x.add(y)                                        //> res0: Rational = 22/21
  x.neg                                           //> res1: Rational = -1/3
  
  x.sub(y).sub(z)                                 //> res2: Rational = -79/42
}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y
  
  def add(other: Rational) =
    new Rational(
      numer * other.denom + denom * other.numer,
      denom * other.denom
    )
 
  def neg = new Rational(-numer, denom)
    
  def sub(other: Rational) = add(other.neg)
     
  override
  def toString = numer + "/" + denom
}