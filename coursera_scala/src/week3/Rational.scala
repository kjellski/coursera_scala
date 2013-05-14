package week3

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be nonzero")

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  
  val numer = x / g
  val denom = y / g
  
  def < (other: Rational) = numer * other.denom < other.numer * denom
  
  def max(other: Rational) = if(this < other) other else this
  
  def unary_- : Rational = new Rational(-numer, denom)
  
  def + (other: Rational) =
    new Rational(
      this.numer * other.denom + this.denom * other.numer,
      this.denom * other.denom
    )
    
  def - (other: Rational) = this + -other
     
  override
  def toString = numer + "/" + denom
}