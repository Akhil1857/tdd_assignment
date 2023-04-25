package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company

class CompanyValidator {

  def companyIsValid(company: Company): Boolean = {
    val emailValidator = new EmailValidator
    val companyReadDto = new CompanyReadDto
    companyReadDto.getCompanyByName(company.name) match {
      case Some(_) => false
      case None => if(emailValidator.emailIdIsValid(company.emailId)) true else false
    }
  }
}
