package com.knoldus.request

import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CompanyImplTest extends AnyFlatSpec with Matchers {
  val companyValidator = new CompanyValidator
  val companyImpl = new CompanyImpl(companyValidator)

  "createCompany" should "return valid company name" in {
    val company:Company = Company("Wipro", "wipro123@gmail.com", "Noida")
    companyImpl.createCompany(company) shouldEqual Some(company.name)
  }

  it should "return none as the company if it is already present" in {
    val company: Company = Company("Knoldus", "Knoldus@gmail.com", "Greater Noida")
    companyImpl.createCompany(company) shouldEqual None
  }

  it should "return None as invalid email is entered" in {
    val company = Company("TCS","Tcs.gmail.com","Noida")
    companyImpl.createCompany(company) shouldEqual None
  }

}
