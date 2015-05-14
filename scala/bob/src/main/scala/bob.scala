class Bob {

  def hey(text: String) : String = {
  	if (text.endsWith("!") && text.toLowerCase != text){
		"Whoa, chill out!"
  	} else if (text.endsWith(".")){
    	"Whatever."
  	} else if (text.endsWith("?")){
  		"Sure."
  	} else {
  		"Whatever."
  	}
  }

}