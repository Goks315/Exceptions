package exceptionsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex04InvalidElementStateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Element is not currently interactable and may not be manipulated
		//Indicates that a WebElement is in a state that means actions cannot be performed with it
		// Ex : Using Hidden Elements
		
		WebDriver driver= new ChromeDriver();

		driver.get("C:/Users/Elcot/Documents/HiddenField.html");
		
		WebElement textBox = driver.findElement(By.id("textID"));
		textBox.clear();
		//textBox.sendKeys("");
	}

}
