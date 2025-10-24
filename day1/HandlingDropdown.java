package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		
		WebElement passcode = driver.findElement(By.id("password"));
		passcode.sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		WebElement crmSfaLink = driver.findElement(By.partialLinkText("CRM"));
		crmSfaLink.click();
		
		WebElement leadsTab = driver.findElement(By.linkText("Leads"));
		leadsTab.click();
		
		WebElement leftTabCreateLead = driver.findElement(By.linkText("Create Lead"));
		leftTabCreateLead.click();
		
		WebElement companyNameTextBox = driver.findElement(By.id("createLeadForm_companyName"));
		companyNameTextBox.sendKeys("Infy software");
		
		WebElement firstNameTextBox = driver.findElement(By.id("createLeadForm_firstName"));
		firstNameTextBox.sendKeys("Silviya");
		
		WebElement lastNameTextBox = driver.findElement(By.id("createLeadForm_lastName"));
		lastNameTextBox.sendKeys("Suruthi");
		
		WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdownSource = new Select(sourceDropdown);
		dropdownSource.selectByIndex(4);
		
		WebElement marketingCompDropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdownMarketing = new Select(marketingCompDropdown);
		dropdownMarketing.selectByVisibleText("Automobile");
		
		WebElement ownershipDropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdownOwnership = new Select(ownershipDropdown);
		dropdownOwnership.selectByValue("OWN_CCORP");
		
		WebElement clickLeadButton = driver.findElement(By.xpath("//input[@class='smallSubmit']"));
		clickLeadButton.click();
		
		System.out.println("Page Title:"+driver.getTitle());
		driver.close();
		
		
		

	}

}
