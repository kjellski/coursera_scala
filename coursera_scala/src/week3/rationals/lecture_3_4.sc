object lecture_3_4 {
  val testSet = new NonEmpty(5, new NonEmpty(3, new Empty, new Empty), new Empty)
                                                  //> testSet  : NonEmpty = {{.3.}5.}
  testSet.incl(4)                                 //> res0: IntSet = {{.3{.4.}}5.}
  testSet.incl(54)                                //> res1: IntSet = {{.3.}5{.54.}}
  testSet.incl(1)                                 //> res2: IntSet = {{{.1.}3.}5.}
  testSet.incl(24)                                //> res3: IntSet = {{.3.}5{.24.}}
  testSet.incl(123)                               //> res4: IntSet = {{.3.}5{.123.}}
  
}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
}
  
class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < elem) left.contains(x)
    else if (x > elem) right.contains(x)
    else true
    
  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left.incl(x), right)
    else if (x > elem) new NonEmpty(elem, left, right.incl(x))
    else this
    
  override
  def toString = "{" + left + elem + right + "}"
}
  
class Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
  
  override
  def toString = "."
}