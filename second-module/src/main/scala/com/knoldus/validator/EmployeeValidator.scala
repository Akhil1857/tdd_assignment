package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Employee

class EmployeeValidator {

  def employeeIsValid(employee: Employee): Boolean = {
    val emailValidator = new EmailValidator
    val companyReadDto = new CompanyReadDto
    companyReadDto.getCompanyByName(employee.companyName) match {
      case Some(_) => if(emailValidator.emailIdIsValid(employee.emailId)) true else false
      case None => false
    }
  }
}
