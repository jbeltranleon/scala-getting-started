package example

object HighOrderFunctions {
  //High order functions - Pass functions as arguments and return functions as results

  //function_name(param: Type, param: Type): ReturnType = Process
  def sumIntsInRange(a: Int, b: Int): Int =
    if (a>b) 0 else a + sumIntsInRange(a+1, b)

  def cube(x: Int): Int = x*x*x

  def sumCubesInRange(a: Int, b: Int): Int =
    if (a>b) 0 else cube(a) + sumCubesInRange(a+1, b)


  // Generating High Order functions
  // Lets define the sum generic function this function will recive a function as a parameter!
  // functionName: ParamType => ReturnType
  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a>b) 0 else f(a) + sum(f, a+1, b)

  def fact(x: Int): Int = if (x==0) 1 else fact(x-1)

  // The return type could be inferred by the compiler
  def sumFactorialsInRange(a: Int, b: Int) = sum(fact, a, b)

  // We will use an anonymous function
  def sumSquaresInRange(a: Int, b: Int) = sum((x: Int) => x*x, a, b)

  def main(args: Array[String]): Unit = {
    val a = 2
    val b = 4
    val sumResult = sumIntsInRange(a, b)
    println(s"The result of the sum is: $sumResult")

    val sumCubesResult = sumCubesInRange(a, b)
    println(s"The result of the sum cubes is: $sumCubesResult")

    val sumFactorialsResult = sumFactorialsInRange(a, b)
    println(s"The result of the sum factorials is: $sumFactorialsResult")

    val sumSquaresResult = sumSquaresInRange(a, b)
    println(s"The result of the sum squares is: $sumSquaresResult")

  }

}
