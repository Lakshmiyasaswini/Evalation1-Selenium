package Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsForm {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		// To open the web site of the cart.com 
		driver.get("https://cart.com/contact/sales");
		
		// To Maximize the chrome page
		driver.manage().window().maximize();
		
		// Step 1:
		//Fill the first name in the form
		driver.findElement(By.name("firstname")).sendKeys("Lakshmi");
		
		Thread.sleep(2000);
		
		// Fill the last name in the form
		driver.findElement(By.name("lastname")).sendKeys("Yasaswini");
		
		Thread.sleep(2000);
		
		// Fill the phone number in the form
		driver.findElement(By.name("phone")).sendKeys("9345670843");
		
		Thread.sleep(1000);
		
		// Fill the email address in the form
		driver.findElement(By.name("email")).sendKeys("yashuraja1708@gmail.com");
		
		Thread.sleep(1000);
		
		// Fill the company in the form
		driver.findElement(By.name("company")).sendKeys("Infosys");
		
		Thread.sleep(2000);
		
		// Step 2:
		// Drop down method to select the "India" from the country drop down
		WebElement countryDropdown = driver.findElement(By.name("country"));
		
		Select country = new Select(countryDropdown);
		
		country.selectByVisibleText("India");
		
		Thread.sleep(2000);
		
		// Step 3:
		// To write the message in the message box
		driver.findElement(By.name("contant_message")).sendKeys("It is a good platform");
		
		Thread.sleep(2000);
		
		// Step 4:
		// Click on the Submit the form
		driver.findElement(By.cssSelector("[value='Submit']")).click();
		
		// Step 5:
		// Close the browser window to complete the task
		driver.quit();
		
	}

}
