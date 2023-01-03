package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealStepwithMapsDefinition {
WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@When("^Title of login page is Free CRM$")
	public void title_of_login_page_is_free_crm() {
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		
		for(Map<String,String> data : credentials.asMaps(String.class, String.class)) {
	    
		driver.findElement(By.name("email")).sendKeys(data.get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
	    
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		
		String title = driver.getTitle();
		System.out.println("Home Page title is:" + title);
		Assert.assertEquals("Cogmento CRM", title);
	}
	
	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() {
	    WebElement deals = driver.findElement(By.xpath("//div[@id='main-nav']/div[5]/button/i"));
	    
	    Actions builder = new Actions(driver);
	    builder.moveToElement(deals).build().perform();
	    
	    driver.findElement(By.xpath("//div[@id='main-nav']/div[5]/button/i")).click();
	}
	
	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealData) throws InterruptedException{
		for (Map<String,String> data : dealData.asMaps(String.class, String.class)) { 
	    
		driver.findElement(By.name("title")).sendKeys(data.get("title"));
		driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
		driver.findElement(By.name("probability")).sendKeys(data.get("probability"));
		driver.findElement(By.name("commission")).sendKeys(data.get("commission"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='item']/button[2]")).click();
		Thread.sleep(3000);
		
		 WebElement deals = driver.findElement(By.xpath("//div[@id='main-nav']/div[5]/button/i"));
		    
		    Actions builder = new Actions(driver);
		    builder.moveToElement(deals).build().perform();
		    
		    driver.findElement(By.xpath("//div[@id='main-nav']/div[5]/button/i")).click();
		}
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
	    driver.quit();
	}
	
}
