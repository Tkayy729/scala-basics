package Day3

object Lab1{
  def main(args: Array[String]): Unit = {
   print(performOperation("add",2,5))
  }
// re-write the performOperation to take a string and a function
// match the string to correspond to specific functions
  def performOperation(operation: String, x: Int , y:Int): Int ={
    if (operation == "add") add(x,y)
    else if (operation == "subtract") subtract(x, y)
    else power(x,y)
  }

  val add = new ((Int, Int) => Int) {
    override def apply(x: Int, y: Int): Int = x+y
  }
  val subtract = new ((Int, Int) => Int) {
    override def apply(x: Int, y: Int): Int = x - y
  }
  val power = new ((Int, Int) => Int) {
    override def apply(x: Int, y: Int): Int = Math.pow(x,y).toInt
  }


}
