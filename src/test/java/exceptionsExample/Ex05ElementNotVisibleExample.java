package exceptionsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex05ElementNotVisibleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Child of InvalidElementState exception
		// Hidden Elements
		
		WebDriver driver= new ChromeDriver();

		driver.get("C:/Users/Elcot/Documents/HiddenField.html");
		
		WebElement button = driver.findElement(By.id("buttonID"));
		button.click();
	}

}
