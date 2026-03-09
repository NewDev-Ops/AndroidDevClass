fun main() {
  //Crtl + K - Commit
  //Crtl + Shift + K - Push
  //Crtl + Alt + N - New Branch

  val x = 1
  val y = 2F

  val result = x + y

  println(result)

  val result2 = x % y // Gives the remainder of division
  println(result2)

  //Operator BODMAS
  var result3 = 3 + 4 / 5 * 3
  println("3+4/5*3 = $result3")

  result3 += 2
  println(result3)

  println(result3++)
  println(++result3)

  val isActive = false
  //Control flow statements
  if (isActive) {
    println("I'm active")
  } else {
    println("I'm inactive")
  }

  val mynum = 12
  if (mynum >= 4){
    println("It is")
  }else{
    println("No")
  }


}



