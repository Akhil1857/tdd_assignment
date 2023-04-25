package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User

class UserValidator {

  def validUser(user:User):Boolean = {
    val emailValidator = new EmailValidator
    val companyReadDto = new  CompanyReadDto
    companyReadDto.getCompanyByName(user.companyName) match{
      case Some(_) => if(emailValidator.emailIdIsValid(user.emailId)) true
                      else false
      case None => false
    }
  }

}
