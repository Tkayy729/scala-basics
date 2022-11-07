package Day1

object Demo {

  def main(args: Array[String]) : Unit = {
    val name = "Martina"
    println(s"Hello $name")

    println("Hello world")
    println(myMax(4,5)+ "\n")
    sayHello
    println(**(10) + "\n")
  }

  def myMax(x: Int, y : Int) : Int ={
    if(x>y) x else y
  }

  def sayHello =  print("say hello" + "\n")

  def **(a : Int) = (a * a);

  // [] and . are not allowed in naming your scala methods
}
