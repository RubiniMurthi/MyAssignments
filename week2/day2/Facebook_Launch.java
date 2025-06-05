package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Launch {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver(); // ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("TestFacebook");
		driver.findElement(By.name("lastname")).sendKeys("BrowserTest");
		driver.findElement(By.name("reg_email__")).sendKeys("0999445805");
		driver.findElement(By.id("password_step_input")).sendKeys("Test1234567");
		driver.findElement(By.xpath("(//input[@class='_8esa'])")).click();
		
		WebElement dropDownn = driver.findElement(By.id("day"));
		Select dropOption = new Select(dropDownn);
		dropOption.selectByValue("12");
	
	    WebElement dropDownn1 = driver.findElement(By.id("month"));
	    Select dropOption1 = new Select(dropDownn1);
	    dropOption1.selectByValue("12");
	    
	    WebElement dropDownn2 = driver.findElement(By.id("year"));
	    Select dropOption2 = new Select(dropDownn2);
	    dropOption2.selectByValue("1964");
	    
	    
		
		// driver.findElement(By.className("_58mt")).click();
		
		// driver.findElement(By.id("email")).sendKeys("Vineeth@testleaf.com");
		// driver.findElement(By.id("pass")).sendKeys("123test");
		// driver.findElement(By.name("login")).click();
		

	}

}
