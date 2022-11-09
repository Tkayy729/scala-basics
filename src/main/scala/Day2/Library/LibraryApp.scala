package Day2.Library

object LibraryApp {
  def main(args: Array[String]): Unit = {
    val emmanuel = new Regular("Emmanuel", "Tweneboah")
    val samuel = new Junior("Samuel", "Ggyamfi")
    val mensah = new Senior("Mensah", "junior")


    var members = List(
      emmanuel, samuel, mensah
    )

    for (i <- members) {
      i match {
        case i: Regular => println(s"${i.firstName} can borrow ${i.maxNumofItemstoBorrow} books")
        case i: Senior => println(s"${i.firstName} can borrow ${i.maxNumofItemstoBorrow} books")
        case i: Junior => println(s"${i.firstName} can borrow ${i.maxNumofItemstoBorrow} books")
      }
    }
  }


}
