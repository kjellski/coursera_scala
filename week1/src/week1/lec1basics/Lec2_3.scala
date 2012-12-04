package week1.lec1basics

object Lec2_3 {
  
  
  def omg(op: (Int, Int) => Int, unit: Int, f: Int => Int)
  		 (a: Int, b:Int): Int =
  	if (a > b) unit
  	else op(f(a), omg(op, unit, f)(a + 1, b)) //> omg: (op: (Int, Int) => Int, unit: Int, f: Int => Int)(a: Int, b: Int)Int
  
  def product(a: Int, b: Int): Int =
  	omg((x, y) => x * y , 1, z => z)(a, b)    //> product: (a: Int, b: Int)Int
  
  product(3,4)                                    //> res0: Int = 12
  
  def factorial(n: Int): Int =
  	product(1, n)                             //> factorial: (n: Int)Int
  	
  factorial(5)                                    //> res1: Int = 120
  
  def sumg(a: Int, b: Int): Int =
  	omg((x, y) => x + y , 1, z => z)(a, b)    //> sumg: (a: Int, b: Int)Int
  
  
  sumg(0, 5)                                      //> res2: Int = 16
  
}