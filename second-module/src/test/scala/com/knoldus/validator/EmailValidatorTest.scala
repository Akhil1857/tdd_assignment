package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class EmailValidatorTest extends AnyFlatSpec with Matchers{

  val emailValidator = new EmailValidator

  it should "emailIdIsValid" in {
    val email = "john@gmail.com"
    emailValidator.emailIdIsValid(email) shouldEqual true
  }

  it should "emailIdIsValid as . can be added before @" in {
    val email = "bib.john@xyz.com"
    emailValidator.emailIdIsValid(email) shouldEqual true
  }

  it should "emailIdIsValid as email can have numbers" in {
    val email = "heni.2joee@xyz.com"
    emailValidator.emailIdIsValid(email) shouldEqual true
  }

  it should "emailIdIsInValid as @ not available" in {
    val email = "a.b.c.com"
    emailValidator.emailIdIsValid(email) shouldEqual false
  }


}
