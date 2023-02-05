package Mtech_Package
import scala.io.StdIn._
object input extends  App{


    println("Enter first number ")
    val a = readInt()
    println("Enter second number ")
    val b = readInt()
  println("Enter  Third number ")
  val c = readInt()
  println("Enter fourth number ")
  val d = readInt()
    if(a>b && a>c && a>d) {
      print("a is grater")
    }
    else if (b>c && b>d)
        {
          print("b is grater")

        }
    else if(c>d)
      {
        print("c is grater")
      }
      else {
      print("d is grater")

    }
    }
