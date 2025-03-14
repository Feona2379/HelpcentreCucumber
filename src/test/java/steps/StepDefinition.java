package steps;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.By;


public class StepDefinition {
	

		WebDriver driver;

	    @Given("User able to launch Chrome browser and the Bank URL")
	    public void user_launches_chrome_browser_and_bank_url() {
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://Scotiabank.com"); 
	    }

	    @When("Clicking on Help centre button")
	    public void clicking_on_help_centre_button() {
	        WebElement helpCentreButton = driver.findElement(By.xpath("//span[normalize-space()='Help Centre']")); 
	        helpCentreButton.click();
	    }

	    @Then("User should be navigating to Help centre page")
	    public void user_should_be_navigating_to_help_centre_page() {
	        String expectedUrl = "https://help.scotiabank.com/?origin=dotcom_help"; 
	        String actualUrl = driver.getCurrentUrl();
	        Assert.assertEquals("Navigation failed!", expectedUrl, actualUrl);;
	    }

	    @Then("close the browser")
	    public void close_the_browser() {
	        driver.quit();
	    }

	}



