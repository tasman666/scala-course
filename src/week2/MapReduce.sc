object MapReduce {
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, factor: Int)(a: Int, b: Int): Int = {
       if (a > b) factor
     		else combine(f(a), mapReduce(f, combine, factor) (a + 1, b))
  }                                               //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, factor: Int)(a: Int, 
                                                  //| b: Int)Int
  
  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x * y, 1) (a, b)
                                                  //> product: (f: Int => Int)(a: Int, b: Int)Int
  product(x => x * x) (2, 4)                      //> res0: Int = 576
}