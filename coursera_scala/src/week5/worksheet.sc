package week5

object worksheet {
  val fruit = List("apples", "oranges", "pears")  //> fruit  : List[String] = List(apples, oranges, pears)
  val diag3 = List(List(1,0,0), List(0,1,0), List(0,0,1))
                                                  //> diag3  : List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
                                                  //| 
  val test = Nil.::(4).::(3).::(2).::(1).::(0)    //> test  : List[Int] = List(0, 1, 2, 3, 4)
  
  test.head                                       //> res0: Int = 0
  test.tail                                       //> res1: List[Int] = List(1, 2, 3, 4)
  
  
}