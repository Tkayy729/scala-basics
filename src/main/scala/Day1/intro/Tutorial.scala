package Day1.intro

import java.text.DateFormat

object Tutorial {

  def main(args: Array[String]): Unit = {
    convertCelciusToFahrenheit(50.5)
    print("---------Scala tutorials-----------\n")
    //println(convertCelciusToFahrenheit(50.85))
    covertDateToNiceForm("02/125/19")

  }

  def convertCelciusToFahrenheit(c : Double): Double ={
    return (c * 9/5) .+ (32)
  }

  def covertDateToNiceForm (dateFormat1: String)  ={
   var dateArr = dateFormat1.split("/");
    var day = dateArr(0).toInt
    var month = dateArr(1).toInt
    var year = dateArr(2)

      day match {
      case 1 | 21 | 31 =>  print( day.+("st"))
      case 2 | 22  => print( day.+("nd"))
      case 4| 5| 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 |
           14| 15| 16| 17 | 18 |19 | 20| 22| 23 |24|
           25 |26 |27 |28 |29 | 30 => print(day.+("th"))
      case 1 | 23 | 3 => print( day.+("rd"))
      case _ => "check your inputs"
    }

    month match {
      case 1 => print(" January")
      case 2 => print(" February")
      case 3 => print(" March")
      case  4=> print(" April")
      case 5=> print(" May")
      case 6  => print(" June")
      case 7 => print(" July")
      case 8 => print(" August")
      case 9 => print(" September")
      case 10 => print(" October")
      case 11 => print(" November")
      case 12 => print(" December")
      case _ => "check your inputs"
    }

    year = "20".+(year)
    print(s" $year")



  }


}
