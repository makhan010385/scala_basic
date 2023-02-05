package Mtech_Package

object if_else {
  def main(args: Array[String]): Unit = {
    // taking a variable
    var a: Int = 650

    if (a > 698)
    {

      // This statement will not
      // execute as a > 698 is false
      println("A is grater")
    }

    else {

      // This statement will execute
      println("A is not Grater")
    }
  }
}
