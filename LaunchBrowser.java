package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		EdgeDriver driver= new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("marketsoft1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anjali");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anjali"); 
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("software tester");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("72000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("9346");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("working as a tester");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("experienced in testing");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("s");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("computer science");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("45");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("~");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("128");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("kovur");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("srinivasanjali5@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6383167170");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("mother");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://content/mode");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("moni");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("no4 kovur");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("moni address");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("korur main road");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("4321");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("321");
		
		
		
		
		
	}

}
