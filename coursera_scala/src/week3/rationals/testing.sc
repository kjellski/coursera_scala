object testing {
  new Rational(1,2)                               //> res0: Rational = Rational@2a606e6
  
}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y
}