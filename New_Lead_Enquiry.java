package new_client;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class New_Lead_Enquiry {

	public static void main(String[] args) {
        // declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    String appUrl = "https://tempqashop.wellyx.com/#/53/membership";
	    driver.get(appUrl);
	    //maximize the browser window
	    driver.manage().window().maximize();
	    //implicit wait for 3o seconds
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    
	    // driver.get("https://tempqashop.wellyx.com/#/53/membership");
	    driver.findElement(By.linkText("Enquire")).click();
	    driver.get("https://tempqashop.wellyx.com/#/53/inquire-membership/183");
	   //enter first last name
	    driver.findElement(By.name("FirstName")).click();
	    driver.findElement(By.name("FirstName")).clear();
	    driver.findElement(By.name("FirstName")).sendKeys("Koby");
	    driver.findElement(By.xpath("//form/div[4]/div")).click();
	    driver.findElement(By.name("LastName")).click();
	    driver.findElement(By.name("LastName")).clear();
	    driver.findElement(By.name("LastName")).sendKeys("A Dodge");
	    //enter email address
	    driver.findElement(By.name("Email")).click();
	    driver.findElement(By.name("Email")).clear();
	    driver.findElement(By.name("Email")).sendKeys("koby@yopmail.com");
	    //select gender
	    driver.findElement(By.name("Gender")).click();
	    new Select(driver.findElement(By.name("Gender"))).selectByVisibleText("Female");
	    driver.findElement(By.name("Gender")).click();
	    //enter phone number
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("+61 363636363");
	    //enter county
	    driver.findElement(By.name("StateCountyName")).click();
	    driver.findElement(By.name("StateCountyName")).clear();
	    driver.findElement(By.name("StateCountyName")).sendKeys("FAIRBANK");
	    //enter address 1
	    driver.findElement(By.name("Address")).clear();
	    driver.findElement(By.name("Address")).sendKeys("43 Sale-Heyfield Road");
	    //enter city
	    driver.findElement(By.name("City")).click();
	    driver.findElement(By.name("City")).clear();
	    driver.findElement(By.name("City")).sendKeys("Victoria");
	    //enter country ID
	    driver.findElement(By.name("CountryID")).click();
	    new Select(driver.findElement(By.name("CountryID"))).selectByVisibleText("Australia");
	    driver.findElement(By.name("CountryID")).click();
	    //enter post code
	    driver.findElement(By.name("PostCode")).click();
	    driver.findElement(By.name("PostCode")).clear();
	    driver.findElement(By.name("PostCode")).sendKeys("3910");
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    //press on continue button
	    driver.findElement(By.linkText("Continue Shopping")).click();

//driver quit
	driver.quit();    
	 
	    
	}
}
