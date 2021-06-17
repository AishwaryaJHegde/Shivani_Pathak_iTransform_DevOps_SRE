package first_groovy

def urlContents = "https://www.google.com/".toURL().
	urlContents.eachLine {
		println it //read each line of the web page99
	}