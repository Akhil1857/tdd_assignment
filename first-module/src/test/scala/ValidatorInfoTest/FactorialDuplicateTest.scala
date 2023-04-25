package ValidatorInfoTest

import ValidatorInfo.FactorialDuplicate
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class FactorialDuplicateTest extends AnyFlatSpec with Matchers{

  val factorialDuplicate = new FactorialDuplicate
  "isContainDuplicate" should "return true if list contains duplicate" in {
    val userList = List(1, 2, 3, 4, 5, 1)
    val result = factorialDuplicate.isContainDuplicate(userList)
    result shouldEqual true
  }

  it should "return false if list contain duplicate" in{
    val userList = List(1,2,3,4,5)
    val result = factorialDuplicate.isContainDuplicate(userList)
    result shouldEqual false
  }

  "findFactorial" should "return a Success with factorial" in {
    val inputNumber = 5
    val result = factorialDuplicate.findFactorial(inputNumber)
    result.isSuccess shouldEqual true
    result.get shouldEqual 120
  }

  it should "return 1 for input 0" in {
    val inputNumber = 0
    val result = factorialDuplicate.findFactorial(inputNumber)
    result.isSuccess shouldEqual true
    result.get shouldEqual 1
  }

  it should "return a Failure for a negative Input" in {
    val inputNumber = -5
    val result = factorialDuplicate.findFactorial(inputNumber)
    result.isFailure shouldEqual true
  }

}
