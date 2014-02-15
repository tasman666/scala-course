import week4._

object nth {
  def nth[T](n: Int, list: List[T]): T = {
    if (list.isEmpty) throw new IndexOutOfBoundsException()
    else if (n == 0) list.head
    else nth(n - 1, list.tail)
  }                                               //> nth: [T](n: Int, list: week4.List[T])T
  def list = new Cons(5, new Cons(4, new Nil))    //> list: => week4.Cons[Int]
  nth(1, list)                                    //> res0: Int = 4
  nth(-2, list)                                   //> java.lang.IndexOutOfBoundsException
                                                  //| 	at nth$$anonfun$main$1.nth$1(nth.scala:5)
                                                  //| 	at nth$$anonfun$main$1.apply$mcV$sp(nth.scala:11)
                                                  //| 	at scala.runtime.WorksheetSupport$$anonfun$$execute$1.apply$mcV$sp(Works
                                                  //| heetSupport.scala:75)
                                                  //| 	at scala.runtime.WorksheetSupport$.redirected(WorksheetSupport.scala:64)
                                                  //| 
                                                  //| 	at scala.runtime.WorksheetSupport$.$execute(WorksheetSupport.scala:74)
                                                  //| 	at nth$.main(nth.scala:3)
                                                  //| 	at nth.main(nth.scala)
}