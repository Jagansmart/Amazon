package Maven_Project.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maven_Practise {
	@Test
	public  void browser_Launch() {
		System.out.println("Browser Launch");
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("Start Argument");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://mvnrepository.com/artifact/junit/junit/4.13.2");
		driver.manage().window().maximize();
	}
}
