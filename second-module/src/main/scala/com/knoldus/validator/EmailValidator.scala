package com.knoldus.validator

class EmailValidator {

  def emailIdIsValid(emailId: String): Boolean = {
    val emailRegex =
      "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$".r
    emailRegex.findFirstMatchIn(emailId) match {
      case Some(_) => true
      case None => false
    }
  }
}
