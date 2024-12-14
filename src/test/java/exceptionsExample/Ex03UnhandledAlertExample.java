package exceptionsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex03UnhandledAlertExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//exception occurs whenever a alert occurs for which we have coded in selenium before we accept the alert 
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement alert=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		alert.click();
		
		WebElement getLabel=driver.findElement(
		By.xpath("//*[@id='contentblock']/section/div[1]/div/div/label"));
		
		
	}
}
