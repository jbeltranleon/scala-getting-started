package example

object HighOrderFunctions {
  //High order functions - Pass functions as arguments and return functions as results

  //function_name(param: Type, param: Type): ReturnType = Process
  def sumIntsInRange(a: Int, b: Int): Int =
    if (a>b) 0 else a + sumIntsInRange(a+1, b)

  def cube(x: Int): Int = x*x*x

  def sumCubesInRange(a: Int, b: Int): Int =
    if (a>b) 0 else cube(a) + sumCubesInRange(a+1, b)


  def main(args: Array[String]): Unit = {
    val a = 2
    val b = 4
    val sumResult = sumIntsInRange(a, b)
    println(s"The result of the sum is: $sumResult")

    val sumCubesResult = sumCubesInRange(a, b)
    println(s"The result of the sum cubes is: $sumCubesResult")

  }


}
