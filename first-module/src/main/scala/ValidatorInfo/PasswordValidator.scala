package ValidatorInfo

case class PasswordValidator(userName:String, password:String,email:String){

  // val logger = LoggerFactory.getLogger(getClass)

    def validatePassword(password: String): Boolean = {
    val containsUppercase = password.exists(_.isUpper)
    val containsLowercase = password.exists(_.isLower)
    val containsCharacters = password.forall(character => character.isLetterOrDigit || "%@#&$".contains(character))
    val notContainsUsername = !password.toLowerCase.contains(userName.toLowerCase)

    containsUppercase && containsLowercase && containsCharacters && notContainsUsername
  }

}
