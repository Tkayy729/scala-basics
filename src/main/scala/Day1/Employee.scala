package Day1;

class Employee(val fname: String, val lname:String, flag: Boolean, var a: Int) {

  val name = fname + lname

  def age = a;

  def age_(newAge: Int) = if(newAge >0 && newAge < 50) a = newAge
// look into default parameters

  def isOlder(otherAge : Integer): Boolean = a > otherAge
  def +(newAge: Int) = a+ newAge //infix notation: methods that takes one parameter
  def `isOld : ` (otherAge : Int)  = a < otherAge

  // any method that has no parameters can be written in the postfix notation

  def printName = println(fname)

  def returnName: String = name


}