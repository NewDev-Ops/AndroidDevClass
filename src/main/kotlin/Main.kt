fun main(){
  val name: String = "Michelle"
  val age: Int = 18

  //Reason for the grayed out string is that it is a redundant type.

  println("Hello, $name. I hear you're age is $age")
  println("Are you sure you're supposed to be here.")

  var max = Integer.MAX_VALUE //Maximum value that can be stored in an int
  var min = Integer.MIN_VALUE //Minmum value that can be stored in an int

  println(max)
  println(min)


  //Byte
  val byteMaxValue: Byte = Byte.MAX_VALUE
  val byteMinValue: Byte = Byte.MIN_VALUE

  println("Byte Values")
  println(byteMaxValue)
  println(byteMinValue)


  //Short
  val shortMaxValue: Short = Short.MAX_VALUE
  val shortMinValue: Short = Short.MIN_VALUE

  println("Short Values")
  println(shortMaxValue)
  println(shortMinValue)

  //Whole Numbers
  val longMaxValue: Long = Long.MAX_VALUE
  val longMinValue: Long = Long.MIN_VALUE

  println("Long Values")
  println(longMaxValue)
  println(longMinValue)

  //If no type is specified kotlin will assign it into any category that fits it, Int, Long, Short. But default type is int
  val myNumber = 2800000000

  //Ways of declaring long types
  val myNumber3 = 28000000000
  val myNumber2 = 12L




}
