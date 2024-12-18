package packg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SiteAutomation {

ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testingWork() 
	{
        
		Actions act=new Actions(driver);
		WebElement switching=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));
		act.moveToElement(switching).perform();
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("sam");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("kochi");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("rpm@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("888736355");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)","");
		
		
		
		WebElement skill=driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		Select skillDetails=new Select(skill);
		skillDetails.selectByValue("C");
		
		
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
		Select yearDetails=new Select(year);
		yearDetails.selectByValue("1918");
		WebElement month=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		Select monthDetails=new Select(month);
		monthDetails.selectByValue("May");
		WebElement day=driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
		Select dayDetails=new Select(day);
		dayDetails.selectByValue("5");
		driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("Samsc@1990");
		driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("Samsc@1990");
		driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
		
	

		
		
	}
}
