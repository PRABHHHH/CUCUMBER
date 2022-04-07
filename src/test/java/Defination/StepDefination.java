package Defination;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefination {
	 WebDriver driver;
	    String url = "https://demoapp.skillrary.com/login.php?type=login";

@Given("I should open the browser and navigate to Login page")
public void i_should_open_the_browser_and_navigate_to_login_page() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
   
    driver.get(url);
   
}
@When("Enter Username {string}")
public void enter_username(String string) {
	driver.findElement(By.id("email")).sendKeys(string);
    
}
@When("Enter Password {string}")
public void enter_password(String string) {
	driver.findElement(By.id("password")).sendKeys(string);
}
@When("Click on Loginbutton")
public void click_on_loginbutton() {
	driver.findElement(By.id("last")).click();
    
}
@Then("i should see the username as {string}")
public void i_should_see_the_username_as(String string) {
	
	if(string == "SkillRary Admin") {
		 WebElement wl = driver.findElement(By.className("hidden-xs"));
		    Assert.assertEquals(wl.getText(), string);
driver.close();    
    
    }
	else 
	{
		WebElement we = driver.findElement(By.className("hidden-xs"));
	    Assert.assertEquals(we.getText(), string);
	    driver.close();
}


}



}

