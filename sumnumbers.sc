object SumCalculator {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5)
    val sum = calculateSum(numbers)
    println(s"The sum of numbers is: $sum")
  }

  def calculateSum(numbers: List[Int]): Int = {
    numbers.sum
  }
}
