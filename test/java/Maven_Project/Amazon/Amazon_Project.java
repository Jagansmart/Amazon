package Maven_Project.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Project extends Reusable_Methods {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\rjaga\\eclipse-workspace\\Selenium_Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement sign_in = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Click(sign_in);
		WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
		inputvalue_Sendkeys(username, "7339265821");
		WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
		Click(Continue);
		WebElement password = driver.findElement(By.name("password"));
		inputvalue_Sendkeys(password, "Jagannathan@3");
		WebElement Sign_in = driver.findElement(By.id("signInSubmit"));
		Click(Sign_in);
		WebElement search_product = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select ss =  new Select(search_product);
		ss.selectByVisibleText("Electronics");
		WebElement Search = driver.findElement(By.xpath("//input[@type='text']"));
		inputvalue_Sendkeys(Search, "Bluetooth");
		WebElement Click_Search = driver.findElement(By.xpath("//input[@type='submit']"));
		Click(Click_Search);
		WebElement Product = driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-4']"));
		Click(Product);
		//Get_Title();
		
		WebElement Add_to_cart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		Click(Add_to_cart);
		
		WebElement Payment = driver.findElement(By.id("proceedToRetailCheckout"));
		Click(Payment);
		
		WebElement Use_Address = driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]"));
		Click(Use_Address);
		
		
	}

}
