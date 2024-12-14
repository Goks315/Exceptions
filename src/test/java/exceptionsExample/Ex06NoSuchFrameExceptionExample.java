package exceptionsExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex06NoSuchFrameExceptionExample {

	public static void main(String[] args) {
		
		
		//This exception occurs when Selenium is unable to locate the desired frame or iframe using the specified iframe identifier (By iframe id, name or index).
	
		// Same as No such window Exception
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");

		driver.switchTo().frame(5);
	}

}
