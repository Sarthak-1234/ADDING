package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePage {
	
	@BeforeClass
	public void testing() {
		
	}
	
	@Test
	public void testcase1() {
		System.out.println("Testcase1");
		System.setProperty("webdriver.chrome.driver", "chromedriver_windows.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //250 milliseconds
		driver.findElement(By.name("q")).sendKeys("testing");
		//if element not found in implicit wait = NoSuchElementException
		
		//Thread.sleep(3000);
		
		
		
		
		presenceOfList(driver, "//ul[@class='erkvQe']/li");
		
		//if no element found = then it return 
		
		//foreach...
		
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
		
		elementToBeClickable(driver, driver.findElement(By.xpath("elementToBeClickable")));
		
	}
	
	public static void presenceOfList(WebDriver driver, String ele) {
		WebDriverWait wait = new WebDriverWait(driver, 50); //500 milliseconds
		//wait.until(ExpectedConditions.alertIsPresent());
		//wait.until(ExpectedConditions.presenceOfElementLocated(locator))
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(ele)));
	}
	
	public static void elementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 50); //500 milliseconds
		//wait.until(ExpectedConditions.alertIsPresent());
		//wait.until(ExpectedConditions.presenceOfElementLocated(locator))
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}


//maven download
//maven path set
//make a maven project
//usme 1 task
//Thread.sleep remove
//In separate function impelent Explicit wait





