package Day1

 class Trade(private val id: String,private val symbol: String,private val quantity: Int , private val price: Double ){
   override def toString: String = s"ID-$id, Symbol-$symbol, Quantity-$quantity, Price-$price"

  val _price = price

//   def price_=(value: Double): Double = { if (value >= 0) price = value }
 }


