package seleniuminterviewquestions;

import java.net.MalformedURLException;
import java.net.URL;

/*MalFormedURLException : MalFormedURLException is thrown when the built-in URL class encounters an invalid URL; 
specifically, when the protocol that is provided is missing or invalid.

Below program throws MalFormedURLException because I have not added http to the url. 
URL class expects fully form urls like http://chercher.tech

MalFormedURLException is Checked exception, so we have to use throws with method or 
we should handle the exception using try..catch*/
public class MALFORMEDURLEXCEPTION {
	public static void main(String[] args) throws MalformedURLException {
		URL u1 = new URL("chercher.tech");
	}
}
