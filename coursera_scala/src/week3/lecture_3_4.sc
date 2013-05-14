package week3

import week3._

object lecture_3_4 {
  val testSet = new NonEmpty(5, new NonEmpty(3, new Empty, new Empty), new Empty)
  testSet.incl(4)
  testSet.incl(54)
  testSet.incl(1)
  testSet.incl(24)
  testSet.incl(123)

}