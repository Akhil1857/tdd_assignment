package com.knoldus.validator

import com.knoldus.models.User
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class UserValidatorTest extends AnyFlatSpec with Matchers {

  val userValidator = new UserValidator

  "validUser" should "return true if details already exists and email is valid" in {
    val user: User = User("John", "Doe", 23, 15000, "Intern", "Knoldus", "John.doe@knoldus.com")
    userValidator.validUser(user) shouldEqual true
  }

  "validUser" should "return false if company details not exists" in {
    val user = User("Mary", "Kom", 25, 18000, "Intern", "Apple", "Mary.kom@gmail.com")
    userValidator.validUser(user) shouldEqual false
  }

  it should "return false as company name exists and email id is not valid" in {
    val user = User("Bill", "man", 24, 5000, "Intern", "Philips", "@philips.com")
    userValidator.validUser(user) shouldEqual false
  }

}
