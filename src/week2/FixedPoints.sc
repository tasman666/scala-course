object FixedPoints {
  val tolerance = 0.0001                          //> tolerance  : Double = 1.0E-4
  
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double
  
  def isCloseEnough(x: Double, y: Double) = abs((x - y) / x) / x < tolerance
                                                  //> isCloseEnough: (x: Double, y: Double)Boolean
    
  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      println(next)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }                                               //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
  
  def sqrt(x: Double) = fixedPoint(y => (y + x / y) / 2)(1.0)
                                                  //> sqrt: (x: Double)Double
  
  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double
  
  def sqrt2(x: Double) = fixedPoint(averageDamp(y => x/y))(1.0)
                                                  //> sqrt2: (x: Double)Double
}