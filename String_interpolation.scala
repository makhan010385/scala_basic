package demo

object String_interpolation
{
  def main(args: Array[String]): Unit =
  {
    val name ="amit"
     val age =23
//    print(name+" is  "+age+" year old\n")
    //print(s"$name is $age year old\n")
      //print(s"Hello \n world\n ")
      print(raw"Hello \n world ")
  }
}
