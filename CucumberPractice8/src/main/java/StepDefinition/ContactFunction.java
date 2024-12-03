package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactFunction {
	static WebDriver driver;
	@Before("@Adhoc")
	public void setup() {
		String Path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Path+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://protrainingtech.com/");
		driver.manage().window().maximize();
	}
	@After("@Adhoc")
	public void teardowm() {
		driver.close();
		}
	@Before("@Function")
	public void setupfunction() {
		System.out.println("This is to show before function tag");}
	@After("@Function")
	public void teardowmfunction() {
		System.out.println("This is to show after function tag");
		//driver.close();
		}

	@Given("^I navigate to protrainingtech\\.com$")
	public void i_navigate_to_protrainingtech_com() throws Throwable {
		System.out.println("This to navigate to the site ");
	   }

	@When("^I click on contact us link$")
	public void i_click_on_contact_us_link() throws Throwable {
		System.out.println("Click to contact us link");
	    }

	@Then("^The Join us form displays$")
	public void the_Join_us_form_displays() throws Throwable {
		System.out.println("Form displays");
	    }

	@When("^I click on register button$")
	public void i_click_on_register_button() throws Throwable {
	    }

	@Then("^I am able to see the validation error$")
	public void i_am_able_to_see_the_validation_error() throws Throwable {
	}
	@When("^I enter name \"([^\"]*)\"$")
	public void i_enter_name(String arg1) throws Throwable {
		System.out.println("Name is = " + arg1);
	    }

	@Then("^I will see the \"([^\"]*)\"$")
	public void i_will_see_the(String arg1) throws Throwable {
	    }

	    }

	


