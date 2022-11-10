//
//val ingredients = ("sugar", 5)
//println(ingredients._1)
//
//val (name, quantity) = ingredients
//
//println(name)     // Sugar
//println(quantity)
//
//val planets = List(("Mercury", 57.9),("venus",108.2))
//  planets.foreach{
//    case("Mercury", distance) =>
//      println(s"Our planet is $distance mill ki from the sun")
//    case _=>
//  }
//
//
//var list:List[Int] = List(1,2,3,4,5,6)
//list.reverse // immutable
//list
//
//list.sliding(2).foreach(println)
////list is a bad for reversing
////due listBuffer Instead
//// vectors have o(1) performance
//// list have o(n) performance
//
//class Stack[A]{
//  private var elements: List[A] = Nil
//  def push(x:A) = elements = x:: elements
//  def peek: A = elements.head
//
//  def pop(): A = {
//    val currentTop = peek
//    elements = elements.tail
//    currentTop
//  }
//}
//
////val stack = new Stack[Int];
////stack.push(1)
////stack.push(2)
////println(stack.toString)
//
//class Fruit
//class Apple extends Fruit
//class Banana extends Fruit
//
//val stack = new Stack[Fruit]
//val stack1 = new Stack[Apple]
//
//val apple = new Apple
//val banana = new Banana
//
//stack1.push(apple)
//
//stack.push(apple)
//stack.push(banana)
//
//
//val fruits = List("mango","orange")
//val paper = List("a1","a4")
//
//print(fruits:+paper)

val files = (new java.io.File(".")).listFiles
for (file <- files ) println(file.getName])
//val file_names_excluding_hidden = file_names
//  .filter(fileName => fileName.getName.startsWith("."))
//  .map(fileName => fileName.getPath.toList)
