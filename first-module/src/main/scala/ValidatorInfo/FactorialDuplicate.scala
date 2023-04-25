package ValidatorInfo

import org.slf4j.LoggerFactory
import scala.annotation.tailrec
import scala.util.Try

class FactorialDuplicate {
  private val logger = LoggerFactory.getLogger(getClass)

  def findFactorial(number: Int): Try[Double] = {
    if (number < 0) {
      logger.warn("Please Enter value >= 0")
      Try(throw new IllegalArgumentException("Input must be a non-negative integer."))
    } else {
      @tailrec
      def helpFactorial(number: Int, factorial: Double): Double = {
        if (number == 0) factorial
        else {
          helpFactorial(number - 1, factorial * number)
        }
      }

      val result = Try(helpFactorial(number, 1))
      logger.info(s"Factorial of $number is $result")
      result
    }
  }

  def isContainDuplicate[A](list: List[A]): Boolean = {
    def removeRedundant(list: List[A]): List[A] = list match {
      case Nil => List.empty[A]
      case head :: tail => head :: removeRedundant(tail.filter(_ != head))
    }

    val nonRedundantList = removeRedundant(list)
    val result = nonRedundantList.length != list.length

    logger.info(s"User list: $list")
    logger.info(s"NonRedundantList : $nonRedundantList")
    logger.info(s"Result: $result")

    result

  }

}
