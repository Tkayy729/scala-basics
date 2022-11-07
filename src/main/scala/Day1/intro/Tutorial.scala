package Day1.intro

import java.text.DateFormat

object Tutorial {

  def main(args: Array[String]): Unit = {
    print("---------Scala tutorials-----------\n")
    //println(convertCelciusToFahrenheit(50.85))
    covertDateToNiceForm("1/5/556")

  }

  def convertCelciusToFahrenheit(c : Double): Double ={
    return (c * 9/5) .+ (32)
  }

  def covertDateToNiceForm (dateFormat1: String)  {
   var dateArr = dateFormat1.split("/");
    var day = dateArr(0).toInt
    var month = dateArr(1).toInt
    var year = dateArr(2).toInt

    day match {
      case 1 | 21 | 31 => println( day.+("st"))
    }
  }


}
