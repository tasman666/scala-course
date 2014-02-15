package week1

object Exercises {
	def and(x: Boolean,y: Boolean) = if (x) y else false
                                                  //> and: (x: Boolean, y: Boolean)Boolean
	def or(x: Boolean,y: Boolean) = if (x) true else y
                                                  //> or: (x: Boolean, y: Boolean)Boolean
                                                  
	and(true, true)                           //> res0: Boolean = true
	and(true, false)                          //> res1: Boolean = false
	and(false, true)                          //> res2: Boolean = false
	and(false, false)                         //> res3: Boolean = false
	or(true, true)                            //> res4: Boolean = true
	or(true, false)                           //> res5: Boolean = true
	or(false, true)                           //> res6: Boolean = true
	or(false, false)                          //> res7: Boolean = false
	
	
}