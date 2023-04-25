package com.knoldus.db

import com.knoldus.models.Company
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CompanyReadDtoTest extends AnyFlatSpec with Matchers {

  val companyReadDto = new CompanyReadDto
  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val philipsCompany: Company = Company("Philips", "philips123@gmail.com", "Noida")

  "getCompanyBtName" should "return details of Knoldus Company" in {
    companyReadDto.getCompanyByName("Knoldus") shouldEqual Some(knoldusCompany)
  }

  it should "return the details of Philips company" in {
    companyReadDto.getCompanyByName("Philips") shouldEqual Some(philipsCompany)
  }

  it should "return None for an invalid company name" in {
    companyReadDto.getCompanyByName(null) shouldEqual None
  }

  it should "return None for a empty company name" in {
    companyReadDto.getCompanyByName("") shouldEqual None
  }

}
