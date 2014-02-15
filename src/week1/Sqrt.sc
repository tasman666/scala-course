object Sqrt {
  def abs(x: Double) = if (x > 0) x else -x       //> abs: (x: Double)Double
  
	def sqrt(x: Double) =  {
	  def sqrtIter(guess: Double): Double =
	    if (isGoodEnough(guess)) guess
	    else sqrtIter(improve(guess))
	
	  def improve(guess: Double) =
	    (guess + x / guess) / 2
	  def isGoodEnough(guess: Double) =
	    abs(guess * guess - x) / x <  0.001
    
    sqrtIter(1.0)

	}                                         //> sqrt: (x: Double)Double
	sqrt(2)                                   //> res0: Double = 1.4142156862745097
	sqrt(4)                                   //> res1: Double = 2.000609756097561
	sqrt(1e-6)                                //> res2: Double = 0.0010000001533016628
	sqrt(1e6)                                 //> res3: Double = 1000.0001533016629
	sqrt(0.001)                               //> res4: Double = 0.03162278245070105
	sqrt(0.1E-20)                             //> res5: Double = 3.1633394544890125E-11
	sqrt(1.0E20)                              //> res6: Double = 1.0000021484861237E10
	sqrt(1.0E60)                              //> res7: Double = 1.0000788456669446E30
}