package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeaf_AccountCreation {

	public static void main(String[] args) {
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Test126");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select industryOption = new Select(industry);
		industryOption.selectByValue("IND_SOFTWARE");
		
		WebElement owership = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipOption = new Select(owership);
		ownershipOption.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select sourceOption = new Select(source);
		sourceOption.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		Select marketingOption = new Select(marketing);
		marketingOption.selectByIndex(6);
		
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateOption = new Select(state);
		stateOption.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String actualAccount = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		
		
		if (actualAccount.contains("Test126")) {
			System.out.println("Displayed correctly");
		}
		else {
			System.out.println("Failed:");
			
		}			
		
		
		driver.close();
		
		
	}

}
