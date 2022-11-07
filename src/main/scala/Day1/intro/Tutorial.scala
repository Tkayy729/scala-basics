package Day1.intro

import java.text.DateFormat

object Tutorial {

  def main(args: Array[String]): Unit = {
    print("---------Scala tutorials-----------\n")
    println(convertCelciusToFahrenheit(50.85))

  }

  def convertCelciusToFahrenheit(c : Double): Double ={
    return (c * 9/5) .+ (32)
  }

//  def covertDateToNiceForm (dateFormat1: String) : String = {
//    DateFormat getDateInstance();
//    0
//
//  }

}
