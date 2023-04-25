package ValidatorInfoTest

import ValidatorInfo.PasswordValidator
import org.scalatest.flatspec.AnyFlatSpec

class PasswordValidatorTest extends AnyFlatSpec {

  "A password" should "be Valid if follow all criteria" in {
    val validator = PasswordValidator("John", "aABC12$", "john@email.com")
    assert(validator.validatePassword(validator.password))
  }

  it should "be invalid if it doesn't have a lowercase letter" in {
    val validator = PasswordValidator("Mary", "ABC123$", "Mary@email.com")
    assert(!validator.validatePassword(validator.password))
  }

  it should "be invalid if it doesn't have an uppercase letter" in {
    val validator = PasswordValidator("Bob", "abc123$", "bob@email.com")
    assert(!validator.validatePassword(validator.password))
  }

  it should "be invalid if it contains the username" in {
    val validator = PasswordValidator("Kati", "abcKatiABC$", "kati@email.com")
    assert(!validator.validatePassword(validator.password))
  }

  it should "be invalid if it doesn't have a special character" in {
    val validator = PasswordValidator("John", "abcABC123", "kati@email.com")
    assert(validator.validatePassword(validator.password))
  }

}