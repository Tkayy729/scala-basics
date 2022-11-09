package Day3

import scala.annotation.tailrec



class Recursive {

   def  sumBetweenTwoNumbers(x:Int, y:Int):Int ={
    if(y == x+1) 0
    else y -1 + sumBetweenTwoNumbers(x, y-1)
   }


   def sumBetweenTwoNumbersTail(x:Int, y:Int): Int = {
      if(y<x || y== x) 0
      @tailrec
      def sumBetweenTwoNumbersTail(x:Int, y:Int,acc:Int): Int ={
         if (y == x+1) acc
         else sumBetweenTwoNumbersTail(x,y-1,acc+(y-1))
      }
      sumBetweenTwoNumbersTail(x,y,0)
   }

   //  concatenate a given string for n number of times

   def concateNtimes (string: String, n:Int): String = {
      @tailrec
      def concateNtimes(string: String, n: Int, acc :String): String ={
         if(n <= 1) acc
         else concateNtimes(string,n-1,acc+string)
      }
      concateNtimes(string,n,string)

   }

   def fib(n: BigInt): BigInt = {
      @tailrec
      def fibAcc(n: BigInt, prev:BigInt, curr:BigInt):BigInt={
         if(n<=2) curr
         else fibAcc(n-1, curr , prev + curr)
      }
      fibAcc(n,prev = 1,curr = 1)
   }

   //  length of a string

   def lengthOfString(str: String) : Int ={
      if(str.isEmpty) 0
      else 1 + lengthOfString(str.dropRight(1))
   }

}

// word
// 1 +  lengthOfString(str.dropRight(1))


