package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testLocators() throws InterruptedException {

		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("photo")).sendKeys("C:\\Feb23qa\\Name.java");
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		driver.navigate().back();
//		driver.findElement(By.partialLinkText("TF-API")).click();
		driver.findElement(By.cssSelector("input#tool-2")).click();
		driver.findElement(By.cssSelector("input[value='Automation Tester'][id='profession-1']")).click();
//		driver.findElement(By.cssSelector("a[href$='http://techfios.com/api-prod/api/']")).click();
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("is fun");
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).clear();
		driver.findElement(By.xpath("//input[@name='lastname'and @type='text']")).sendKeys("is not fun");
//		driver.findElement(By.xpath("//strong[text()='Link Test : Page Change']")).click();
		driver.findElement(By.xpath("//strong[contains(text(),'Page Change')]")).click();
	}

//	@After
	public void tearDown() {

		driver.close();
		driver.quit();

	}

}
