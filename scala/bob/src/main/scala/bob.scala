
class Bob {

  def isScreaming(text: String): Boolean = {
    if (text.split(",").last.trim.forall(x => x.isDigit || !x.isLetter )){
      false
    } else {
      text.toUpperCase() == text;
    }
  }

  def hey(text: String): String = {
    if (text.trim.isEmpty){
      "Fine. Be that way!"
    } else if (isScreaming(text)) {
      "Whoa, chill out!"
    } else if (text.endsWith("?")) {
      "Sure."
    } else {
      "Whatever."
    }
  }

}