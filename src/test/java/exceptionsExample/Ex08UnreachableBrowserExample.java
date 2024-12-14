package exceptionsExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ex08UnreachableBrowserExample {

	public static void main(String[] args) {

		// Indicates there was a problem communicating with the browser being controlled or the Selenium server.

		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://www.google.co.in");
	}

}
