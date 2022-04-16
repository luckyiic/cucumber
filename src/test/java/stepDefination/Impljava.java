package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Impljava {
WebDriver driver;

	@Given("Open broswer and navigate to {string}")
	public void open_broswer_and_navigate_to(String string) {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Open broswer and navigate to " + string);
	}

	@When("Click on the login page")
	public void click_on_the_login_page() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		System.out.println("Click on the login page");
	}

	@When("Enter the usename {string} and Password {string}")
	public void enter_the_usename_and_password(String string, String string2) {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		System.out.println("Enter the user name as " + string + "and password as " + string2);
	}

	@Then("Login page should open")
	public void login_page_should_open() {
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Login Page should open");
	}

	@Then("Login page should not open")
	public void login_page_should_not_open() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin123");
		System.out.println("Login Page shouldnot open");
	}

}


