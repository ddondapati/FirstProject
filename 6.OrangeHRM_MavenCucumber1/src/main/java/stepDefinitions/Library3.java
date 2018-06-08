package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Library3 {
	WebDriver driver;

	@Given("Open the Browser")
	public void open_the_Browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		 driver = new ChromeDriver();
	}

	@When("navigate to Application using the url")
	public void navigate_to_Application_using_the_url() {

		// accessing the qahrm project home page
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
	}

	@Then("Enter UserName and Password and Click on Login Button")
	public void enter_UserName_and_Password_and_Click_on_Login_Button() throws Throwable {

		// statements to perform login action
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
	}

	@Then("click on Logout link")
	public void click_on_Logout_link() {
		// statements to perform logout action
		driver.findElement(By.linkText("Logout")).click();
	}

	@Then("Close the Browser")
	public void close_the_Browser() {
		// statements to quit the browser
		driver.quit();
	}

}
