package commonMethods;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BaseMethods {
	
	public static WebDriver driver;
	
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	public static void launchERP() {
		driver.get("http://webapp.qedgetech.com/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void launchERP(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void loginERP() {
		// This code belongs to login methods 
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		//String pCaption = driver.findElement(By.id("ewPageCaption")).getText();
		String pCaption1 = driver.findElement(By.linkText("Dashboard")).getText();
		Assert.assertEquals(pCaption1, "Dashboard");

	}
	
	public static void logoutERP() {
		//click on Logout link
		driver.findElement(By.id("mi_logout")).click();
		//validate Login button existance
		Assert.assertTrue(driver.findElement(By.id("btnsubmit")).isEnabled());
	}

	public static void loginERP(String username, String password) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='btnsubmit']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String pCaption1 = driver.findElement(By.linkText("Dashboard")).getText();
		Assert.assertEquals(pCaption1, "Dashboard");
	}
	
	public static void AccessToStockItemsPage() {
		//click on the stock Items menu 
		  driver.findElement(By.xpath("//li[@id='mi_a_stock_items']")).click();
		// put the validation code to check stock Items page is opened or not
		 String pcaption = driver.findElement(By.id("ewPageCaption")).getText();
		 Assert.assertTrue(pcaption.equals("Stock Items"));
	}
	
	public static void AccessToCustomersPage() {
		//click on the stock Items menu 
		  driver.findElement(By.xpath("//li[@id='mi_a_customers']")).click();
		// put the validation code to check stock Items page is opened or not
		 String pcaption = driver.findElement(By.id("ewPageCaption")).getText();
		 Assert.assertTrue(pcaption.equals("Customers"));
	}
	
	

}
