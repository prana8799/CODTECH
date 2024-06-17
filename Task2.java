import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGSeleniumDemo {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setUp() {
		System.setProperty("Webdriver.gecko.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.cssSelector("#email")).sendKeys("praneshbalamurugan@gmail.com");
		
		Thread.sleep(2000L);
		
		driver.findElement(By.id("pass")).sendKeys("jhk998");
		
		Thread.sleep(2000L);;
		
		driver.findElement(By.xpath("//button[value='1']")).click();
		
	}
		
		
		@AfterClass
		public void tearDown() {
			if(driver!=null) {
				driver.close();
			}
		
	}

	
		
}
