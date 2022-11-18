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
  val removePAth = files
    .map(file => file.toString().drop(2))

    val _files = removePAth
    .map(file => if (file.toString().contains(".")) println(file))

  println("=" *100)

  val _folders = removePAth
    .map(file => if (! file.toString().contains(".")) println(file))

  println("::" *100)
  val pair = files
    .map(file => Map((file.getName,file.length())))
    .map(pair => println(pair))

  println("::" *100)

//  val `4LargestFiles` = files.map()



}
