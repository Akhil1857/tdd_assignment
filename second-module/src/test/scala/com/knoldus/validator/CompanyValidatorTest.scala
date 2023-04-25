package com.knoldus.validator

import com.knoldus.models.Company
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CompanyValidatorTest extends AnyFlatSpec with Matchers {

  val companyValidator = new CompanyValidator

  "companyIsValid" should "return true as new company doesn't exist and have valid emailid" in {
    val newCompany: Company = Company("Wipro", "wipro@gmail.com", "Noida")
    companyValidator.companyIsValid(newCompany) shouldEqual true
  }

  it should "return false as company already exist" in {
    val newCompany: Company = Company("Philips", "philips@gmail.com", "Noida")
    companyValidator.companyIsValid(newCompany) shouldEqual false
  }

  it should "return false as emaild is not valid" in {
    val newCompany = Company("Accenture", "accenture.gmail.com", "Delhi")
    companyValidator.companyIsValid(newCompany) shouldEqual false
  }
}
