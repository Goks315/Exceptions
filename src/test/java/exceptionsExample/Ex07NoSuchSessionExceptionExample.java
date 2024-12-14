package exceptionsExample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ex07NoSuchSessionExceptionExample {

	public static void main(String[] args) {
		
		//Doing actions after closing the session 
		
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("http://www.google.co.in");
		
		driver.quit();
		driver.findElement(By.name("q"));
		
	}

}
