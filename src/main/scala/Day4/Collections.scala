package Day4

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object Collections extends App{

  val a = sequence.slice(0,2).last
  print(a)


  val sequence = Seq(1,2,5,8)

  def remove(col: Seq[Int] , idx:Int): Any ={
    var slice_upTillBefore_index = col.slice(0,idx-1).toBuffer
    var slice_afterIndex_toEnd = col.slice(idx+1,col.length).toBuffer
  }

  val removed_element = remove(sequence, 2)
  println(s"Removed element is $removed_element")

val myList = ListBuffer("Zara", "Nuha", "Ayan")
  var elements = List(1, 2, 3)



  println(myList.addOne("Welcome"))
  val new_elements = elements.apply(1)
  println(new_elements)







}
