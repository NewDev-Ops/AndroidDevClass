fun main(){
  //Variables
  //camelCase = 'c'

  var userName: String = "Jeremy"
  println("Hello $userName!")

  //Interpreter reads line by line, from up to down
  userName= "Blessed"
  println("Hello $userName!")

  //Koltin is statically typed, it checks variables at compile time not runtime

  // val - value can't be changed after value is assigned to it. it's like static
  val name: String = "Jeremy"
  println("Hello $name!")

  // Koltin can auto detect value types, it infers the type by the first type that is assigned to it. Meaning the first type locks it
  var age: Int = 0
  var ages = 10

  println("$age years old")

  //Use shift+f10 to run code
}
