package Day3

object Intro {
  def main (args: Array[String]): Unit ={
    println(sumUntil(5))
    println(add3(6))
    println(nTimes(3,3,cal))
  }
  def sumUntil(n: Int): Int = {
    if (n <= 0) 0
    else n + sumUntil(n - 1)
  }
  val add1 = new ((Int,Int) => Int) {
    override def apply(v1: Int, x:Int): Int = v1 +1+x
  }

  val add2:Int => Int = (x:Int) => x+1;

  val add3=  (x:Int) => x+1;

  val add4:Int => Int = _+1;

  def nTimes(n: Int, x:Int, f:Int=>Int): Int ={
    if (n<=0) x
    else nTimes(n-1, f(x) , f)
  }

  def cal(x:Int) : Int={
    println("cool stuff")
    x+1
  }

}
