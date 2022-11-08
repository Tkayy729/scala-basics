package Day2

class ScalaWorkSheet {


}

object main {
  def main(args: Array[String]): Unit = {

    var tuple = (3,(2,3))

    val matchTuple = tuple match{
      case(x,(2,y)) =>println( s"$x and 2  $y")
      case(y,(x,3)) =>println( s"$x and 2  $y")


    }
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val list1 =  List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val listMach1 = list1 match {
      case head::tail => print(s"Head is $head and tail is $tail\n")
    }

    val listMach = list match {
      case List(1, 2, 3, 4, 5, 6, 7, 8, 9, b) => println(s"$b")
    }
  }
}

