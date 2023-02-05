package Mtech_Package
import scala.io.StdIn._
object scala_Pattern {
  def main(args: Array[String]): Unit = {
    print("enter the first number\n")
    val a =readInt()
    print("enter the second number\n")
    val b =readInt()
    val value = readLine("enter the +,-,*,/")
    value match {

      case "+" =>  print(a+b)
      case "-" => print(a-b)
      case "*" =>println(a*b)
      case "/" =>println(a/b)
      case _ => println("No match")
    }
  }
}
