package Day4

object Functional_Collections extends App{
  val files = (new java.io.File(".")).listFiles
 files.map(file => println(file))
  println("_" *100)

  val file_names_excluding_hidden = files
    .foreach(file => {
      if (file.toString().charAt(2) != '.')  {
        println(file.toString().drop(2))
      }
    })

  println("_" *100)

  val _move =


//  file_names_excluding_hidden.map(file => println(file))



}
