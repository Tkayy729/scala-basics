package Day1

import scala.language.postfixOps

object Demo {

  def main(args: Array[String]) : Unit = {
    val person = new Person("Thomas", "Belem");

    val z = {val a= 5; a + 3}
     val b = 6;

    def upper (Strings: String* ) = Strings.map(_.toUpperCase())

    println("one","two")
    print(z);
    println("-" *100);


    val p = new Employee("Emmanuel", "Tweneboah", flag = true, 78);
    p.age_(45)
    println(p.fname)
    println(p.age)
    println(p.isOlder(52))
    println(p.`isOld : `(50))
    p.printName
    println(p returnName)

    printOddOrEven
    val name = "Martina"
    println(s"Hello $name")

    println("Hello world")
    println(myMax(4,5)+ "\n")
    sayHello
    println(**(10) + "\n")

   val month = 5;
    def season(m: Int) =
    m match {
     case 1 => println("Jan")
     case 2 => println("Feb")
     case 3 => println("Mar")
   }
    season(3)
  }

  // Type inference in scala is wonderful

  def myMax(x: Int, y : Int) : Int ={
    if(x>y) x else y
  }

  def sayHello =  print("say hello" + "\n")

  def **(a : Int) = (a * a);

  // [] and . are not allowed in naming your scala methods
  // Everything in scala is an object
  var j : Int = 1
  def printOddOrEven (): Unit = {
    while (j <= 5) {
      if (j % 2 == 0) {
        println(s" $j -> even")
      }
      else {
        println(s" $j -> odd")
      }
      j = j + 1
    }


  }
}
