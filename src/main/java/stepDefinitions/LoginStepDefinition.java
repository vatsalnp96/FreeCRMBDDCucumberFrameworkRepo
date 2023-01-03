//package stepDefinitions;
//
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
//public class LoginStepDefinition {
//	
//	WebDriver driver;
//	
//	@Given("^user is already on Login Page$")
//	public void user_is_already_on_login_page() {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://ui.freecrm.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//	}
//	
//	@When("^Title of login page is Free CRM$")
//	public void title_of_login_page_is_free_crm() {
//		
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Cogmento CRM", title);
//	}
//	
//	//Reg Exp.
//	//1.    \"([^\"]*)\"
//	//2.    \"(.*)\"
//	
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username, String password) {
//	    
//		driver.findElement(By.name("email")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	}
//	
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//	    
//		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
//	}
//	
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() {
//		
//		String title = driver.getTitle();
//		System.out.println("Home Page title is:" + title);
//		Assert.assertEquals("Cogmento CRM", title);
//	}
//	
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page() {
//		Actions builder = new Actions(driver);
//	    WebElement contactsLink = driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
//	    builder.moveToElement(contactsLink).build().perform();
//	    
//	    WebElement newContactLink = driver.findElement(By.xpath("//div[@id='main-nav']/div[3]/button"));
//		newContactLink.click();
//	}
//	
//	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	public void user_enters_contacts_details(String firstname, String lastname, String position) {
//		driver.findElement(By.name("first_name")).sendKeys(firstname);
//		driver.findElement(By.name("last_name")).sendKeys(lastname);
//		driver.findElement(By.name("position")).sendKeys(position);
//		driver.findElement(By.xpath("//div[@class='item']//button[2]")).click();
//	}
//	
//	@Then("^close the browser$")
//	public void close_the_browser() {
//	    driver.quit();
//	}
//	
//}
