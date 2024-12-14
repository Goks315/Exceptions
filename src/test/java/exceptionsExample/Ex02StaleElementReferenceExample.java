package exceptionsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex02StaleElementReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Stale = No longer Fresh
		//This exception occurs when an element that was previously located on the page is no longer available
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.google.co.in");
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Agni"+Keys.ENTER);
		//WebElement searchBox1=driver.findElement(By.name("q"));
		searchBox.clear();
	
	}

}
