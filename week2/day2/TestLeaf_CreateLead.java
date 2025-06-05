package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class TestLeaf_CreateLead {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test1112");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TestRubini1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Automation");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Practice");
		driver.findElement(By.className("smallSubmit")).click();
		String leadAccountname = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		
		if (leadAccountname.contains("Test1112")) {
			System.out.println("Displayed correctly");
		}
		else {
			System.out.println("Failed:");
			
		}		
		driver.close();

	}

}
