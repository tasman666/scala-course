object Sum {

  // none tail-recursive version
  def sum(f: Int => Int, a: Int, b: Int): Int = {
     if (a > b) 0
     else f(a) + sum(f, a + 1, b)
  }                                               //> sum: (f: Int => Int, a: Int, b: Int)Int
  
  // tail-recursive version
  def sumTailRecursive(f: Int => Int, a: Int, b: Int): Int	 = {
        def loop(a: Int, acc: Int): Int = {
          if (a > b) acc
          else loop(a + 1, acc + f(a))
        }
        loop(a, 0)
  }                                               //> sumTailRecursive: (f: Int => Int, a: Int, b: Int)Int
  
  sum(x => x * x, 3, 5)                           //> res0: Int = 50
  sumTailRecursive(x => x * x, 3, 5)              //> res1: Int = 50
}