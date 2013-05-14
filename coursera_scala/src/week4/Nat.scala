package week4

// Peano numbers
abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor = new Succ(this)
  def + (that: Nat): Nat
  def - (that: Nat): Nat
}

object Zero extends Nat {
  def isZero = true  
  def predecessor =  throw new Error("0.predecessor")
  def + (that: Nat): Nat = that
  def - (that: Nat): Nat = 
    if (that.isZero) 
      this 
	else 
	  throw new Error ("0.- with Argument > 0")
}

class Succ(n: Nat) extends Nat {
  def isZero: Boolean = false
  def predecessor: Nat = n
  def + (that: Nat) = new Succ(n + that)
  def - (that: Nat): Nat = if (that.isZero) this else n - that.predecessor
}

