object Factorial {
  
  // no tail-recursive version
 def factorial(n: Int): Int = {
  	if (n == 0) 1 else n * factorial(n-1)
  }                                               //> factorial: (n: Int)Int
  
  // tail-recursive version
  def factorialTailRecursive(n: Int): Int = {
  	def loop(acc: Int, n: Int): Int =
  		if (n == 0) acc
  		else loop(acc * n, n-1)
  	loop(1, n)
  }                                               //> factorialTailRecursive: (n: Int)Int
  
  factorial(10)                                   //> res0: Int = 3628800
  factorialTailRecursive(10)                      //> res1: Int = 3628800
}